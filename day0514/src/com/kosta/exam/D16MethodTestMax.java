package com.kosta.exam;

public class D16MethodTestMax {
	
	//두개의 실수를 매개변수로 전달받아 그 중에 큰수를 찾아 출력하는 메소드를 정의하고 호출.
	
	public static void printMax(double a, double b) {
		double max = a;
		if (b > max) {
			max = b;
		}
		System.out.println("큰수는"+max);
		return;
	}

	public static void main(String[] args) {
		printMax(1.6, 2.6);
	}

}
