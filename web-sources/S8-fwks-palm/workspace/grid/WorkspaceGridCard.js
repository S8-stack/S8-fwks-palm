

import { S8Object } from "/S8-api/S8Object.js";




export class WorkspaceGridCard extends S8Object {



    /**
     * @type{Popover}
     */
    popover = null;



    constructor(){
        super();

        this.containerNode = document.createElement("div");
        this.containerNode.classList.add("workspace-grid-card");
        this.containerNode.setAttribute("size", "std");
        this.containerNode.setAttribute("theme", "light");

        let _this = this;
        this.isPopoverAttached = false;
        this.containerNode.addEventListener("click", function (event) {
            _this.S8_vertex.runVoid("on-click");
            event.stopPropagation();
        }, false);
    }

    getEnvelope() {
        return this.containerNode;
    }





    attachPopover() {
        this.popoverBox.attach(this.containerNode);
    }

    detachPopover() {
        this.popoverBox.detach();
    }


    /**
     * 
     * @param {*} code 
     * @returns 
     */
    parseSizeCode(code){
        switch(code){
            case 0 : return "std";
            case 1 : return "large-horizontal";
            case 2 : return "large-vertical";
            case 3 : return "large-square";

            default: return "std";
        }
    }

     /**
     * 
     * @param {*} code 
     * @returns 
     */
     parseThemeCode(code){
        switch(code){
            case 2 : return "light";
            case 4 : return "dark";
            default: return "light";
        }
    }


    /**
     * 
     * @param {*} code 
     */
    S8_set_size(code){
        this.containerNode.setAttribute("size", this.parseSizeCode(code));
    }

     /**
     * 
     * @param {*} code 
     */
     S8_set_theme(code){
        this.containerNode.setAttribute("theme", this.parseThemeCode(code));
    }


    /**
     * 
     * @param {Popover} popover
     */
    S8_set_popover(popover) {
        if (popover != null) {
            this.popover = popover;
            this.containerNode.appendChild(this.popover.getEnvelope());
            //this.popover.attach(this.cardNode);

            /* focus on node */
            this.popover.show();
        }
        else if (popover == null && this.popover != null) {
            this.containerNode.removeChild(this.popover.getEnvelope());
            this.popover = null;
        }
    }

}