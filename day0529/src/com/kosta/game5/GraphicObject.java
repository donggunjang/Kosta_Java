package com.kosta.game5;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
// 미래에 만들어질 적(상대편), 미사일, 플레이어(우리편)이 가져야할 공통적인 속성과
// 동작을 뽑아서 일반화를 시킨다(부모클래스 생성)
public class GraphicObject {
	
	//적, 미사일, 플레이어를 나타낼 이미지를 담을 변수
	BufferedImage img = null;
	//이미지를 출력할 좌표 x,y
	int x=0, y=0;
	
	//생성자 (생성시에 이미지 파일명을 매개변수로 전달받는다)
	//BufferedImage객체를 생성한다.
	public GraphicObject(String name) {
		try {
			img = ImageIO.read(new File(name));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//미래에 만들어질 후손클래스들이 가져야할 공통적인 메소드들
	public void update() { }
	public void draw(Graphics g) {
		g.drawImage(img, x, y, null);
	}
	
	public void KeyPressed(KeyEvent event) {}
	
}
