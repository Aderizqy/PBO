package Tugas_Swing.latihan1_2;

import javax.swing.*;

public class HelloWorldForm2 extends JFrame {
    public HelloWorldForm2() {
        setTitle("Hello World Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello, World!");
        add(label);
    }
}

