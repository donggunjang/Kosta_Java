package com.kosta.exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckBoxTest extends JFrame {
	JCheckBox jcb01;
	JCheckBox jcb02;
	
	public JCheckBoxTest() {
		setLayout(new FlowLayout());
		jcb01 = new JCheckBox("호날두");
		jcb02 = new JCheckBox("메시");
		
		add(jcb01);
		add(jcb02);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jcb01.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jcb01.isSelected()) {
					System.out.println("호날두 선택");
				}else {
					System.out.println("메시 선택 해제");
				}
			}
		});
		jcb02.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jcb02.isSelected()) {
					System.out.println("메시 선택");
				}else {
					System.out.println("메시 선택 해제");
				}
			}
		});
	}
	public static void main(String[] args) {
		new JCheckBoxTest();

	}

}
