package com.kosta.exam01;

public class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		for(int i=1; i<=10; i++) {
			System.out.println("hello,"+name+"==>"+i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
