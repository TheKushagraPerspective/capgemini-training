package com.capg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PreparedStatementExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Oracle Connect Example.");
		Connection conn = null;
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "kushagra";
		String password = "@Kussu321";
		
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url , username , password);
			
			try {
				
				String query = "INSERT INTO EMPLOYEEINFO2 VALUES (? , ? , ?)";
				
				//Step1 :  Get PreparedStatement 
				PreparedStatement pstmt = conn.prepareStatement(query);
				//Step2 :  Set parameters
				pstmt.setInt(1 , 1);
				pstmt.setString(2 , "Kushagra Varshney");
				pstmt.setInt(3 , 650000);
				//Step3 : execute the query
				int i = pstmt.executeUpdate();
				
				System.out.println("Record inserted count :"+i);
			   	//Execute query once again
				
				pstmt.setInt(1,2);
				pstmt.setString(2,"Saksham Gupta");
				pstmt.setInt(3,575000);
				i=pstmt.executeUpdate(); 			
				
				System.out.println("Query executed for the second time count :"+i);
			
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("AT THE END");
	}

}
