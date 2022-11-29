package com.springlec.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello2 {
	
	@RequestMapping
	public String hello2() {
		
		return "index";
	}
}
