package com.kosta.exam01;

public class SplitTest2 {

	public static void main(String[] args) {
		String data = "이강인 손흥민 메시 호날두 장동건 레츠기릿!";
		String []arr = data.split("\s");
		for(String name:arr) {
			System.out.println(name);
		}
	}

}
