package com.xworkz.webspring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping
	public class PoliticsController {
		
		public PoliticsController() {
				System.out.println("Created \t"+this.getClass().getSimpleName());
			}
			
		@RequestMapping("/Politics.do")
		public  String onSave(HttpServletRequest req) {
			System.out.println("invoked onSave");
			String NoOfCandidate = req.getParameter("noOfCandidate");
			String PartyName = req.getParameter("partyName");
			String ElectionDate = req.getParameter("electionDate");
			
			System.out.println(" NoOfCandidate "+NoOfCandidate+" PartyName "+PartyName
					+" ElectionDate "+ElectionDate);
				
				return "/SuccessPolitics.jsp";
			}
}
