
package com.mycompany.bbc_hotelresortreserv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;


public class TransactionSystem {


    int TransIDCtr = 0;
    private LinkedList<Transaction> transactions = new LinkedList<>();
    
    
    public TransactionSystem() throws ParseException {
        Customer c = new Customer(5, "Bryan Calulo", 12);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/dd/mm");  
        Date d = formatter.parse("2023/1/1");
        Customer[] customers = {c};
        createReservation(customers,"A1",5000,d,0,0,null);
        createReservation(customers,"B1",5000,d,0,0,null);
    }
    
    public Transaction createReservation( Customer[] customers, String hotel, double downcash , Date timeRsrv , double fullcash, double remBal, Resources[] resoUsed) { //create customer
        
            Transaction transaction = new Transaction(TransIDCtr++,customers,hotel,downcash,timeRsrv,fullcash,remBal,resoUsed);
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
