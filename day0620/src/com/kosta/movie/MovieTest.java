package com.kosta.movie;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MovieTest extends JFrame {
	JTextField jtf_pub;
	JButton btn_select;
	JTable table;
	Vector<Vector<String>> rowData;
	Vector<String> colName;
	
	public MovieTest(String title) {
		super(title);
		
		setLayout(new BorderLayout());
		JPanel p1 = new JPanel(new FlowLayout());
		jtf_pub = new JTextField(20);
		btn_select = new JButton("조회");
		
		//p1에 라벨 텍스트필드 버튼을 삽입
		p1.add(new JLabel("극장명 입력: "));
		p1.add(jtf_pub);
		p1.add(btn_select);
		
		//테이블의 속성명
		colName = new Vector<String>();
		colName.add("극장명");
		colName.add("예약건수");
		colName.add("총수익");
		
		
		rowData = new Vector<Vector<String>>();
		
		table = new JTable(rowData, colName);
		JScrollPane jsp = new JScrollPane(table);
		add(p1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		
		btn_select.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				rowData.clear();
				MovieDAO dao = new MovieDAO();
				ArrayList<MovieVO> list = dao.movieList(jtf_pub.getText());
				for(MovieVO vo:list) {
					Vector<String> row = new Vector<String>();
					row.add(vo.getTheaterName());
					row.add(vo.getCount()+"");
					row.add(vo.getPricesum()+"");
					rowData.add(row);
				}
				JOptionPane.showMessageDialog(null, "조회완료");
				table.updateUI();
				
			}
		});
	
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MovieTest("영화조회");
	}

}
