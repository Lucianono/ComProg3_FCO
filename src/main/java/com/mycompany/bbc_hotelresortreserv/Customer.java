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
    int index;
    private final String name;
    private final int age;

    public Customer(String name, int age, long timeChecked, int index) {
        this.name = name;
        this.age = age;
        this.timeChecked = timeChecked;
        this.index = index;
    }

    Object getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
