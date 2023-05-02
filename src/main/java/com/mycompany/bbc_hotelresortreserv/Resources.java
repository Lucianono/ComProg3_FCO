/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bbc_hotelresortreserv;

/**
 *
 * @author Ryzen5 B450
 */
public class Resources {
    private String itemName;
    private final int qty;
    private double price;
    
    public Resources (String itemName, int qty, double price){
        this.itemName = itemName;
        this.qty = qty;
        this.price = price;
    }

    Resources() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
}