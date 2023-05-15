package com.mycompany.bbc_hotelresortreserv;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class HelpAbout {
    JFrame frm = new JFrame();
    JLabel about = new JLabel("About");
    JLabel abt = new JLabel("This system wwas all about how to ama"); 
    
    public HelpAbout() {
    about.setFont(new Font("Arial",Font.BOLD,25)); 
    
    abt.setFont(new Font("Arial",Font.PLAIN,12)); 
    
    frm.add(about);
    frm.add(abt);     
    frm.setLayout(new FlowLayout(FlowLayout.CENTER,600,5)); 
    frm.setSize(600, 400); 
    frm.setVisible(true); 
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    
}
