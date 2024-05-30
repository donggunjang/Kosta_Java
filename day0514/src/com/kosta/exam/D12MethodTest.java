package com.kosta.exam;

public class D12MethodTest {
	
	public static void printStr(int a) {
		for(int i=1; i<=a; i++) {
			System.out.println("시우야 안녕");
		}
		return;
	}

	public static void main(String[] args) {
		printStr(2);
		String title = "KOSTA 교육센터";
		System.out.println(title);
		printStr(4);
		int year = 2024;
		System.out.println(year);
		printStr(5);
		
	}

}
