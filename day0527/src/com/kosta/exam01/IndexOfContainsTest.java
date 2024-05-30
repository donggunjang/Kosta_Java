package com.kosta.exam01;

public class IndexOfContainsTest {
	public static void main(String[] args) {
		String data = "hello java hello oracle";
//		if(data.indexOf("java") != -1) {
//			System.out.println("자바를 포함하고 있어요");
//		}else {
//			System.out.println("자바를 포함하고 있지 않아요");
//		}
		
//		if(data.contains("java")) {
//			System.out.println("자바를 포함하고 있어요");
//			}else {
//				System.out.println("자바를 포함하고 있지 않아요");
//			}
		
		if(data.matches(".*java.*")) {
			System.out.println("자바를 포함하고 있어요");
		}else {
			System.out.println("자바를 포함하고 있지 않아요");
		}
	}
}
