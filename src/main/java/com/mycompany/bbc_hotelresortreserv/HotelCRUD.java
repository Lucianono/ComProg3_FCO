package com.mycompany.bbc_hotelresortreserv;

import java.util.ArrayList;

/*
This is the class for the hotels or rooms CRUD

TODO :
-This do not have GUI
-Create methods for the Hotels or Rooms Availabilty and Reservation
-Create method to reserve or book a hotel
-Create method to read or get a hotel's details
-Create method to update a hotel's details
-Create method to unbook a hotel
-Able to set the number of hotel 
-Hotels should have the following details : HotelNo, HotelType, Availability

*/


public class HotelCRUD {

    ArrayList<Object> hotel_arr = new ArrayList();
    
    HotelCRUD(){
        addHotel("A1","Tourist Class",true,1,1000.0,900.0);
        System.out.println(hotel_arr.get(0).toString());
    }


    public void addHotel(String HotelNo, String HotelType, boolean Availability, int RoomCap , double RegRate, double PromoRate){
    
        Object[] hotel = new Object[6];
        hotel[0]= HotelNo;
        hotel[1]= HotelType;
        hotel[2]= Availability;
        hotel[3]= RoomCap;
        hotel[4]= RegRate;
        hotel[5]= PromoRate;
        hotel_arr.add(hotel);
        System.out.println(hotel[1]);
   
    }
    
    public void unbookHotel(String name, int numofroom, int roomcap){
    }
    
    public void bookHotel(String name, int numofroom, int roomcap){
    }

    public void getHotel(String name, int numofroom, int roomcap){
        
    }
    
    public void updateHotel(String name, int numofroom, int roomcap){
        
    }
    
    public void deleteHotel(String name, int numofroom, int roomcap){
        
    }
    
    
//    public void availability(String name, int numofroom, int roomcap){
//        System.out.print ("[1] Tourist Class");
//        System.out.print ("[2] Deluxe Class");
//        System.out.print ("[3] Ambassador Class");
//        System.out.print ("[4] Corporate Class");
//        System.out.print ("[5] Annex Room 1");
//        System.out.print ("[6] Annex Room 2");
//        if (numofroom < 1 || numofroom >6){
//            System.out.print("Invalid room number, Please choose between 1 to 6.");
//        }
//        if (availableroom <= 0){
//            System.out.print("No room available");
//        }
//
//    }
}