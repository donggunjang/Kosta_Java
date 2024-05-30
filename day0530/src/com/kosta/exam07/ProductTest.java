package com.kosta.exam07;

public class ProductTest {

	public static void main(String[] args) {
		Product prod = new Product();
		Producer producer = new Producer(prod);
		Consumer consumer = new Consumer(prod);
		
		producer.start();
		consumer.start();

	}

}
