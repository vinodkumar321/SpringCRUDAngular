package com.jocata.config;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

public class SpringMVCContext {
	private static WebApplicationContext context = 
			ContextLoader.getCurrentWebApplicationContext();

	public static WebApplicationContext getApplicationContext() {
			return context;
	}
}
