package com.kosta.game5;

import java.awt.Color;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		MyPanel mp = new MyPanel();
		add(mp);
		setSize(600,600);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
	}
}
	
