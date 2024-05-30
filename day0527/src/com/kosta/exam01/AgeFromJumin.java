package com.kosta.exam01;

import java.util.Date;
import java.util.Scanner;

//주민번호를 입력 받아서 나이를 계산하고 출력.
public class AgeFromJumin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num;
		System.out.println("주민번호 입력:000000-0000000");
		num = sc.next();
		
		String num_year = num.substring(0, 2);
		char num_gender = num.charAt(num.indexOf("-")+1);
		
		System.out.println(num_year);
		System.out.println(num_gender);
		
		int userYear = Integer.parseInt(num_year)+1900;
		
		if(num_gender == '3' || num_gender == '4') {
			userYear += 100;
		}
		
		System.out.println("출생연도:"+userYear);
		
		int thisYear = (new Date()).getYear()+1900;
		int age = thisYear - userYear;
		System.out.println("나이:"+age);
		
	}
}
