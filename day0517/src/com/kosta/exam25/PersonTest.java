
package com.kosta.exam25;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20); // p1이랑 참조변수가 힙에 있는 name과 age 맴버 변수를 가르킨다.
		Person p2 = new Person("김유신", 25);
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
