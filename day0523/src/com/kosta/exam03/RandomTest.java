package com.kosta.exam03;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		int data = r.nextInt(); //int의 범뮈내에서 무작위로 뽑아 준다.
		System.out.println(data);
		//-75572068
		//-299947
		//123874
		
		int data2 = r.nextInt(10); // 0~ 10-1 사이에서 무작위로 뽑아준다.
		System.out.println(data2);
		//4
		//7
		//9
		
		//만약 1~10까지 난수를 출력
		int data3 = r.nextInt(10) +1;
		System.out.println(data3);
		
	}

}
