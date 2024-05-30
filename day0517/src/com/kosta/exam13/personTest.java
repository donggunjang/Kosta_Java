package com.kosta.exam13;

class Person{
	private String name;
	private int age;
	private double height;
	
//	public Person(String name, int age, double height) {
//		this.name = name;
//		this.age = age;
//		this.height = height;
//	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getheight() {
		return height;
	}
}
public class personTest {
	public static void main(String[] args) {
		//사용자가 생성자를 만들기 시작하면 더 이상 기본생성자를 제공하지 않는다.
		//필요하다면 사용자가 만들어서 사용해야 한다.
		Person p1 = new Person();
		System.out.println(p1.getName()+","+p1.getAge()+","+p1.getheight());
	}
}
