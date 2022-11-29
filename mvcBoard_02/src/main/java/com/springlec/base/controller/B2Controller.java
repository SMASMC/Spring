package com.springlec.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.model.B2Dto;
import com.springlec.base.service.B2DaoService;

@Controller
public class B2Controller {

	
	@Autowired
	B2DaoService service;
	
	@RequestMapping("/list")
	public String list(Model model)throws Exception{
		List<B2Dto>listDao=service.listDao();
		model.addAttribute("list",listDao);
		return "list";
	}
	
}
