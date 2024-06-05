package com.kosta.exam01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class ListStudentGUI_JTable2 extends JFrame {
	Vector<String> colName;
	Vector<Vector<String>> rowData;
	JTable table;
	
	
	public ListStudentGUI_JTable2() {
		colName = new Vector<String>();
		colName.add("이름");
		colName.add("속도");
		colName.add("골결");
		colName.add("밸런스");
		
		rowData = new Vector<Vector<String>>();
		
		table = new JTable(rowData, colName);
		JScrollPane jsp = new JScrollPane(table);
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
		
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				int idx = table.getSelectedRow();
				Vector<String> row = rowData.get(idx);
				String search = row.get(0);
				System.out.println(search);
//				String speed = row.get(1);
//				String goal = row.get(2);
//				String balance = row.get(3);
//				System.out.println(search+","+speed+","+goal+","+balance);
				
				String sql = "select *from student";
				sql += "'"+search+"'";
				
				String driver = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@localhost:1521:XE";
				String username ="c##mdang";
				String password ="madang";
				
				Statement stmt = null;
				Connection conn = null;
				ResultSet rs = null;
				
				try {
					Class.forName(driver);
					
					conn = DriverManager.getConnection(
							url,
							username,
							password);
					
					stmt = conn.createStatement();
					rs = stmt.executeQuery(sql);
					
					//한건만 있으면 if가 좋음
					while(rs.next()) {
						String name = rs.getString(1);
						int speed = rs.getInt(2);
						int goal = rs.getInt(3);
						int balance = rs.getInt(4);
						System.out.println(name+","+speed+","+goal+","+balance);
					}
					
				}catch(Exception ex) {
					System.out.println("예외발생:" +ex.getMessage());
				}finally {
					try {
						if(rs != null) {
							rs.close();
						}
						if(stmt != null) {
							stmt.close();
						}
						if(conn!=null) {
							conn.close();
						}
					
						
					}catch(Exception ex){
						System.out.println("에외: "+ex.getMessage());
					}
				}
				
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		btnSelect.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				rowData.clear();
				
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
						int speed = rs.getInt(2);
						int goal = rs.getInt(3);
						int balance = rs.getInt(4);
						Vector<String> row = new Vector<String>();
						row.add(name);
						row.add(speed+"");
						row.add(goal+"");
						row.add(balance+"");
						rowData.add(row);
					}
					table.updateUI();
					
					
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
		new ListStudentGUI_JTable2();
	}

}
