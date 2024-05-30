package com.kosta.exam08;

public class ShapeTest {
	public static void main(String[] args) {
//		Rectangle r = new Rectangle(10, 10, 100, 100);
		Shape r = new Rectangle(10, 10, 100, 100);
//		Circle c = new Circle(10, 200, 50);
		Shape c = new Circle(10, 200, 50);
		
		r.calcArea();
		r.calcRound();
		
		c.calcArea();
		c.calcRound();
		
		System.out.println(r);
		System.out.println(c);	
	}
}
