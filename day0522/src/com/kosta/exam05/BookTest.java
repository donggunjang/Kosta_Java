package com.kosta.exam05;

public class BookTest {
	public static void main(String[] args) {
		
//		Book book = new Book();
//		추상클래스의 객체는 생성할 수 없다.
		
		Book book1 = new Novel("N001","자바","장동건");
		Book book2 = new Novel("N001","자바","장동건");
		Book book3 = new Poet("P001","파이썬","이동건");
		Book book4 = new Poet("P002","설국","미야자키");
		Book book5 = new ScienceFiction("S001","C++","김동건");
		Book book6 = new ScienceFiction("S002","외로우니깐 사람이다","정승");
		
		System.out.println(book1.number+"번 연체료는 "+book1.getLateFees(3)+"원 입니다.");
		System.out.println(book2.number+"번 연체료는 "+book2.getLateFees(3)+"원 입니다.");
		System.out.println(book3.number+"번 연체료는 "+book3.getLateFees(3)+"원 입니다.");
		System.out.println(book4.number+"번 연체료는 "+book4.getLateFees(3)+"원 입니다.");
		System.out.println(book5.number+"번 연체료는 "+book5.getLateFees(3)+"원 입니다.");
		System.out.println(book6.number+"번 연체료는 "+book6.getLateFees(3)+"원 입니다.");
		
		if(book1.equals(book2)) {
			System.out.println("같은책입니다.");
		}else {
			System.out.println("다른책입니다.");
		}
		System.out.println("------------------------------------");
		if(book3.equals(book4)) {
			System.out.println("같은책입니다.");
		}else {
			System.out.println("다른책입니다.");
		}
		System.out.println("------------------------------------");
	}
}
