package com.kosta.exam23;

public class Person {
	private String name;
	private int age;
	
	//Person의 모든 속성정보를 출력하는 메소드를 정의
	public void info() {
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
		
	}
	
	//setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//getter
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		
	}
}
