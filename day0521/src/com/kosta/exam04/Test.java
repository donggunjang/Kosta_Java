package com.kosta.exam04;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Rectangle(10, 10, 100, 100);
		if(s instanceof TwoDimShape) {
			System.out.println("2차원도형입니다.");
		}else {
			System.out.println("2차원도형이 아닙니다.");
		}
		
	}
}
