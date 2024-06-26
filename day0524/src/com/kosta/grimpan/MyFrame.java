package com.kosta.grimpan;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 윈도우 프로그래밍(GUI 프로그래밍)을 위하여
// 자바가 제공하는 Frame을 상속받은 MyFrame 클래스를 만든다.

public class MyFrame extends Frame {
	//MyFrame의 구성요서(부속품, 맴버변수)로 LinePanel을 선언.
	DrawPanel dp;
	
	public MyFrame() {
		
		//생성자에서 부속품인 LinePanel을 생성
		dp = new DrawPanel();
		add(dp);
		
		//메뉴바 생성
		MenuBar mb = new MenuBar();
		
		//주메뉴 "그리기 도구"
		Menu menu_draw = new Menu("draw tool");
		//주메뉴 "색 선택 도구"
		Menu menu_color = new Menu("Selete color");
		
		//부메뉴 "선,사각형,원" 생성
		MenuItem draw_line = new MenuItem("line");
		MenuItem draw_rect = new MenuItem("rect");
		MenuItem draw_oval = new MenuItem("oval");
		//부메뉴 "빨강,파랑,그린" 생성
		MenuItem color_red = new MenuItem("Red");
		MenuItem color_blue = new MenuItem("Blue");
		MenuItem color_green = new MenuItem("Green");
		
		//주메뉴 "그리기 도구"에 부메뉴 "선,사각형,원"을 담는다
		menu_draw.add(draw_line);
		menu_draw.add(draw_rect);
		menu_draw.add(draw_oval);
		//주메뉴 "색 선택 도구"에 부메뉴 "빨강,파랑,녹색"을 담는다
		menu_color.add(color_red);
		menu_color.add(color_blue);
		menu_color.add(color_green);
		
		//메뉴바에 주메뉴"그리기 도구"를 담는다.
		mb.add(menu_draw);
		//메뉴바에 "색선택도구" 추가
		mb.add(menu_color);
		
		setMenuBar(mb);
		setSize(800,600);
		setVisible(true);
		
		
		//각각의 메뉴가 눌러 졌을때 기능별로 동작 하도록 
		//메뉴 이벤트를 등록.
		
		draw_line.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("선그리기를 선택 하였습니다.");
				dp.drawType = 0;
			}
		});
		
		draw_rect.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("사각형그리기를 선택 하였습니다.");
				dp.drawType = 1;
			}
		});
		
		draw_oval.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("원그리기를 선택 하였습니다.");
				dp.drawType = 2;
			}
		});
		
		color_red.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dp.drawColor = Color.red;
				
			}
		});
		
		color_blue.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dp.drawColor = Color.blue;
				
			}
		});
		
		color_green.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dp.drawColor = Color.green;
				
			}
		});
		
	}
}
//자바에서 클래스 안에 클래스를 만들 수 있다.
//class MyLineEvent implements ActionListener{
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("선그리기 누름");
//		
//		
//	}
//}
//
//MyLineEvent me = new MyLineEvent();
//draw_line.addActionListener(me);
//draw_line.addActionListener(new MyLineEvent());
	