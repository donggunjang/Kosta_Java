package com.kosta.exam23;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20); // p1이랑 참조변수가 힙에 있는 name과 age 맴버 변수를 가르킨다.
		p1.info();
//		System.out.println("이름:"+ p1.getName());
//		System.out.println("이름:"+ p1.getAge());
	}

}
