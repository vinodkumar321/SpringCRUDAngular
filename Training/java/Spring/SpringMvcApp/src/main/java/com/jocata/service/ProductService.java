package com.jocata.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jocata.config.SpringMVCContext;
import com.jocata.model.Category;
import com.jocata.model.Product;
import com.jocata.util.DAOManager;

@Component
public class ProductService {
	
	@Autowired
	DAOManager daoManager;
	
	public Product getProduct(Integer pId) {
		Product product = (Product)SpringMVCContext.getApplicationContext().getBean("product");
		return daoManager.getProductDAO().getEntityById(product, pId);
	}
	
	  public Product saveProduct(Product product) {
		Serializable id = daoManager.getProductDAO().save(product);
		product.setId((Integer) id);
		
		return product; 
	}
     
      public List<Product> getProductList(){
		Product product = (Product) SpringMVCContext.getApplicationContext().getBean("product");
		return daoManager.getProductDAO().loadEntity(product);
	}	 
	
	 
}
