package com.kosta.exam03;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProductTest extends JFrame {
	JTextField jtf_no;
	JTextField jtf_item;
	JTextField jtf_qty;
	JTextField jtf_price;
	JButton btn_insert;
	
	public ProductTest(String title) {
		super(title);
		jtf_no = new JTextField();
		jtf_item = new JTextField();
		jtf_qty = new JTextField();
		jtf_price = new JTextField();
		
		setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4,2));
		JPanel p2 = new JPanel();
		p2.setLayout(new FlowLayout());
		
		p1.add(new JLabel("상품번호"));
		p1.add(jtf_no);
		p1.add(new JLabel("상품명"));
		p1.add(jtf_item);
		p1.add(new JLabel("수량"));
		p1.add(jtf_qty);
		p1.add(new JLabel("가격"));
		p1.add(jtf_price);
		
		btn_insert = new JButton("등록");
		p2.add(btn_insert);
		
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn_insert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int no = Integer.parseInt(jtf_no.getText());
				String item = jtf_item.getText();
				int qty = Integer.parseInt(jtf_qty.getText());
				int price = Integer.parseInt(jtf_price.getText());
				
				
				ProductVO pvo = new ProductVO(no, item, qty, price);
				ProductDAO dao = new ProductDAO();
				int re = dao.insertProduct(pvo);
				if(re == 1) {
					JOptionPane.showMessageDialog(null, "제품이 등록 되었습니다.");
				}else {
					JOptionPane.showMessageDialog(null, "제품 등록을 실패 했습니다.");
				}
				
				
			}
		});
		
	}
	
	public static void main(String[] args) {
		new ProductTest("제품 관리");
	}

}
