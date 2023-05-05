
package com.mycompany.bbc_hotelresortreserv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class TransactionGUI extends JFrame implements ActionListener{

    JFrame frame = new JFrame();
    JPanel jPanel1 = new JPanel();
    JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JPanel jPanel2 = new JPanel();
    JLabel jLabel1 = new JLabel();
    JComboBox jComboBox1 = new JComboBox<>();
    JPanel jPanel3 = new JPanel();
    JTextField jTextField7 = new JTextField();
    JPanel jPanel4 = new JPanel();
    JButton jButton3 = new JButton();
    
    
    TransactionGUI() {
        frame.setSize(600,400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));

        jPanel1.setLayout(new java.awt.GridLayout(0, 2));


        jButton1.setText("+");
        jButton1.addActionListener(this);
        jPanel1.add(jButton1);

        jButton2.setText("-");
        jButton2.addActionListener(this);
        jPanel1.add(jButton2);

        
        jTextField1.setText("name");
        jPanel1.add(jTextField1);

        jTextField2.setText("age");
        jPanel1.add(jTextField2);
        
        frame.add(jPanel1);

        jLabel1.setText(" Hotel");
        jPanel2.add(jLabel1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox1);

        frame.add(jPanel2);

        jTextField7.setText("Cash");
        jPanel3.add(jTextField7);

        frame.add(jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton3.setText("CheckIn");
        jPanel4.add(jButton3, java.awt.BorderLayout.CENTER);

        frame.add(jPanel4,BorderLayout.SOUTH);

        
        frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==jButton1){
            jPanel1.add(new JTextField());
            jPanel1.add(new JTextField());
            System.out.println("panel added");
            frame.setVisible(true);

        }

    }
    
    
    
}
