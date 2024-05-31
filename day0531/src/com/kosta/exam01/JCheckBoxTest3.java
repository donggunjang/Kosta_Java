package com.kosta.exam01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCheckBoxTest3 extends JFrame {
	JLabel jlb01;
	String []player = {"호날두","메시","박지성","손흥민","장동건"};
	JCheckBox []jcb = new JCheckBox[player.length];
	
	public void printCheck() {
		String r = "";
		
		for(int i=0; i<jcb.length; i++) {
			if(jcb[i].isSelected()) {
				r +=jcb[i].getText()+",";
			}
			
		}
		if(r.equals("")) {
			r = "선택해주세요!";
		}else {
			r += "를(을) 선택 했습니다.";
			r = r.substring(0, r.length()-1);
		}
		jlb01.setText(r);
		
		
	}
	
	
	public JCheckBoxTest3() {
		setLayout(new FlowLayout());
		
		for(int i=0; i<player.length; i++) {
			jcb[i] = new JCheckBox(player[i]);
			add(jcb[i]);
			jcb[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					printCheck();
				}
			});
		}
	
		jlb01 = new JLabel();
		add(jlb01);
		
		
		
		setSize(400,300);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
		
	}
	public static void main(String[] args) {
		new JCheckBoxTest3();

	}

}
