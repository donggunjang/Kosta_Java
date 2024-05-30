package com.kosta.exam01;

public class MyUtil {

	//두개의 정수를 매개변수로 전달받아 그 중에 큰수를 찾아서 반환하는 메소드 정의
//	public int getMax(int a, int b) {
//		if(a < b) {
//			a = b;
//		}
//		
//		return a; 
//	}
	//두개의 실수를 매개변수로 전달받아 그 중에 큰수를 찾아서 반환하는 메소드 정의
	public double getMax(double a, double b ) {
		if(a < b) {
			a = b;
		}
		
		return a;
	}
	//실수형 배열을 매개변수로 전달받아 그 중에 가장 큰수를 찾아서 반환
	public double getMax(double []arr) {
		double max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
