package com.kosta.exam05;

import java.awt.Frame;

public class MyFrame extends Frame {
	LinePanel lp;
	
	public MyFrame() {
		lp = new LinePanel();
		add(lp);
		setSize(800,600);
		setVisible(true);
		
	}
}
