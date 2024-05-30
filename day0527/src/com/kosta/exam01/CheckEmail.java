package com.kosta.exam01;

import java.util.Scanner;

//이메일을 입력 받아서
//올바른 이메일 형식인지 판별하는 프로그램
public class CheckEmail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email;
		
		System.out.println("이메일을 입력하세요:");
		email = sc.next();
		
		String regex = "[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z0-9]+";
		if(email.matches(regex) != true) {
			System.out.println("올바른 이메일 형식이 아닙니다.");
		}else {
			System.out.println("올바른 이메일 형식입니다.");
		}
		
		
	}

}
