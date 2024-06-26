package com.kosta.game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	//이미지 파일을 참조하기 위한 변수를 선언.
	BufferedImage img =null;
	
	public MyPanel() {
		// 이미지를 표현하기 위한 BufferedImage를 생성
		try {
			img = ImageIO.read(new File("player.png"));
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) { 
		g.drawImage(img, 100, 100 , null);
	}
	
}
