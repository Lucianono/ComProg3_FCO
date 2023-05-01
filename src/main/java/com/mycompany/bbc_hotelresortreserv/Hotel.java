
package com.mycompany.bbc_hotelresortreserv;


public class Hotel {

    private final String HotelNo;
    private final String HotelType;
    private boolean Availability;
    private int RoomCap;
    private double RegRate;
    private double PromoRate;
    
    public Hotel(String HotelNo, String HotelType, boolean Availability, int RoomCap , double RegRate, double PromoRate) {
        
        this.HotelNo = HotelNo;
        this.HotelType = HotelType;
        this.Availability = Availability;
        this.RoomCap = RoomCap;
        this.RegRate = RegRate;
        this.PromoRate = PromoRate;
    }
    
    public String getHotelNo(){
        return HotelNo;
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
    
    public double getRegRate(){
        return RegRate;
    }
    
    public double getPromoRate(){
        return PromoRate;
    }
    
    
    
    
    
    
    
}
