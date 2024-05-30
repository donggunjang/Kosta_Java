package com.kosta.exam28;

public class FamilyTest {

	public static void main(String[] args) {
		
		Family.pro();
		
		//static 키워드가 붙어 있는 맴버변수는 객체와 무관하게 사용할 수 있다.
		//클래스 이름으로 접근 ==> 클래스변수
		Family.addr = "서울시 종로구 관철동";
		System.out.println(Family.addr);
		
		Family f1 = new Family("홍길동", 30);
		Family f2 = new Family("신짱구", 5);
		
		f1.pro();
		f2.pro();
		
		System.out.println("---------------------------------------------------");
		System.out.println(f1.getName()+","+f1.addr);
		System.out.println(f2.getName()+","+f1.addr);
		
		System.out.println("---------------------------------------------------");
		f1.addr = "제주도 서귀포시 ";
		System.out.println(f1.getName()+","+f1.addr);
		System.out.println(f2.getName()+","+f1.addr);
		
		
	}

}
