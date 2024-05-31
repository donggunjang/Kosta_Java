package com.kosta.exam01;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CarCenterTest2 extends JFrame {
    JLabel result;
    HashMap<String, Integer> repair = new HashMap<String, Integer>();
    JCheckBox[] jcb01 = new JCheckBox[4];

    public CarCenterTest2() {
        JPanel p_center = new JPanel();
        p_center.setLayout(new GridLayout(6, 2));
        p_center.add(new JLabel("수리"));
        p_center.add(new JLabel("가격(원)"));

        repair.put("엔진오일 교환", 45000);
        repair.put("자동 변속기 교환", 80000);
        repair.put("에어콘 필터 교환", 65000);
        repair.put("타이어 교환", 100000);

        Set<String> keyList = repair.keySet();
        Iterator<String> iter = keyList.iterator();
        int i = 0;

        while (iter.hasNext()) {
            String key = iter.next();
            jcb01[i] = new JCheckBox(key);
            p_center.add(jcb01[i]);
            p_center.add(new JLabel(repair.get(key) + ""));
            i++;
        }

        result = new JLabel("총 가격: 0원");
        p_center.add(result);

        JButton calculateButton = new JButton("계산");
        calculateButton.addActionListener(new CalculateButtonListener());
        p_center.add(calculateButton);

        add(p_center);
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class CalculateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int total = 0;
            for (int i = 0; i < jcb01.length; i++) {
                if (jcb01[i].isSelected()) {
                    total += repair.get(jcb01[i].getText());
                }
            }
            result.setText("총 가격: " + total + "원");
        }
    }

    public static void main(String[] args) {
        new CarCenterTest2();
    }
}
