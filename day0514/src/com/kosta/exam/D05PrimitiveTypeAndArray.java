package com.kosta.exam;

public class D05PrimitiveTypeAndArray {
	public static void main(String[] args) {
		int age1= 20;
		int age2= 20;
		double height = 185.9;
		int []data1 = {10,20,30,40,50};
		int []data2= {10,20,30,40,50};
		
		
		if(age1==age2) {
			System.out.println("동일");
		}else {
			System.out.println("다름");
		}
		
		if(data1==data2) {
			System.out.println("동일");
		}else {
			System.out.println("다름");
		}
	}
}
