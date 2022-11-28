package com.mycompany.de1moi;

import javax.swing.*;

public class test extends JFrame {
    private JPanel mainPanel;

    public test (String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }
    public static void main (String [] args){
        JFrame frame = new test("My celssis");
        frame.setVisible(true);
    }
}
