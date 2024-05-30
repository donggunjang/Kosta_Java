package com.kosta.exam06;

public class BookTest {

	public static void main(String[] args) {
//		Book b = new Book("Java의 정석", 412, "남궁석");
		Magazine m = new Magazine();
		Magazine m2 = new Magazine("java의 정석",412,"남궁식","2024/05/20");
		
//		System.out.println("*** Book ***");
//		System.out.println(b);
		System.out.println("*** Magazine ***");
		System.out.println(m);
		System.out.println(m2);
	}

}
