package com.springlec.base.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.model.ADto;
import com.springlec.base.service.ADaoService;

@Controller
public class AController {
	
	
	@Autowired
	ADaoService service;
	
	@RequestMapping("/list")
	public String list(Model model)throws Exception{
		List<ADto>listDao=service.listDao();
		model.addAttribute("list",listDao);
		return "list";
	}
	
	@RequestMapping("/write_view")
	public String writeview() {
		return "write_view";
	}
	
	@RequestMapping("/write")//write로 
	public String write(HttpServletRequest request, Model model)
	throws Exception
	{
		service.writeDao(request.getParameter("aName"), request.getParameter("aContent"), 
				request.getParameter("aAddress"), request.getParameter("aEmail"), request.getParameter("aRelation"));
		return "redirect:list";
	}
	
	@RequestMapping("/content_view")
	public String contentview(HttpServletRequest request, Model model) throws Exception{
		ADto contentDto=service.viewPage(Integer.parseInt(request.getParameter("seq")));
		model.addAttribute("content_view",contentDto);
		return "content_view";
	}
	@RequestMapping("/deleteDao")//delete
	public String deleteDao(HttpServletRequest request)throws Exception{
		service.deleteDao(Integer.parseInt(request.getParameter("seq")));
		return "redirect:list";
	}
	
	@RequestMapping("/updatelist")
	public String updatelist(HttpServletRequest request, Model model)
	throws Exception{
		service.updatelist(Integer.parseInt(request.getParameter("seq")),request.getParameter("aName"),request.getParameter("aContent"),
				request.getParameter("aAddress"),request.getParameter("aEmail"),request.getParameter("aRelation"));
		return "redirect:list";
	}
	
	@RequestMapping("/search")
	public String search(HttpServletRequest request, Model model) throws Exception{
		List<ADto> contentDto=service.search(request.getParameter("searchoption"),request.getParameter("keyword"));
		model.addAttribute("list",contentDto);
		return "list";
	}
}