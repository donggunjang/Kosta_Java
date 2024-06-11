package com.kosta.exam01;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date today = new Date();
		int year = today.getYear() +1900;
		int month = today.getMonth() +1;
		int date = today.getDate();
		int hours = today.getHours();
		int minutes = today.getMinutes();
		int seconds = today.getSeconds();
		
		int day = today.getDay();
		
		System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Date: " + date);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
        System.out.println("Day: " + day);

	}

}
