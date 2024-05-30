package com.kosta.exam;

import java.util.Scanner;

//학생 5명의 이름, 국어, 영어, 수학을 입력받아 총점, 평균을 구하는 프로그램

public class D05StudentSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String []name = new String[5];
		int []kor = new int[5];
		int []eng = new int[5];
		int []math = new int[5];
		int []tot = new int[5];
		double []avg = new double[5];
		
		for(int i=0; i<name.length; i++) {
			System.out.printf("%d번째 학생의 이름:", i+1);
			name[i] = sc.next();
			System.out.printf("%d번째 학생의 국어점수:", i+1);
			kor[i] = sc.nextInt();
			System.out.printf("%d번째 학생의 영어점수:", i+1);
			eng[i] = sc.nextInt();
			System.out.printf("%d번째 학생의 수학점수:", i+1);
			math[i] = sc.nextInt();
			tot[i] = kor[i] + eng[i] + math[i];
			avg[i] = tot[i] / 3;
			}
		System.out.println("\t\t***성적 처리 결과***");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------");
		for(int i=0; i<name.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",
								name[i],kor[i],eng[i],math[i],tot[i],avg[i]);
		}
		
		//성적이 높은순으로 정렬하기
		for(int i=0; i<tot.length; i++) {
			for(int j=i+1; j<tot.length; j++) {
				if(tot[j] > tot[i]) {
					String temp_name = name[i];
					name[i] = name[j];
					name[j] = temp_name;
					
					int temp = kor[i];
					kor[i] = kor[j];
					kor[j] = temp;
					
					temp = eng[i];
					eng[i] = eng[j];
					eng[j] = temp;
					
					temp = math[i];
					math[i] = math[j];
					math[j] = temp;
					
					temp = tot[i];
					tot[i] = tot[j];
					tot[j] = temp;
					
					double temp_avg = avg[i];
					avg[i] = avg[j];
					avg[j] = temp_avg;
				}//end if
			}//end for j
		}//end for i
		System.out.println("\t\t***성적 처리 결과***");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------");
		for(int i=0; i<name.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",
								name[i],kor[i],eng[i],math[i],tot[i],avg[i]);
		}
	}
}
