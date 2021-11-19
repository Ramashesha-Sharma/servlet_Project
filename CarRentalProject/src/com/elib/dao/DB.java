package com.elib.dao;
//if port is already in use then we have do this
//netstat -ano | findstr 8080
//taskkill /pid  Process_id /F
import java.sql.*;

public class DB {
	public static Connection getCon() {
		Connection con = null;
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental", "root", "MyNewPass");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
