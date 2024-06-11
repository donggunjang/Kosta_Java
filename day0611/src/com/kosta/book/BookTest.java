package com.kosta.book;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class BookTest extends JFrame {
	JTextField jtf_pub;
	JButton btn_select;
	JTable table;
	Vector<Vector<String>> rowData;
	Vector<String> colName;
	
	public BookTest(String title) {
		super(title);
		
		setLayout(new BorderLayout());
		JPanel p1 = new JPanel(new FlowLayout());
		jtf_pub = new JTextField(20);
		btn_select = new JButton("조회");
		
		//p1에 라벨 텍스트필드 버튼을 삽입
		p1.add(new JLabel("출판사명 입력: "));
		p1.add(jtf_pub);
		p1.add(btn_select);
		
		//테이블의 속성명
		colName = new Vector<String>();
		colName.add("도서번호");
		colName.add("도서명");
		colName.add("도서가격");
		colName.add("판매가격");
		colName.add("판매일");
		colName.add("고객번호");
		colName.add("고객명");
		colName.add("전화번호");
		
		table = new JTable(rowData, colName);
		JScrollPane jsp = new JScrollPane(table);
		add(p1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		
		btn_select.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				rowData.clear();
				BookDAO dao = new BookDAO();
				ArrayList<BookVO> list = dao.bookList(jtf_pub.getText());
				for(BookVO vo:list) {
					Vector<String> row = new Vector<String>();
					row.add(vo.getBookid()+"");
					row.add(vo.getBookname());
					row.add(vo.getPrice()+"");
					row.add(vo.getSalepice()+"");
					row.add(vo.getOrderdate());
					row.add(vo.getName());
					row.add(vo.getPhone());
					rowData.add(row);
				}
				table.updateUI();
				
			}
		});
	
		setSize(1000,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new BookTest("도서 판매내역");
	}

}
