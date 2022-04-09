package com.jocata.amazon.util;

import com.jocata.amazon.controller.CategoryController;
import com.jocata.amazon.controller.ProductController;
import com.jocata.amazon.dao.impl.CategoryDAOImpl;
import com.jocata.amazon.dao.impl.Product;
import com.jocata.amazon.dao.impl.ProductDAOImpl;
import com.jocata.amazon.model.Category;
import com.jocata.amazon.request.CategoryRequest;
import com.jocata.amazon.request.ProductRequest;
import com.jocata.amazon.response.CategoryResponse;
import com.jocata.amazon.response.ProductResponse;
import com.jocata.amazon.service.impl.CategoryServiceImpl;
import com.jocata.amazon.service.impl.ProductServiceImpl;

public class AmazonBeanFactory { // to supply all required beans as Dependency Injection
   
	 public static Object getBean(String className) {
		
	   if(className.equalsIgnoreCase("category"))	 
		 return new Category("");
	   
	   else if(className.equalsIgnoreCase("product"))	 
			 return new Product();
	   
	   else if(className.equalsIgnoreCase("categoryDAO"))	 
			 return new CategoryDAOImpl();
	   
	   else if(className.equalsIgnoreCase("productDAO"))	 
			 return new ProductDAOImpl();
	   
	   else if(className.equalsIgnoreCase("categoryService"))	 
			 return new CategoryServiceImpl();
	   
	   else if(className.equalsIgnoreCase("productService"))	 
			 return new ProductServiceImpl();
	   
	   else if(className.equalsIgnoreCase("categoryController"))	 
			 return new CategoryController();
	   
	   else if(className.equalsIgnoreCase("productController"))	 
			 return new ProductController();
	   
	   else if(className.equalsIgnoreCase("categoryRequest"))	 
			 return new CategoryRequest();
	   
	   else if(className.equalsIgnoreCase("categoryResponse"))	 
			 return new CategoryResponse();
	   
	   else if(className.equalsIgnoreCase("productRequest"))	 
			 return new ProductRequest();
	   
	   else if(className.equalsIgnoreCase("productResponse"))	 
			 return new ProductResponse();
	   
	   return null;
	}
}
