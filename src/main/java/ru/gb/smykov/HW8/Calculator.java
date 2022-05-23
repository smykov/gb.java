package ru.gb.smykov.HW8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private Double leftOperand;
    private String operation;

    public Calculator() {

        setTitle("Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 230, 220);
        setLayout(new BorderLayout());

        final JLabel display = new JLabel("0");
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setFont(new Font("Arial", Font.BOLD, 15));
        add(display, BorderLayout.NORTH);

        final JPanel numberPanel = new JPanel();
        final GridLayout numberLayout = new GridLayout(4, 3, 10, 10);
        numberPanel.setLayout(numberLayout);

        final JPanel buttonPanel = new JPanel();
        final GridLayout buttonLayout = new GridLayout(6, 1, 10, 5);
        buttonPanel.setLayout(buttonLayout);

        final ActionListener numberListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final JButton button = (JButton) e.getSource();
                final String text = button.getText();
                String displayText = display.getText();

                if (".".equals(text) && displayText.contains(".")) {
                    return;
                }

                if ("0".equals(displayText) && !".".equals(text)) {
                    displayText = "";
                }

                if ("+/-".equals(text)) {
                    if (!displayText.contains("-") && !"0".equals(displayText)) {
                        display.setText(String.valueOf(Double.parseDouble(displayText) * -1));
                    }
                    return;
                }

                displayText += text;
                display.setText(displayText);

            }
        };

        final ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                final JButton button = (JButton) e.getSource();
                Double rightOperand = Double.parseDouble(display.getText());
                final String action = button.getText();

                if ("=".equals(action)) {
                    if (leftOperand != null) {
                        switch (operation) {
                            case "+":
                                display.setText(String.valueOf(leftOperand + rightOperand));
                                break;
                            case "-":
                                display.setText(String.valueOf(leftOperand - rightOperand));
                                break;
                            case "*":
                                display.setText(String.valueOf(leftOperand * rightOperand));
                                break;
                            case "/":
                                display.setText(String.valueOf(leftOperand / rightOperand));
                                break;
                        }
                        leftOperand = Double.parseDouble(display.getText());
                        operation = null;
                    }
                    return;
                }
                leftOperand = Double.parseDouble(display.getText());
                operation = action;
                display.setText("0");

            }
        };

        int[] array = new int[]{7, 8, 9, 4, 5, 6, 1, 2, 3};
        for (int i : array) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(numberListener);
            numberPanel.add(button);
        }

        final JButton pointButton = new JButton(".");
        pointButton.addActionListener(numberListener);
        numberPanel.add(pointButton);

        final JButton zeroButton = new JButton("0");
        zeroButton.addActionListener(numberListener);
        numberPanel.add(zeroButton);

        final JButton negativeButton = new JButton("+/-");
        negativeButton.addActionListener(numberListener);
        numberPanel.add(negativeButton);

        for (char c :
                "C+-*/=".toCharArray()) {
            JButton button = new JButton(String.valueOf(c));
            button.addActionListener(buttonListener);
            buttonPanel.add(button);
        }

        add(numberPanel, BorderLayout.WEST);
        add(buttonPanel, BorderLayout.EAST);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

