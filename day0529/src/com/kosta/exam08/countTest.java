package com.kosta.exam08;

public class countTest {
	public static void main(String[] args) {
		CountDown c = new CountDown();
		c.start();
		CountDownEvent ce = new CountDownEvent(2000, "연결 장치 분리!!");
		ce.start();
		
	}
}
