package com.mycompany.bbc_hotelresortreserv;

import java.util.ArrayList;

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
public final class ResourcesCRUD {
        ArrayList<Resources> rcs = new ArrayList();
        
        ResourcesCRUD(){
        System.out.println("ResourcesCRUD created");
        
        create(101,"extra bed",10,150);
        create(103,"f",10,150);
        create(105,"asf",10,150);
        
        }
        
        public int getIndex(int itemNum){
            for (int i = 0; i < rcs.size(); i++){
            if (rcs.get(i).equals(itemNum)) {
                return i;
            }
        }
        return -1;
        }
        
        public void create(int itemID, String itemName, int qty, double price){
            Resources resources = new Resources(itemID, itemName, qty, price);
            rcs.add(resources);
        }
        
        public void update(int itemID, String itemName, int qty, double price){
            if(itemID != -1){
                rcs.get(getIndex(itemID)).setItemName(itemName);
                rcs.get(getIndex(itemID)).setQty(qty);
                rcs.get(getIndex(itemID)).setPrice(price);
                System.out.println("Updated successfully");
            }else{
                System.out.println("Item is not found");
            }
        }
        
        
        public void delete(int itemID){
            
            if (getIndex(itemID) != -1)
            {
                rcs.remove(itemID);
            }
            else {
                    System.out.println("Resource does not exist");
            }
            
        }
        
        
        public void display(){
            if (rcs.isEmpty()){
                System.out.println("No item");
            }
            else {
            for (Resources c : rcs) { 
            System.out.println(c.getItemName() + ", " + c.getQty() + ", " + c.getItemNum()); 
        } 
            }
        }
        


    
    ResourcesCRUD(){
        System.out.println("ResourcesCRUD created");
        
        create(101,"Extra Bed",10,300);
        create(102,"Pillow",20,150);
        create(103,"Towel",30,150);
        create(104,"Reading Light",15,200);
        create(105,"Books/Magazines",50,100);
        create(106,"Toiletries",100,300);
        create(107,"Luggage Rack",15,300);
        create(201,"Breakfast",100,400); // <---- different item num because different category of reso
        create(202,"Lunch",100,600);
        create(203,"Dinner",100,600);
        create(204,"Drink",100,100);
        create(205,"Snack",100,300);
    }
    
    
}