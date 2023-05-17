//nag initialize sa login form ng Account sa may loginbtn part


package com.mycompany.bbc_hotelresortreserv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
ToDo's

-Create method to change username
-Create method to change password
-When changing password, confirm old password then set new password
-Create method to signout
*/

public class Account {
    
    
        String UserChange;
        String PassChange;
        Security security;
    
    public void ChangeUsername(){
        JFrame frame2 = new JFrame("Change Username/Password");
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setSize(300, 200);

        JPanel panel2 = new JPanel();
        
        JLabel usernameLabel = new JLabel("Enter New Username:");
        panel2.add(usernameLabel);

        JTextField usernameField = new JTextField(20);
        panel2.add(usernameField);

        JLabel passwordLabel = new JLabel("Enter Password:");
        panel2.add(passwordLabel);

        JTextField passwordField = new JTextField(20);
        panel2.add(passwordField);  
        
        frame2.getContentPane().add(panel2);
        frame2.setVisible(true);
        
        //Confirm Button
        JButton Confirm = new JButton("Confirm");
        panel2.add(Confirm);
        
        
        
        
        //Change Username Confirm
        Confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame2.dispose();
                
                //Security secChange = new Security();
                
                //Function for changing username
                String NewUserText = usernameField.getText();
                String EnterPass = passwordField.getText();
                           
                
                if  (security.logged == true){
                    
                    int i = security.getIndexByUser(UserChange);
                    
                        System.out.println(security.user[i] + security.Decrypt(security.pass[i]));
                        if (security.Decrypt(security.pass[i]).equals(EnterPass)){
                                //Hinahanap ung username ng iniiba na pw then gagawing = sa NewPassText
                                
                                security.user[i] = NewUserText;
                                
                                System.out.println(security.user[i] + security.Decrypt(security.pass[i]));
                                JOptionPane.showMessageDialog(null, "Successfully Changed Username");
                                LoginSignupFormGUI lsfg = new LoginSignupFormGUI(security);
                                security.logged = false;
                        }
                        
                    
                }
                else{
                    System.out.println("Login First...");
                }
                // ADD METHODS/FUNCTIONS OR STATEMENTS RELATED TO SUCCESSFULLY CHANGE USERNAME ../
                   
            }
        });
        
        
        JButton Back = new JButton("Back");
        panel2.add(Back);
        
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame2.dispose();
                System.out.println(security.user); 
                
            }
        });
        
        
        
    }
    
    public void ChangePass(){
        JFrame frame3 = new JFrame("Change Username/Password");
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.setSize(300, 200);

        JPanel panel3 = new JPanel();

        JLabel NewPassLabel = new JLabel("Enter New Password:");
        panel3.add(NewPassLabel);

        JTextField NewPassField = new JTextField(20);
        panel3.add(NewPassField);

        JLabel ConfirmPassLabel = new JLabel("Confirm New Password");
        panel3.add(ConfirmPassLabel);

        JTextField ConfirmPassField = new JTextField(20);
        panel3.add(ConfirmPassField);  
        
        
        frame3.getContentPane().add(panel3);
        frame3.setVisible(true);
        
        //Confirm Button
        JButton Confirm2 = new JButton("Confirm");
        panel3.add(Confirm2);
        
        JButton Back2 = new JButton("Back");
        panel3.add(Back2);
        
        
        
        //passConfirm
        Confirm2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame3.dispose();
                
                
                // METHODS/FUNCTIONS OR STATEMENTS RELATED TO SUCCESSFULLY CHANGE PASSWORD
                String NewPassText = NewPassField.getText();
                String ConfirmNewPass = ConfirmPassField.getText();

                
                if  (security.logged == true){
                    
                    
                    int i = security.getIndexByUser(UserChange);
                    
                            if(ConfirmNewPass.equals(NewPassText))
                            {
                                 //Hinahanap ung username ng iniiba na pw then gagawing = sa NewPassText
                                security.pass[i] = security.Encrypt(NewPassText);
                                System.out.println(security.Decrypt(security.pass[i]));
                                security.logged = false;
                                JOptionPane.showMessageDialog(null, "Successfully Changed Password");
                                LoginSignupFormGUI lsfg = new LoginSignupFormGUI(security);
                                
                                
                            }
                            else{
                                System.out.println("new pass does not match to confiirm pass");
                            }    
                       // }
                        
                    }
                
            }
        });

        Back2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame3.dispose();
                
            }
        });
        
    }
    
    
    Account(String userinput, String userpass, Security security){
        
        this.UserChange = userinput;
        this.PassChange = userpass;
        this.security = security;
      
        // Create a JFrame
        JFrame frame = new JFrame("Change Username/Password");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        // Create a JPanel
        JPanel panel = new JPanel();

        

        // Create a button to choose between changing username and password
        JButton ChangeUsernameBtn = new JButton("Change Username");
        panel.add(ChangeUsernameBtn);
        
        JButton ChangePasswordBtn = new JButton("Change Password");
        panel.add(ChangePasswordBtn);
        
        // Add the panel to the frame
        frame.getContentPane().add(panel);

        // Make the frame visible
        frame.setVisible(true);
        
        JButton Back3 = new JButton("Back");
        panel.add(Back3);
        
        Back3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                
            }
        });
        
        
        //Button Action
        ChangeUsernameBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ChangeUsername();
                
                // usernameField.setText(newUsername);
            }
        });
        ChangePasswordBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ChangePass();
                
                
                
              //  passwordField.setText(newPassword);
            }
        });
        
        
        
    }
    
    
    
    
}
