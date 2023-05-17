package com.mycompany.bbc_hotelresortreserv;

//this is the main class

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

//all classes should be in here

public class BBCMain {

    public static void main(String[] args) {
        
        CustomerCRUD cstmr = new CustomerCRUD();
        HotelCRUD hotel = new HotelCRUD();
        ResourcesCRUD rsrcs = new ResourcesCRUD();
        
        UIManager.put("Panel.background", new Color(0, 0, 0, 0));
        
//        JPanel statBar = new StatusBar("Hello", "Admin");
//        JFrame jf = new JFrame();
//        jf.add(statBar, BorderLayout.NORTH);
//        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        jf.setVisible(true);
//        jf.setSize(600,400);
        
        MainMenuGUI menu = new MainMenuGUI();
    }
    
    
}
