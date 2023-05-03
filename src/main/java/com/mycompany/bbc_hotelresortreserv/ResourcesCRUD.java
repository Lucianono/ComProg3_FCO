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
        
        public int getIndex(int itemNum){
            return 0;
        }
        
        public void create(int itemNum, String itemName, int qty, double price){
            Resources resources = new Resources(itemNum, itemName, qty, price);
            rcs.add(resources);
        }
        
        public void update(int itemNum, String itemName, int qty, double price){
            if(itemNum != -1){
                rcs.get(getIndex(itemNum)).setItemName(itemName);
                rcs.get(getIndex(itemNum)).setQty(qty);
                rcs.get(getIndex(itemNum)).setPrice(price);
                System.out.println("Updated successfully");
            }else{
                System.out.println("Item is not found");
            }
        }
        
        
        public void delete(String itemName){
             Resources rcsDel = null;
             for (Resources rec : rcs){
                if(rcsDel == null){
                    System.out.println("Cannot delete");
                }else{
                    rcs.remove(rcsDel);
                    System.out.println("Successful remove the item");
                }
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
        
        create(101,"extra bed",10,150);
    }
    
}