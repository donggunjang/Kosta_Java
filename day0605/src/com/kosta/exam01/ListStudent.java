package com.kosta.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ListStudent {

	public static void main(String[] args) {
		String sql = "select * from student";
		
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn =
					DriverManager.getConnection(
							"jdbc:oracle:thin:@localhost:1521:XE",
							"c##mdang",
							"madang");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String name = rs.getString(1);
				int kor = rs.getInt(2);
				int eng = rs.getInt(3);
				int math = rs.getInt(4);
				System.out.println(name+","+kor+","+eng+","+math);
			}
			
			
		}
		catch(Exception e){
			System.out.println("예외발생:" +e.getMessage());
		}finally{
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
					
			}catch(Exception e1) {
				System.out.println(e1.getMessage());
			}
		}
	}

}
