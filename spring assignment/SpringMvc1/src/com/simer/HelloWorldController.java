package com.simer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	
	@RequestMapping("/")
	public ModelAndView printHello() {
		ModelAndView model=new ModelAndView("/helloWorld");
		model.addObject("message", "Hello Spring MVC Framework!");
		return model;// view name
}
}