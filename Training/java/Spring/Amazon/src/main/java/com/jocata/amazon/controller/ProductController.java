package com.jocata.amazon.controller;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jocata.amazon.request.ProductRequest;
import com.jocata.amazon.service.ProductService;
import com.jocata.amazon.service.impl.ProductServiceImpl;
import com.jocata.amazon.util.AmazonBeanFactory;

public class ProductController implements Controller {

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		Integer catId = Integer.parseInt(request.getParameter("catId"));
		String productName = request.getParameter("productName");
		Integer productPrice = Integer.parseInt(request.getParameter("productPrice"));
		Integer productQuantity = Integer.parseInt(request.getParameter("productQuantity"));
		String productDescription = request.getParameter("productDescription");
		
		try {
			   ProductRequest productRequest = (ProductRequest)AmazonBeanFactory.getBean("productRequest");
			   productRequest.setCatId(catId);
			   productRequest.setProductName(productName);
			   productRequest.setProductPrice(productPrice);
			   productRequest.setProductQuantity(productQuantity);
			   productRequest.setProductDescription(productDescription);
			   
			   PrintWriter out = response.getWriter();
			   
			   ProductService productService = (ProductServiceImpl)AmazonBeanFactory.getBean("productService");
			   
			   boolean success = productService.addProduct(productRequest);
			   RequestDispatcher rd = request.getRequestDispatcher("manageProduct.jsp");
			   rd.include(request,response);
			   if(success) {
		              out.println("<center><h3><font color=green>Product Added Successfully</font></h3></center>");	    	  
			      }else {
			    	  out.println("<center><h3><font color=red>Failed to Add Product.</font></h3></center>"); 
			      }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
