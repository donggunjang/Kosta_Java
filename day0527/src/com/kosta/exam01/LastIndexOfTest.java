package com.kosta.exam01;

public class LastIndexOfTest {
	public static void main(String[] args) {
		String data = "java";
		int n1 = data.indexOf("a");
		int n2 = data.lastIndexOf("a");
		
		System.out.println(n1); //1
		System.out.println(n2); //3
	}
}
