package com.kosta.exam04;

public abstract class ThreeDimShape extends Shape {
	protected double volume;
	
	public abstract void calcVolume();// 추상메소드
	
	public ThreeDimShape() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ThreeDimShape(int x, int y) {
		super(x, y);
	}//생성자
	
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	
}
