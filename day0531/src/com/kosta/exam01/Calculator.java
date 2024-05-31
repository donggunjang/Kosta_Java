package com.kosta.exam01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField display;
    private StringBuilder currentInput;
    private double result;
    private String lastOperator;

    public Calculator() {
        setTitle("Calculator");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        currentInput = new StringBuilder();
        result = 0;
        lastOperator = "";

        display = new JTextField();
        display.setFont(new Font("Arial", Font.PLAIN, 48));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4));

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 36));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
                currentInput.append(command);
                display.setText(currentInput.toString());
            } else if (command.equals("C")) {
                currentInput.setLength(0);
                result = 0;
                lastOperator = "";
                display.setText("");
            } else if (command.equals("=")) {
                if (lastOperator.isEmpty()) {
                    return;
                }
                calculate(Double.parseDouble(currentInput.toString()));
                display.setText(String.valueOf(result));
                currentInput.setLength(0);
                lastOperator = "";
            } else {
                if (currentInput.length() > 0) {
                    calculate(Double.parseDouble(currentInput.toString()));
                    currentInput.setLength(0);
                }
                lastOperator = command;
            }
        }

        private void calculate(double input) {
            switch (lastOperator) {
                case "":
                    result = input;
                    break;
                case "+":
                    result += input;
                    break;
                case "-":
                    result -= input;
                    break;
                case "*":
                    result *= input;
                    break;
                case "/":
                    result /= input;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calculator = new Calculator();
            calculator.setVisible(true);
        });
    }
}
