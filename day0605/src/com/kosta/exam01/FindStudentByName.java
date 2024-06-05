package com.kosta.exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

// 사용자 한테 이름을 입력 받아
// 그 이름에 해당하는 학생의 정보를 조회 하여 출력하는 프로그램.
public class FindStudentByName {
	public static void main(String[] args) {
		
		Statement stmt = null;
		Connection conn = null;
		ResultSet rs = null;
		String name;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		name = sc.next();
		String sql = "select *from student where name =";
		sql += "'"+name+"'";
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:XE",
					"c##mdang",
					"madang");
			stmt = conn.createStatement();
			System.out.println(sql);
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				name =rs.getString(1);
				int kor =rs.getInt(2);
				int eng =rs.getInt(3);
				int math =rs.getInt(4);
				System.out.println(name+","+kor+","+eng+","+math);
			}
			
			
		}catch(Exception e) {
			System.out.println("예외: "+e.getMessage());
		}finally {
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
			}catch(Exception e) {
				System.out.println("예외발생: "+e.getMessage());
			}
		}
	}
}
