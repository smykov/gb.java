package ru.gb.smykov.HW8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        final JButton[] jButtons = new JButton[]{
                new JButton("Button #1"),
                new JButton("Button #2"),
                new JButton("Button #3"),
                new JButton("Button #4"),
                new JButton("Button #5"),
                new JButton("Button #6"),
        };
        final JTextArea jTextArea = new JTextArea();
        add(jTextArea);
        jTextArea.setText("TextArea\n");
        final ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                final JButton button = (JButton) e.getSource();
                System.out.println("Clicked - " + button.getText());
//                button.setText("Click!!!");
                jTextArea.append("Clicked - " + button.getText() + "\n");
            }
        };

        for (JButton jButton : jButtons) {
            add(jButton);
            jButton.addActionListener(listener);
        }

        final JLabel label = new JLabel("Text");
        add(label);

        final LayoutManager layout = new GridLayout(3, 3);
        setLayout(layout);

        setVisible(true);


    }
}
