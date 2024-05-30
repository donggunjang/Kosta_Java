package com.kosta.exam01;

import java.util.StringTokenizer;

public class SplitTestStringTokenizer {

	public static void main(String[] args) {
		String data = "이강인 손흥민 메시 호날두 장동건 레츠기릿!";
		StringTokenizer st = new StringTokenizer(data);

		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		
		
	}
}
