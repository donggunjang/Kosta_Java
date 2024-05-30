package com.kosta.exam;

import java.util.Scanner;

class D21_MaxStudent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String []name = new String[5];
		int []score = new int[5];
		
		// 학생의 이름과 점수를 입력 받기
		for(int i=0; i<name.length; i++) {
			System.out.printf("%d번째 학생의 이름을 입력해 주세요:", i+1);
			name[i] = sc.next();
			System.out.printf("%s학생의 점수를 입력해 주세요:", name[i]);
			score[i] = sc.nextInt();
		}
		
		int maxScore;
		String maxStudent;
		
		//맨 첫번째 요소의 값을 가장 크다고 본다.
		maxScore = score[0];
		maxStudent = name[0];
		//int idx = 0;
		
		//나머지 배열의 모든 요소를 maxScore와 비교하여
		//그 값이 max보다 더 크면 그 값을 max 저장한다.
		for(int i=1; i<name.length; i++ ) {
			if(score[i] > maxScore) {
				maxScore = score[i];
				maxStudent = name[i];
				// idx = i;
			}
		}
		System.out.printf("최고점수는 %d점이고 학생의 이름은 %s입니다.", maxScore, maxStudent);
	}
}
