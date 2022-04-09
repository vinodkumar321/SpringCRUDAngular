package com.jocata.mailingsystem.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jocata.mailingsystem.request.UserRegistrationRequest;
import com.jocata.mailingsystem.service.UserMasterService;

public class RegController implements Controller{ //plain old java obj but can servce
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		//read all the request values coming in request
		UserRegistrationRequest regRequest = new UserRegistrationRequest();
		regRequest.setUsername(request.getParameter("username"));
		regRequest.setPassword(request.getParameter("password"));
		regRequest.setName(request.getParameter("name"));
		regRequest.setEmailid(request.getParameter("emailid"));
		regRequest.setMobileNumber(request.getParameter("mobileNumber"));
		
		//supply them to request pojo and give the pojo to service layer - call save method
		UserMasterService userService = new UserMasterService();
		boolean success  = userService.registerNewUser(regRequest);
				
		//return result back to caller which is received from service
		RequestDispatcher rd = null; 
		if(success) {
			rd = request.getRequestDispatcher("login.html");
			rd.include(request, response);
			out.println("<center><h4><font color=green>Registered Successfully. Plz login</font></h4></center>");
		}else {
			rd = request.getRequestDispatcher("registration.html");
			rd.include(request, response);
			out.println("<center><h4><font color=red>Registered Failed. Plz try again</font></h4></center>");
		}
		
	}

}
