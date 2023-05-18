package com.mycompany.bbc_hotelresortreserv;

import javax.swing.JComboBox;

public class Security{
    
    //UPDATE THIS BEFORE RELEASE

    public String[] user = new String[]{"123"}; //default username
    public String[] pass = new String[]{"678"}; //default password
    public String[] pos = new String[] {"admin"}; //default position
    public static int StringIncrement = 5;
    public boolean logged;
    public static int logAttempts = 0; 
    public static int loopctr = 3;
    
    public int loggedIndex = 0;
    //fromLoginGUI- create reset
    
    public Security(){
        
    }
        
    public boolean signUp(String username, String password, String position) { //signUp method
            for (String user1 : user) {
                if (user1.equals(username)) {
                    System.out.println("already taken");
                    return false; //username already taken
                }
            }

        //if username does not exist, add the new user to the storage
        String[] newusernames = new String[user.length+1];
        String[] newpasswords = new String[pass.length+1];
        String[] newposition = new String[pos.length+1];
        
            for(int i=0; i<user.length; i++) {
                newusernames[i] = user[i];
                newpasswords[i] = pass[i];
                newposition[i] = pos[i];
            }
            
        newusernames[newusernames.length-1] = username;
        newpasswords[newpasswords.length-1] = Encrypt(password); //<---- encrypted password
        newposition[newposition.length-1] = position;
        
        user = newusernames;
        pass = newpasswords;
        pos = newposition;
    //    System.out.println("created successfully");
        return true;
}  
    public boolean logIn (String username, String password){ //logIn Method
        
            logged = false;
            if(logAttempts < 2 && !logged){// <---- 3 times error 
                for (int i = 0; i < user.length; i++)//checheck if username and password is compatible
                {
                    if (user[i].equals(username) && Decrypt(pass[i]).equals(password)){ //user logged in
                        System.out.println("Login Successful!");
                        logAttempts = 0;
                        logged = true;
                        loggedIndex = getIndexByUser(username);
                        return true;
                        
                    }
                }    
            }
            
            return false;
            
    }
    

    public static String Encrypt (String Password){ //Encryption Method
        char[] chars = Password.toCharArray(); 
        String encryptedPass = "";
            for(char c : chars){ 
                c += StringIncrement; 
                encryptedPass += c;
            }    
        return encryptedPass;
    } 

    public String Decrypt (String encryptedPass){ //Decryption Method
        char[] chars = encryptedPass.toCharArray();
        String decryptPass = "";
            for (char c : chars){
                c -= StringIncrement;
                decryptPass += c;
            }
        return decryptPass;
        
    }
    
    public int getIndexByUser(String userName){
        
        for(int i=0; i<user.length; i++) {
            if(user[i].equals(userName))
                return i;
        }
        return -1;
        
    }

  //  void signUp(String UserInput, String PasswordInput, JComboBox Position) {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   // }

}
