package com.jocata.mailingsystem.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller { //trying to create an interface which looks like Servlet
	public void service(HttpServletRequest request, HttpServletResponse response) 
						throws ServletException, IOException;
}
