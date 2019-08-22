package com.student.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.student.dao.StudentDao;
import com.student.entity.StudentEntity;
import com.student.util.DatabaseConnection;
@Repository
public class StudentDaoImpl implements StudentDao {

	public void createStudent(StudentEntity studentEntity) {
		// TODO Auto-generated method stub

		Connection conn = null;
		Statement stm = null;
		try {
			conn = DatabaseConnection.getMySqlconnection();
			stm = conn.createStatement();
			String name = studentEntity.getName();
			String gender = studentEntity.getGender();

			int age = studentEntity.getAge();

			String sql = "INSERT INTO studentdetails(name,age,gender) values('" + name + "'," + age + ", '" + gender
					+ "')";
			boolean isInserted = stm.execute(sql);
			System.out.println(isInserted);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public ArrayList<StudentEntity> getAllStudent() {
		// TODO Auto-generated method stub
		Connection con = null;
		Statement smt = null;
		StudentEntity studententity = null;

		ArrayList<StudentEntity> studentList = new ArrayList<StudentEntity>();
		try {
			con = DatabaseConnection.getMySqlconnection();
			smt = con.createStatement();
			String sql = "SELECT * FROM studentdetails";
			ResultSet rs = smt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String gender = rs.getString(3);
				StudentEntity studentEntity = new StudentEntity(age, name, age, gender);
				studentList.add(studentEntity);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return studentList;
	}

}
