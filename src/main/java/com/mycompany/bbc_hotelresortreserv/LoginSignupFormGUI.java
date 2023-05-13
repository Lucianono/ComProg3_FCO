
package com.mycompany.bbc_hotelresortreserv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

/*
This is a security extended, Login and Signup Form

TODOs:
-Create a UI or GUI or login and signup
-as much as possible, use only one jframe
-able user to login 
-if wrong 3x, program terminates
-able user to sign up then choose for position
-use methods created in Security class

-BE CREATIVE! BE Mindful on the layouts. Layouts should be responsive

*/
public class LoginSignupFormGUI extends Security implements ActionListener{
    
    JButton LoginButton, SignUpButton;
    JTextField userText, passwordText;
    JLabel usernameLabel, passwordLabel;
    
    Security security = new Security();

    
    LoginSignupFormGUI(){
        JPanel panel = new JPanel();
        
        JFrame frame = new JFrame();
        
        panel.setLayout(null);
        
        //Username Label
        usernameLabel = new JLabel("Username : ");
        usernameLabel.setBounds(180, 20, 250, 250);
        panel.add(usernameLabel);
        
        //Password Label
        passwordLabel = new JLabel("Password : ");
        passwordLabel.setBounds(180, 50, 250, 250);
        panel.add(passwordLabel);
        
        
        //UsernameField
        userText = new JTextField(20);
        userText.setBounds(250, 131, 165, 25);
        panel.add(userText); 
        
        
        
        JTextField passText = new JTextField(20);
        passText.setBounds(250, 161, 165, 25);
        panel.add(passText);
        
        //encrypt password
        
        //Password Field
        passwordText = new JPasswordField();
        passwordText.setBounds(250,161,165,25);
        panel.add (passwordText);
        
        
        
        
        //LoginButton Login
        LoginButton = new JButton("Login");
        LoginButton.setBounds(250, 191, 80, 25);
        LoginButton.addActionListener(this);
        panel.add(LoginButton);
        
        //SignupButton Login
        SignUpButton = new JButton("Sign Up");
        SignUpButton.setBounds(250, 221, 80, 25);
        SignUpButton.addActionListener(this);
        panel.add(SignUpButton);
        
        
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Login and SignUp Form");
        frame.setSize(600,400);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(usernameLabel);
        frame.add(passwordLabel);
        
       // frame.add(button);
        frame.add(panel);
        frame.add(userText);
        
       // frame.add(passText);
        frame.add(passwordText);
        frame.add(LoginButton);
        frame.add(SignUpButton);
        
        //For Signup
        
        
    }
    
    @Override

    public void actionPerformed(ActionEvent e){
        String UserInput = userText.getText();
        String PasswordInput = passwordText.getText();
        
        if(e.getSource() == LoginButton){
        security.logIn(UserInput, PasswordInput);
        }
        else if(e.getSource() == SignUpButton){
              security.signUp(UserInput, PasswordInput, UserInput);
              
              
        }
    } 
}
