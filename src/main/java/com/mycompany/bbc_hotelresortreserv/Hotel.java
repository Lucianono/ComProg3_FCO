
package com.mycompany.bbc_hotelresortreserv;


public class Hotel {

    private String HotelNo;
    private String HotelType;
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
    
    
    
}
