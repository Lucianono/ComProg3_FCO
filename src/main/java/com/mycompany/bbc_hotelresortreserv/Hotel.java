
package com.mycompany.bbc_hotelresortreserv;


public class Hotel {

    private final String HotelID;
    private final String HotelType;
    private boolean Availability;
    private int RoomCap;
    private double RegRate;
    private double PromoRate;
    
    public Hotel(String HotelID, String HotelType, boolean Availability, int RoomCap , double RegRate, double PromoRate) {
        
        this.HotelID = HotelID;
        this.HotelType = HotelType;
        this.Availability = Availability;
        this.RoomCap = RoomCap;
        this.RegRate = RegRate;
        this.PromoRate = PromoRate;
    }
    
    public String getHotelID(){
        return HotelID;
    }
    
    public String getHotelType(){
        return HotelType;
    }
    
    public boolean getAvailability(){
        return Availability;
    }
    public void setAvailability(boolean avlbl){
        this.Availability = avlbl;
    }
    
    public int getRoomCap(){
        return RoomCap;
    }
    public void setRoomCap(int cap){
        this.RoomCap = cap;
    }
    
    public double getRegRate(){
        return RegRate;
    }
    
    public void setRegRate(double reg){
        this.RegRate = reg;
    }
    
    public double getPromoRate(){
        return PromoRate;
    }
    
    public void setPromoRate(double prm){
        this.PromoRate = prm;
    }
    
    
    
    
    
    
    
}
