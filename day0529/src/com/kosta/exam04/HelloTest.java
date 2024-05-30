package com.kosta.exam04;

import java.util.Date;

public class HelloTest {
	

	public static void main(String[] args) {
		
		while(true) {
			Date date = new Date();
			System.out.println((date.getYear()+1900)+"년"+(date.getMonth()+1)+"월"+
			date.getDate()+"일"+date.getHours()+"시"+date.getMinutes()+"분"+
			date.getSeconds()+"초" +"안녕하세요");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
