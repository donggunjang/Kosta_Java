package com.kosta.exam;

public class D18MethodMaxArray {
	
	// 정수형 배열을 매개변수로 전달받아 가장 큰값을 찾아서 출력하는 메소드를 정의
	
	public static void printMaxArray(int []arr) {
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최대값은: "+max);
	}
	
	public static void main(String[] args) {
		
		int []data = {4,55,17,8,10,40};
		printMaxArray(data);
	}

}
