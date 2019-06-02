package com.employee.service;

import java.util.ArrayList;

import com.employee.bean.EmployeeBean;

 

public interface EmployeeService {
	public abstract void createEmployee(EmployeeBean employeeBean);
	
	public abstract ArrayList<EmployeeBean> getAllEmployee();
	
	public abstract void deleteEmployeeById(int employeeId);
	
	public abstract EmployeeBean getEmployeeById(int employeeId);
	public abstract void UpdateEmployee(EmployeeBean employeeBean);
}
