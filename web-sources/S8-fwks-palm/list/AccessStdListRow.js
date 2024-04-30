
import { StdListRow } from './StdListRow.js';




export class AccessStdListRow extends StdListRow {

    constructor() {
        super();

        this.wrapperNode = document.createElement("div");
        this.wrapperNode.classList.add("stdlist-row-access");

        this.titleNode = document.createElement("div");
        this.titleNode.classList.add("stdlist-row-access-title");
        this.wrapperNode.appendChild(this.titleNode);

        this.infoNode = document.createElement("div");
        this.infoNode.classList.add("stdlist-row-access-info");
        this.wrapperNode.appendChild(this.infoNode);


        let _this = this;
        this.wrapperNode.addEventListener("click", function (event) {
            _this.S8_vertex.runVoid("on-click");
            event.stopPropagation();
        }, false);
        
    }


    getEnvelope() {
        return this.wrapperNode;
    }

   

   

    /**
     * 
     * @param {string} cards 
     */
    S8_set_title(name) {
        this.titleNode.innerHTML = name;
    }

    /**
    * 
    * @param {string} cards 
    */
    S8_set_info(name) {
        this.infoNode.innerHTML = name;
    }


    S8_render() { /* continuous rendering approach... */ }

    S8_dispose() { /* continuous rendering approach... */ }
    
}