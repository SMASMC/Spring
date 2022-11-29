package com.springlec.base;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class From_02 {

	
	@RequestMapping("/")//데이터를 바로 넘겨주는 느낌
	public String getStudentview() {//데이터를 바로 넘겨주는 느낌
		return "student/studentView";
	}
	@RequestMapping("/studentdto")//데이터를 바로 넘겨주는 느낌
	public String getStudent(studentIdDto studentIdDto) {//데이터를 바로 넘겨주는 느낌
		return "student/studentId";
	}
	
//	@RequestMapping("/student/{studentId}")//데이터를 바로 넘겨주는 느낌
//	public String getStudent(@PathVariable String studentId,Model model) {//데이터를 바로 넘겨주는 느낌
//		model.addAttribute("studentId", studentId);
//		
//		return "student/studentId";
//	}
	
	@RequestMapping("/student")
	public String confirmId(Model model, HttpServletRequest request) {
		String studentId=request.getParameter("studentId");
		
		model.addAttribute("studentId",studentId);
		
		return "student/studentId";
	}
	
}
