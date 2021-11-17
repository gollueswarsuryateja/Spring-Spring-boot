package com.ltts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller  //it is a controller
public class HomeController {
	@RequestMapping("/home")
    public String home() {
    	return "home";
    }
	
	@RequestMapping("/test")
    public String test() {
    	return "test";
    }
	
	@RequestMapping("/hello")
	public ModelAndView showinfo(Model model)
	{
		model.addAttribute("message", "we are done spring boot MVC");
		return new ModelAndView("welcome");
	}
    	
}
