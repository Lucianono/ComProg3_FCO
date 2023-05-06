
package com.mycompany.bbc_hotelresortreserv;

import java.util.Date;

/*



*/

public class Transaction {

    private final int TransactID;
    private final Customer[] customers;
    private final String hotel;
    private final double cash;
    private final Date timeRsrv;

    
    
    Transaction(int TransactID, Customer[] customers, String hotel, double cash, Date timeRsrv) {
        this.TransactID = TransactID;
        this.customers = customers;
        this.hotel = hotel;
        this.cash = cash;
        this.timeRsrv = timeRsrv;
        
    }
    
    
    
}
