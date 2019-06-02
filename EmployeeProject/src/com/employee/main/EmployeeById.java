package com.employee.main;

import com.employee.bean.EmployeeBean;
import com.employee.service.impl.EmployeeServiceImpl;

public class EmployeeById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeServiceImpl employeeServiceImpl=new EmployeeServiceImpl();
		EmployeeBean employeeBean=employeeServiceImpl.getEmployeeById(7);
		System.out.println("id="+employeeBean.getId());
		System.out.println("name="+employeeBean.getName());
		System.out.println("age="+employeeBean.getAge());

	}

}
