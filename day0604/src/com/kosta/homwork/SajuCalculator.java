package com.kosta.homwork;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SajuCalculator extends JFrame {
    private JTextField nameField;
    private JTextField yearField;
    private JTextField monthField;
    private JTextField dayField;
    private JTextField hourField;
    private JTextArea resultArea;

    public SajuCalculator() {
        setTitle("Saju Calculator");
        setSize(600, 500);  // JFrame 크기 증가
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 컴포넌트 초기화
        nameField = new JTextField(10);
        yearField = new JTextField(4);
        monthField = new JTextField(2);
        dayField = new JTextField(2);
        hourField = new JTextField(2);
        resultArea = new JTextArea(15, 40);  // JTextArea 크기 증가
        resultArea.setEditable(false);

        JButton calculateButton = new JButton("Calculate Saju");

        // 레이아웃 설정
        setLayout(new GridLayout(7, 2, 10, 10));  // 컴포넌트 간격 추가

        add(new JLabel("이름을 입력하세요:"));
        add(nameField);
        add(new JLabel("태어난 년도를 입력하세요(0000형식):"));
        add(yearField);
        add(new JLabel("태어난 월을 숫자로 입력하세요:"));
        add(monthField);
        add(new JLabel("태어난 일을 숫자로 입력하세요:"));
        add(dayField);
        add(new JLabel("태어난 시간을 24시간 형식으로 입력하세요:"));
        add(hourField);
        add(calculateButton);
        add(new JScrollPane(resultArea));

        // 버튼 이벤트 리스너 추가
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateSaju();
            }
        });
    }

    private void calculateSaju() {
        String name = nameField.getText();
        int year = Integer.parseInt(yearField.getText());
        int month = Integer.parseInt(monthField.getText());
        int day = Integer.parseInt(dayField.getText());
        int hour = Integer.parseInt(hourField.getText());

        String[] animal = { "신", "유", "술", "해", "자", "축", "인", "묘", "진", "사", "오", "미" };
        String[] sajuPalja = {
            "천역: 역마살, 다방면에 관심", "천간: 이성에게 매력", "천수: 손재주가 있어요.",
            "천명: 명이 길어요", "천귀: 귀인 대접", "천액: 액땜", "천권: 권력, 리더십",
            "천파: 파동이 있어요, 해외 이주", "천인: 인간성, 법 없이도 살 사람", 
            "천문: 머리가 좋아", "천복: 복을 갖고태어남", "천고: 외로움을 많이 타요"
        };

        String yearAnimal = yearAnimal(year, animal);
        String yearSaju = yearSaju(year, sajuPalja);
        String monthAnimal = yearAnimal((year + month - 1) % 12, animal);
        String monthSaju = monthSaju(year, month, sajuPalja);
        String dayAnimal = yearAnimal((year + month + day - 2) % 12, animal);
        String daySaju = daySaju(year, month, day, sajuPalja);
        String hourAnimal = yearAnimal((year + month + day + hour / 2 - 3) % 12, animal);
        String hourSaju = hourSaju(year, month, day, hour, sajuPalja);

        resultArea.setText(String.format("****%s님의 사주팔자는 다음과 같습니다****\n", name));
        resultArea.append(yearAnimal + "띠\t" + yearSaju + "\n");
        resultArea.append(monthAnimal + "띠\t" + monthSaju + "\n");
        resultArea.append(dayAnimal + "띠\t" + daySaju + "\n");
        resultArea.append(hourAnimal + "띠\t" + hourSaju + "\n");
    }

    public static String yearAnimal(int n, String[] animal) {
        return animal[n % 12];
    }

    public static String yearSaju(int year, String[] sajuPalja) {
        return sajuPalja[year % 12];
    }

    public static String monthSaju(int year, int month, String[] sajuPalja) {
        return sajuPalja[(year + month - 1) % 12];
    }

    public static String daySaju(int year, int month, int day, String[] sajuPalja) {
        return sajuPalja[(year + month + day - 2) % 12];
    }

    public static String hourSaju(int year, int month, int day, int hour, String[] sajuPalja) {
        int adjustedHour = hour / 2; // 24시간 형식을 12등분으로 변환
        return sajuPalja[(year + month + day + adjustedHour - 3) % 12];
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SajuCalculator().setVisible(true);
            }
        });
    }
}
