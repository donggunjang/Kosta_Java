package com.kosta.exam01;

import java.util.Calendar;
import java.util.GregorianCalendar;

//도전과제1
//연도와 월을 매개변수로 전달받아 그달의 달력을 출력하는 메소드를 작성

public class CalendarTest3 {

	public static void main(String[] args) {
		
		GregorianCalendar today = new GregorianCalendar();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int date = today.get(Calendar.DAY_OF_MONTH);
		
		GregorianCalendar start = new GregorianCalendar(year, month, 1);
		int last = start.getActualMaximum(Calendar.DAY_OF_MONTH);
//		System.out.println(last);
		int day = start.get(Calendar.DAY_OF_WEEK);
//		System.out.println(day);		
		
		System.out.printf("\t\t*** %d년 %d월 ***\n", year, month+1);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("----------------------------------------------------");
		for(int j=1; j<day; j++) {
			System.out.print("\t");
		}
		
		for(int i=1; i<=last; i++) {
			System.out.print(i+"\t");
			if((i+day-1) % 7 == 0) {
				System.out.println();
			}
		}
	}

}

//현재 보여주고 있는 달력이 2024년 12월 달력인데 다음달을 누르면 2025년 1월 달력을 보여줘야한다.
//24년 01월에서 이전달을 보려면 2023년 12월 달력을 보여줘야 한다.
