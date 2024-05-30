package com.kosta.exam04;

public class Rectangle extends TwoDimShape {
	private double width;
	private double length;
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}//기본생성자
	public Rectangle(int x, int y, double width, double length) {
		super(x, y);
		this.width = width;
		this.length = length;
	}

	@Override
	public void calcArea() {
		area = width * length;
	}//넓이 계산 메소드
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", area=" + area + ", x=" + x + ", y=" + y + "]";
	}//toString
	
}
