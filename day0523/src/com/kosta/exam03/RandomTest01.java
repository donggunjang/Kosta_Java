package com.kosta.exam03;

import java.util.Random;

public class RandomTest01 {

	public static void main(String[] args) {
//1~10사이의 난수 만들기	
//	방법4)
		long data = System.currentTimeMillis();
		// 현재의 컴퓨터의 시간을 밀리세컨으로 반환
		System.out.println(data);
		data = data % 10 + 1;
		System.out.println(data);
		
		
		
//	방법3)
//		Random r = new Random();
//		int data = r.nextInt();
//		System.out.println(data);
//		data = data >>> 1; // 양수로 만들어 주는 비트 연산자.
//		data = data % 10 +1;
//		System.out.println(data);
		
//	방법2)
//		Random r = new Random();
//		int data = r.nextInt();
//		if(data < 0) {
//			data = data * -1;
//		}
//		data = data % 10 + 1;
//		System.out.println(data);
		
//	방법1)
//		Random r = new Random();
//		int data1 = r.nextInt(10)+1;
//		System.out.println(10);
		
	}

}
