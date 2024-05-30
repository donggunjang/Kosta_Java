package com.kosta.exam04;

public class Cube extends ThreeDimShape {
	private double width;
	private double length;
	private double corner;
	
	public Cube() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cube(int x, int y, double width, double length, double corner) {
		super(x,y);
		this.width = width;
		this.length = length;
		this.corner = corner;
	}//생성자
	@Override
	public String toString() {
		return "Cube [width=" + width + ", length=" + length + ", corner=" + corner + ", volume=" + volume + ", x=" + x
				+ ", y=" + y + "]";
	}//toString
	@Override
	public void calcVolume() {
		volume = width * length * corner;
	}// 부피 구하는 메소드 
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getCorner() {
		return corner;
	}
	public void setCorner(double corner) {
		this.corner = corner;
	}

}
