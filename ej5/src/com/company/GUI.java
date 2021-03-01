package com.company;

import javax.swing.*;

public class GUI {

    GUI(){
        JFrame frame = new JFrame("JFrame title");

        JTextField textField = new JTextField("text field");
        textField.setBounds(10, 10, 50, 50);

        JButton button = new JButton("click me");
        button.setBounds(100, 100, 100, 100);

        frame.add(textField);

        frame.add(button);
        frame.setSize(600, 500);

        frame.setLayout(null);
        frame.setVisible(true);


    }
}
