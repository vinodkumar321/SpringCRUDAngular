package com.jocata.amazon.controller;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jocata.amazon.request.CategoryRequest;
import com.jocata.amazon.service.CategoryService;
import com.jocata.amazon.service.impl.CategoryServiceImpl;
import com.jocata.amazon.util.AmazonBeanFactory;

public class CategoryController implements Controller {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException {
	      String catName = request.getParameter("catName");	
	      try {
	      CategoryRequest categoryRequest = (CategoryRequest)AmazonBeanFactory.getBean("categoryRequest");
	      categoryRequest.setCatName(catName);
	      
	      PrintWriter out = response.getWriter();
	      
	      CategoryService categoryService = (CategoryServiceImpl)AmazonBeanFactory.getBean("categoryService");
	      
	      boolean success = categoryService.addCategory(categoryRequest);
	      
	      RequestDispatcher rd = request.getRequestDispatcher("manageCategory.jsp");
	      rd.include(request,response);
	      if(success) {
              out.println("<center><h3><font color=green>Category Added Successfully</font></h3></center>");	    	  
	      }else {
	    	  out.println("<center><h3><font color=red>Failed to Add Category.</font></h3></center>"); 
	      }
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
	}

}
