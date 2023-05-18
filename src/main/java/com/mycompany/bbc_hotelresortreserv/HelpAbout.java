package com.mycompany.bbc_hotelresortreserv;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class HelpAbout {
    JFrame frm = new JFrame("Help/ About");
    //JScrollBar hb = new JScrollBar(JScrollBar.HORIZONTAL,30,20,0,500);
    //JScrollBar vb = new JScrollBar(JScrollBar.VERTICAL,30,40,0,500);
    JPanel dev1 = new JPanel();
    JPanel dev2 = new JPanel();
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
    

    //frm.add(hb, BorderLayout.SOUTH);
    //frm.add(vb, BorderLayout.EAST);
    frm.add(about);
    dev1.add(abt); 
    dev1.add(name1);
    dev1.add(ys1);
    dev1.add(phonNum1);
    dev1.add(blnk1);
    dev2.add(name2);
    dev2.add(ys2);
    dev2.add(phonNum2);
    dev2.add(blnk2);
    dev2.add(pt);
    dev2.add(name3);
    dev2.add(intruc);   
    frm.add(dev1);
    frm.add(dev2);
    frm.add(blnk3);
    frm.add(help);
    dev1.setPreferredSize(new Dimension(600, 100));
    dev2.setPreferredSize(new Dimension(600, 400));
    

    frm.setLayout(new FlowLayout(FlowLayout.CENTER,600,5)); 
    frm.setSize(600, 400); 
    frm.setVisible(true); 
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    
}