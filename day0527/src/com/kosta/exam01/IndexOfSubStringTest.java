package com.kosta.exam01;

import java.util.Scanner;

//이메일을 입력 받아서
//아이디만 추출하여 출력.
public class IndexOfSubStringTest {
	public static void main(String[] args) {
//		String email = "tiger@naver.com";
		Scanner sc = new Scanner(System.in);
		String email;
		
		System.out.println("이메일 입력:");
		email = sc.next();
		String id = email.substring(0, email.indexOf("@")); 
		
		System.out.printf("아이디는 %s입니다.", id);
	}

}
