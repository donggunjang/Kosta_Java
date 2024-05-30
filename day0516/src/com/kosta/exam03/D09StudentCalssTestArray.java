package com.kosta.exam03;

import java.util.Scanner;

class StudentInfo{
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
}


public class D09StudentCalssTestArray {
	public static void main(String[] args) {
		
		StudentInfo []data;
		data = new StudentInfo[5]; //클래스 참조변수는 new에 의하여 개체를 생성하고 사용할 수 있다.
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<data.length; i++) {
			data[i] = new StudentInfo();
			System.out.printf("%d번째 학생의 이름:\n",i+1);
			data[i].name =sc.next();
			System.out.println("국어점수:");
			data[i].kor =sc.nextInt();
			System.out.println("영어점수:");
			data[i].eng =sc.nextInt();
			System.out.println("수학점수:");
			data[i].math =sc.nextInt();
			
			data[i].tot = data[i].kor+data[i].eng+data[i].math;
			data[i].avg = data[i].tot / 3.0;
		}
		
		for(int i=0; i<data.length; i++ ) {
			for(int j=i+1; j<data.length; j++) {
				if(data[j].tot > data[i].tot) {
					StudentInfo temp = data[i];
					data[i] = data[j] ;
					data[j] = temp;
					
				}
			}
		}
		
		System.out.println("\t\t*** 성적순 처리 결과 ***");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------");
		for(int i=0; i<data.length; i++ ) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",
								data[i].name,data[i].kor,data[i].eng,
								data[i].math,data[i].tot,data[i].avg);
		}
	}
}
