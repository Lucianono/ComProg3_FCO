
package com.mycompany.bbc_hotelresortreserv;

import java.util.ArrayList;
import java.util.Collection;

/*
This is the class for the Resources or Amenities CRUD

TODO:
-This do not have GUI
-Create methods for the Resources Stock System
-Create method to add a new item
-Create method to read or get an item's details
-Create method to update an item's details
-Create method to delete an item
-Items should have the following details : ItemName, Quantity, Price


 */
public class ResourcesCRUD {
        Collection<Resources> rcs = new ArrayList<Resources>();
        
        public void create(){
            Resources resources = new Resources();
                rcs.add(resources);
        }
        
        public void update(String itemName, int qty, double price){
            
        }
        
        public void delete(String itemName, int qty, double price){
            
        }
        
        public void display(String itemName, int qty, double price){
            
        }
        


    
    ResourcesCRUD(){
        System.out.println("ResourcesCRUD created");
    }
    
}
