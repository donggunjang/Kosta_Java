package com.kosta.exam01;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableTest extends JFrame {
	JTable table;
	public JTableTest() {
		String []colNames = {"이름","속도","골결","밸런스"};
		String [][]rowData = {
				{"손흥민","100","100","90"},
				{"이강인","93","99","100"},
				{"장동건","90","97","95"},
		};
		
		table= new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);
		add(jsp);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	public static void main(String[] args) {
		new JTableTest();

	}

}
