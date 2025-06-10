package Tugas_Swing.latihan1_1;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm1 extends JFrame {
    public HelloWorldForm1() {
        JLabel label = new JLabel("HelloWorld!");
        add(label);

        setTitle("Form HelloWorld");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
