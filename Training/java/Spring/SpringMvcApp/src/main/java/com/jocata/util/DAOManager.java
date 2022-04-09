package com.jocata.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jocata.dao.CategoryDAO;
import com.jocata.dao.ProductDAO;

@Component
public class DAOManager {

	@Autowired
	CategoryDAO categoryDAO;
	
	@Autowired
	ProductDAO productDAO;

	public CategoryDAO getCategoryDAO() {
		return categoryDAO;
	}

	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}
	
	public ProductDAO getProductDAO() {
		return productDAO;
	}

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	
	
}
