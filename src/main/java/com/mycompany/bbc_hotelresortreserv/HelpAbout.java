package com.mycompany.bbc_hotelresortreserv;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class HelpAbout {
    JFrame frm = new JFrame();
    JLabel about = new JLabel("About the Developer");
    JLabel abt = new JLabel("From BSM CS 2A");
    //The Developer of Hotel and Resort Reservation System for Black Beans Company
    JPanel pAbt;
    
    public HelpAbout() {
        this.pAbt = new JPanel(new FlowLayout(FlowLayout.LEFT));
    about.setFont(new Font("Arial",Font.BOLD,25)); 
    
    abt.setFont(new Font("Arial",Font.PLAIN,12)); 
    abt.setBorder(new EmptyBorder(0,0,25,10));
    pAbt.add(abt);      
    
    frm.add(about);
    frm.add(pAbt);
    frm.setLayout(new FlowLayout(FlowLayout.CENTER,600,5)); 
    frm.setSize(600, 400); 
    frm.setVisible(true); 
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    
}
