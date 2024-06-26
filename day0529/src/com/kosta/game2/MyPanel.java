package com.kosta.game2;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements KeyListener {
	
	//이미지 파일을 참조하기 위한 변수를 선언.
	BufferedImage img =null;
	
	public MyPanel() {
		// 이미지를 표현하기 위한 BufferedImage 객체를 생성
		try {
			img = ImageIO.read(new File("player.png"));
		}catch(IOException e){
			e.printStackTrace();
		}
		//키보드 이벤트를 등록
		addKeyListener(this);
		
		//패널은 원래부터 부슨 글자를 입력하는 용도가 아니다.
		//그래서 키보드이벤트를 등록해도 동작하지 않는다.
		//패널에 키보드 이벤트를 등록하려면 
		//포커스를 설정 해야 한다.
		requestFocus();
		setFocusable(true);
	}
	
	@Override
	protected void paintComponent(Graphics g) { 
		g.drawImage(img, 100, 100 , null);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		System.out.print(code);
		System.out.println("키가눌러짐");
		switch(code) {
			case 32: System.out.println("스페이스키 누름"); break;
			case 37: System.out.println("왼쪽 방향키 누름"); break;
			case 38: System.out.println("위쪽 방향키 누름"); break;
			case 39: System.out.println("오른쪽 방향키 누름"); break;
			case 40: System.out.println("아래 방향키 누름"); break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
