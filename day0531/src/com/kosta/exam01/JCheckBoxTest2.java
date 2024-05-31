package com.kosta.exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class JCheckBoxTest2 extends JFrame {
	JCheckBox jcb01;
	JCheckBox jcb02;
	JLabel jlb01;
	
	
	public void printCheck(boolean ronaldo, boolean messi) {
		if(messi && ronaldo) {
			jlb01.setText("호날두와 메시 선택");
		}else if(messi) {
			jlb01.setText("메시를 선택 했어요");
		}else if(ronaldo) {
			jlb01.setText("호날두 선택 했어요");
		}else{
			jlb01.setText("아무것도 선택 하지 않았어요");
		}
	}
	
	
	public JCheckBoxTest2() {
		setLayout(new FlowLayout());
		jcb01 = new JCheckBox("호날두");
		jcb02 = new JCheckBox("메시");
		jlb01 = new JLabel("아무것도 선택하지 않았어요");
		
		
		add(jcb01);
		add(jcb02);
		add(jlb01);
		
		setSize(200,300);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jcb01.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				printCheck(jcb01.isSelected(), jcb02.isSelected());
			}
		});
		jcb02.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				printCheck(jcb01.isSelected(), jcb02.isSelected());
			}
		});
		
		
	}
	public static void main(String[] args) {
		new JCheckBoxTest2();

	}

}
