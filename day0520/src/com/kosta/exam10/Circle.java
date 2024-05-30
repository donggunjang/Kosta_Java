package com.kosta.exam10;

public class Circle extends Shape {
	private double radius;
	private final static double PI = 3.141592;
	
	public Circle (int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	@Override
	public void calcArea() {
		area = PI*(radius*radius);
	}

	@Override
	public void calcRound() {
		round = 2*PI*radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", pi=" + PI + ", x=" + x + ", y=" + y + ", area=" + area + ", round="
				+ round + "]";
	}
	
}
