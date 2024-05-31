package com.kosta.exam01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NumberGuess extends JFrame {
	
	JTextField jtf_input;
	JLabel jlb_result;
	JLabel jlb_count;
	int cnt;
	
	Random r = new Random();
	int r_number = r.nextInt(100)+1;
	
	public NumberGuess() {
		setTitle("숫자 게임");
		setLayout(new FlowLayout());
		jtf_input = new JTextField(10);
		
		add(new JLabel("숫자를 추축하시오:"));
		add(jtf_input);
		
		jlb_result = new JLabel("여기에 결과가 나옵니다");
		add(jlb_result);
		
		jlb_count = new JLabel();
		
		
		
		JButton btnOk = new JButton("\s\s\s\s\s다시 한번\s\s\s\s\s");
		JButton btnClose = new JButton("\s\s\s\s\s종료\s\s\s\s\s");
		
		add(btnOk);
		add(btnClose);
		add(jlb_count);
		
		//프레임에 배경색을 설정.
		getContentPane().setBackground(Color.LIGHT_GRAY);
		
		jtf_input.setBackground(Color.white);
		
		btnOk.setBackground(new Color(150,150,150));
		btnClose.setBackground(new Color(150,150,150));
		
		// 라벨은 원래부터 투명한 성격
		// 배경색을 설정하려면 불투면하게 한 다음 설정
		jlb_result.setOpaque(true);
//		jlb_result.setBackground(Color.white);
		
		setSize(250, 150);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
		
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int userInput = Integer.parseInt(jtf_input.getText());
				System.out.println(userInput);
				System.out.println(r_number);
				
				String str = "            정답입니다            ";
				
				if(userInput == r_number) {
					jlb_result.setText(str);
					jlb_result.setBackground(new Color(150,150,250));
					System.out.println("정답입니다");
				}else if(userInput>r_number) {
					str = "             높아요 ㅠㅠ             ";
					jlb_result.setText(str);
					jlb_result.setBackground(Color.red);
					System.out.println("높다");
				}else {
					str = "             낮아요 ㅠㅠ             ";
					jlb_result.setText(str);
					System.out.println("낮다");
					jlb_result.setBackground(Color.red);
				}
				cnt++;
				jlb_count.setText(cnt+"번 시도 입니다.");
			}
		});
		
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jtf_input.setText("");
				jlb_result.setText("          숫자가 변했습니다          ");
				r_number = r.nextInt(100)+1;
				cnt = 0;
			}
		});
		
	}

	public static void main(String[] args) {
		new NumberGuess();

	}

}
