package com.student.servlet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.bean.StudentBean;
import com.student.service.StudentService;

/**
 * Servlet implementation class StudentServlet
 */
@Controller
public class CreateStudentRestController  {
	@Autowired
	private StudentService studentService;
	
	
	public StudentService getStudentService() {
		return studentService;
	}


	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}


	@RequestMapping("/hello")
	@ResponseBody
	public String getHello()
	{
		return "Hello";
	}
	 
	@RequestMapping(value = "/allstudent",method = RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public ResponseEntity<List<StudentBean>> getAllStudent() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		
		List<StudentBean> listOfStudent =studentService.getAllStudent();
		return new ResponseEntity<List<StudentBean>>(listOfStudent, headers, HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/all",method = RequestMethod.GET,produces = "application/json")
	@ResponseBody
	public  List<StudentBean> getAllStudent1() {
		List<StudentBean> listOfStudent =studentService.getAllStudent();
		return  listOfStudent;
		
	}
	
	@RequestMapping(value = "/create",method = RequestMethod.POST,produces = "application/json")
	@ResponseBody
	public  StudentBean createStudent(@RequestBody StudentBean studentBean) {
		   studentService.createStudent(studentBean);
		return  studentBean;
		
	}
	
	@RequestMapping(value = "/create1",method = RequestMethod.POST,produces = "application/json")
	@ResponseBody
	public  ResponseEntity< StudentBean> createStudent1(@RequestBody StudentBean studentBean) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Type", "application/json");
		   studentService.createStudent(studentBean);
		return  new ResponseEntity< StudentBean>(studentBean, headers, HttpStatus.OK);
		
	}

}
