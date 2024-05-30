package com.kosta.exam04;

public class Triangle extends TwoDimShape {
	private double width;
	private double hight;
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Triangle(int x, int y, double width, double hight) {
		super(x, y);
		this.width = width;
		this.hight = hight;
	}//생성자
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", hight=" + hight + ", area=" + area + ", x=" + x + ", y=" + y + "]";
	}//toString
	@Override
	public void calcArea() {
		area = (width * hight)/2;
	}//넓이 구하는 메소드
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}

}
