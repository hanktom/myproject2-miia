package com.tom.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    //Fields
    JButton button = new JButton("GUESS");
    JLabel label = new JLabel("Zzzz...");
    JTextField number = new JTextField(8);
    int secret = new Random().nextInt(10)+1;
    //Constructors
    public GuessFrame() {
        super();
        System.out.println("secret: " + secret);
        setSize(600, 400);
        setLocation(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(number.getText());
                System.out.println(num);
                if (num > secret) {
                    label.setText("Smaller");
                } else if (num < secret) {
                    label.setText("Bigger");
                } else {
                    label.setText("Bingo, the secrete number is " + secret);
                }
//                label.setText("Hello!");
            }
        });
        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);
    }
    //Methods

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
//        guessFrame.setSize(600, 400);
//        guessFrame.setVisible(true);
    }
}
