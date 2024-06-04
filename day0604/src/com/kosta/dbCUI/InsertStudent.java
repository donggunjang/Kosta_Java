/*
 	사용자 한테 이름, 국어, 영어, 수학을 입력받아
 	새로운 레코드를 추가하도록 프로그램 작성
 */

package com.kosta.dbCUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertStudent {
	public static void main(String[] args) {
		String name;
		int kor, eng, math;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요:");
		name = sc.next();
		System.out.println("국어 점수를 입력하세요:");
		kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요:");
		eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요:");
		math = sc.nextInt();
		String sql ="insert into student values("+"'"+name+"'"+","+kor+","+eng+","+math+")";
		
		Statement stmt = null;
		Connection conn = null;
		try {
			//1. jdbc드라이버를 메모리에 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. DB서버에 연결한다.
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String username = "c##mdang";
			String password = "madang";
			conn = DriverManager.getConnection(url,username,password);
			
			//3. 데이터베이스 명령어 실행 담당자 객체를 생성.
			stmt = conn.createStatement();
			
			//4. 명령어 실행 담당자를 통해서 데이터베이스 명령을 실행한다.
			int re = stmt.executeUpdate(sql);
			if(re == 1) {
				System.out.println("레코드 추가를 성공하였습니다.");
			}else {
				System.out.println("실패");
			}
			
			
		}catch(Exception e) {
			System.out.println("예외발생: "+e.getMessage());
		}finally {
			try {
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
