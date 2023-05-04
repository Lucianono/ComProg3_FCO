package com.mycompany.bbc_hotelresortreserv;

public class Resources {
    private String itemName;
    private final int qty;
    private double price;
    private int itemNum;
    
    public Resources (int itemNum, String itemName, int qty, double price){
        this.itemName = itemName;
        this.qty = qty;
        this.price = price;
        this.itemNum = itemNum;
        
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
        this.price = qty;
    }

    public double getPrice() {
        return price;
    }
    public double setPrice(double price) {
        this.price = price;
        return 0;
    }
    public int getItemNum() {
        return itemNum;
    }
    public void setItemNum(int itemNum) {
        this.itemNum = itemNum;
    }
}