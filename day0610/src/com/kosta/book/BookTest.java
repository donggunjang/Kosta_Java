package com.kosta.book;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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

import com.kosta.exam01.ProductDAO;
import com.kosta.exam01.ProductVO;

public class BookTest extends JFrame {
	JTextField jtf_pub;
	JButton btn_select;
	
	Vector<String> colName;
	Vector<Vector<String>> rowData; 
	JTable table;
	
	String pubhlisher;
	
	public void setData() {
		pubhlisher = jtf_pub.getText();
	}
	
	public BookTest(String title) {
		super(title);
		jtf_pub = new JTextField();
		
		colName = new Vector<String>();
		colName.add("도서번호");
		colName.add("도서명");
		colName.add("출판사");
		colName.add("가격");
		
		rowData = new Vector<Vector<String>>();
		table = new JTable(rowData, colName);
		JScrollPane jsp = new JScrollPane(table);
		
		setLayout(new BorderLayout());
		JPanel p1 = new JPanel(new GridLayout(1,1));
		p1.add(new JLabel("출판사"));
		p1.add(jtf_pub);
		
		JPanel p2 = new JPanel(new FlowLayout());
		btn_select = new JButton("조회");
		p2.add(btn_select);
		
		JPanel p_north = new JPanel(new BorderLayout());
		p_north.add(p1, new BorderLayout().CENTER);
		p_north.add(p2, new BorderLayout().SOUTH);
		add(p_north, new BorderLayout().NORTH);
		add(jsp, new BorderLayout().CENTER);
		
		btn_select.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				BookDAO dao = new BookDAO();
				ArrayList<BookVO> list = dao.selectBook(jtf_pub.getText());
				for(BookVO vo:list) {
					Vector<String> row = new Vector<String>();
					row.add(vo.getBookid()+"");
					row.add(vo.getBookname());
					row.add(vo.getPubhlisher());
					row.add(vo.getPrice()+"");
					rowData.add(row);
				}
				table.updateUI();
			}
		});
		
		setSize(600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new BookTest("도서목록 조회");
	}

}
