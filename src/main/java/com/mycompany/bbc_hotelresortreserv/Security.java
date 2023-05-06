package com.mycompany.bbc_hotelresortreserv;

    public class Security {
        
        private String[] user = new String[]{"user123"}; //default username
        private String[] pass = new String[]{"pass123"}; //default password
        private String[] pos = new String[] {"staff"}; //default position
        public static int StringIncrement = 1;
    
        public Security(){
            System.out.println("Security Created");
        }
        
    public boolean signUp(String username, String password, String position) { //signUp method
            for (String user1 : user) {
                if (user1.equals(username)) {
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
        return true;
}  
    public boolean logIn (String username, String password){ //logIn Method
        int logAttempts = 0;
        boolean logged = false;
            while (logAttempts < 2 && !logged){// <---- 3 times error 
                for (int i = 0; i < user.length; i++)//checheck if username and password is compatible
                {
                    if (user[i].equals(username) && pass[i].equals(password)){ //user logged in
                        System.out.println("Login Successful!");
                        logged=true;
                        break;
                    }
                    
                }
                    if (logAttempts == 2){
                        System.out.println("You have reached maximum amount of tries.");
                        System.out.println("Program Close...");
                        System.exit(0);
                    }
                    else {
                    logAttempts++;
                        System.out.println("Invalid. Remaining Tries: " + (3-logAttempts));
                    }
                }
            return false;
    }

    private static String Encrypt (String Password){ //Encryption Method
        char[] chars = Password.toCharArray(); 
        String encryptedPass = "";
            for(char c : chars){ 
                c += 5; 
                encryptedPass += c;
            }    
        return encryptedPass;
    } 

    private static String Decrypt (String encryptedPass){ //Decryption Method
        char[] chars = encryptedPass.toCharArray();
        String decryptPass = "";
            for (char c : chars){
                c -= StringIncrement - 1;
                decryptPass += c;
            }
        return decryptPass;
        
    }
}