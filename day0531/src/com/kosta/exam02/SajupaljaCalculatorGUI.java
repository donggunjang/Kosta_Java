package com.kosta.exam02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SajupaljaCalculatorGUI extends JFrame {
    private JTextField nameField, yearField, monthField, dayField, hourField;
    private JTextArea resultArea;

    public SajupaljaCalculatorGUI() {
        setTitle("Sajupalja Calculator");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(6, 2));

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Year (Zodiac):"));
        yearField = new JTextField();
        inputPanel.add(yearField);

        inputPanel.add(new JLabel("Month:"));
        monthField = new JTextField();
        inputPanel.add(monthField);

        inputPanel.add(new JLabel("Day:"));
        dayField = new JTextField();
        inputPanel.add(dayField);

        inputPanel.add(new JLabel("Hour:"));
        hourField = new JTextField();
        inputPanel.add(hourField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new CalculateButtonListener());
        inputPanel.add(calculateButton);

        add(inputPanel, BorderLayout.NORTH);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        add(new JScrollPane(resultArea), BorderLayout.CENTER);
    }

    private class CalculateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String inputName = nameField.getText();
            String inputStrYear = yearField.getText();
            int inputMonth, inputDay, inputTime;

            try {
                inputMonth = Integer.parseInt(monthField.getText());
                inputDay = Integer.parseInt(dayField.getText());
                inputTime = Integer.parseInt(hourField.getText());
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter valid numbers for month, day, and hour.");
                return;
            }

            String[] result = new String[4];
            int[] dateOfBirth = new int[4];

            dateOfBirth[0] = setStartNumber(inputStrYear);
            if (dateOfBirth[0] >= 0) {
                dateOfBirth[1] = inputMonth - 1;
                dateOfBirth[2] = setBirth(inputMonth, inputDay);
                if (dateOfBirth[2] >= 0) {
                    dateOfBirth[3] = setTime(inputTime);
                    if (dateOfBirth[3] >= 0) {
                        getConvert(result, dateOfBirth);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid hour input.");
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid day input.");
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid year input.");
                return;
            }

            resultArea.setText(String.format(
                    "%s\nYear: %s\nMonth: %d\nDay: %d\nHour: %d\n\nSajupalja Result:\n%s\n%s\n%s\n%s",
                    inputName, inputStrYear, inputMonth, inputDay, inputTime,
                    result[0], result[1], result[2], result[3]
            ));
        }
    }

    private static void getConvert(String[] result, int[] dateOfBirth) {
        int shiftNum = dateOfBirth[0];
        String[] resultArray = {
                "천귀", "천액", "천권", "천파", "천인", "천문", "천복", "천고", "천역", "천간", "천수", "천명"
        };
        result[0] = resultArray[shiftNum];

        for (int i = 1; i < result.length; i++) {
            shiftNum += dateOfBirth[i];
            if (shiftNum >= 12) {  // 수정된 부분: 인덱스가 12 이상이면 나머지 값을 사용
                shiftNum %= 12;
            }
            result[i] = resultArray[shiftNum];
        }
    }


    private static int setStartNumber(String inputStrYear) {
        int start = 0;
        String[] animals = {
                "쥐", "소", "호랑이", "토끼", "용", "뱀", "말", "양", "원숭이", "닭", "개", "돼지"};
        for (String animal : animals) {
            if (animal.equals(inputStrYear)) {
                return start;
            }
            start++;
        }
        return -1;
    }

    private static int setBirth(int month, int day) {
        int setDay, lastDay = 31;
        if (month == 2) lastDay = 28;
        else if (month == 4 || month == 6 || month == 9 || month == 11) lastDay = 30;

        if (month >= 1 && month <= 12 && day > 0 && day <= lastDay) {
            setDay = (day - 1) % 12;
            return setDay;
        }
        return -1;
    }

    private static int setTime(int inputTime) {
        if (inputTime >= 1 && inputTime <= 24) {
            return (((inputTime - 1) / 2) + 1) % 12;
        }
        return -1;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SajupaljaCalculatorGUI calculator = new SajupaljaCalculatorGUI();
            calculator.setVisible(true);
        });
    }
}

