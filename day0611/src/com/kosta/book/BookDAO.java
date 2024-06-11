package com.kosta.book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.kosta.db.ConnectionProvider;

public class BookDAO {
	
	//select Table
	public ArrayList<BookVO> bookList(String pubhlisher) {
		ArrayList<BookVO> list = new ArrayList<BookVO>();
		String sql = "SELECT b.bookid, bookname, price, saleprice, orderdate, c.custid, name, phone"
				+ "FROM book b, orders o, customer c"
				+ "WHERE b.bookid = o.bookid AND o.custid = c.custid"
				+ "AND pubhlisher = '"+pubhlisher+"'";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionProvider.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				list.add(new BookVO(rs.getInt(1), rs.getString(2), rs.getInt(3),
						rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getString(7),
						rs.getString(8), rs.getString(9)));
				
			}
		}catch(Exception ex) {
			System.out.println("예외: "+ex.getMessage());
		}finally {
			ConnectionProvider.close(conn, stmt, rs);
		}
		
		return list;
	}
	
}
