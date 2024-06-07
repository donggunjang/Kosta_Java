package com.kosta.exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDao {
	public static String driver = "oracle.jdbc.driver.OracleDriver";
	public static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	public static String username = "c##mdang";
	public static String password = "madang";
	
	//모든 학생의 정보를 조회하여 ArrayList로 반환하는 메소드
	public ArrayList<StudentVo> listStudent(){
		ArrayList<StudentVo> list = new ArrayList<StudentVo>();
		String sql = "select *from student";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				list.add(new StudentVo(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4)));
			}
		}catch(Exception ex) {
			System.out.println("예외: "+ex.getMessage());
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
				
			}catch(Exception ex) {
				System.out.println("에외: "+ex.getMessage());
			}
		}
		
		return list;
	} 
	
	// StudentVo를 매개변수로 전달받고 int를 반환하는 insertStudent라는 이름의 메소드
	public int insertStudent(StudentVo svo) {
		int re = -1;
		String sql = "insert into student values('"+svo.getName()+"',"+svo.getKor()+","+svo.getEng()+","+svo.getMath()+")";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,username,password);
			stmt = conn.createStatement();
			re = stmt.executeUpdate(sql);
		}catch(Exception ex){
			System.out.println("에외: "+ex.getMessage());
		}finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
				if(conn != null) {
					conn.close();
				}
				
			}catch(Exception ex) {
				System.out.println("에외: "+ex.getMessage());
			}
			
		}
		
		return re;
	}
	
	public int updateStudent(StudentVo svo) {
		int re = -1;
		String sql = "update student set kor ="+svo.getKor()+""
				+ ", eng = "+svo.getEng()+", math="+svo.getMath()+" "
						+ "where name ='"+svo.getName()+"'";
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			re = stmt.executeUpdate(sql);
		}catch(Exception ex) {
			System.out.println("예외: "+ex.getMessage());
		}finally {
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
		
		return re;
	}

	public int deleteStudent(String name) {
		int re = -1;
		String sql = "delete from student where name ='"+name+"'";
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			re = stmt.executeUpdate(sql);
		}catch(Exception ex) {
			System.out.println("예외: "+ex.getMessage());
		}finally {
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
		
		return re;
	}
	
	
}
