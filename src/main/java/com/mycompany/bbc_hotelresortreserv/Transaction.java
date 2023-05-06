
package com.mycompany.bbc_hotelresortreserv;

import java.util.Date;

/*



*/

public class Transaction {

    private final int TransactID;
    private final Customer[] customers;
    private final String hotel;
    private final double cash;
    private final Date dateRsrv;

    
    
    Transaction(int TransactID, Customer[] customers, String hotel, double cash, Date dateRsrv) {
        this.TransactID = TransactID;
        this.customers = customers;
        this.hotel = hotel;
        this.cash = cash;
        this.dateRsrv = dateRsrv;
        
    }
    
    public int getTransactID() {
        return TransactID;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public String getHotel() {
        return hotel;
    }

    public double getCash() {
        return cash;
    }

    public Date getDateRsrv() {
        return dateRsrv;
    }
    






    
    
    
}
