
package com.mycompany.bbc_hotelresortreserv;

/*



*/

public class Transaction {

    private final int TransactID;
    private final Customer[] customers;
    private final String hotel;
    private final double cash;

    
    
    Transaction(int TransactID, Customer[] customers, String hotel, double cash) {
        this.TransactID = TransactID;
        this.customers = customers;
        this.hotel = hotel;
        this.cash = cash;
        
    }
    
    
    
}
