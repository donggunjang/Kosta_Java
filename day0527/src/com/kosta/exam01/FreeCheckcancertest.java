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

public class FreeCheckcancertest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jumin;
		int thisYear = (new Date()).getYear()+1900;
		System.out.println("주민번호입력:");
		jumin = sc.next();
		
		//주민번호 앞두자리를 잘라와서 정수로 변환하여 1900을 더함
		int userYear = Integer.parseInt(jumin.substring(0,2))+1900;
		
		//성별을 의미하는 값이 3,4이면 출생연도에 100을 더함.
		char gender = jumin.charAt(7);
		if(gender == '3' || gender == '4') {
			userYear += 100;
		}
		//나이 구하기
		int age = thisYear - userYear;
		
		//성별을 일단은 남자라고 본다.
		String gender_str = "남자";
		String data = "위암,간암,일반암";
		
		//성별 코드 값이 2이거나 4라면 "여자"라고 한다.
		if(gender == '2' || gender == '4') {
			gender_str = "여자";
		}
		
		System.out.println("무료 암검진 판별");
		System.out.println("올해연도:"+thisYear);
		System.out.println("출생연도:"+userYear);
		System.out.println("나이:"+age);
		System.out.println("성별:"+gender_str);
		if(age >=40 && thisYear % 2 == 0 && userYear % 2 ==0) {
			if(age >= 50) {
				data +=", 대장암";
			}
			
			if(gender =='2'|| gender=='4') {
				data += ", 자궁암, 유방암";
			}
			System.out.println("무료암검진 대상자 입니다.");
			System.out.println("암검진 항목은"+data+"입니다.");
			
		}else {
			System.out.println("무료암검진 대상자가 아닙니다.");
		}
		
	}
}
