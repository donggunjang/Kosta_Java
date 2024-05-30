package com.kosta.exam;

public class D17MethodTestGugudan {
	
	// 몇단을 출력할지를 매개변수로 전달받아 해당하는 구구단을 출력하는 메소드를 정의합니다.
	public static void guguDan(int dan) {
		
		if(dan < 2 || dan > 9) {
			return;
		}
		
		System.out.printf("*****%d단*****\n", dan);
		for(int i=1; i<=9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
			}
		System.out.println();
		return;
		}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		guguDan(5);
		guguDan(8);
		guguDan(100);
	}

}
