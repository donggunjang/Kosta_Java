/*
 	사용자 한테 이름, 국어, 영어, 수학을 입력받아
 	새로운 레코드를 추가하도록 프로그램 작성
 */

package com.kosta.dbGUI;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//학생의 이름, 국어, 영어, 수학을 입력받아
//student 테이블에 정보를 추가하는 프로그램을 GUI로 작성.

public class InsertStudent extends JFrame {
	JTextArea jta;
	JTextField jtf;
	JButton btn;
	
	String name;
	int kor, eng, math;
	
	public InsertStudent() {
		
		jta = new JTextArea();
		jtf = new JTextField(50);
		
		JScrollPane jsp = new JScrollPane(jta);
		JButton btn = new JButton("OK");
		JPanel p = new JPanel();
		
		p.setLayout(new BorderLayout());
		p.add(jtf, BorderLayout.CENTER);
		p.add(btn, BorderLayout.EAST);
		add(jsp, BorderLayout.CENTER);
		add(p, BorderLayout.SOUTH);
		
		setSize(400,450);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
	
	public static void main(String[] args) {
		new InsertStudent();
		
	}

}
