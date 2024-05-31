package com.kosta.exam01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RepairShop0 extends JFrame {
	LinkedHashMap<String, Integer> repairMap; 
	JCheckBox []jcb; 
	JLabel jlb_result;
	
	public RepairShop0() {
		JPanel p_center = new JPanel();
		p_center.setLayout(new GridLayout(6,2));
		p_center.add(new JLabel("수리"));
		p_center.add(new JLabel("가격(원)"));
		
		repairMap = new LinkedHashMap<String, Integer>();
		repairMap.put("엔진오일 교환", 45000);
		repairMap.put("자동 변속기 교환", 80000);
		repairMap.put("에어콘 필터 교환", 30000);
		repairMap.put("타이어 교환", 100000);
		
		jcb = new JCheckBox[repairMap.size()];
		Iterator<String> iter= repairMap.keySet().iterator();
		int i=0;
		while(iter.hasNext()) {
			
			String key = iter.next();
			jcb[i] = new JCheckBox(key);
			p_center.add(jcb[i]);
			p_center.add(new JLabel(repairMap.get(key)+""));
			
			jcb[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String key = e.getActionCommand();
					System.out.println(key);
					
				}
			});
			
		}
		
		jlb_result = new JLabel("총금액:");
		
		add(p_center, BorderLayout.CENTER);
		add(jlb_result, BorderLayout.SOUTH);
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	public static void main(String[] args) {
		new RepairShop0();

	}

}
