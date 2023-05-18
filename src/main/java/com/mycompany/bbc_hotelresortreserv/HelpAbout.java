package com.mycompany.bbc_hotelresortreserv;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class HelpAbout {
    JFrame frm = new JFrame("Help/ About");
    jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
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