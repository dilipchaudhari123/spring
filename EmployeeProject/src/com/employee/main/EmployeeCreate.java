package com.employee.main;

import com.employee.bean.EmployeeBean;
import com.employee.service.impl.EmployeeServiceImpl;

public class EmployeeCreate {
	public static void main(String[] args)
	{
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		EmployeeBean employeeBean= new EmployeeBean(23,"dilip2",24);
		
		 employeeServiceImpl.createEmployee(employeeBean);
	}

}
