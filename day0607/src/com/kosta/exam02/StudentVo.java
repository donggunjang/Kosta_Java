package com.kosta.exam02;

public class StudentVo {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	//매개변수를 가지는 생성자
	public StudentVo(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//매개변수가 없는 생성자
	public StudentVo() {
		
	}
	//toString
	@Override
	public String toString() {
		return "StudentVo [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
	//setter getter 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
}
