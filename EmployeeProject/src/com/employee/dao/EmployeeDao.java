package com.employee.dao;

import java.util.ArrayList;

import com.employee.entity.EmployeeEntity;

public interface EmployeeDao {
	
	public abstract void createEmployee(EmployeeEntity employeeEntity);
	
	public abstract ArrayList<EmployeeEntity> getAllEmployee();
	

	public abstract void deleteEmployeeById(int employeeId);

public abstract EmployeeEntity getEmployeeById(int employeeId);

public abstract void UpdateEmployee(EmployeeEntity employeeEntity);
}
