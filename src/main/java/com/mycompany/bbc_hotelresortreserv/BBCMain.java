package com.mycompany.bbc_hotelresortreserv;

//this is the main class

import java.awt.Color;
import java.awt.Insets;
import java.text.ParseException;
import javax.swing.UIManager;

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
        
        
        Report rm = new Report();
        
    }
    
    
}
