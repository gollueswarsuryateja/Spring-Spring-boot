package com.llts.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	
   // @RequestMapping("/")
	
	public ModelAndView m1() {
		return new ModelAndView("index");
		
	}
	
	

}
