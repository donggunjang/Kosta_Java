package com.kosta.exam;

public class D01MethodTest {
	
	public static String getFirstName(String []name, int []score) {
		String result ="";
		int topscore = score[0];
		int idx = 0;
		for(int i=1; i<name.length; i++) {
			if(score[i]>topscore) {
				topscore = score[i];
				idx = i;
			}
		}
		result = name[idx];
		return result;
	}
	
	public static void main(String[] args) {
		String []name = {"홍길동", "이순신", "유관순", "김유신", "강감찬"};
		int []score = {80,90,95,70,60};
		System.out.println( getFirstName(name, score));
	}
}
