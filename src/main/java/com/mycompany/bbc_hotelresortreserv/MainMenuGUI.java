
package com.mycompany.bbc_hotelresortreserv;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenuGUI extends JFrame implements ActionListener{

    
        
    JPanel statusPnl ;
    JPanel mainPnl = new JPanel();
    JPanel btnPnl = new JPanel();
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JButton jButton5 = new JButton();
    JButton jButton6 = new JButton();
    JPanel viewPnl = new JPanel();

    
    public MainMenuGUI() {

        statusPnl = new StatusBar("Bryan","admin");
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        getContentPane().add(statusPnl, BorderLayout.NORTH);

        
        mainPnl.setLayout(new BoxLayout(mainPnl, BoxLayout.X_AXIS));
        btnPnl.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        
        btnPnl.setPreferredSize(new Dimension(70, 508));
        btnPnl.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));

        jButton1.setText("Reserve");
        jButton1.setPreferredSize(new Dimension(60, 60));
        btnPnl.add(jButton1);

        jButton2.setText("CheckIn/CheckOut");
        jButton2.setPreferredSize(new Dimension(60, 60));
        btnPnl.add(jButton2);

        jButton3.setText("Resources");
        jButton3.setPreferredSize(new Dimension(60, 60));
        btnPnl.add(jButton3);

        jButton4.setText("Report");
        jButton4.setPreferredSize(new Dimension(60, 60));
        btnPnl.add(jButton4);

        jButton5.setText("About/ Help");
        jButton5.setPreferredSize(new Dimension(60, 60));
        btnPnl.add(jButton5);

        jButton6.setText("Account");
        jButton6.setPreferredSize(new Dimension(60, 60));
        btnPnl.add(jButton6);

        viewPnl.setPreferredSize(new Dimension(530, 60));
        
        mainPnl.add(btnPnl);

        mainPnl.add(viewPnl);

        getContentPane().add(mainPnl, BorderLayout.CENTER);
        
        setVisible(true);
        setResizable(false);
        setSize(700,500);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
