package com.employee.main;

import com.employee.service.impl.EmployeeServiceImpl;

public class EmployeeDelete {

	public static void main(String[] args)
	{
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		
		employeeServiceImpl.deleteEmployeeById(1);

	}

}
