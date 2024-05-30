package com.kosta.exam22;

public class RandomTest {

	public static void main(String[] args) {
//		double data = Math.random();
//		System.out.printf("%.4f\n",data);
//		
//		double data2 = data * 6;
//		System.out.printf("%.4f",data2);
		
		//1~6사이에 난수 발생
		int n = (int)(Math.random()*6+1);
		System.out.println(n);

	}

}
