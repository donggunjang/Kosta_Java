package com.kosta.exam30;

public class BridsTest {
	public static void main(String[] args) {
		Brids b1 = new Brids("참새", 10, 23);
		Brids b2 = new Brids("독수리",150, 30000);
		Brids b3 = new Brids("매", 70, 5000);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		System.out.println("-------------------------------------------------");
		
		b1.printWings();
		b1.printFly(10, 8);
		b1.printLanding(8, "나무");
		
		System.out.println("-------------------------------------------------");
		
		b2.printWings();
		b2.printFly(1000, 100);
		b2.printLanding(100, "황무지");
		
		System.out.println("-------------------------------------------------");
		
		b3.printWings();
		b3.printFly(500, 20);
		b3.printLanding(20, "나무");
		
		
	}
}
