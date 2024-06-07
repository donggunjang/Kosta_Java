package com.kosta.exam01;

import javax.swing.JFrame;

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
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// 학생의 이름, 국어, 영어, 수학을 입력받아 
// student테이블에 정보를 추가하는 프로그램을 GUI로 작성합니다.
// 화면구성및 변수명등은 자유롭게 합니다.

public class InsertAndSelectStudentGUI extends JFrame {
	JTextField jtf_name;
	JTextField jtf_speed;
	JTextField jtf_goal;
	JTextField jtf_balance;
	
	JTable table;
	Vector<String> colNames;
	Vector<Vector<String>> rowData;
	
	public static String driver = "oracle.jdbc.driver.OracleDriver";
	public static String url = "jdbc:oracle:thin:@localhost:1521:XE";
	public static String username ="c##mdang";
	public static String password ="madang";
	
	//데이터베이스 student의 모든 학생의 정보를 조회하여
	//JTable에 출력하는 메소드
	public void loadStudent() {
		
		rowData.clear();
		String sql = "select *from student";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				try {
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
				}catch(Exception e) {
					System.out.println("예외 :"+e.getMessage());
				}
				table.updateUI();
			}
			
		}catch(Exception e) {
			System.out.println("에외: "+e.getMessage());
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
			}catch(Exception e){
				System.out.println("예외 :"+e.getMessage());
			}
		}
	}
	
	public InsertAndSelectStudentGUI() {
		
		jtf_name = new JTextField(10);
		jtf_speed = new JTextField(5);
		jtf_goal = new JTextField(5);
		jtf_balance = new JTextField(5);
		
		JPanel p = new JPanel();
		p.add(new JLabel("이름"));
		p.add(jtf_name);
		p.add(new JLabel("속도"));
		p.add(jtf_speed);
		p.add(new JLabel("골결"));
		p.add(jtf_goal);
		p.add(new JLabel("밸런스"));
		p.add(jtf_balance);
		
		JButton btnAdd= new JButton("등록");
		JButton btnUpdate = new JButton("수정");
		JButton btnDelete = new JButton("삭제");
		p.add(btnAdd);
		p.add(btnUpdate);
		p.add(btnDelete);
		
		
		colNames = new Vector<String>();
		colNames.add("이름");
		colNames.add("속도");
		colNames.add("골결");
		colNames.add("밸런스");
		rowData = new Vector<Vector<String>>();
		table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);
		
		add(p, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		loadStudent();
		
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;
				Statement stmt = null;
				String name = jtf_name.getText();
				int speed = Integer.parseInt(jtf_speed.getText());
				int goal = Integer.parseInt(jtf_goal.getText());
				int balance = Integer.parseInt(jtf_balance.getText());
				
				try {
					String sql = "insert into student values('"+name+"',"+speed+","+goal+","+balance+")";
					
					//1. jdbc드라이버를 메모리로 로드한다.
					Class.forName(driver);
					
					//2. DB서버에 연결한다.
					conn = DriverManager.getConnection(
							url, 
							username, 
							password);
					
					//3. 데이터베이스 명령어 실행 담당 객체를 생성
					stmt = conn.createStatement();
					
					//4. 데이터베이스 명령어를 실행한다.
					int re = stmt.executeUpdate(sql);
					
					if(re == 1) {
						JOptionPane.showMessageDialog(null, "학생의 정보를 추가하였습니다.");
						loadStudent();
					}else {
						JOptionPane.showMessageDialog(null, "학생정보 추가에 실패했습니다..");
					}
					
				}catch (Exception ex) {
					System.out.println("예외발생:"+ex.getMessage());
				}finally {
					try {
						if(stmt != null) {
							stmt.close();
						}
						if( conn != null) {
							conn.close();
						}				
					}catch (Exception ex) {
						System.out.println("예외발생:"+ex.getMessage());
					}
				}
			}
		});
		//수정
		btnUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = jtf_name.getText();
				int speed = Integer.parseInt(jtf_speed.getText());
				int goal = Integer.parseInt(jtf_goal.getText());
				int balance = Integer.parseInt(jtf_balance.getText());
				String sql = "update student set kor="+speed+",eng="+goal+",math="+balance+" where name = '"+name+"'";
				
				Connection conn =null;
				Statement stmt = null;
				
				try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url, username, password);
					stmt = conn.createStatement();
					int re = stmt.executeUpdate(sql);
					if(re > 0) {
						JOptionPane.showMessageDialog(null, "학생의 정보를 수정하였습니다.");
						loadStudent();
					}else {
						JOptionPane.showMessageDialog(null, "학생정보 수정에 실패했습니다..");
					}
				}catch(Exception ex) {
					System.out.println("예외발생: "+ex.getMessage());
				}finally {
					try {
						if(stmt != null) {
							stmt.close();
						}
						if(conn != null) {
							conn.close();
						}
					}catch(Exception ex2){
						System.out.println("예외발생: "+ex2.getMessage());
					}
				}
				
			}
		});
		//삭제
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = jtf_name.getText();
				//삭제할 학생을 선택하지 않았으면 경고 메세지 출력
				if(name.equals("")) {
					JOptionPane.showMessageDialog(null, "삭제할 학생을 선택해주세요");
					return;
				}
				//삭제하는 명령은 위험한 작업이기 때문에 
				//삭제하기 전에 한번더 물어보고 삭제를 진행한다.
				int confirm = JOptionPane.showConfirmDialog(null, "정말 삭제 하시겠습니까?","회원삭제",JOptionPane.YES_NO_OPTION);
				if(confirm != 0) {
					return;
				}
				String sql = "delete student where name ='"+name+"'";
				
				Connection conn = null;
				Statement stmt = null;
				try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url, username, password);
					stmt = conn.createStatement();
					int re = stmt.executeUpdate(sql);
					if(re > 0) {
						JOptionPane.showMessageDialog(null, "학생의 정보를 삭제하였습니다.");
						loadStudent();
					}else {
						JOptionPane.showMessageDialog(null, "학생정보 삭제에 실패했습니다..");
					}
					
				}catch(Exception ex){
					System.out.println("예외발생: "+ex.getMessage());
				}finally {
					try {
						if(stmt != null) {
							stmt.close();
						}
						if(conn != null) {
							conn.close();
						}
					}catch(Exception ex2){
						System.out.println("예외발생: "+ex2.getMessage());
					}
				}
			}
		});
		
		//마우스로 클릭 하면 정보가 각각의 텍스트 필드로 출력
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				//Jtable에서 마우스를 눌렀다가 떼어지면 선택한 행의 인덱스를 갖고 온다.
				int idx = table.getSelectedRow();
				//Jtable의 데이터를 갖고있는 rowData로 부터 선택한 행의 정보를 갖고 온다.
				Vector<String> row = rowData.get(idx);
				
				//갖고온 벡터로 부터 이름을 뽑아 온다.
				String search = row.get(0);
				String sql ="select * from student where name = '"+search+"'";
				System.out.println(sql);
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;
				try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url, username, password);
					stmt = conn.createStatement();
					rs = stmt.executeQuery(sql);
					if(rs.next()) {
						String name = rs.getString(1);
						int speed = rs.getInt(2);
						int goal = rs.getInt(3);
						int balance = rs.getInt(4);
						jtf_name.setText(name);
						jtf_speed.setText(speed+"");
						jtf_goal.setText(goal+"");
						jtf_balance.setText(balance+"");
					}
					
				}catch(Exception ex){
					System.out.println("예외: "+ex.getMessage());
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
					}catch(Exception ex) {
						System.out.println("예외: "+ex.getMessage());
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
		
		
		setSize(800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {	
		new InsertAndSelectStudentGUI();
	}

}