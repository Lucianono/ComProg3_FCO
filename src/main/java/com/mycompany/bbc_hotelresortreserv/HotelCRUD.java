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
    
    //constructor
    HotelCRUD(){
        addHotel("A1","Tourist Class",true,1,1000,900);
        addHotel("B1","Deluxe Class",true,1,1200,930);
        addHotel("C1","Ambassador Class",true,1,1300,1030);
        addHotel("D1","Corporate Class",true,1,1500,1300);
        addHotel("E11","Annex Room",true,3,0,300.0);
        addHotel("E12","Annex Room",true,5,0,300.0);
        
        
    }


    //converts hotelno to index
    public int getHotelIndex(String HotelNo){
        
        for(int i =0; i<hotel_arr.size();i++){
            if(hotel_arr.get(i).getHotelNo().equals(HotelNo)){
                return i;
            }
        }
        return -1;
        
    }
    
    //add a new hotel
    public void addHotel(String HotelNo, String HotelType, boolean Availability, int RoomCap , double RegRate, double PromoRate){
    
        Hotel hotel = new Hotel(HotelNo,HotelType,Availability,RoomCap,RegRate,PromoRate);
        hotel_arr.add(hotel);
        
    }
    
    
    //book hotel
    public void bookHotel(String HotelNo){
        
        if(getHotelIndex(HotelNo) != -1){ 
            if (hotel_arr.get(getHotelIndex(HotelNo)).getAvailability()==true){
                hotel_arr.get(getHotelIndex(HotelNo)).setAvailability(false);
            }else{
                System.out.println("Hotel already booked");
            }
        }else{
            System.out.println("Hotel does not exist");
        }
        
        
        
    }
    
    //unbook hotel
    public void unbookHotel(String HotelNo){
        
        if(getHotelIndex(HotelNo) != -1){ 
            if (hotel_arr.get(getHotelIndex(HotelNo)).getAvailability()==false){
                hotel_arr.get(getHotelIndex(HotelNo)).setAvailability(true);
            }else{
                System.out.println("Hotel already unbooked");
            }
        }else{
            System.out.println("Hotel does not exist");
        }
        
        
    }
    
    //change hotel price
    public void updateHotelRate (String HotelNo, double RegRate, double PromoRate){
        
        if(getHotelIndex(HotelNo) != -1){
            hotel_arr.get(getHotelIndex(HotelNo)).setRegRate(RegRate);
            hotel_arr.get(getHotelIndex(HotelNo)).setPromoRate(PromoRate);
        }else{
            System.out.println("Hotel does not exist");
        }
        
    }
    
    //remove a hotel
    public void deleteHotel(String HotelNo){
       
        if(getHotelIndex(HotelNo) != -1){
            hotel_arr.remove(getHotelIndex(HotelNo));
        }else{
            System.out.println("Hotel does not exist");
        }
        
        
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