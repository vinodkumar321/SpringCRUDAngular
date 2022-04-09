package com.jocata.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jocata.config.SpringMVCContext;
import com.jocata.model.Category;
import com.jocata.util.DAOManager;

@Component
public class CategoryService {

	@Autowired
	DAOManager daoManager;
	public Category saveCategory(Category category) {
		Serializable id = daoManager.getCategoryDAO().save(category);
		category.setId((Integer) id);
		
		return category; 
	}
	public Category getCategory(Integer Id) {
		Category category = (Category) SpringMVCContext.getApplicationContext().getBean("category");
		return daoManager.getCategoryDAO().getEntityById(category, Id);
	}
	public List<Category> getCatList(){
		Category category = (Category) SpringMVCContext.getApplicationContext().getBean("category");
		return daoManager.getCategoryDAO().loadEntity(category);
	}
}
