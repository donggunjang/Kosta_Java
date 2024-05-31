package com.kosta.exam01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class KorToEng2 extends JFrame {
	JTextArea jta01;
	JTextArea jta02;
	

	public KorToEng2() {
		jta01= new JTextArea(10, 50);
		jta02= new JTextArea(10, 50);
		
		JButton btnOK = new JButton("변환");
		JButton btnCancel = new JButton("취소");
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		p1.setLayout(new GridLayout(1, 2,10,10));
		p2.setLayout(new FlowLayout(FlowLayout.CENTER));		
		
		JScrollPane jsp01 = new JScrollPane(jta01);
		JScrollPane jsp02 = new JScrollPane(jta02);
		
		p1.add(jsp01);
		p1.add(jsp02);
		
		p2.add(btnOK);
		p2.add(btnCancel);
		
		setLayout(new BorderLayout());
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		HashMap<String, String> engMap = new HashMap<String, String>();
		engMap.put("텍스트", "Text");
		engMap.put("영어", "english");
		engMap.put("국어", "kor");
		engMap.put("바꾼다", "changed");
		
		
		
		btnOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = jta01.getText();
				Set<String> keyList = engMap.keySet();
				Iterator<String> iter = keyList.iterator();
				while(iter.hasNext()) {
					String kor = iter.next();
					String eng = engMap.get(kor);
					str = str.replace(kor, eng);
				}
				jta02.setText(str);

			}
		});
		
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jta01.setText("");
				jta02.setText("");
				
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		new KorToEng2();
	}

}