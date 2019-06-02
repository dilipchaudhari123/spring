package com.employee.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.employee.dao.EmployeeDao;
import com.employee.entity.EmployeeEntity;
import com.employee.util.DatabaseConnection;
import com.mysql.cj.xdevapi.Result;

public class EmployeeDaoImpl implements EmployeeDao {
	
	
	

	@Override
	public ArrayList<EmployeeEntity> getAllEmployee() {
		// TODO Auto-generated method stub
		
		
		Connection conn=null;
		Statement stm= null;
		EmployeeEntity employeeEntity=null;
		ArrayList<EmployeeEntity> employeeList=new ArrayList<EmployeeEntity>();
		try
		{
			conn= DatabaseConnection.getMySqlConnection();
			stm=conn.createStatement();
			String sql= "SELECT*FROM employee";
			ResultSet rs=stm.executeQuery(sql);
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int age=rs.getInt(3);
				
			 employeeEntity =new EmployeeEntity(id,name,age);
			 employeeList.add(employeeEntity);
			}
				
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return employeeList;
	
	}

	@Override
	public void createEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement stm= null;
		try
		{
			conn= DatabaseConnection.getMySqlConnection();
			stm=conn.createStatement();
			String name=employeeEntity.getName();
			int id= employeeEntity.getId();
			int age=employeeEntity.getAge();
			String sql= "INSERT INTO employee(id,name,age)values("+id+",'"+name+"',"+age+")";
			boolean isInserted=stm.execute(sql);
			
			System.out.println(isInserted);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement stm= null;
		try
		{
			conn= DatabaseConnection.getMySqlConnection();
			stm=conn.createStatement();
			String sql= "DELETE FROM employee where id="+employeeId;
			boolean isDeleted=stm.execute(sql);
			
			System.out.println(isDeleted);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public EmployeeEntity getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		
		
		Connection conn=null;
		Statement stm= null;
		EmployeeEntity employeeEntity=null;
		try
		{
			conn= DatabaseConnection.getMySqlConnection();
			stm=conn.createStatement();
			String sql= "SELECT*FROM employee where id="+employeeId;
			ResultSet rs=stm.executeQuery(sql);
			
			while(rs.next())
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int age=rs.getInt(3);
				
			 employeeEntity =new EmployeeEntity(id,name,age);
			}
				
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return employeeEntity;
	}

	@Override
	public void UpdateEmployee(EmployeeEntity employeeEntity) {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement stm= null;
		try
		{
			conn= DatabaseConnection.getMySqlConnection();
			stm=conn.createStatement();
			String name=employeeEntity.getName();
			int id= employeeEntity.getId();
			int age=employeeEntity.getAge();
			String sql= "UPDATE employee set name='"+name+"',age="+age+" WHERE id="+id;
			boolean isUpdate=stm.execute(sql);
			
			System.out.println(isUpdate);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

}
