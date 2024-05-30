package com.kosta.exam06;

public class countTest {
	public static void main(String[] args) {
		CountDown c = new CountDown();
		(new Thread(c)).start();
	}
}
