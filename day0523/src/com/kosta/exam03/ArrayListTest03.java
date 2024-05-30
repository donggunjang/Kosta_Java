package com.kosta.exam03;

import java.util.ArrayList;

class Human{
	String name;
	int age;
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void sayHello() {
		System.out.println("Hello" + name);
	}
}

public class ArrayListTest03 {

	public static void main(String[] args) {
		ArrayList<Human> list = new ArrayList<Human>();
		list.add(new Human("홍길동",20));
		list.add(new Human("이순신",22));
		list.add(new Human("김유신",25));
//		list.add("자바");
//		list.add(2024);
//		지금의 경우에 리스트에는 Human만 담을 수 있다.
		
//		for(int i=0; i<list.size(); i++) {
//			Human h = list.get(i);
//			h.sayHello();
//		}
		
		for(Human h:list) {
			h.sayHello();
		}
		
	}

}
