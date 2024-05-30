package com.kosta.exam08;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MyFrame extends Frame implements MouseListener {
	public MyFrame(String title) {
		super(title);
		setSize(800,600);
		setVisible(true);
		//마우스 일처리 담당자를 등록.
		addMouseListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 클릭");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 누름");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스 때어짐");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스들어옴");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("마우스나감");
		
	}
	
	
}

public class FrameTest02 {

	public static void main(String[] args) {
		MyFrame m = new MyFrame("Hello JAVA");
		
	}

}
