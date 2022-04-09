package com.jocata.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jocata.config.SpringMVCContext;
import com.jocata.model.Category;
import com.jocata.util.ServiceManager;

@Controller
public class CategoryController {

	@Autowired
	ServiceManager serviceManager;
	
	@GetMapping("/getCategory")
	public ModelAndView getCategory(@RequestParam("catid") Integer catid) {
		ModelAndView mv = new ModelAndView("catList");
		Category category = serviceManager.getCategoryService().getCategory(catid);
		mv.addObject("catName",category.getCatName());
		
		return mv;
	}
	
	@GetMapping("/addCategoryForm")
	public ModelAndView addCategory(){
		List<Category> catList = serviceManager.getCategoryService().getCatList();
		ModelAndView mv = new ModelAndView("addCategory");
		mv.addObject("catList", catList);
		return mv;
	}
	
	@PostMapping("/saveCategory")
	public ModelAndView saveCategory(HttpServletRequest request, 
									@RequestParam("catName")String catName)
	{
		ModelAndView mv = new ModelAndView("addCategory");
		
		Category category = (Category) SpringMVCContext.getApplicationContext().getBean("category");
		category.setCatName(catName);  //this is using RequestParam variable
		//category.setCatName(reqest.getParameter("catName")); //this is using HttpServletRequest
		
		category = serviceManager.getCategoryService().saveCategory(category);
		List<Category> catList = serviceManager.getCategoryService().getCatList();
		mv.addObject("catList", catList);
		
		return mv;		
	}
	
}
