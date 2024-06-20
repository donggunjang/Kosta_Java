package com.kosta.movie;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.kosta.db.ConnectionProvider;

public class MovieDAO {
	
	//select Table
	public ArrayList<MovieVO> movieList(String theaterName) {
		ArrayList<MovieVO> list = new ArrayList<MovieVO>();
		String sql = "SELECT tl.thname, COUNT(r.thid) AS reservation_count, SUM(t.price) AS total_price "
                + "FROM THEATER tl "
                + "JOIN SCREEN t ON tl.thid = t.thid "
                + "JOIN RESERVATION r ON t.scrid = r.scrid "
                + "WHERE tl.thname = '"+theaterName+"'"
                + "GROUP BY tl.thname "
                + "ORDER BY tl.thname";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionProvider.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				list.add(new MovieVO(rs.getString(1), rs.getInt(2), rs.getInt(3)));
			}
		}catch(Exception ex) {
			System.out.println("예외: "+ex.getMessage());
		}finally {
			ConnectionProvider.close(conn, stmt, rs);
		}
		
		return list;
	}
	
}
