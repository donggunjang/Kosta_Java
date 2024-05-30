package com.kosta.exam01;

import java.util.Scanner;

//사용자한테 아이디와 암호를 입력받아서
//올바른지 판별하는 프로그램
//(아이디: "kosta", 암호:"1234")
public class EqualsTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id,pw;
		System.out.println("아이디 입력:");
		id = sc.next();
		System.out.println("비밀번호 입력:");
		pw = sc.next();
		
		if(id.equals("kosta") && pw.equals("1234")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("아이디와 비밀번호가 유효하지 않습니다.");
		}
	}
}
