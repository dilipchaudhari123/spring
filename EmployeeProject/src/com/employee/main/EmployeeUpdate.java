package com.employee.main;

import com.employee.bean.EmployeeBean;
import com.employee.service.impl.EmployeeServiceImpl;

public class EmployeeUpdate {

	public static void main(String[] args) {
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		EmployeeBean employeeBean= new EmployeeBean(7,"dilip2xyz",100);
		
		 employeeServiceImpl.UpdateEmployee(employeeBean);
	
		// TODO Auto-generated method stub

	}

}
