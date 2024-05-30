package com.kosta.exam05;

import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LinePanel extends Panel implements MouseListener {
	
	int x1,y1,x2,y2;
	
	public LinePanel() {
		System.out.println("생성자 동작함");
		addMouseListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		int x = x1;
		int y = y1;
		int width = x2 - x1;
		int height = y2 - y1;
		if(x1 > x2) {
			width = x1 - x2;
			x = x2;
		}
		if(y1 > y2) {
			height = y1 - y2;
			y = y2;
		}
	
		g.drawRect(x, y, width, height);
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("마우스 눌러짐");
		x1 = e.getX();
		y1 = e.getY();
		System.out.println("x1="+x1+","+"y1="+y1);
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("마우스 떼어짐");
		x2 = e.getX();
		y2 = e.getY();
		System.out.println("x2="+x2+","+"y2="+y2);
		repaint();
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}