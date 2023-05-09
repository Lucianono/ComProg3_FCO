package com.mycompany.bbc_hotelresortreserv;

public class Resources {
    private String itemName;
    private int qty;
    private double price;
    private final int itemID;
    
    public Resources (int itemID, String itemName, int qty, double price){
        this.itemName = itemName;
        this.qty = qty;
        this.price = price;
        this.itemID = itemID;
        
    }
    
    public Resources (int itemID, int qty){
        this.qty = qty;
        this.itemID = itemID;
        
    }

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getItemID() {
        return itemID;
    }
}