package com.jocata.las.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVCController { //a controller who can serve as a controller return a model and view

	@GetMapping("/sayHello")
	public ModelAndView sayHello(@RequestParam("callerName") String callerName) {
		ModelAndView mv = new ModelAndView("hello");
		mv.addObject("caller",callerName);
		
		return mv;
	}
}
