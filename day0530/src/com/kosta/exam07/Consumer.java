package com.kosta.exam07;

public class Consumer extends Thread {
	
	//생산자와 제품을 공유하기 위해
	//맴버변수로 제품을 선언.
	private Product product;
	
	//제품을 매개변수로 전달 받아 초기화 
	public Consumer(Product product) {
		this.product = product;
	}
	
	//제품 소비
	public void run() {
		for(int i=1; i<=10; i++) {
			product.usePdNumber();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
}
