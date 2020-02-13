package com.xworkz.webspring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


	@Component
	@RequestMapping
	public class ProtestController {

		public ProtestController() {
			System.out.println("Created \t"+this.getClass().getSimpleName());
		}
		
		@RequestMapping("/Protest.do")
		public  String onApply(HttpServletRequest req) {
			System.out.println("invoked onApply");
			String organization = req.getParameter("organization");
			String reason = req.getParameter("reason");
			String date = req.getParameter("date");
			String location = req.getParameter("location");
			System.out.println(" organization "+organization + " reason "+reason + " date "+date + " location " +location);
			return "/Success.jsp";
		}
	}


