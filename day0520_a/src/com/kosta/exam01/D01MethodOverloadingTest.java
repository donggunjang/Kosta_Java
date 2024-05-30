package com.kosta.exam01;

public class D01MethodOverloadingTest {

	public static void main(String[] args) {
		// 메소드를 사용하기 위해 객체를 생성, 객체를 생성하지 않고 메소드를 사용하려면 static 메소드를 정의 해야한다.
		MyUtil util = new MyUtil();
		
		//메소드 실행시 매개변수의 데이터 타입에 따라 결정
		System.out.println(util.getMax(3,4)); // int는 double에 포함되기 때문에 double 매개변수로 갖는 매개변수가 동작
		System.out.println(util.getMax(6.5, 15.1));
		
		double []data = {5.5, 15.7, 6.7, 3.2};
		System.out.println(util.getMax(data));
		
		// int의 배열을 getMax에 넣으면 어떻게 될까?
//		int []data2 = {5, 15, 6, 3};
//		System.out.println(util.getMax(data2));
		
		//기본자료형 변수 int는 double에 포함되지만
		//배열은 오류가 발생
	}

}
