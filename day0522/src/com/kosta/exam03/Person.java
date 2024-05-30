package com.kosta.exam03;

public class Person {
	private String name;
	private int age;
	
	public boolean equals(Object obj) {
		boolean re = false;
		Person p = (Person)obj;
		if(name.equals(p.name) && age == p.age ) {
			re = true;
		}
		return re;  
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
