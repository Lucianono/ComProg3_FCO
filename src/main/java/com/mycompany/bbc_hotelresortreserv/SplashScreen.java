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

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.JProgressBar;


public class SplashScreen {
    JFrame frm = new JFrame();
    JProgressBar bar = new JProgressBar();
    
    SplashScreen(){
    bar.setValue(0);
    bar.setBounds(0, 0, 400, 40);
    bar.setStringPainted(true);
     
    frm.add(bar);
    frm.setLayout(new FlowLayout(FlowLayout.CENTER));
    frm.setSize(600, 400);
    frm.setVisible(true);
    frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frm.setLocationRelativeTo(null);
    fill();
    
    }
    public void fill(){
        int counter = 0;
        while (counter <= 100)
            bar.setValue(counter);
            
        try{
            Thread.sleep(50);
        }catch(InterruptedException e){}
        counter +=1;
    }
}
