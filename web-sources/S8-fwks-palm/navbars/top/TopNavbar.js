
import { S8Object } from "/S8-api/S8Object.js";

import { S8WebFront } from "/S8-pkgs-ui-carbide/S8WebFront.js";

import { TopNavbarMenu } from "./TopNavbarMenu.js";




/**
 * 
 */
S8WebFront.CSS_import('/S8-fwks-palm/navbars/top/TopNavbar.css');


/**
 * 
 */
export class TopNavbar extends S8Object {


    /**
     * @type {TopNavbarMenu[]}
     */
    menus;


    /** @type {string} : size of the navbar */
    classSize;


    /**
     * 
     */
    selectionIndex = 1;

    
    /**
     * 
     */
    constructor(){
        super();
        this.wrapperNode = document.createElement("div");
        this.wrapperNode.classList.add("palm-topnavbar-header");
        this.wrapperNode.classList.add(this.classSize = "palm-topnavbar-large");
    }


    /**
     * 
     * @returns 
     */
    getEnvelope(){
        return this.wrapperNode;
    }



    /** @param {Number} code */
    S8_set_size(code){
        let newClassSize = "palm-topnavbar-" + S8WebFront.parseSize(code);
        this.wrapperNode.classList.add(this.classSize, newClassSize);
        this.classSize = newClassSize;
    }
    

    /**
     * 
     * @param {TopNavbarMenu[]} menus 
     */
    S8_set_menus(menus){
        let n = menus.length;
        for(let i=0; i<n; i++){
            let menu = menus[i];
            menu.index = i;
            menu.navbar = this;
            this.wrapperNode.appendChild(menu.getEnvelope());
        }
        this.menus = menus;

        this.updateSelection();
    }


    S8_set_selectedIndex(index){
        this.select(index);
    }


    /**
     * 
     * @param {*} index 
     */
    select(index){
        this.selectionIndex = index;
        this.updateSelection();
    }


    /**
     * 
     * @param {*} index 
     */
    updateSelection(){
        let n = this.menus.length;
        for(let i=0; i<n; i++){
            this.menus[i].setSelected(i == this.selectionIndex);
        }
    }

    /**
     * 
     */
    S8_render(){
    }


    /**
     * 
     */
    S8_dispose(){
    }


}