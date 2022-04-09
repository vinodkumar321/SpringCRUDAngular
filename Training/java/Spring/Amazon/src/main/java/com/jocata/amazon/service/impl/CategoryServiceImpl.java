package com.jocata.amazon.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.jocata.amazon.dao.CategoryDAO;
import com.jocata.amazon.dao.impl.CategoryDAOImpl;
import com.jocata.amazon.model.Category;
import com.jocata.amazon.request.CategoryRequest;
import com.jocata.amazon.response.CategoryResponse;
import com.jocata.amazon.service.CategoryService;
import com.jocata.amazon.util.AmazonBeanFactory;

public class CategoryServiceImpl implements CategoryService {

	public List<CategoryResponse> getCategorylist() {
		CategoryDAO catDAO = (CategoryDAOImpl)AmazonBeanFactory.getBean("categoryDAO"); 
      	List<CategoryResponse> catList = new ArrayList<>();
      	List<Object> responseList = catDAO.list();
	    if(responseList != null && responseList.size() > 0) {
	     for(Object obj : responseList) {
	    	 Category category = (Category)obj;
	    	 CategoryResponse response = (CategoryResponse)AmazonBeanFactory.getBean("categoryResponse");
	    	 response.setId(category.getId());
	    	 response.setCatName(category.getCatName());
	    	 catList.add(response);
	     }
	    	 
	    }
		return catList;
	}

	public boolean addCategory(CategoryRequest categoryReq) {
	    CategoryDAO categoryDAO = (CategoryDAOImpl)AmazonBeanFactory.getBean("categoryDAO");
	    Category category = (Category)AmazonBeanFactory.getBean("category");
	    category.setCatName(categoryReq.getCatName());
	    
	    return categoryDAO.save(category);
		
	}

}
