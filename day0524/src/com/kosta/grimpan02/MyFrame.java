package com.kosta.grimpan02;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

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
		
		//주메뉴 "파일 도구"
		Menu menu_file = new Menu("File");
		//주메뉴 "그리기 도구"
		Menu menu_draw = new Menu("draw tool");
		//주메뉴 "색 선택 도구"
		Menu menu_color = new Menu("Selete color");
	
		
		//부메뉴 "저장,열기" 생성
		MenuItem file_open = new MenuItem("open");
		MenuItem file_save = new MenuItem("save");
		//부메뉴 "선,사각형,원" 생성
		MenuItem draw_line = new MenuItem("line");
		MenuItem draw_rect = new MenuItem("rect");
		MenuItem draw_oval = new MenuItem("oval");
		//부메뉴 "빨강,파랑,그린" 생성
		MenuItem color_red = new MenuItem("Red");
		MenuItem color_blue = new MenuItem("Blue");
		MenuItem color_green = new MenuItem("Green");
		
		//주메뉴 "파일 도구"에 부메뉴 "열기, 저장"을 담는다
		menu_file.add(file_open);
		menu_file.add(file_save);
		
		//주메뉴 "그리기 도구"에 부메뉴 "선,사각형,원"을 담는다
		menu_draw.add(draw_line);
		menu_draw.add(draw_rect);
		menu_draw.add(draw_oval);
		//주메뉴 "색 선택 도구"에 부메뉴 "빨강,파랑,녹색"을 담는다
		menu_color.add(color_red);
		menu_color.add(color_blue);
		menu_color.add(color_green);
		
		//메뉴바에 "파일 도구" 추가
		mb.add(menu_file);
		//메뉴바에 주메뉴"그리기 도구"를 담는다.
		mb.add(menu_draw);
		//메뉴바에 "색선택도구" 추가
		mb.add(menu_color);
		
		
		setMenuBar(mb);
		setSize(800,600);
		setVisible(true);
		
		
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
		
		//파일저장에 대한 이벤트 처리
		file_save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					
					//우리가 그린 그래픽의 모든 정보는 패널의 리스트에 담겨있다
					// 그래서 파일로 출력할 내용은 바로 리스트이다.
					// 자바에는 객체단위로 입출력을 위하여
					// ObjectinputStream과 ObjectOutputStream을 만들어 두었다.
					
					//객체단위의 출력을 위한 ObjectOutputStream객체를 생성.
					//이때 생성시에 FileOutStream의 객체를 매개변수로 전달하여
					//생성할 파일의 위치와 이름을 알려준다.
					ObjectOutputStream oos =
							new ObjectOutputStream(new FileOutputStream("c:/data/bus.pan"));
					
					oos.writeObject(dp.list);
					
					//파일의 사용이 끝나면 파일을 닫아준다.
					oos.close();
					System.out.println("파일을 생성하였습니다.");
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		file_open.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ObjectInputStream ois = 
							new ObjectInputStream(new FileInputStream("c:/data/bus.pan"));
					dp.list = (ArrayList<GraphicInfo>)ois.readObject();
					
					dp.repaint();
					ois.close();
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
	}
}