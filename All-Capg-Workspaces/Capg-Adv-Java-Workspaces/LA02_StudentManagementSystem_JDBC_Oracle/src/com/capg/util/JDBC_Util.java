package com.capg.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_Util {
	private static Connection conn;
	
	static {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "kushagra";
		String password = "@Kussu321";
		
		try {
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url , username , password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		return conn;
	}
}
