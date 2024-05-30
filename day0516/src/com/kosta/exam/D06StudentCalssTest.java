package com.kosta.exam;

class StudentInfo{
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
}


public class D06StudentCalssTest {
	public static void main(String[] args) {
		int year;
		year = 2024;
		StudentInfo data;
		data = new StudentInfo(); //클래스 참조변수는 new에 의하여 개체를 생성하고 사용할 수 있다.
		data.name = "홍길동";
		data.kor = 100;
		data.eng = 90;
		data.math = 98;
		data.tot = data.kor+data.eng+data.math;
		data.avg = data.tot / 3;
		System.out.println(year);
		System.out.println(data.name+","+data.kor+","+data.math+","+data.tot+","+data.avg);
	}

}