
package com.mycompany.bbc_hotelresortreserv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

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
public class LoginSignupFormGUI extends JFrame implements ActionListener{
    
    LoginSignupFormGUI(){
        JPanel panel = new JPanel();
        //JButton button = new JButton();
        JFrame frame = new JFrame();
        
        
       // button.setBounds(150, 150, 50, 20);
                
        //JPanel Login = new JPanel();
        
        //JPanel Password = new JPanel();
        panel.setLayout(null);
        
        JLabel username = new JLabel("Username : ");
        username.setBounds(180, 20, 250, 250);
        panel.add(username);
        
        JLabel password = new JLabel("Password : ");
        password.setBounds(180, 50, 250, 250);
        panel.add(password);
        
        JTextField userText = new JTextField(20);
        userText.setBounds(250, 131, 165, 25);
        panel.add(userText); 
        
        /*
        JTextField passText = new JTextField(20);
        passText.setBounds(250, 161, 165, 25);
        panel.add(passText);
        */
        //encrypt password
        JPasswordField passwordText = new JPasswordField();
        passwordText.setBounds(250,161,165,25);
        panel.add (passwordText);
        
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(250, 191, 80, 25);
        loginButton.addActionListener(this);
        panel.add(loginButton);
        
        JButton signupButton = new JButton("Sign Up");
        signupButton.setBounds(250, 221, 80, 25);
        signupButton.addActionListener(this);
        panel.add(signupButton);
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Login and SignUp Form");
        frame.setSize(600,400);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(username);
        frame.add(password);
       // frame.add(button);
        frame.add(panel);
        frame.add(userText);
       // frame.add(passText);
        frame.add(passwordText);
        frame.add(loginButton);
        frame.add(signupButton);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("asd");
    }
    
}
