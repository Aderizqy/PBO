package Tugas_Swing.kasus2_1;

import javax.swing.*;
import java.awt.event.*;

public class JumlahDuaAngka extends JFrame implements ActionListener {
    private JTextField field1, field2;
    private JButton tombolJumlah;

    public JumlahDuaAngka() {
        setTitle("Penjumlahan Dua Angka");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label1 = new JLabel("Angka 1:");
        label1.setBounds(30, 30, 80, 25);
        add(label1);

        field1 = new JTextField();
        field1.setBounds(100, 30, 150, 25);
        add(field1);

        JLabel label2 = new JLabel("Angka 2:");
        label2.setBounds(30, 60, 80, 25);
        add(label2);

        field2 = new JTextField();
        field2.setBounds(100, 60, 150, 25);
        add(field2);

        tombolJumlah = new JButton("Jumlahkan");
        tombolJumlah.setBounds(90, 100, 120, 30);
        tombolJumlah.addActionListener(this);
        add(tombolJumlah);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int angka1 = Integer.parseInt(field1.getText());
            int angka2 = Integer.parseInt(field2.getText());
            int hasil = angka1 + angka2;
            JOptionPane.showMessageDialog(this, "Hasil: " + hasil);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Input harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        JumlahDuaAngka form = new JumlahDuaAngka();
        form.setVisible(true);
    }
}

