package com.kosta.exam01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ListStudentGUI extends JFrame {
	JTextArea jta;
	
	public ListStudentGUI() {
		jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JButton btnSelect = new JButton("조회하기");
		p.add(btnSelect);
		
		setLayout(new BorderLayout());
		add(jsp, BorderLayout.CENTER);
		add(p,BorderLayout.SOUTH);
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnSelect.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				
				String sql = "select *from student";
				
				Statement stmt = null;
				Connection conn = null;
				ResultSet rs = null;
				
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					conn = DriverManager.getConnection(
							"jdbc:oracle:thin:@localhost:1521:XE",
							"c##mdang",
							"madang");
					
					stmt = conn.createStatement();
					rs = stmt.executeQuery(sql);
					while(rs.next()) {
						String name = rs.getString(1);
						int kor = rs.getInt(2);
						int eng = rs.getInt(3);
						int math = rs.getInt(4);
						System.out.println(name+","+kor+","+eng+","+math);
						String row = name+","+kor+","+eng+","+math+"\n";
						jta.append(row);
					}
					
					
				}catch(Exception e1) {
					System.out.println("예외: "+e1.getMessage());
				}finally {
					try {
						if(rs != null) {
							rs.close();
						}
						if(stmt != null) {
							stmt.close();
						}
						if(conn != null) {
							conn.close();
						}
							
					}catch(Exception e1) {
						System.out.println("예외: "+e1.getMessage());
					}
				}
				
			}
		});
		
		
	}

	public static void main(String[] args) {
		new ListStudentGUI();
	}

}
