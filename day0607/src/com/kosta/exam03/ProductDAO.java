package com.kosta.exam03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductDAO {
	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	static String username = "c##mdang";
	static String password = "madang";
	
	//loadTable
	public ArrayList<ProductVO> listProduct() {
		ArrayList<ProductVO> list = new ArrayList<ProductVO>();
		String sql = "select *from product";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new ProductVO(rs.getInt(1), 
						rs.getString(2), rs.getInt(3), rs.getInt(4)));
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
			}catch(Exception ex){
				System.out.println("예외: "+ex.getMessage());
			}
		}
		
		return list;
	} 
	
	//INSERT
	public int insertProduct(ProductVO pvo) {
		int re = -1;
		String sql = "insert into product values("+pvo.getNo()+", '"+pvo.getItem()+"', "
				+ ""+pvo.getQty()+", "+pvo.getPrice()+")";
		
		Connection conn = null; // 데이터베이스와 연결을 도와준다
		Statement stmt = null; //데이터베이스의 명령어를 담당해주는 객체
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			re = stmt.executeUpdate(sql);
		}catch(Exception ex){
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
	//UPDATE
	public int updateProduct(ProductVO pvo) {
		int re = -1;
		String sql = "update product set item = '"+pvo.getItem()+"', qty = "+pvo.getQty()+""
				+ ", price = "+pvo.getPrice()+" where no = "+pvo.getNo()+"";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			re = stmt.executeUpdate(sql);
		}catch(Exception ex){
			System.out.println("예외: "+ex.getMessage());
		}finally {
			try {
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
		
		return re;
	}
	
	//DELETE
	public int deleteProduct(int no) {
		int re = -1;
		String sql = "delete from product where no = '"+no+"'";
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

