package com.kosta.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionProvider {
	
	// static 매소드 이며 매개변수는 없고 connection 을 반환하는 메소드
	public static Connection getConnection() {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "c##mdang";
		String password = "madang";
		
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		}catch(Exception ex) {
			System.out.println("예외: "+ex.getMessage());
		}
		return conn;
	}
	
	// 매개변수 Connection과 statement와 ResultSet을 받고 close 해주는 메소드 반환값 없음
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}catch(Exception ex){
			System.out.println("예외: "+ex.getMessage());
		}
	}
	
	public static void close(Connection conn, Statement stmt) {
		try {
			if(stmt != null) {
				stmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}catch(Exception ex) {
			System.out.println("예외: "+ex.getMessage());
		}
	}

}
