package com.kosta.exam;

import java.util.Scanner;

public class homework {
	
	public static String yearAnimall(int n, String []animall) {
		String result ="";
		result = animall[n%12];
		return result;
	}
	//년사주
	public static String yearSaju(int year, String []sajupalja) {
		String result ="";
		result = sajupalja[(year%12)];
		return result;
	}
	//월사주
	public static String monthSaju(int year, int month, String []sajupalja) {
		String result ="";
		result = sajupalja[(year+month-1)%12];
		return result;
	}		
	//일사주
	public static String daySaju(int year, int month, int day, String []sajupalja) {
		String result ="";
		if(day > 12) {
			day = day % 12;
			result = sajupalja[(year+month+day-2)%12];
		}else {
			result = sajupalja[((year+month+day-2)%12)];
		}
		return result;
	}
	//시사주 (수정 필요 계산식이 잘못됌)
	public static String hourSaju(int year, int month, int day,int hour, String []sajupalja) {
		String result ="";
		if(hour > 12) {
			hour = hour % 12;
			result = sajupalja[((year+month+day+hour-3)%12)];
		}else {
			result = sajupalja[((year+month+day+(hour/3)-3)%12)];
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		int year;
		int month;
		int day;
		int hour;
		
		System.out.println("이름을 입력하세요:");
		name = sc.next();
		System.out.println("태어난 년도를 입력하세요(0000형식):");
		year = sc.nextInt();
		System.out.println("태어난 월을 숫자로 입력하세요:");
		month = sc.nextInt();
		System.out.println("태어난 일을 숫자로 입력하세요:");
		day = sc.nextInt();
		System.out.println("태어난 시간을 24시간 형식으로 입력하세요:");
		hour = sc.nextInt();
		
		String []animall = { "신", "유", "술", "해","자", "축", "인", "묘", "진", "사", "오", "미"};
		String []sajupalja = {"천역: 역마살, 다방면에 관심","천간: 이성에게 매력","천수: 손재주가 있어요.",
							"천명: 명이 길어요","천귀: 귀인 대접","천액: 액땜","천권: 권력, 리더십",
							"천파: 파동이 있어요, 해외 이주",
							"천인: 인간성, 법 없이도 살 사람","천문: 머리가 좋아","천복: 복을 갖고태어남",
							"천고: 외로움을 많이 타요"};
		
		//사주팔자 메서드 실행
		System.out.printf("****%s님의 사주팔자는 다음과 같습니다****\n", name);
		System.out.println(yearAnimall(year,animall)+"띠\t"+yearSaju(year, sajupalja));
		System.out.println(yearAnimall(((year+month-1)%12),animall)+"띠\t"+monthSaju(year, month, sajupalja));
		System.out.println(yearAnimall(((year+month+day-2)%12),animall)+"띠\t"+daySaju(year, month, day, sajupalja));
		System.out.println(yearAnimall(((year+month+day+hour-3)%12),animall)+"띠\t"+hourSaju(year, month, day, hour, sajupalja));
	}
}
