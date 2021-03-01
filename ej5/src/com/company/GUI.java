package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class GUI {

    GUI() {
        JFrame frame = new JFrame("JFrame title");

        JTextField textField = new JTextField("txt field");
        textField.setBounds(10, 10, 200, 100);

        JLabel label1, label2;
        label1 = new JLabel("first label");
        label2 = new JLabel("second label");
        label1.setBounds(210, 0, 200, 200);

        JCheckBox checkBox = new JCheckBox("check");
        checkBox.setBounds(300, 0, 500, 50);
        checkBox.addItemListener(e -> label1.setText("checkbox: "
                                    + (e.getStateChange()==1? "checked": "unchecked")
                                    + " "
                                    + (checkBox.isSelected()? "selected": "not selected")));


        JButton button = new JButton("click me");
        button.setBounds(200, 200, 100, 100);

        button.addActionListener(e -> testButtonActionListener(e, textField, label1));


        frame.add(label1);
        frame.add(textField);
        frame.add(button);
        frame.add(checkBox);

        frame.setSize(600, 600);

        frame.setLayout(null);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void testButtonActionListener(ActionEvent e, JTextField textField, JLabel label1) {
        try {
            //textField.setText("changed");
            label1.setText("button pressed");

            String fromTxtField = textField.getText();
            label1.setText(fromTxtField);

            System.out.println(e.getSource());
        } catch (Exception ex){
            System.out.println(ex);
        }
    }


}

//        button.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e){
//                textField.setText("text changed.");
//                label1.setText("button pressed");
//            }
//        });

//        button.addActionListener(e -> {
//            try {
//                textField.setText("changed");
//                label1.setText("changed label");
//            } catch (Exception ex){
//                System.out.println(ex);
//            }
//        });
