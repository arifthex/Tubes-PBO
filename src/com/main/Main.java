package com.main;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("test");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel l = new JLabel("Login");
        l.setBounds(5,5,50,15);
        
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p.setBounds(0,20,100,60);
        
        JTextField t1 = new JTextField(8);
        JPasswordField t2 = new JPasswordField(8);
        
        JButton b = new JButton("Login");
        b.setBounds(5,80,70,20);
        
        p.add(t1);
        p.add(t2);
        
        f.add(l);
        f.add(p);
        f.add(b);
        
        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
