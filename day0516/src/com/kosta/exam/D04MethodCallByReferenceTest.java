package com.kosta.exam;

public class D04MethodCallByReferenceTest {
	
	//정수형 배열을 매개변수로 전달받아 배열의 요소를 모두 1씩 증가하는 메소드
	public static void printArray(int []arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] += 1;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%5d",arr[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int []data = {1,2,3,4,5}; //참조 자료형
		printArray(data); // 참조에 의한 호출
		for(int i=0; i<data.length; i++) {
			System.out.printf("%5d",data[i]);
		}
	}
}
