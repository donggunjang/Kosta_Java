package com.kosta.exam01;

class A{
	public void pro() {
		System.out.println("A클래스의 pro입니다.");
	}
	public final void test() {
		System.out.println("테스트입니다.");
	}
}

class B extends A {
	public void pro() {
		System.out.println("B클래스의 pro입니다.");
	}
//	public void test() {
//		
//	} A클래스에서 test() 메소드가 
//	  final로 정의 되었기 때문에 오버라이딩을 할 수 없다
}

public class FinalTest {

	public static void main(String[] args) {
		B ob = new B();
		ob.pro();
	}

}
