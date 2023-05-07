package com.mycompany.bbc_hotelresortreserv;

import java.util.Date;

public class Transaction {

    private final int TransactID;
    private final Customer[] customers;
    private final String hotel;
    private final double downCash;
    private final Date dateRsrv;
    private double fullCash;
    private double remBal;

    Transaction(int TransactID, Customer[] customers, String hotel, double downCash, Date dateRsrv, double fullCash ,double remBal) {
        this.TransactID = TransactID;
        this.customers = customers;
        this.hotel = hotel;
        this.downCash = downCash;
        this.dateRsrv = dateRsrv;
        this.fullCash = fullCash;
        this.remBal = remBal;
    }

    // Getters for all variables
    public int getTransactID() {
        return TransactID;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public String getHotel() {
        return hotel;
    }

    public double getDownCash() {
        return downCash;
    }

    public Date getDateRsrv() {
        return dateRsrv;
    }

    public double getFullCash() {
        return fullCash;
    }

    public double getRemBal() {
        return remBal;
    }

    // Setters for the non-final variables
    public void setFullCash(double fullCash) {
        this.fullCash = fullCash;
    }

    public void setRemBal(double remBal) {
        this.remBal = remBal;
    }
}