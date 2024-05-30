package com.kosta.exam09;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle(int x, int y, double width, double height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle() {
		super();
	}

	@Override
	public void calcArea() {
		area = width * height;
	}

	@Override
	public void calcRound() {
		round = (width+height) * 2;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", x=" + x + ", y=" + y + ", area=" + area
				+ ", round=" + round + "]";
	}
	
	
	
}
