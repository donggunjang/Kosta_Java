package com.kosta.exam10;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest02 extends JFrame{
	
	//설정한 그리드의 수와 컴포넌트의 수가 맞지 않으면
	//컴포넌트에 수에 알아서 맞추어준다.
	public GridLayoutTest02() {
		setLayout(new GridLayout(3, 5));
		for(int i=1; i<=10; i++) {
			add(new JButton("버튼"+i));
		}
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new GridLayoutTest();
	}
}
