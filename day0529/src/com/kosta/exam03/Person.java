package com.kosta.exam03;

public class Person implements Runnable{
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("hello,"+name+"==>"+i);
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
