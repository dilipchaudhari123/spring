package com.student.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.bean.StudentBean;
import com.student.dao.StudentDao;
import com.student.dao.impl.StudentDaoImpl;
import com.student.entity.StudentEntity;
import com.student.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	
	//StudentDaoImpl studentDaoImpl = new StudentDaoImpl();
	//private StudentDao studentDaoImpl = new StudentDaoImpl();
	@Autowired
	private StudentDao studentDaoImpl;
	

	public StudentDao getStudentDaoImpl() {
		return studentDaoImpl;
	}

	public void setStudentDaoImpl(StudentDao studentDaoImpl) {
		this.studentDaoImpl = studentDaoImpl;
	}

	public void createStudent(StudentBean studentBean) {
		// TODO Auto-generated method stub

		 

		StudentEntity studentEntity = new StudentEntity(studentBean.getName(), studentBean.getAge(),
				studentBean.getGender());
		studentDaoImpl.createStudent(studentEntity);
	}

	public ArrayList<StudentBean> getAllStudent() {
		// TODO Auto-generated method stub

		 

		ArrayList<StudentEntity> studentEntityList = studentDaoImpl.getAllStudent();

		ArrayList<StudentBean> studentBeanList = new ArrayList<StudentBean>();
		for (int i = 0; i < studentEntityList.size(); i++) {
			StudentEntity studentEntity = studentEntityList.get(i);
			StudentBean studentBean = new StudentBean(studentEntity.getId(), studentEntity.getName(),
					studentEntity.getAge(), studentEntity.getGender());
			studentBeanList.add(studentBean);
		}
		return studentBeanList;
	}

}
