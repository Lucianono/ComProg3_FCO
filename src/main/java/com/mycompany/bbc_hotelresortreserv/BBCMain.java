package com.mycompany.bbc_hotelresortreserv;

//this is the main class

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

//all classes should be in here

public class BBCMain {

    public static void main(String[] args) {
        
        CustomerCRUD cstmr = new CustomerCRUD();
        HotelCRUD hotel = new HotelCRUD();
        ResourcesCRUD rsrcs = new ResourcesCRUD();
        
        
        JPanel statBar = new StatusBar("Hello", "Admin");
        JFrame jf = new JFrame();
        jf.add(statBar, BorderLayout.NORTH);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.setSize(600,400);
        
    }
    
    
}
