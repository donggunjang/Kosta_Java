package com.kosta.exam04;

class Person{
	String name;
	String gender;
	int age;
	public void eat(String food) {
		System.out.printf("%s %d살 %s이(가) %s를(을) 먹고 있다.\n",
							gender, age, name, food);
	}
	
	public void walk(String where) {
		System.out.printf("%s %d살 %s이(가) %s를(을) 걷고 있다.\n",
				gender, age, name, where);
	}
}

public class PersonTest {
	public static void main(String[] args) {
		int data;
		Person lee;
		data = 2024;
		lee = new Person();
		Person kim = new Person();
		lee.name = "이제원";
		lee.gender = "남";
		lee.age = 28;
		
		kim.name = "김예은";
		kim.gender = "여자";
		kim.age = 26;
		
		lee.eat("비비빅");
		lee.walk("광화문");
		
		kim.eat("팥빙수");
		kim.walk("강의실");
	}
}
