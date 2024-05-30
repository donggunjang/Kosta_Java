package com.kosta.exam24;

public class Person {
	private String name;
	private int age;
	
	//Person의 모든 속성정보를 문자열로 반환하는 메소드
	public String getInfo() {
		String result = "이름:"+name+",나이:"+age;
		return result;
		
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
