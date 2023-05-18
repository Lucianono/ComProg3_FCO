
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
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");  
        Date d1 = formatter.parse("2023/5/14");
        Date d2 = formatter.parse("2023/5/13");
        Resources [] r = null;
        Customer[] customers = {c};
        createReservation(customers,"A1",1000,5000,d1,0,0,r);
        createReservation(customers,"B1",1000,5000,d1,0,500,r);
        createReservation(customers,"C1",1000,5000,d1,0,750,r);
        createReservation(customers,"A1",1000,5000,d2,0,750,r);
        createReservation(customers,"B1",1000,5000,d2,0,750,r);
        createReservation(customers,"D1",1000,5000,d2,0,750,r);

        
    }
    
    public Transaction createReservation( Customer[] customers, String hotel,double totalAm, double downcash , Date timeRsrv , double fullcash, double remBal, Resources[] resoUsed) { //create customer
        
            Transaction transaction = new Transaction(TransIDCtr++,customers,hotel,totalAm,downcash,timeRsrv,fullcash,remBal,resoUsed,false,false);
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
