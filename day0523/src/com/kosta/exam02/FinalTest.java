package com.kosta.exam02;

final class Person{
	String name;
	int age;
	public void sayHello() {
		System.out.println("hello" + name);
	}
}

//class Student extends Person{
//	String major;
//	public void study() {
//		System.out.println("study" + major);
//	}
//} ==> Person클래스가 final로 정의 되어 있기 때문에 상속을 받을 수 없다.
public class FinalTest {

	public static void main(String[] args) {
		
	}

}
