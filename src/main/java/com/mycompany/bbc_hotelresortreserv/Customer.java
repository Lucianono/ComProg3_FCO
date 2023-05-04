package com.mycompany.bbc_hotelresortreserv;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
    private String cstmrName;
    private int cstmrAge;
    private final int CustID;
    private final String cstmrCheckIn;


    public Customer(int CustID, String name, int age) {
        
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");  
        Date cstmrTime = new Date();
        
        this.cstmrName = name;
        this.cstmrAge = age;
        this.CustID = CustID;
        this.cstmrCheckIn = formatter.format(cstmrTime);
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

    String getTimeChecked() {
        return cstmrCheckIn;
    }

}
