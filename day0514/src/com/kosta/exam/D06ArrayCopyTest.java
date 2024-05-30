package com.kosta.exam;

public class D06ArrayCopyTest {
	public static void main(String[] args) {
		int []a = {1, 2, 3, 4, 5};
		int []b = new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
		}
		
		System.out.print("a배열의 요소==>");
		for(int data:a) {
			System.out.printf("%5d", data);
		}
		System.out.println();
		
		System.out.print("b배열의 요소==>");
		for(int data:b) {
			System.out.printf("%5d", data);
		}
		System.out.println();
		
		a[0] = 100;
		System.out.print("a배열의 요소==>");
		for(int data:a) {
			System.out.printf("%5d", data);
		}
		System.out.println();
		
		System.out.print("b배열의 요소==>");
		for(int data:b) {
			System.out.printf("%5d", data);
		}
		
	}
}
