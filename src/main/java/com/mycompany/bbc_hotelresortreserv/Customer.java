package com.mycompany.bbc_hotelresortreserv;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.text.SimpleDateFormat;
import java.time.LocalDateTime; 

public class Customer {
    String cstmrName;
    int cstmrAge;
    int ID;
    int cstmrTime;


    public Customer(String name, int age, int ID) {
        this.cstmrName = cstmrName;
        this.cstmrAge = cstmrAge;
        this.ID = ID;
    }

    Customer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getName() {
        return cstmrName;
    }

    int getAge() {
        return cstmrAge;
    }

    void setAge(int age) {
        this.cstmrAge = cstmrAge;
    }

    void setName(String newName) {
        this.cstmrName = cstmrName;
    }

    Date getTimeChecked() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm");  
        Date cstmrTime = new Date();
        return cstmrTime;
    }

}
