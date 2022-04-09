package com.jocata.amazon.service;

import java.util.List;

import com.jocata.amazon.request.CategoryRequest;
import com.jocata.amazon.response.CategoryResponse;

public interface CategoryService {
    
	public boolean addCategory(CategoryRequest categoryReq);   
	public List<CategoryResponse> getCategorylist();
}
