package com.kosta.exam01;

public class CharAtTest {
	public static void main(String[] args) {
		String data = "Hello Java";
		String name = "장동건";
		String year = "2024";
		char c1 = data.charAt(0);
		int c2 = year.charAt(0);
		char c3 = year.charAt(0);
		int c4 = (int)year.charAt(0);
		int c5 = Integer.parseInt(year.charAt(0)+"");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
	}
}
