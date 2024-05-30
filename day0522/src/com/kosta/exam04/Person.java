package com.kosta.exam04;

import java.util.Objects;

public class Person {
	private String name;
	private int age;
	
//	public boolean equals(Object obj) {
//		boolean re = false;
//		Person p = (Person)obj;
//		if(name.equals(p.name) && age == p.age ) {
//			re = true;
//		}
//		return re;  
//	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
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
