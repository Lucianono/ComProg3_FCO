
package com.mycompany.bbc_hotelresortreserv;

import java.util.LinkedList;


public class TransactionSystem {


    int TransIDCtr = 0;
    private LinkedList<Transaction> transactions = new LinkedList<>();
    
    
    public TransactionSystem() {
        
    }
    
    public Transaction createReservation( Customer[] customers, String hotel, double cash ) { //create customer
        
            Transaction transaction = new Transaction(TransIDCtr++,customers,hotel,cash);
            transactions.add(transaction);
            return transaction;
        
        }
    
    
    
}
