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
public class CustomerCRUD {
    //eto ung ginamit namin sa main
    /*public static void main(String[] args) {
        CustomerInformationSystem();
    }*/
    
    public static int customer = 0;
    public static String[] Name = new String[10];
    public static int[] Age = new int[10];
    public static String[] TimeChecked = new String[10]; //updated, converted into string to hold inputs such as ":"
        
    public static void CreateCustomer(){ //option 1, creation of customer
        Scanner sc = new Scanner(System.in);
        System.out.println("Create Customer");
        System.out.print("Input Name: ");
        Name[customer] = sc.nextLine();
        System.out.print("Input Age: ");
        Age[customer] = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Input Time Checked: ");
        TimeChecked[customer] = sc.nextLine();
        customer++;
        CustomerInformationSystem();
    }
    
    public static void ViewCustomerDetails(){//option 2, review of customer
        for(int i = 0; i < customer; i++){
            System.out.println("Customer " + (i+1) + ":");//to identify index of customer (for update and deletion)
            System.out.println("Name: " + Name[i]);
            System.out.println("Age: " + Age[i]);
            System.out.println("Time Checked: " + TimeChecked[i]);
            System.out.println();
        }
        CustomerInformationSystem();
    }
    
    public static void UpdateCustomerDetails(){//option 3, update of customer/s
        Scanner sc = new Scanner(System.in);
        System.out.print("Update Customer Number: ");
        int index = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter new Name: ");
        Name[index-1] = sc.nextLine();
        System.out.print("Enter New Age: ");
        Age[index-1] = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Edit Time Checked: ");
        TimeChecked[index-1] = sc.nextLine();
        CustomerInformationSystem();
    }
    
    public static void DeleteCustomerDetails(){//option 4, deletion of customer
        Scanner sc = new Scanner(System.in);
        if (customer == 0) { //if there are no customers
        System.out.println("There are no customers to delete.");
        CustomerInformationSystem();
        return;
        }        
        System.out.print("Enter customer index to delete: ");
        int index = sc.nextInt();
        for(int i = index-1; i < customer-1; i++){
            Name[i] = Name[i+1];
            Age[i] = Age[i+1];
            TimeChecked[i] = TimeChecked[i+1];
        }
        
        customer--;
        CustomerInformationSystem();
    }
    
    public static void CustomerInformationSystem(){//main
        Scanner sc = new Scanner(System.in);
        System.out.println("Customer Information System");
        System.out.println("");
        System.out.println("[1] Add New Customer");
        System.out.println("[2] View Customer Details");
        System.out.println("[3] Update Customer Details");
        System.out.println("[4] Delete Customer Details");
        System.out.println("[5] Quit");
        System.out.println("");
        System.out.print("Enter your Choice: ");
        int Choice = sc.nextInt();
        
        switch(Choice){
            case 1 -> CreateCustomer();
            case 2 -> ViewCustomerDetails();
            case 3 -> UpdateCustomerDetails();
            case 4 -> DeleteCustomerDetails();
            case 5 -> {
            }
            default -> {
                System.out.println("Invalid choice... Try again...");
                CustomerInformationSystem();
            }
        }
    }
}