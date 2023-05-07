package com.mycompany.bbc_hotelresortreserv;

//this is the main class
//all classes should be in here

public class BBCMain {

    public static void main(String[] args) {
        
        HotelCRUD hotelBooked = new HotelCRUD();
        CustomerCRUD customersBooked = new CustomerCRUD();
        TransactionSystem transactionsCompleted = new TransactionSystem();
        
        //ReservationGUI transGUI = new ReservationGUI(hotelBooked,customersBooked,transactionsCompleted);
        RealTimeViewGUI rtvGUI = new RealTimeViewGUI(hotelBooked,customersBooked,transactionsCompleted);
        
    }
}
