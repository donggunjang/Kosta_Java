package com.kosta.exam05;

public class CountDownEvent extends Thread {
	private int dalay;
	private String msg;
	
	public CountDownEvent(int dalay, String msg) {
		super();
		this.dalay = dalay;
		this.msg = msg;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(dalay);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(msg);
	}
	
	
}
