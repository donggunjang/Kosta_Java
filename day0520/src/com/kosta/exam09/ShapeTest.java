package com.kosta.exam09;

public class ShapeTest {
	public static void main(String[] args) {
//		Circle []data = new Circle[100];
//		Rectangle []data2 = new Rectangle[100];
		
		//다양한 2차원 도형을 담을 수 있는 배열을 만들기
		//그래서 부모클래스인 Shape으로 배열을 만든다.
		Shape []data = new Shape[3];
		data[0] = new Circle(10, 10, 50);
		data[1] = new Rectangle(10, 200, 100, 100);
		data[2] = new Circle(10, 310, 25);
		
		
		for(Shape s:data) {
			s.calcArea();
			s.calcRound();
			System.out.println(s);
		}
	}
}
