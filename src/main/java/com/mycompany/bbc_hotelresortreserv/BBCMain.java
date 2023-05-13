package com.mycompany.bbc_hotelresortreserv;

//this is the main class

import java.text.ParseException;

//all classes should be in here

public class BBCMain {

    public static void main(String[] args) throws ParseException {
        
        HotelCRUD hotelBooked = new HotelCRUD();
        CustomerCRUD customersBooked = new CustomerCRUD();
        TransactionSystem transactionsCompleted = new TransactionSystem();
        ResourcesCRUD resourcesInv = new ResourcesCRUD();
        
        //ReservationGUI transGUI = new ReservationGUI(hotelBooked,customersBooked,transactionsCompleted);
        //RealTimeViewGUI rtvGUI = new RealTimeViewGUI(hotelBooked,customersBooked,transactionsCompleted,resourcesInv);
        InventoryGUI invGUI = new InventoryGUI(resourcesInv);
    }
}
