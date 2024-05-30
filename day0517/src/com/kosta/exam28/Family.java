package com.kosta.exam28;
/*
	클래스메소드는 객체없이도 동작하는 메소드이기 때문에
	객체를 생성해야지만 확보되는 메모리영역인 name과 age에 접근할 수 없다.
	
	static 메소드에서는
	static 맴버에만 접근할 수 있다.
 
*/


public class Family {
	private String name; //객체맴버변수
	private int age;	 //객체맴버변수
	public static String addr; //객체와 무관하게 사용가능
	
	public static void pro() {
		addr = "서울시 종로구 종로1동";
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
