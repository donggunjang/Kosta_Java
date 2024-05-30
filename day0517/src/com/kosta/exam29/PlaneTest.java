package com.kosta.exam29;

public class PlaneTest {

	public static void main(String[] args) {
		Plane p1 = new Plane("에어부산","A380",500);
		Plane p2 = new Plane("대한항공","B390",500);
		Plane p3 = new Plane();
		
		p3.setCompany("아시아나");
		p3.setModel("아시아나707");
		p3.setMaxcostomer(500);
		
		
		System.out.println(p1.getCompany()+","+p1.getModel()+","+p1.getMaxcostomer());
		System.out.println(p2.getCompany()+","+p2.getModel()+","+p2.getMaxcostomer());
		System.out.println(p3.getCompany()+","+p3.getModel()+","+p3.getMaxcostomer());
		
		System.out.println("비행기 대수:"+Plane.getPlanes());
	}

}
