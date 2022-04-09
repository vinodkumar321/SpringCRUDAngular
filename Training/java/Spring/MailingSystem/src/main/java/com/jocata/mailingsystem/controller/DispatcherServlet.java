package com.jocata.mailingsystem.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DispatcherServlet")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Controller controller = null;
		
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("registration")) controller = new RegController();
		else if(action.equalsIgnoreCase("login")) controller = new LoginController();
		
		controller.service(request, response);
	}

}
