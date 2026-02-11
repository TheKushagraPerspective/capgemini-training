package com.capg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetNextExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "kushagra";
		String password = "@Kussu321";
		
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url , username , password);
			
			try {
				Statement stmt = conn.createStatement();
				
				ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEEINFO1");
				
				while(rs.next()) {
					System.out.println("Employee Number: " + rs.getInt(1));
					System.out.println("Employee Name: " + rs.getString("ENAME"));
					System.out.println("Employee Salary: " + rs.getInt(3));
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
