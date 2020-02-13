package com.xworkz.webspring.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;

@Component
@RequestMapping
public class ThirdController {
	//DispatcherServlet
	public ThirdController() {
		System.out.println("Created \t "+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/first.do")
	public String onEnd() {
		System.out.println("invoked onEnd");
		return "/index.jsp";
	}
}

