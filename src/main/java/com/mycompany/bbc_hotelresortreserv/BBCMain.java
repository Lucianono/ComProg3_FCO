package com.mycompany.bbc_hotelresortreserv;

//this is the main class

import java.awt.Color;
import java.awt.Insets;
import java.text.ParseException;
import javax.swing.UIManager;

//all classes should be in here

public class BBCMain {

    public static void main(String[] args) throws ParseException {
        UIManager.put("Panel.background", Color.TRANSLUCENT);
        UIManager.put("Button.background", Color.WHITE);
        UIManager.put("Button.margin", new Insets(2, 5, 2, 5));
        UIManager.put("TextField.background", Color.WHITE);
        UIManager.put("Label.background", Color.WHITE);
        UIManager.put("CheckBox.background", Color.WHITE);
        UIManager.put("RadioButton.background", Color.WHITE);
        
        HotelCRUD hotelBooked = new HotelCRUD();
        CustomerCRUD customersBooked = new CustomerCRUD();
        TransactionSystem transactionsCompleted = new TransactionSystem();
        ResourcesCRUD resourcesInv = new ResourcesCRUD();
        Security security = new Security();
        
        
        MainMenuGUI menu = new MainMenuGUI(hotelBooked, customersBooked, transactionsCompleted, resourcesInv,security);
        
    }
    
    
}
