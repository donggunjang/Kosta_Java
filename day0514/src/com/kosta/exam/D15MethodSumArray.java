package com.kosta.exam;

public class D15MethodSumArray {
	// 정수형 배열을 매개변수로 전달받아 배열의 총합을 누적하여 출력하는 메소드 정의
	public static void printSumArray(int []arr) {
		int sum = 0;
		for(int item:arr) {
			sum += item;
		}
		System.out.println("배열의 총합:"+sum);
		return;
	} 
	
	public static void main(String[] args) {
		int []data1 = {13,22,34,45,56};
		int []data2 = {12,23,44,55,66};
		printSumArray(data1);
		printSumArray(data2);
	}

}
