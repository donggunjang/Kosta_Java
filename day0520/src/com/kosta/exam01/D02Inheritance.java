package com.kosta.exam01;

class A{
	String title;
	int year;
}

class B extends A {
	String data;
	public void info() {
		System.out.println(title+","+year+","+data);
	}
}

public class D02Inheritance {

	public static void main(String[] args) {
		A ob1 = new A();
		B ob2 = new B(); // new B() 해서 그안에는 title,year,data 만큼 메모리가 할당
		
		ob2.title ="Hello";
		ob2.year = 2023;
		ob2.data = "상속";
		ob2.info();
		

	}

}
