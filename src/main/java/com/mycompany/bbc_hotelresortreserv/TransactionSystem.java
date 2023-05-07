
package com.mycompany.bbc_hotelresortreserv;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;


public class TransactionSystem {


    int TransIDCtr = 0;
    private LinkedList<Transaction> transactions = new LinkedList<>();
    
    
    public TransactionSystem() {
        
    }
    
    public Transaction createReservation( Customer[] customers, String hotel, double cash , Date timeRsrv) { //create customer
        
            Transaction transaction = new Transaction(TransIDCtr++,customers,hotel,cash,timeRsrv);
            transactions.add(transaction);
            return transaction;
        
        }
    
    public Transaction getTransaction(int TransID){
        if (getIndex(TransID) != -1)
        {
            return transactions.get(getIndex(TransID) );
        }
        else {
            System.out.println("Transaction does not exist");
            return null;
        }
    }
    
    public ArrayList<Transaction> getTransactionsByDate(Date d){
        
        ArrayList<Transaction> transTaken = new ArrayList<>();
        for(int i = 0; i<transactions.size();i++){
            if(transactions.get(i).getDateRsrv().equals(d)){
                transTaken.add(transactions.get(i));
                
            }
        }
        return transTaken;
        
    }
    
    public int getIndex(int TransID) {//get index 
        for (int i = 0; i < transactions.size(); i++){
            if (transactions.get(i).getTransactID()==TransID) {
                return i;
            }
        }
        return -1;
    }
    
    
    
}
