package com.kosta.exam04;

public abstract class TwoDimShape extends Shape {
	protected double area;
	
	public TwoDimShape(int x, int y) {
		super(x, y);
	}//생성자
	public TwoDimShape() {
		super();
		// TODO Auto-generated constructor stub
	}//기본생성자



	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}


	public abstract void calcArea();
}
