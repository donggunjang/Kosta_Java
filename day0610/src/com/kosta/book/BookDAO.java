package com.kosta.book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.kosta.db.ConnectionProvider;

public class BookDAO {
	
	//select Table
	public ArrayList<BookVO> selectBook(String pubhlisher) {
		ArrayList<BookVO> list = new ArrayList<BookVO>();
		String sql = "SELECT *FROM book WHERE pubhlisher ='"+pubhlisher+"'"; 
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionProvider.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(new BookVO(rs.getInt(1), 
						rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
		}catch(Exception ex) {
			System.out.println("예외: "+ex.getMessage());
		}finally {
			ConnectionProvider.close(conn, stmt, rs);
		}
		return list;
	}
	
}
