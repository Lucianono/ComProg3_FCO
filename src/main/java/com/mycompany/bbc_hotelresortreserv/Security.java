package com.mycompany.bbc_hotelresortreserv;

/*import java.util.Scanner;

    /* jelo note:
       -Create String in form of array so that multiple accs can be stored and accessed. 
       -signUp boolean type to indicate if process is successful or fail.
       -make position a string to store.. 
       -Note public static void is ONLY AND PURELY for testing
       -11:12 signUp feature done bitch
       -11:57 logIn feature done BITCH
       -may bug sa login tanginang 3 times yan
*/


    public class Security {
        private String[] user = new String[]{"user123"};
        private String[] pass = new String[]{"pass123"};
        private String[] pos = new String[] {"staff"};
        public static int StringIncrement = 1;
    
/*---------------------------------------------------------------------*/ 
    public boolean signUp(String username, String password, String position) { //signUp method
            for (String user1 : user) {
                if (user1.equals(username)) {
                    return false; //username already exists
                }
            }

        //if username does not exist, add the new user to the arrays
        String[] newusernames = new String[user.length+1];
        String[] newpasswords = new String[pass.length+1];
        String[] newposition = new String[pos.length+1];
        
            for(int i=0; i<user.length; i++) {
                newusernames[i] = user[i];
                newpasswords[i] = pass[i];
                newposition[i] = pos[i];
            }
            
        newusernames[newusernames.length-1] = username;
        newpasswords[newpasswords.length-1] = Encrypt(password);
        newposition[newposition.length-1] = position;
        user = newusernames;
        pass = newpasswords;
        pos = newposition;
        return true;
}
/*---------------------------------------------------------------------*/     
    public boolean logIn (String username, String password){ //logIn Method
        int logAttempts = 0;
        boolean logged = false;
            while (logAttempts < 3 && !logged){
                for (int i = 0; i < user.length; i++)
                {
                    if (user[i].equals(username) && pass[i].equals(password)){ //user logged in
                        System.out.println("wow");
                        logged=true;
                        break;
                    }
                    
                }
                    if (!logged){
                        System.out.println("Invalid. Remaining Tries: " + (3-logAttempts));
                    

                        System.out.println("gg bye");
                        System.exit(0);
                    }
    
            }
            return false;
    }
/*---------------------------------------------------------------------*/
    //encryption SUI   
    public static String Encrypt (String Password){
        char[] chars = Password.toCharArray(); 
        String encryptedPass = "";
        for(char c : chars){ 
            c += 1; 
            encryptedPass += c;
        }    
        return encryptedPass;
    } 
        
/*---------------------------------------------------------------------
    
        //for testing
         public static void main(String[] args) {
            SUI security = new SUI();
            Scanner scanner = new Scanner(System.in);
        
        while (true){
            
            System.out.print("choice (1 to signup | 2 to login): ");
            String choice = scanner.nextLine();
                switch(choice){
                    case "1" -> {
                        System.out.print("Enter a new username: ");
                        String username = scanner.nextLine();
                        if (username.equals("q"))
                        {
                        }
                        System.out.print("Enter a new password: ");
                        String password = scanner.nextLine();
                        String encryptedPass = SUI.Encrypt(password);
                        System.out.println("Encrypted Password: " + encryptedPass);
                    
                        
                        System.out.print("Admin or Staff: ");
                        String position = scanner.nextLine().toLowerCase();
                        if (position.equals("admin") || position.equals("staff")){
                            boolean success = security.signUp(username, password, position); // <--------- call signUp here
                            
                            if (success) {
                                System.out.println("Sign up successful!");
                            } else {
                                System.out.println("Username already exists!");
                            }
                        }
                        else {
                            System.out.println("No bitch");
                        }       }
            
                    case "2" -> { 
                        System.out.print("enter user: ");
                        String logUser = scanner.nextLine();
                        System.out.print("enter pass: ");
                        String logPass = scanner.nextLine();
                        String encryptedPass = SUI.Encrypt(logPass);
                        System.out.println("Encrypted Password: " + encryptedPass);
                        boolean logged = security.logIn(logUser, logPass); // <------------ call logIn here
                        {
                            if (logged){
                                System.out.println("Sad. See ya dick");
                                System.exit(0);
                            }
                        }
                    }
                    default -> {
                    }
                    
            }
            }
         }
/*---------------------------------------------------------------------*/ 
}