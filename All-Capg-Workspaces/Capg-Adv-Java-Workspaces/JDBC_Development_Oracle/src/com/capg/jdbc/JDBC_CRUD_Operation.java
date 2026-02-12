package com.capg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_CRUD_Operation {

	public static void main(String[] args) {
		
//		step 1:
		Connection conn = null;
		
//		step 2:
		String driver = "oracle.jdbc.driver.OracleDriver";
		
//		step 3:
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
//		step 4:
		String username = "kushagra";
		String password = "@Kussu321";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		try {
//			step 5:
			Class.forName(driver);
			conn = DriverManager.getConnection(url , username , password);
			conn.setAutoCommit(true);
			
			int choice = 0;
			boolean flag = true;
			
			do {
				
				 System.out.println("\n--- Employee CRUD Menu ---");
	             System.out.println("1. Insert Employee");
	             System.out.println("2. Show All Employees");
	             System.out.println("3. Delete Employee by ID");
	             System.out.println("4. Exit");
	             
	             System.out.print("Enter your choice: ");
	             choice = sc.nextInt();
	             
	             switch (choice) {
					case 1: {
//							step 6: 
							String query = "INSERT INTO EMPLOYEEINFO2 VALUES (? , ? , ?)";
//							step 7:
							pstmt = conn.prepareStatement(query);
							
							System.out.print("Enter Employee Id: ");
							int empId = sc.nextInt();
							sc.nextLine();  // consume leftover newline
							
							System.out.print("Enter Employee Name: ");
							String empName = sc.nextLine();
							
							System.out.print("Enter Employee Salary: ");
							double empSalary = sc.nextDouble();
//							step 8:
							pstmt.setInt(1 ,  empId);
							pstmt.setString(2 , empName);
							pstmt.setDouble(3 , empSalary);
//							step 9:
							int insertCount = pstmt.executeUpdate();
							System.out.println(insertCount + " record inserted.");
						}	
						break;
						
					case 2 : {
							String query = "SELECT * FROM EMPLOYEEINFO2";
							pstmt = conn.prepareStatement(query);
							
						    rs = pstmt.executeQuery();
						    
						    System.out.println("\nEmpNo\tEmpName\tSalary");
		             		while(rs.next()) {
		             			System.out.println(
		             					rs.getInt(1)+"\t"+
		             					rs.getString(2)+"\t"+
		             					rs.getDouble(3)
		             			);
		             		}
						}
						break;
						
					case 3 : {
							String query = "DELETE FROM EMPLOYEEINFO2 WHERE EMPNO = ?";
							pstmt = conn.prepareStatement(query);
							
							System.out.print("Enter Employee Id to delete: ");
							int empId = sc.nextInt();
							
							pstmt.setInt(1 , empId);
							
							int deleteCount = pstmt.executeUpdate();
							
							if(deleteCount > 0) {
								System.out.println("Successfully Deleted the Record");
							}
							else {
								System.out.println("No Record Found to DELETE");
							}
						}
						break;
						
					case 4: {
							System.out.println("Exiting...");
		             		flag = false;
						}
						break;
	             		
	             	default:
	             		System.out.println("Not a valid choice");
	             		break;
				}
	         
			} while (flag);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
		        if(rs != null) rs.close();
		        if(pstmt != null) pstmt.close();
		        if(conn != null) conn.close();
		        sc.close();
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }				
		}
		
	}

}