package com.xworkz.webspring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
@Component
@RequestMapping
	public class CountryController {
	
		public CountryController() {
			System.out.println("Created \t"+this.getClass().getSimpleName());
		}
		
		@RequestMapping("/Country.do")
		public  String onSave(HttpServletRequest req) {
			System.out.println("invoked onSave");
			String countryName = req.getParameter("countryName");
			String capitalCity = req.getParameter("capitalCity");
			String continent = req.getParameter("continent");
		
			System.out.println(" countryName "+countryName+" capitalCity "+capitalCity+
					" continent "+continent);
			
			return "/SuccessCountry.jsp";
		}
	}

