package com.springlec.base.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base.model.BDto;
import com.springlec.base.service.BDaoService02;

@Controller//@Controller라는 것이 controller를 서로 이어준다.
public class BController02 {

	@Autowired
	BDaoService02 service;
	//service를 나눠졌을 때 값을 받아서 사용
	
	//게시판 입력 실행
	@RequestMapping("/write")
	public String write(HttpServletRequest request) throws Exception{
		service.writeDao(request);//이전 MVC패턴과 동일
		return "redirect:list";//다시 부를때는 redirect를 입력해야 함
	}
	
	//제목을 누르면 입력되었던 값들을 불러오기 게시판 개별 검색
	@RequestMapping("/content_view")
	public String contentView(HttpServletRequest request, Model model)throws Exception {
		BDto contentDto = service.viewDao(Integer.parseInt(request.getParameter("bId")));
		model.addAttribute("content_view",contentDto);
		return "content_view";
	}
	//content_view에서 삭제 버튼을 누르면 delete가 되도록
	
	@RequestMapping("/deleteDao")
	public String deleteDao(HttpServletRequest request)throws Exception {
		service.deleteDao(Integer.parseInt(request.getParameter("bId")));
		
		return "redirect:list";
	}
	
	//content_view에서 수정 버튼을 누르면 update가 되도록
	
	@RequestMapping("/modify")//반환해서 넘겨줄 값은 없음
	public String modify(HttpServletRequest request) throws Exception{
		service.modify(Integer.parseInt(request.getParameter("bId")),request.getParameter("bName"), request.getParameter("bTitle"), request.getParameter("bContent"));
		return "redirect:list";//다시 부를때는 redirect를 입력해야 함
	}
	
	
} // ----
