package com.jocata.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringMVCWebInitializer implements WebApplicationInitializer{
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		//set webapplicationContext to return beans
		AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();		        
		root.scan("com.jocata");
		servletContext.addListener(new ContextLoaderListener(root));
		
		//set Dispatcher Servlet to act as router for all incoming requests
		ServletRegistration.Dynamic appServlet = 
		   		servletContext.addServlet("mvc", new DispatcherServlet(new GenericWebApplicationContext()));
		appServlet.setLoadOnStartup(1);
		appServlet.addMapping("/");	
	}		

}
