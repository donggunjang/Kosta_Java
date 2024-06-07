package com.kosta.exam02;

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

public class StudentTest extends JFrame {
	JTextField jtf_name;
	JTextField jtf_kor;
	JTextField jtf_eng;
	JTextField jtf_math;
	
	Vector<String> colNames;
	Vector<Vector<String>> rowData;
	JTable table;
	
	//모든 학생의 목록을 읽어와서 JTable에 출력하는 메소드
	public void loadStudent() {
		rowData.clear();
		StudentDao dao = new StudentDao();
		ArrayList<StudentVo> list = dao.listStudent();
		for(StudentVo svo :list) {
			Vector<String> row = new Vector<String>();
			row.add(svo.getName());
			row.add(svo.getKor()+"");
			row.add(svo.getEng()+"");
			row.add(svo.getMath()+"");
			rowData.add(row);
		}
		table.updateUI();
	}
	
	public StudentTest() {
		
		jtf_name = new JTextField(10);
		jtf_kor = new JTextField(5);
		jtf_eng = new JTextField(5);
		jtf_math = new JTextField(5);
		
		JPanel p= new JPanel();
		
		p.add(new JLabel("이름"));
		p.add(jtf_name);
		p.add(new JLabel("국어"));
		p.add(jtf_kor);
		p.add(new JLabel("영어"));
		p.add(jtf_eng);
		p.add(new JLabel("수학"));
		p.add(jtf_math);
		
		JButton btnAdd= new JButton("등록");
		JButton btnUpdate= new JButton("수정");
		JButton btnDelete= new JButton("삭제");
		
		p.add(btnAdd);
		p.add(btnUpdate);
		p.add(btnDelete);
		
		colNames = new Vector<String>();
		colNames.add("이름");
		colNames.add("국어");
		colNames.add("영어");
		colNames.add("수학");		
		rowData = new Vector<Vector<String>>();		
		table = new JTable(rowData, colNames);
		JScrollPane jsp= new JScrollPane(table);
		
		add(p, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		
		//테이블 로드
		loadStudent();
		setSize(650, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				int idx = table.getSelectedRow();
				Vector<String> row = rowData.get(idx);
				jtf_name.setText(row.get(0));
				jtf_kor.setText(row.get(1));
				jtf_eng.setText(row.get(2));
				jtf_math.setText(row.get(3));
				
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
		
		//등록 버튼 이벤트 
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = jtf_name.getText();
				int kor = Integer.parseInt(jtf_kor.getText());
				int eng = Integer.parseInt(jtf_eng.getText());
				int math = Integer.parseInt(jtf_math.getText());
				 
				//StudentVo의 세트로 만든다.
				StudentVo svo = new StudentVo(name,kor,eng,math);
				StudentDao dao = new StudentDao();
				int re = dao.insertStudent(svo);
				if(re == 1) {
					JOptionPane.showMessageDialog(null, "학생의 정보를 추가했습니다.");
					loadStudent();
				}else {
					JOptionPane.showMessageDialog(null, "학생의 정보를 추가하는데 실패하였습니다.");
				}
				
			}
		});
		
		//수정 버튼 이벤트
		btnUpdate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = jtf_name.getText();
				int kor = Integer.parseInt(jtf_kor.getText());
				int eng = Integer.parseInt(jtf_eng.getText());
				int math = Integer.parseInt(jtf_math.getText());
				
				
				//studentVo의 세트로 만든다.
				StudentVo svo = new StudentVo(name, kor, eng, math); 
				StudentDao dao = new StudentDao();
				int re = dao.updateStudent(svo);
				if(re > 0) {
					JOptionPane.showMessageDialog(null, "학생의 정보를 수정했습니다.");
					loadStudent();
				}else {
					JOptionPane.showMessageDialog(null, "학생의 정보 수정에 실패했습니다.");
				}
				
			}
		});
		
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = jtf_name.getText();
				if(name.equals("")) {
					JOptionPane.showMessageDialog(null, "학생이름을 입력해주세요");
					return;
				}
				
				int confirm = JOptionPane.showConfirmDialog(null, "정말로 삭제 하시겠습니까?", 
						"학생삭제", JOptionPane.YES_NO_OPTION);
				if(confirm != 0) {
					return;
				}
				
				StudentDao dao = new StudentDao();
				int re = dao.deleteStudent(name);
				if(re > 0) {
					JOptionPane.showMessageDialog(null, "학생의 정보를 삭제했습니다.");
					loadStudent();
				}else {
					JOptionPane.showMessageDialog(null, "학생의 정보 삭제에 실패했습니다.");
				}
				
			}
		});
		
	}
	
	public static void main(String[] args) {	
		new StudentTest();
	}

}