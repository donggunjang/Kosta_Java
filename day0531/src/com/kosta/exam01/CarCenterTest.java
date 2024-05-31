package com.kosta.exam01;

import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CarCenterTest extends JFrame {
	JLabel result;
	HashMap<String, Integer> repair = new HashMap<String, Integer>();
	JCheckBox []jcb01 = new JCheckBox[4];
	
	public CarCenterTest() {
		JPanel p_center = new JPanel();
		p_center.setLayout(new GridLayout(6,2));
		p_center.add(new JLabel("수리"));
		p_center.add(new JLabel("가격(원)"));
		
		repair.put("엔진오일 교환", 45000);
		repair.put("자동 변속기 교환", 80000);
		repair.put("에어콘 필터 교환", 45000);
		repair.put("타이어 교환", 45000);
		
		Set<String> keyList = repair.keySet();
		Iterator<String> iter = keyList.iterator();
		int i=0;
		i++;
		while(iter.hasNext()) {
			String key = iter.next();
			jcb01[i] = new JCheckBox(key);
			p_center.add(jcb01[i]);
			p_center.add(new JLabel(repair.get(key)+""));
			
		}
		add(p_center);
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
	}
	
	public static void main(String[] args) {
		new CarCenterTest();

	}

}
