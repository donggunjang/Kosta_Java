package com.kosta.exam01;

//다양한 형태의 자료형을 모두 문자열(String)로 만들 수 있다
//==> valueOf()
public class ValueOfTest {

	public static void main(String[] args) {
		int year = 2024;
		String data_year = year+"";
		
		
		double height = 56.7;
		String data_height = String.valueOf(height);
		
		boolean flag = false;
		String data_flag = String.valueOf(flag);
		
		char []arr = {'h','e','l','l','o'};
		String data_arr = String.valueOf(arr);
		
		System.out.println(data_year);
		System.out.println(data_height);
		System.out.println(data_flag);
		System.out.println(data_arr);
	}

}
