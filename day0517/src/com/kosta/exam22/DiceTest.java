package com.kosta.exam22;

public class DiceTest {

	public static void main(String[] args) {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		
		d1.roll();
		d2.roll();
		
		System.out.println("첫번째 주사위의 면:"+d1.getFace());
		System.out.println("첫번째 주사위의 면:"+d2.getFace());
		
	}

}
