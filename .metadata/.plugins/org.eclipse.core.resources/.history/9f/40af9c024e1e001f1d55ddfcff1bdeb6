package com.kosta.exam10;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame{
	JButton []arr = new JButton[15];
	
	public FlowLayoutTest() {
		setLayout(new FlowLayout());
		for(int i=0; i<arr.length; i++) {
			arr[i] = new JButton("버튼"+(i+1));
			add(arr[i]);
		}
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	public static void main(String[] args) {
		new FlowLayoutTest();
	}

}
