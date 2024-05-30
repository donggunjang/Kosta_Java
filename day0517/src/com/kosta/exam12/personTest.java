package com.kosta.exam12;

class Person{
	private String name;
	private int age;
	private double height;
	private boolean gender;
//	public Person() {}	// 다음과 같은 기본 생성자가 생성됨.
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getheight() {
		return height;
	}
	public boolean getGender() {
		return gender;
	}
}
public class personTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.getName()+","+p1.getAge()+","+p1.getheight()+","+p1.getGender());
	}
}
