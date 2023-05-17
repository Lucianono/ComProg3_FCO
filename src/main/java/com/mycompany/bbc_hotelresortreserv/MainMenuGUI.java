
package com.mycompany.bbc_hotelresortreserv;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenuGUI extends JFrame implements ActionListener{

    
        
    JPanel jPanel4 = new JPanel();
    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JButton jButton5 = new JButton();
    JButton jButton6 = new JButton();
    JPanel jPanel3 = new JPanel();

    
    public MainMenuGUI() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(new BorderLayout());
        getContentPane().add(jPanel4, BorderLayout.NORTH);

        jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.X_AXIS));
        jPanel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        jPanel2.setPreferredSize(new Dimension(70, 508));
        jPanel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));

        jButton1.setText("Reserve");
        jButton1.setPreferredSize(new Dimension(60, 60));
        jPanel2.add(jButton1);

        jButton2.setText("CheckIn/CheckOut");
        jButton2.setPreferredSize(new Dimension(60, 60));
        jPanel2.add(jButton2);

        jButton3.setText("Resources");
        jButton3.setPreferredSize(new Dimension(60, 60));
        jPanel2.add(jButton3);

        jButton4.setText("Report");
        jButton4.setPreferredSize(new Dimension(60, 60));
        jPanel2.add(jButton4);

        jButton5.setText("About/ Help");
        jButton5.setPreferredSize(new Dimension(60, 60));
        jPanel2.add(jButton5);

        jButton6.setText("Account");
        jButton6.setPreferredSize(new Dimension(60, 60));
        jPanel2.add(jButton6);

        jPanel1.add(jPanel2);

        jPanel1.add(jPanel3);

        getContentPane().add(jPanel1, BorderLayout.CENTER);
        
        setVisible(true);
        setResizable(false);
        setSize(700,500);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
