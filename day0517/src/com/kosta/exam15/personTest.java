package com.kosta.exam15;

class Person{
	private String name;
	private int age;
	private double height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Person(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public Person() {
		
	}
}
public class personTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.getName()+","+p1.getAge()+","+p1.getHeight());
		
		Person p2 = new Person("홍길동",24,183.6);
		System.out.println(p2.getName()+","+p2.getAge()+","+p2.getHeight());
	}
}
