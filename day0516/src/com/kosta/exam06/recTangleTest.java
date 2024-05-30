package com.kosta.exam06;

class Rectangle{
	private double width;
	private double length;
	
	public void setWidth(double w) {
		width = w;
		return;
	}
	
	public void setLength(double l) {
		length = l;
		return;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	public double calcArea() {
		double area = width * length;
		return area;
		
		
	}
}

public class recTangleTest {

	public static void main(String[] args) {
		Rectangle r1= new Rectangle();
		r1.setWidth(200);
		r1.setLength(300);
		System.out.println("가로"+r1.getWidth());
		System.out.println("세로"+r1.getLength());
		System.out.println("넓이"+r1.calcArea());
	}

}
