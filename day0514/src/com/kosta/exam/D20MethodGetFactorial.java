package com.kosta.exam;

public class D20MethodGetFactorial {
	// 정수형 변수 n을 매개변수로 전달받아서 n!을 구하여 반환하는 메소드를 정의.
	
	public static int getFactorial(int n) { // 9
		
		int result = 1;
		for(int i=n; i>=1; i--) {			// 9,8,7,6,5,4,3,2,1
			result *= i;
		}
		return result;  
	}
	
	public static void main(String[] args) {
		
		System.out.println(getFactorial(9));
		int data = getFactorial(5);
		System.out.println(data);
	}

}
