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

    ArrayList<Hotel> hotel_arr = new ArrayList();
    
    HotelCRUD(){
        addHotel("A1","Tourist Class",true,1,1000,900);
        addHotel("B1","Deluxe Class",true,1,1200,930);
        addHotel("C1","Ambassador Class",true,1,1300,1030);
        addHotel("D1","Corporate Class",true,1,1500,1300);
        addHotel("E11","Annex Room",true,3,0,300.0);
        addHotel("E12","Annex Room",true,5,0,300.0);
        
    }


    public void addHotel(String HotelNo, String HotelType, boolean Availability, int RoomCap , double RegRate, double PromoRate){
    
        Hotel hotel = new Hotel(HotelNo,HotelType,Availability,RoomCap,RegRate,PromoRate);
        hotel_arr.add(hotel);
    }
    
    
    public void bookHotel(int HotelIndex){
        
        if(hotel_arr.get(HotelIndex).getAvailability()==true){
            hotel_arr.get(HotelIndex).setAvailability(false);
        }
        
    }
    
    public void unbookHotel(int HotelIndex){
        
        if(hotel_arr.get(HotelIndex).getAvailability()==false){
            hotel_arr.get(HotelIndex).setAvailability(true);
        }
        
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