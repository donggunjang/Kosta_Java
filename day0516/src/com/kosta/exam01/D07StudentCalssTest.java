package com.kosta.exam01;

import java.util.Scanner;

class StudentInfo{
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
}


public class D07StudentCalssTest {
	public static void main(String[] args) {
		
		
		StudentInfo data;
		data = new StudentInfo(); //클래스 참조변수는 new에 의하여 개체를 생성하고 사용할 수 있다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 이름:");
		data.name =sc.next();
		System.out.println("국어점수:");
		data.kor =sc.nextInt();
		System.out.println("영어점수:");
		data.eng =sc.nextInt();
		System.out.println("수학점수:");
		data.math =sc.nextInt();
		
		data.tot = data.kor+data.eng+data.math;
		data.avg = data.tot / 3;
		System.out.println(data.name+","+data.kor+","+data.eng+","+data.math+","+data.tot+","+data.avg);
	}

}
