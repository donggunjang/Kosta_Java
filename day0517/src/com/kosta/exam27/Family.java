package com.kosta.exam27;

public class Family {
	private String name; //객체맴버변수
	private int age;	 //객체맴버변수
	public static String addr; //객체와 무관하게 사용가능
	
	public static void pro() {
		System.out.println("pro입니다.");
	}
	
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
	public Family(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Family() {
		
	}
	
	
}
