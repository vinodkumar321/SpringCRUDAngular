package com.jocata.amazon.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
  
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException; 
}
