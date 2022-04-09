import { Product } from './Product';

export class ProductService {

  public getProducts(){
    let products:Product[];
    products=[
      new Product(1,'Shirts','Clothing',400,20,"Men's Shirt"),
      new Product(2,'T-Shirts','Clothing',300,40,"Men's T-Shirts"),
      new Product(3,'Jeans','Clothing',800,34,"Men's Jeans"),
      new Product(4,'Samsung Galaxy','Electronics',40000,12,"Samsung Mobile Phone"),
      new Product(5,'Gionee M3','Electronics',40000,12,"Gionee Mobile Phone"),
      new Product(6,'Moto g40 Fusion','Electronics',40000,12,"Moto Mobile Phone"),
      new Product(7,'Pickle','Food',40,12,"Mango Pickle"),
      new Product(8,'Banana Yellow','Fruits',40,12,"Yellow Bananas"),
      new Product(9,'Banana Red','Fruits',60,12,"Red Bananas"),
      new Product(10,'Apple','Fruits',400,12,"Red Apple Fruit")
    ];
    return products;
  }
  public getProduct(id:number){
    let product:Product[]=this.getProducts();
    return product.find(p=>p.pid==id);
  }
  constructor() { }
}
