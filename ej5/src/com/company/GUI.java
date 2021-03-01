package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    GUI() {
        JFrame frame = new JFrame("JFrame title");

        JTextField textField = new JTextField("txt field");
        textField.setBounds(10, 10, 200, 100);

        JLabel label1, label2;
        label1 = new JLabel("first label");
        label2 = new JLabel("second label");
        label1.setBounds(210, 0, 200, 200);

        JButton button = new JButton("click me");
        button.setBounds(200, 200, 100, 100);
//        button.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e){
//                textField.setText("text changed.");
//                label1.setText("button pressed");
//            }
//        });
        button.addActionListener(e -> {
            try {
                textField.setText("changed");
                label1.setText("changed label");
            } catch (Exception ex){
                System.out.println(ex);
            }
        });




        frame.add(label1);

        frame.add(textField);

        frame.add(button);
        frame.setSize(600, 600);

        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
