package com.mycompany.bbc_hotelresortreserv;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class HelpAbout {
    JFrame frm = new JFrame();
    JLabel about = new JLabel("About");

    public HelpAbout() {
    about.setFont(new Font("Arial",Font.BOLD,25)); 
    
    frm.add(about);     
    frm.setLayout(new FlowLayout(FlowLayout.CENTER,10,15)); 
    frm.setSize(600, 400); 
    frm.setVisible(true); 
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    
}
