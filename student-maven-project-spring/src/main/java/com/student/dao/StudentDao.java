package com.student.dao;

import java.util.ArrayList;

import com.student.entity.StudentEntity;

public interface StudentDao {
	
	public abstract void createStudent(StudentEntity studentEntity);
	
	public abstract  ArrayList<StudentEntity>  getAllStudent();

}
