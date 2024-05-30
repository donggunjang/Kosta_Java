package com.kosta.exam09;

abstract class Bird {
	abstract void sound();
}

class Dove extends Bird {
	@Override
	void sound() {
		System.out.println("coo coo");
	}
}

public class BirdTest {
	public static void main(String[] args) {
//		Bird b = new Bird();
//		추상 클래스는 body가 구체화 되지 않는 메소드가 있기 때문에
//		객체 생성이 안된다.
		Bird b = new Dove();
//		상속관계에 있을때 자식 클래스는 부모클래스에 포함관계에 있기 때문에 
//		부모 클래스인 Bird의 참조변수 b가 자식클래스의 객체인 Dove를 참조 할 수 있다.
		b.sound();
	}
}
