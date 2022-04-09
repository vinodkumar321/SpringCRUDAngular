package com.jocata.amazon.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jocata.amazon.util.AmazonBeanFactory;

/**
 * Servlet implementation class DispatcherServlet
 */
@WebServlet("/Dispatcher")
public class Dispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String target = request.getParameter("target");
		Controller controller = null;
		
		PrintWriter out = response.getWriter();
		
		if(target.equalsIgnoreCase("category")) {
		      controller = (CategoryController)AmazonBeanFactory.getBean("categoryController");
		}else if(target.equalsIgnoreCase("product")) {
			  controller = (ProductController)AmazonBeanFactory.getBean("productController");;
		}else {
			out.println("wrong target.... <a href='/Amazon/index.jsp'>GobacktoHome</a>");
		}
		
		if(controller != null)
			controller.service(request,response);
	}

	

        

}
