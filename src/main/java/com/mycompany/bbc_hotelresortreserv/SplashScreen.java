/*
This class is for Splash Screen JFrame

TODO:
-Splash Screen is the first screen to be seen by the user
-after a short period of time, splash screen will be closed
-Splashscreen should have Logo, Company Name, License, Copyright, ProgressBar
-Logo can be from internet, AI generated, or original
-ProgressBar should depends on seconds before splashscreen to be closed, progressbar is like the "loading"

-BE CREATIVE! BE Mindful on the layouts. Layouts should be responsive
*/
package com.mycompany.bbc_hotelresortreserv;

import java.awt.Color;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.JProgressBar;


public class SplashScreen {
    JFrame frm = new JFrame();
    JLabel title1 = new JLabel("Black Beans Company");
    JLabel title2 = new JLabel("copyright 2023");
    JLabel logo = new JLabel();
    JProgressBar bar = new JProgressBar(0,100);
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    
    
    SplashScreen(){
    bar.setValue(0);
    bar.setBounds(0, 0, 400, 40);
    bar.setStringPainted(true);
    bar.setFont(new Font("Arial",Font.BOLD,9));
    bar.setForeground(Color.BLUE);
    bar.setBackground(Color.WHITE);
    p2.add(bar);
    
    title1.setFont(new Font("Arial",Font.BOLD,25));
    p1.add(title1);
    
    title2.setFont(new Font("Arial",Font.BOLD,9));
    title2.setForeground(Color.GRAY);
    p3.add(title2);
    
    p4.add(logo);
    
    frm.add(p4);
    frm.add(p1);
    frm.add(p2);
    frm.add(p3);
    frm.setLayout(new FlowLayout(FlowLayout.CENTER,0,150));
    frm.setSize(600, 400);
    frm.setVisible(true);
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm.setLocationRelativeTo(null);
    
    fill();
    
    }
    public void fill(){
        int counter = 0;
        while (counter <= 100){
            bar.setValue(counter);
            
        try{
            Thread.sleep(50);
        }catch(InterruptedException e){
        e.printStackTrace();
        }
        counter +=1;
        }
    }
}