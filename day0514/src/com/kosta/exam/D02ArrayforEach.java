package com.kosta.exam;

public class D02ArrayforEach {

	public static void main(String[] args) {
		String []name = {"사과", "포도", "오렌지", "수박", "딸기"};
		
		//for each 반복문을 이용하여 배열의 모든 요소를 출력
		for(String i: name) {
			System.out.println(i);
		}
	}

}
