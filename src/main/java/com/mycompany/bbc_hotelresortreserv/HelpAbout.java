package com.mycompany.bbc_hotelresortreserv;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class HelpAbout {
    JFrame frm = new JFrame();
    JLabel about = new JLabel("About the Developer");
    JLabel abt = new JLabel("Presented By:");
    JLabel name1 = new JLabel("Darwin Alba Inigo I. Alba             Noren Ester C. Belono             Bryan Jett T. Calulo");
    JLabel ys1 = new JLabel(      "   BSM CS 2A - G1                          BSM CS 2A - G1                       BSM CS 2A - G1");
    JLabel phonNum1 = new JLabel( "  0912-700-2544                            0912-700-2544                          0912-700-2544");
    JLabel blnk1 = new JLabel(" ");
    JLabel name2 = new JLabel("Ramil Angelo Jan M. Rosal             Neil Allen H. Sandiego");
    JLabel ys2 = new JLabel(      "   BSM CS 2A - G1                          BSM CS 2A - G1");
    JLabel phonNum2 = new JLabel( "  0912-700-2544                            0912-700-2544");
    JLabel blnk2 = new JLabel(" ");
    JLabel pt = new JLabel("Presented To:");
    JLabel name3 = new JLabel("Engr. Evelyn C. Samson");
    JLabel intruc = new JLabel("Instruvtor, MCS 203 ");
    
    JLabel blnk3 = new JLabel(" ");
    JLabel help = new JLabel("Help");
    
    public HelpAbout() {
    about.setFont(new Font("Arial",Font.BOLD,20)); 
    abt.setFont(new Font("Arial",Font.BOLD,12)); 
    abt.setBorder(new EmptyBorder(0,0,25,10));
    
    name1.setFont(new Font("Arial",Font.BOLD,12)); 
    ys1.setFont(new Font("Arial",Font.PLAIN,12)); 
    phonNum1.setFont(new Font("Arial",Font.PLAIN,12)); 
    name2.setFont(new Font("Arial",Font.BOLD,12)); 
    ys2.setFont(new Font("Arial",Font.PLAIN,12)); 
    phonNum2.setFont(new Font("Arial",Font.PLAIN,12)); 
    name3.setFont(new Font("Arial",Font.BOLD,12)); 
    intruc.setFont(new Font("Arial",Font.PLAIN,12)); 
    
    help.setFont(new Font("Arial",Font.BOLD,20)); 
    
    frm.add(about);
    frm.add(abt); 
    frm.add(name1);
    frm.add(ys1);
    frm.add(phonNum1);
    frm.add(blnk1);
    frm.add(name2);
    frm.add(ys2);
    frm.add(phonNum2);
    frm.add(blnk2);
    frm.add(pt);
    frm.add(name3);
    frm.add(intruc);    
    frm.add(blnk3);
    frm.add(help);
    frm.setLayout(new FlowLayout(FlowLayout.CENTER,600,5)); 
    frm.setSize(600, 400); 
    frm.setVisible(true); 
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    
}