package com.kosta.exam01;

public class IndexofTest2 {

	public static void main(String[] args) {
		String data = "hello java hello oracle";
		int n = data.indexOf("hello");
		System.out.println(n);
		
		int n2 = data.indexOf("hello", 1);
		System.out.println(n2);	//뒤에서 부터 찾는다.
		
		

	}

}
