export class Product {
    pid:number;
    pname:string;
    cname:string;
    price:number;
    quantity:number;
    description:string;

    constructor(pid:number,pname:string,cname:string,price:number,quantity:number,description:string){
        this.pid = pid;
        this.pname = pname;
        this.cname = cname;
        this.price = price;
        this.quantity = quantity;
        this.description = description; 
    }
}