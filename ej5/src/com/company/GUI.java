package com.company;

import javax.swing.*;

public class GUI {
    JFrame frame;
    GUI(){
        frame = new JFrame();

        JButton button = new JButton("click me");
        button.setBounds(100, 100, 100, 100);

        frame.add(button);
        frame.setSize(500, 500);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}
