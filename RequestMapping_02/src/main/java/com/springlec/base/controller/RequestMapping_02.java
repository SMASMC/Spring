package com.springlec.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestMapping_02 {

	@RequestMapping("/studentConfirm")
	public String studentReedirect(HttpServletRequest request, Model model) {
		String id=request.getParameter("id");
		if(id.equals("abc")) {
			return "redirect:studentOK";//밑에있는 @RequestMapping 값을 지정하여 그쪽으로 가겠다는 느낌
		}
		return "redirect:studentNG";//mapping의 값을 바꿔주는 것이 redirect이다.
	}
	@RequestMapping("/studentOK")public String studentOK() {
		return "student/studentOK";
	}
	@RequestMapping("/studentNG")public String studentNG() {
		return "student/studentNG";
	}
	
}
