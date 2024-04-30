

import { S8Object } from "/S8-api/S8Object.js";



/**
 * 
 */
export class StdListRow extends S8Object {

    /**
     * @type{Popover}
     */
    popover = null;


    constructor(){
        super();
    }

    getEnvelope() {
        return this.wrapperNode;
    }





    attachPopover() {
        this.popoverBox.attach(this.rowNode);
    }

    detachPopover() {
        this.popoverBox.detach();
    }


    /**
     * 
     * @param {Popover} popover
     */
    S8_set_popover(popover) {
        if (popover != null) {
            this.popover = popover;
            this.rowNode.appendChild(this.popover.getEnvelope());
            //this.popover.attach(this.cardNode);

            /* focus on node */
            this.popover.show();
        }
        else if (popover == null && this.popover != null) {
            this.rowNode.removeChild(this.popover.getEnvelope());
            this.popover = null;
        }
    }

}