
package com.mycompany.bbc_hotelresortreserv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
    
    //for signUp
    public static String[] Choice = {"Admin", "Staff"};
    public static JComboBox Position = new JComboBox(Choice);    
    public static JButton CreateAcc, Back;
    public static JTextField userText2, passwordText2, cpText;
    public static JLabel usernameLabel2, passwordLabel2, cpLabel, PosLabel;
    
    
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
        
        cpLabel = new JLabel("Confirm Passwprd :");
        cpLabel.setBounds(133, 80, 250, 250);
        panel.add(cpLabel);
        
        //UsernameField
        userText = new JTextField(20);
        userText.setBounds(250, 131, 165, 25);
        panel.add(userText); 
        
        
        /*
        JTextField passText = new JTextField(20);
        passText.setBounds(250, 161, 165, 25);
        panel.add(passText);
        */
        //encrypt password
        
        //Password Field
        passwordText = new JPasswordField();
        passwordText.setBounds(250,161,165,25);
        panel.add (passwordText);
        
        cpText = new JTextField(20);
        cpText.setBounds(250, 191, 165, 25);
        panel.add(cpText);
        
        
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
        frame.add(Position);
        //For Signup
        
        
    }
    
    public static void SignUp(){
        JPanel panel = new JPanel();
        
        JFrame frame = new JFrame();
        
        panel.setLayout(null);
        
        //Username Label
        usernameLabel2 = new JLabel("Username : ");
        usernameLabel2.setBounds(180, 20, 250, 250);
        panel.add(usernameLabel2);
        
        //Password Label
        passwordLabel2 = new JLabel("Password : ");
        passwordLabel2.setBounds(180, 50, 250, 250);
        panel.add(passwordLabel2);
        
        //Position Label
        PosLabel = new JLabel("Position : ");
        PosLabel.setBounds(193, 107, 250, 250);
        panel.add(PosLabel);
        
        //UsernameField
        userText2 = new JTextField(50);
        userText2.setBounds(250, 131, 165, 25);
        panel.add(userText2); 

        //Password Field
        passwordText2 = new JPasswordField();
        passwordText2.setBounds(250,161,165,25);
        panel.add (passwordText2);
        
        
        //Position Combo Box
        Position.setBounds(250,221,165,25);
        panel.add(Position);
        
        
        //Create Btn
        CreateAcc = new JButton("Create");
        CreateAcc.setBounds(250, 261, 80, 25);
        //LoginButton2.addActionListener();
        panel.add(CreateAcc);
        
        //BackpButton 
        Back = new JButton("Back");
        Back.setBounds(335, 261, 80, 25);
       // SignUpButton2.addActionListener();
        panel.add(Back);
        
        
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Login and SignUp Form");
        frame.setSize(600,400);
        frame.setVisible(true);
        frame.setLayout(null);
        
        frame.add(usernameLabel2);
        frame.add(passwordLabel2);
        
       // frame.add(button);
        frame.add(panel);
        frame.add(userText2);
        
       // frame.add(passText);
        frame.add(cpText);
        frame.add(cpLabel);
        frame.add(passwordText2);
        frame.add(CreateAcc);
        frame.add(Back);
        frame.add(Position);
        frame.add(PosLabel);
        //frame.add(Position);
        
        
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
              SignUp();
              
        }
    } 
}
