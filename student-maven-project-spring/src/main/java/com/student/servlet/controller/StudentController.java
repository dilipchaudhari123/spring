package com.student.servlet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping(value = "/stu")
	public String getmessage() {
		return "index1";
	}

	@RequestMapping(value = "/stu1")
	public ModelAndView getmessage1() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "Dilip");
		mv.setViewName("index2");
		  return mv;
	}

	@RequestMapping(value = "/stu2")
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "index2";

	}
	
	@RequestMapping(value = "/stu2/{id}")
	public String getStudentbyId(@PathVariable("id") int id,  ModelMap model) {
		
		model.addAttribute("id", "1");
		model.addAttribute("name", "xyz");
		model.addAttribute("age", "12");
		model.addAttribute("gender", "male");
		model.addAttribute("dob", "2029-18-10");
		return "studentbyid";

	}

}
