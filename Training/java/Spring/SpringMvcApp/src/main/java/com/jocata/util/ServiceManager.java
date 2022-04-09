package com.jocata.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jocata.service.CategoryService;
import com.jocata.service.ProductService;

@Component
public class ServiceManager {

	@Autowired
	CategoryService categoryService;
    
	@Autowired
	ProductService productService;
	
	public CategoryService getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
   
	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	
}
