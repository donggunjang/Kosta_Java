package com.kosta.exam04;

public class Cylinder extends ThreeDimShape {
	public static final double PI = 3.141592;
	private double radius;
	private double height;
	
	
	public Cylinder(int x, int y, double radius, double height) {
		super();
		this.radius = radius;
		this.height = height;
	}
	public Cylinder() {
		super();
		// TODO Auto-generated constructor stub
	}//생성자
	
	@Override
	public void calcVolume() {
		volume = Cylinder.PI *(radius * radius) * height;

	}// 부피 구하는 메소드
	@Override
	public String toString() {
		return "Cylinder [radius=" + radius + ", height=" + height + ", volume=" + volume + ", x=" + x + ", y=" + y
				+ "]";
	}//toString
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}
