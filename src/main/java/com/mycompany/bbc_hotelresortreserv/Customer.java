package com.mycompany.bbc_hotelresortreserv;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
    private String cstmrName;
    private int cstmrAge;
    private final int CustID;


    public Customer(int CustID, String name, int age) {
        
        
        
        this.cstmrName = name;
        this.cstmrAge = age;
        this.CustID = CustID;
    }


    String getName() {
        return cstmrName;
    }
    
    int getCstmrID() {
        return CustID;
    }


    int getAge() {
        return cstmrAge;
    }
    void setAge(int age) {
        this.cstmrAge = age;
    }

    void setName(String newName) {
        this.cstmrName = newName;
    }

    

}
