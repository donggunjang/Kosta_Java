package com.kosta.exam01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

public class ProductTest2 extends JFrame {
	JTextField jtf_no;
	JTextField jtf_item;
	JTextField jtf_qty;
	JTextField jtf_price;
	JButton btn_insert;
	JButton btn_delete;
	JButton btn_update;
	
	Vector<String> colName;
	Vector<Vector<String>> rowData; 
	JTable table;
	
	int no;
	String item;
	int qty;
	int price;
	
	//텍스트 필드의 입력값을 읽어와서 각각의 변수에 저장하는 메소드
	public void setData() {
		no = Integer.parseInt(jtf_no.getText());
		item = jtf_item.getText();
		qty = Integer.parseInt(jtf_qty.getText());
		price = Integer.parseInt(jtf_price.getText());
	}
	
	public void loadtable() {
		rowData.clear();
		ProductDAO dao = new ProductDAO();
		ArrayList<ProductVO> list = dao.listProduct();
		for(ProductVO pvo:list) {
			Vector<String> row = new Vector<String>();
			row.add(pvo.getNo()+"");
			row.add(pvo.getItem());
			row.add(pvo.getQty()+"");
			row.add(pvo.getPrice()+"");
			rowData.add(row);
		}
		table.updateUI();
	}
	
	public ProductTest2(String title) {
		super(title);
		jtf_no = new JTextField();
		jtf_item = new JTextField();
		jtf_qty = new JTextField();
		jtf_price = new JTextField();
		
		colName = new Vector<String>();
		colName.add("제품번호");
		colName.add("제품명");
		colName.add("수량");
		colName.add("가격");
		
		rowData = new Vector<Vector<String>>();
		table = new JTable(rowData, colName);
		JScrollPane jsp = new JScrollPane(table);
		
		
		setLayout(new BorderLayout());
		// 북쪽 패널 안에 들어갈 센터 패널
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4,2));
		//북쪽 패널 안에 들어갈 남쪽 패널
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
		btn_delete = new JButton("삭제");
		p2.add(btn_delete);
		btn_update = new JButton("수정");
		p2.add(btn_update);

		// 북쪽 패널
		JPanel p_north = new JPanel(new BorderLayout());
		p_north.add(p1,BorderLayout.CENTER);
		p_north.add(p2,BorderLayout.SOUTH);
		
		add(p_north, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		
		//테이블 출력
		loadtable();
	
		setSize(600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		table.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				int idx = table.getSelectedRow();
				Vector<String> row = rowData.get(idx);
				jtf_no.setText(row.get(0));
				jtf_item.setText(row.get(1));
				jtf_qty.setText(row.get(2));
				jtf_price.setText(row.get(3));
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
		
		btn_insert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setData();
				ProductVO pvo = new ProductVO(no, item, qty, price);
				ProductDAO dao = new ProductDAO();
				int re = dao.insertProduct(pvo);
				if(re == 1) {
					JOptionPane.showMessageDialog(null, "제품이 등록 되었습니다.");
					loadtable();
				}else {
					JOptionPane.showMessageDialog(null, "제품 등록을 실패 했습니다.");
				}
				
				
			}
		});
		
		btn_delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int no = Integer.parseInt(jtf_no.getText());
				int confirm = JOptionPane.showConfirmDialog(
						null, "정말 삭제 하시겠습니까?", "학생삭제", JOptionPane.OK_CANCEL_OPTION);
				if(confirm != 0) {
					return;
				}
				
				ProductDAO dao = new ProductDAO();
				int re = dao.deleteProduct(no);
				if(re > 0) {
					JOptionPane.showMessageDialog(null, "제품이 삭제 되었습니다.");
					loadtable();
				}else {
					JOptionPane.showMessageDialog(null, "제품 삭제를 실패 했습니다.");
				}
			}
		});
		
		btn_update.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setData();
				
				ProductVO pvo = new ProductVO(no, item, qty, price);
				ProductDAO dao = new ProductDAO();
				int re = dao.updateProduct(pvo);
				
				if(re > 0) {
					JOptionPane.showMessageDialog(null, "제품정보가 수정 되었습니다.");
					loadtable();
				}else {
					JOptionPane.showMessageDialog(null, "제품정보 수정에 실패 했습니다.");
				}
				
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		new ProductTest2("제품 관리");
	}
}
