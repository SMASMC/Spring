package com.springlec.base;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class Controller_02 {
	
	@RequestMapping("/view")
	public String board_view() {
		return "board/view";
	}
	
	@RequestMapping("/content")
	public String board_content(Model model) {//request getpara와 같음
		
		model.addAttribute("id","kim");
		model.addAttribute("age",30);
		
		return "board/content";
	}
	
	@RequestMapping("/reply")
	public ModelAndView board_reply() {
		ModelAndView mv=new ModelAndView();
		
		mv.addObject("id","kim");
		mv.addObject("age",20);
		mv.setViewName("board/reply");
		
		return mv;
		
	}
	
}
