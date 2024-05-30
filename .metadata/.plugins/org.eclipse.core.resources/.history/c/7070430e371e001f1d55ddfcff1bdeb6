package com.kosta.exam07;

// 생산자 클래스를 만든다.
// 소비자와 상관없이 계속하여 새로운 제품을
// 생산하기 위하여 Thread클래스를 상속받아
// 멀티쓰레드가 가능하도록 한다.
public class Producer extends Thread {
	
	//제품을 생산하기 위해 맴버변수로 제품을 선언
	private Product product;
	
	//생성시에 제품을 매개변수로 전달 받아
	//초기화합니다. 이제품이 소비자와 공유하는 자원.
	
	public Producer(Product product) {
		this.product = product;
		
	}
	
	//생산자 쓰레드가 해야 할 일을 run을 오버라이딩 하여 써준다.
	
	public void run() {
		
		//10개의 새로운 제품을 생산.
		for(int i=1; i<=10; i++) {
			try {
				product.makePdNumber();
				Thread.sleep(100);
			}catch(Exception e) {
				
			}
		}
	}
}
