package com.springlec.base.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.service.CalcService;

@Controller
public class AController {
	
	@Autowired
	CalcService service;
	//연결시켜줌
	
	//계산 입력 화면
	@RequestMapping("/")
	public String input() {
		return "input";
	}
	
	//계산 실행
	@RequestMapping("/addCalc")
	public String calc(HttpServletRequest request, Model model) throws Exception {
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		
		int addResult=service.addAction(num1, num2);
		int subResult=service.subtraction(num1, num2);
		double mulResult=service.multiply(num1, num2);
		double divResult=service.divide(num1, num2);
		double quoResult=service.quotient(num1, num2);
		
		model.addAttribute("num1",num1);
		model.addAttribute("num2",num2);
		model.addAttribute("addition",addResult);
		model.addAttribute("subtraction",subResult);
		model.addAttribute("multiply",mulResult);
		model.addAttribute("divide",divResult);
		model.addAttribute("quotient",quoResult);
		
		return "calcResult";
	}
}
