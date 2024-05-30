package com.kosta.exam01;

public class StartsWithEndsWith {

	public static void main(String[] args) {
		String data ="hello java";
		boolean flag = data.startsWith("hello");
		boolean flag2 = data.endsWith("java");
		boolean flag3 = data.endsWith("oracle");
		
		System.out.println(flag); //true
		System.out.println(flag2); //true
		System.out.println(flag3); //false
		

	}

}
