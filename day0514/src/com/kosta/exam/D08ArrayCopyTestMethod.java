package com.kosta.exam;

public class D08ArrayCopyTestMethod {
	
	//정수형 배열을 전달받아서 배열의 요소를 모두 출력하는 메소드를 정의
	public static void printArray(int []arr){
		for(int data:arr) {
			System.out.printf("%5d", data);
		}
		System.out.println();
		return;
	}

	public static void main(String[] args) {
		int []a = {1, 2, 3, 4, 5};
		int []b = new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
		}
		
		System.out.print("a배열의 요소는==>");
		printArray(a);
		System.out.print("b배열의 요소는==>");
		printArray(b);
		a[0] = 100;
		System.out.print("a배열의 요소는==>");
		printArray(a);
		System.out.print("b배열의 요소는==>");
		printArray(b);
	}

}
