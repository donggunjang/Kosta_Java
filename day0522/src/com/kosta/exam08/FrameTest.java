package com.kosta.exam08;

import java.awt.Frame;

public class FrameTest {
	public static void main(String[] args) {
		Frame f = new Frame("그림판!!");
		System.out.println("윈도우를 만들다");
		
		f.setSize(800, 600);
		System.out.println("창의 크기를 설정");
		
		f.setVisible(true);
		System.out.println("창을 보이도록 설정");
	}
}
