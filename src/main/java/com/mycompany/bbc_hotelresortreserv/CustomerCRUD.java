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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;



public class CustomerCRUD {
    
    
    private LinkedList<Customer> customers;

    CustomerCRUD() {
        customers = new LinkedList<>();
        
        createCustomer(0, "Bryan", 20);
        createCustomer(1, "Jelo", 20);
        createCustomer(2, "Noren", 20);
        
        displayCustomers();
    }

    public void createCustomer(int ID, String name, int age ) { //create customer
        
        Customer customer = new Customer(ID, name, age);
        customers.add(customer);
    }

    public int getIndex(int ID) {//get index 
        for (int i = 0; i < customers.size(); i++){
            if (customers.get(i).equals(ID)) {
                return i;
            }
        }
        return -1;
    }


    public void updateCustomerName(int ID, String cstmrName) { //changing of customer name
        for (Customer c : customers) {
            if (c.getCstmrID() == ID) {
                c.setName(cstmrName);
            }
        }
    }
    public void updateCustomerAge(int ID, int cstmrAge) { //chaging of customer age
        for (Customer c : customers) {
            if (c.getCstmrID() == ID) {
                c.setAge(cstmrAge);
            }
        }
    }  

    public void deleteCustomer(int ID) { //remove customer depending on index
        if (getIndex(ID) != -1)
        {
            customers.remove(ID);
        }
        else {
            System.out.println("Customer does not exist");
        }
    }

    public void displayCustomers() {//display customers along with name, age, time checked
        for (Customer c : customers) {
            System.out.println(c.getName() + ", " + c.getAge() + ", " + c.getTimeChecked());
        }
    }

}
