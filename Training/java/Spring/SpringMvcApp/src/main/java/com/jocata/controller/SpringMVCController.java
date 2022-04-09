package com.jocata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jocata.util.ServiceManager;

@Controller
public class SpringMVCController {

	@Autowired
	ServiceManager serviceManager;
	
	@RequestMapping("/welcome")
	public ModelAndView getWelcomePage() {
		return new ModelAndView("welcome"); //this ModelAndView takes help from viewResolver
	}
	
	@RequestMapping("/gotoCategory")
	public ModelAndView gotoCategory() {
		return new ModelAndView("category"); //this ModelAndView takes help from viewResolver
	}
	
	@RequestMapping("/gotoProduct")
	public ModelAndView gotoProduct() {
		return new ModelAndView("product"); //this ModelAndView takes help from viewResolver
	}
	
}
