package Tugas_Swing.latihan1_3;

import javax.swing.*;
import java.awt.event.*;

public class HelloWorldForm3 extends JFrame implements ActionListener {
    private JLabel label;
    private JButton button;

    public HelloWorldForm3() {
        setTitle("Hello World Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // agar bisa bebas mengatur posisi komponen

        label = new JLabel("Hello, World!");
        label.setBounds(100, 30, 120, 30);
        add(label);

        button = new JButton("Klik Saya");
        button.setBounds(90, 80, 120, 30);
        button.addActionListener(this); // menambahkan event listener
        add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Tombol ditekan!");
    }

    public static void main(String[] args) {
        HelloWorldForm3 form = new HelloWorldForm3();
        form.setVisible(true);
    }
}

