package com.kosta.exam07;

public class CountDownEventTest {

	public static void main(String[] args) {
		CountDownEvent ce = new CountDownEvent(10000, "hello");
		ce.start();
	}

}
