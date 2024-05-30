package com.kosta.exam;

import java.util.Scanner;

//5명의 정수를 입력받아
//최고값과 그때의 인덱스를 구하여 출력
//1) 배열의 맨 첫번째 요소를 MAX에 저장한다.
//2) 
public class D21_MaxTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int []score = new int[5];
		for(int i=0; i < score.length; i++) {
			System.out.printf("%d번째 학생의 점수를 입력:", i+1);
			score[i] = sc.nextInt();
		}
		int max;
		int maxPosition;
		max = score[0];
		maxPosition = 0;
		for(int i=1; i < score.length; i++) {
			if(score[i] > max) {
				max = score[i];
				maxPosition = i;
			}
		}
		System.out.println("최대값:"+max);
		System.out.println("최대값의 인덱스" +maxPosition);
	}

}
