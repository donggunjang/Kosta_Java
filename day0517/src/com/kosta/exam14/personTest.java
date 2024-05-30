package com.kosta.exam14;

class Person{
	private String name;
	private int age;
	private double height;
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public Person() {
		
	}

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
		Person p1 = new Person();
		System.out.println(p1.getName()+","+p1.getAge()+","+p1.getheight());
		
		Person p2 = new Person("홍길동",24,183.6);
		System.out.println(p2.getName()+","+p2.getAge()+","+p2.getheight());
	}
}
