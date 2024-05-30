package com.kosta.exam05;

class Person{
	private String name;
	private String gender;
	private int age;
	
	public String getName(){
		return name;
	}
	
	public String getGender(){
		return gender;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setName(String n) {
		name = n;
		return;
	}
	
	public void setGender(String g) {
		gender = g;
		return;
	}
	
	public void setAge(int a) {
		age = a;
		return;
	}
	
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
		Person lee;
		lee = new Person();
		
		lee.setName("이제원");
		lee.setGender("남");
		lee.setAge(24);
		lee.eat("비비빅");
		lee.walk("광화문");
		System.out.println("이름:"+lee.getName());
		System.out.println("성별:"+lee.getGender());
		System.out.println("나이:"+lee.getAge());
	}
}
