package com.mycompany.bbc_hotelresortreserv;

/*This is the class for Customer CRUD

TODO :
-This do not have GUI
-Create methods for Customer Information System
-Create method to create a customer
-Create method to read or get a customer's details
-Create method to update a customer's details
-Create method to delete a customer
-Customer should have the following details: Name, Age, TimeChecked

*/
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerCRUD {
    
    private static int cstmrNum;
    private List<Customer> customers;

    CustomerCRUD() {
        customers = new ArrayList<>();
        cstmrNum = 0;
    }

    public void createCustomer() {
        
        cstmrNum++;
    }

    
    public Customer getCustomer(String name) {
       
        for (Customer c : customers) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }

    public void updateCustomer(String name) {
        
    }

    public void deleteCustomer(String name) {
        
        cstmrNum--;
    }

    public int getNumCustomers() {
        return customers.size();
    }


    
}