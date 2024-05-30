package com.kosta.exam;

public class D21MethodEqualsArray {
	
	//실수형 배열 두개를 배개변수로 전달받아 두 배열이 서로 동일한지 판별하여 boolean을 반환하도록 메소드 정의.
	
	public static boolean isEquals(double []arr1, double []arr2) {
		
		boolean result = true;
		if(arr1.length != arr2.length) {
			return false;
		}
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		double []data1 = {1.6,2.2,3.5,4.3,5.5};
		double []data2 = {1.6,2.2,3.5,4.3,5.5};
		
		if(isEquals(data1, data2)) {
			System.out.println("두 배열이 같다");
		}else {
			System.out.println("두 배열이 다르다");
		}

	}

}
