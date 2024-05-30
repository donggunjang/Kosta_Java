package com.kosta.exam;
//사용자 한테 두개의 정수를 입력받아 더하기 하여 결과를 출력

import java.util.Scanner;

public class D20_AddTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, add;
		System.out.println("첫번째 수를 입력:");
		a = sc.nextInt();
		System.out.println("두번째 수를 입력:");
		b = sc.nextInt();
		add = a + b;
		
		System.out.println("더하기 결과:" +add);
	}

}
