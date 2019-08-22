package com.student.service;

import java.util.ArrayList;

import com.student.bean.StudentBean;

public interface StudentService {
	
	public abstract void createStudent(StudentBean studentBean);
	
	public abstract ArrayList<StudentBean>  getAllStudent();

}
