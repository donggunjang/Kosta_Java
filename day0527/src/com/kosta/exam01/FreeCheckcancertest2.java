package com.kosta.exam01;

// 주민번호를 입력받아
// 무료암검진 대상자를 판별하는 프로그램 작성.
// 무료암검진 대상자는 40세 이상이고 올해가 홀수연도이면 홀수연도 태어난 사람이고
// 올해가 짝수연도이면 짝수연도에 태어난 사람이며 무료암검진 항목은 다음과 같다.
// 40세 이상 남자 위암,간암,일반암
// 40세 이상 여자 위암,간암,일반암,자궁암,유방암
// 50세 이상 남자 위암,간암,일반암,대장암
// 50세 이상 여자 위암,간암,일반암,대장암,자궁암,유방암

import java.util.Date;
import java.util.Scanner;

public class FreeCheckcancertest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jumin;
		
		System.out.println("주민번호 입력:");
		jumin = sc.next();
		
		String jumin_year = jumin.substring(0,2); 
		char jumin_gender = jumin.charAt(jumin.indexOf("-")+1);
		
		System.out.println(jumin_year);
		System.out.println(jumin_gender);
		
		int thisYear = (new Date()).getYear()+1900;
		int userYear =Integer.parseInt(jumin_year)+1900;
		System.out.println(userYear);
		
		if(jumin_gender == '3' || jumin_gender == '4') {
			userYear += 100; 
		}
		int age = thisYear - userYear;
		System.out.println(age);
		
		if(age >= 40 && age < 50) {
			switch(jumin_gender) {
				case '1': System.out.println("40세 이상 남자이고 위암, 간암, 일반암 대상입니다.");break;
				case '2': System.out.println("40세 이상 여자이고 위암, 간암, 일반암, "
						+ "자궁암, 유방암 대상입니다.");break;
			}
		}else if(age >= 50) {
			switch(jumin_gender) {
				case '1': System.out.println("50세 이상 남자이고 위암, 간암, 일반암 대장암 대상입니다.");break;
				case '2': System.out.println("50세 이상 여자이고 위암, 간암, 일반암, "
						+ "자궁암, 유방암, 대장암 대상입니다.");break;
			}
		}else {
			System.out.println("무료 암검진 대상자가 아닙니다.");
		}
	}
}
