
package com.mycompany.bbc_hotelresortreserv;

import java.util.Scanner;

/*
-This is the class for Security System

TODO:
-This is not GUI or UI form
-Set a default username and password
-Username and password stored in the program SHOULD BE ENCRYPTED
-Create a method to Login -> check if the arguments is right to the stores username and password
-Create a method to SignUp -> add the arguments (username and password) to be stored in the program
-Create a method to Encrypt -> to shuffle, to encrypt, applied cryptography of a String argument
-Create a method to Decrypt -> redo the encryption of Encrypt method by taking a String argument
-Add a feature where 3x error login attempt then exit()
-On SignUp, add an option wether they are staff or admin
-Take note of the project file from mam Evelyn

*/

public class Security {

    public Security() {
        System.out.println("Security Created");
    }
    
    public static int StringIncrement = 1;
    
    public static void Encrypt(String password){
        //pachange nlng variable sa password variable na gamit
        //paalis nlng scanner//Scanner sc = new Scanner(System.in);
        System.out.println("Password: ");
        //String password = sc.nextLine();
        
        
        char[] chars = password.toCharArray();
        for(char c : chars){
            c += 1;
            System.out.print(c);
            
        }
        
    }
    
}
