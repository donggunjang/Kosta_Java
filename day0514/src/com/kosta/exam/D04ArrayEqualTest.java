package com.kosta.exam;

public class D04ArrayEqualTest {

	public static void main(String[] args) {
		int []a = {1, 2, 3, 4, 5};
		int []b = {1, 2, 3, 4, 5};
		boolean flag = true;
		
		if(a.length != b.length) {
			flag = false;
		}else {
			for(int i=0; i<a.length; i++) {
				if(a[i]!=b[i]) {
					flag = false;
					break;
				}
			}
		}
		
		if(flag) {
			System.out.println("배열의 내용이 같다");
		}else {
			System.out.println("배열의 내용이 다르다");
		}
		
		
		
//		if(a==b) {
//			System.out.println("True");
//		}else {
//			System.out.println("False");
//		}
	}
}
