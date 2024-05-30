package com.kosta.exam;

public class D13MethodTest {
	
	public static void printStr(int a, String str) {
		for(int i=1; i<=a; i++) {
			System.out.printf(str+"야(아) 안녕!\n");
		}
		return;
	}

	public static void main(String[] args) {
		printStr(2, "시우");
		String title = "KOSTA 교육센터";
		System.out.println(title);
		printStr(4, "새우");
		int year = 2024;
		System.out.println(year);
		printStr(5, "길동");
		
	}

}
