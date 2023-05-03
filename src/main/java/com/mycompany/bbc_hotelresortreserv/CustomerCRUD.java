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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class CustomerCRUD {
    
        public static void main(String[] args) { // FOR TESTING ONLY
        Scanner sc = new Scanner(System.in);
        Customer customer = new Customer();
 

// To be Completed
        }
        
    private static int cstmrNum;
    private List<Customer> customers;

    CustomerCRUD() {
        customers = new ArrayList<>();
    }


    public CustomerCRUD(List<Customer> customers) { //constructor with para for creating customer objects
        this.customers = customers;
        cstmrNum = customers.size();
    }

    public void createCustomer(Customer customer) { //create customer
        cstmrNum++;
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
            if (c.getName().equals(ID)) {
            }
        }
    }
    public void updateCustomerAge(int ID, int cstmrAge) { //chaging of customer age
        for (Customer c : customers) {
            if (c.getName().equals(ID)) {
            }
        }
    }  

    public void deleteCustomer(int ID, String cstmrName, int cstmrAge) { //remove customer depending on index
        if (getIndex(ID) != -1)
        {
            customers.remove(ID);
        }
        else {
        }
    }

    public void displayCustomers() {//display customers along with name, age, time checked
        for (Customer c : customers) {
            System.out.println(c.getName() + ", " + c.getAge() + ", " + c.getTimeChecked());
        }
    }

}
