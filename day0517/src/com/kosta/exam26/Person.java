package com.kosta.exam26;

public class Person {
	private String name;
	private int age;
	
	public String toString() {
//		String result = "이름:"+name+",나이:"+age;
//		return result;
		return "[이름:"+name+",나이:"+age+"]";
	}// toString
	
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
