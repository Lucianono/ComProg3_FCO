package com.mycompany.bbc_hotelresortreserv;

//this is the main class

import java.awt.Color;
import java.awt.Insets;
import java.text.ParseException;
import javax.swing.*;

//all classes should be in here

public class BBCMain {
    
    static HotelCRUD hotelBooked = new HotelCRUD();
    static CustomerCRUD customersBooked = new CustomerCRUD();
    static TransactionSystem transactionsCompleted = new TransactionSystem();
    static ResourcesCRUD resourcesInv = new ResourcesCRUD();
    static Security security = new Security();;
     
    
    public static void callMenu(){
        
        MainMenuGUI menu = new MainMenuGUI(hotelBooked, customersBooked, transactionsCompleted, resourcesInv,security);
    }
    
    

    public static void main(String[] args) throws ParseException {
        
        BbcUI uidflts = new BbcUI();
        
        
        
        SplashScreen splsh = new SplashScreen(security);
        
        JPanel hp = new HelpAbout();
        JFrame fr = new JFrame();
        fr.add(hp);
        fr.setVisible(true);
        fr.setSize(600,400);
        
    }
    
    
}
