package com.mycompany.bbc_hotelresortreserv;


import java.util.LinkedList;



public class CustomerCRUD {
    
    
    private int customerIDCtr = 0;
    private LinkedList<Customer> customers;

    CustomerCRUD() {
        customers = new LinkedList<>();
        
        createCustomer("Bryan", 20);
        createCustomer("Jelo", 20);
        createCustomer("Noren", 20);
        
        getCustomer(1);
        
    }

    public Customer createCustomer(String name, int age ) { //create customer
        
        Customer customer = new Customer(customerIDCtr++, name, age);
        customers.add(customer);
        return customer;
        
    }

    public int getIndex(int ID) {//get index 
        for (int i = 0; i < customers.size(); i++){
            if (customers.get(i).getCstmrID()==ID) {
                return i;
            }
        }
        return -1;
    }
    
    public Customer getCustomer(int ID ) { //return customer
        
        if (getIndex(ID) != -1)
        {
            return customers.get(getIndex(ID) );
        }
        else {
            System.out.println("Customer does not exist");
            return null;
        }
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
            System.out.println(c.getName() + ", " + c.getAge());
        }
    }

}
