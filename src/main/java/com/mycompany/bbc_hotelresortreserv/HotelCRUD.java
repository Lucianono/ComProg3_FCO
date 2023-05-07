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
        addHotel("E11","Annex Room",true,3,300,300.0);
        addHotel("E12","Annex Room",true,5,300,300.0);
        addHotel("E14","DickClass",true,1,3300,300.0);
        
        
    }


    //converts hotelno to index
    public int getHotelIndex(String HotelID){
        
        for(int i =0; i<hotel_arr.size();i++){
            if(hotel_arr.get(i).getHotelID().equals(HotelID)){
                return i;
            }
        }
        return -1;
        
    }
    
    //add a new hotel
    public void addHotel(String HotelID, String HotelType, boolean Availability, int RoomCap , double RegRate, double PromoRate){
    
        Hotel hotel = new Hotel(HotelID,HotelType,Availability,RoomCap,RegRate,PromoRate);
        hotel_arr.add(hotel);
        
    }
    
    //gethotel
    public Hotel getHotel(String HotelID){
    
        return hotel_arr.get(getHotelIndex(HotelID));
        
    }
    
    
    //book hotel
    public boolean bookHotel(String HotelID){
        
        if(getHotelIndex(HotelID) != -1){ 
            if (hotel_arr.get(getHotelIndex(HotelID)).getAvailability()==true){
                hotel_arr.get(getHotelIndex(HotelID)).setAvailability(false);
                return true;
            }else{
                System.out.println("Hotel already booked");
                return false;
            }
        }else{
            System.out.println("Hotel does not exist");
            return false;
        }
         
    }
    
    //reserve hotel
    public boolean rsrvHotel(String HotelID){
        
        if(getHotelIndex(HotelID) != -1){ 
            if (hotel_arr.get(getHotelIndex(HotelID)).getAvailability()==true){
                hotel_arr.get(getHotelIndex(HotelID)).setAvailability(false);
                return true;
            }else{
                System.out.println("Hotel already booked");
                return false;
            }
        }else{
            System.out.println("Hotel does not exist");
            return false;
        }
         
    }
    
    //unbook hotel
    public boolean unbookHotel(String HotelID){
        
        if(getHotelIndex(HotelID) != -1){ 
            if (hotel_arr.get(getHotelIndex(HotelID)).getAvailability()==false){
                hotel_arr.get(getHotelIndex(HotelID)).setAvailability(true);
                return true;
            }else{
                System.out.println("Hotel already unbooked");
                return false;
            }
        }else{
            System.out.println("Hotel does not exist");
            return false;
        }
        
        
    }
    
    //change hotel price
    public void updateHotelRate (String HotelID, double RegRate, double PromoRate){
        
        if(getHotelIndex(HotelID) != -1){
            hotel_arr.get(getHotelIndex(HotelID)).setRegRate(RegRate);
            hotel_arr.get(getHotelIndex(HotelID)).setPromoRate(PromoRate);
        }else{
            System.out.println("Hotel does not exist");
        }
        
    }
    
    //remove a hotel
    public void deleteHotel(String HotelID){
       
        if(getHotelIndex(HotelID) != -1){
            hotel_arr.remove(getHotelIndex(HotelID));
        }else{
            System.out.println("Hotel does not exist");
        }
        
        
    }
    
    //get all hotel ID
    public String[] getAllHotelID() {
        String[] arr = new String[hotel_arr.size()];
        for (int i = 0; i < hotel_arr.size(); i++){
            arr[i] = hotel_arr.get(i).getHotelID();
        }
        return arr;
    }
}