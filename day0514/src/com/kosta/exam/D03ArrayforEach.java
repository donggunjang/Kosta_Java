package com.kosta.exam;

public class D03ArrayforEach {

	public static void main(String[] args) {
									
		int[] numbers = new int[5]; 
		for(int i = 0; i < 5; i++){	// 0  1  2  3  4
			numbers[i] = i + 1;		//[1][2][3][4][5]
		}
		for(int i: numbers){
			System.out.println(i);
			System.out.println(numbers[i]); 
		}

	}

}
