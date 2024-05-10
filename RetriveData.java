package com.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveData {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "thala7";
		 
		try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
		 
			String sql = "SELECT * FROM employee";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			    String emp_id = result.getString("emp_id");
			    String emp_name = result.getString("emp_name");
			    String emp_address = result.getString("emp_address");
			    
			    String output = "employee #%d: %s - %s  - %s";
			    System.out.println(String.format(output, ++count, emp_id,emp_name, emp_address));
			}
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}

}
