package com.kosta.exam29;

public class Plane {
	private String company; //제작사
	private String model;	//모델명
	private int maxcostomer;//최대승객수
	
	public static int planes;
	public static int getPlanes() {
		return planes;
	} // 비행기 대수를 반환하는 클래스 변수와 클래스 메소드 (static)
	

	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getMaxcostomer() {
		return maxcostomer;
	}
	public void setMaxcostomer(int maxcostomer) {
		this.maxcostomer = maxcostomer;
	}
	
	public Plane(String company, String model, int maxcostomer) {
		planes++;
		this.company = company;
		this.model = model;
		this.maxcostomer = maxcostomer;
	}
	public Plane() {
		planes++;
	}
	
	
	
	
	
}
