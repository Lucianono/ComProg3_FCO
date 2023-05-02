package com.mycompany.bbc_hotelresortreserv;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Darwin
 */
public class Customer {
    String cstmrName;
    int cstmrAge;
    long timeChecked = 0;
    int custNo;
    private final String name;
    private final int age;

    public Customer(int custNo, String name, int age, long timeChecked) {
        this.name = name;
        this.age = age;
        this.timeChecked = timeChecked;
        this.custNo = custNo;
    }

    Object getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
