
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
    public static JTextField userText, passwordText;
    public static JLabel usernameLabel, passwordLabel;
    
    //Jpanel For signup
    public static JPanel panel2 = new JPanel();
    
    //for signUp
    public static String[] Choice = {"Admin", "Staff"};
    public static JComboBox Position = new JComboBox(Choice);    
    public static JButton CreateAcc, Back;
    public static JTextField userText2, passwordText2, cpText;
    public static JLabel usernameLabel2, passwordLabel2, cpLabel, PosLabel;
    
    public static int i = 0; //counter signup
    public static JFrame frame2 = new JFrame();
    
    //public static String UserChange, PassChange;
    
    
    Security security;
    
    
    LoginSignupFormGUI(Security security){
        this.security = security;
        
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
        

        panel2.setLayout(null);
        
        //Username Label
        usernameLabel2 = new JLabel("Username : ");
        usernameLabel2.setBounds(180, 20, 250, 250);
        panel2.add(usernameLabel2);
        
        //Password Label
        passwordLabel2 = new JLabel("Password : ");
        passwordLabel2.setBounds(180, 50, 250, 250);
        panel2.add(passwordLabel2);
        
        //Position Label
        PosLabel = new JLabel("Position : ");
        PosLabel.setBounds(193, 107, 250, 250);
        panel2.add(PosLabel);
        
        //UsernameField
        userText2 = new JTextField(50);
        userText2.setBounds(250, 131, 165, 25);
        panel2.add(userText2); 

        //Password Field
        passwordText2 = new JPasswordField();
        passwordText2.setBounds(250,161,165,25);
        panel2.add (passwordText2);
        
        cpText = new JPasswordField(20);
        cpText.setBounds(250, 191, 165, 25);
        panel2.add(cpText);
        
        //Position Combo Box
        Position.setBounds(250,221,165,25);
        panel2.add(Position);
        
        
        //Create Btn
        CreateAcc = new JButton("Create");
        CreateAcc.setBounds(250, 261, 80, 25);
        CreateAcc.addActionListener(this);
        panel2.add(CreateAcc);
        
        //BackpButton 
        Back = new JButton("Back");
        Back.setBounds(335, 261, 80, 25);
        Back.addActionListener(this);
        panel2.add(Back);
        
    }
   
         
    private void SignUp(){
        

        
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setResizable(false);
        frame2.setTitle("Login and SignUp Form");
        frame2.setSize(600,400);
        frame2.setVisible(true);
        frame2.setLayout(null);
        
        frame2.add(usernameLabel2);
        frame2.add(passwordLabel2);
        
       // frame.add(button);
        frame2.add(panel2);
        frame2.add(userText2);
        
       // frame.add(passText);
        frame2.add(cpText);
        frame2.add(cpLabel);
        frame2.add(passwordText2);
        frame2.add(CreateAcc);
        frame2.add(Back);
        frame2.add(Position);
        frame2.add(PosLabel);
        //frame.add(Position);
        
        
    }
    
    @Override

    public void actionPerformed(ActionEvent e){
        String UserInput = userText.getText();
        String PasswordInput = passwordText.getText();
        String SelectedPosition = (String) Position.getSelectedItem();
        
        
        
        if(e.getSource() == LoginButton){
            //Security Login
            if(UserInput.isEmpty() || PasswordInput.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter both username and password"
                + " then confirm your password.");
            }
            else{

                if (!logged){
                    
                    if(security.logIn(UserInput, PasswordInput)){
                         //Added User,PassChange variable kasabay nung Account
                        Account acc = new Account(UserInput, PasswordInput,security);
                        logAttempts=0;
                        logged=false;

                    }else{{
                        logAttempts++;
                        System.out.println("Invalid Input. Remaining Tries: " + (loopctr-logAttempts));
                        userText.setText("");
                        passwordText.setText("");
                        
                        if(logAttempts == 3){
                        System.out.println("You have reached maximum amount of tries.");
                        System.out.println("Program Close...");
                        System.exit(0);
                    }
                        //Account acc = new Account();
                  //  }
                    
                   
                     //if (!logged){
                        
                        }
                    }
                }
                
            }
        }
        //signUp
        else if(e.getSource() == SignUpButton){
            SignUp();
        }
            //Create
        if(e.getSource() == CreateAcc){
                //checks empty input
                String ConfirmPassword = cpText.getText();
                String UserInput2 = userText2.getText();
                String PasswordInput2 = passwordText2.getText();
  
                if(UserInput2.isEmpty() || PasswordInput2.isEmpty() || ConfirmPassword.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Please enter both username and password then confirm your password");
                }
                else{
                    security.signUp(UserInput2, PasswordInput2, SelectedPosition);
                    if(ConfirmPassword.equals(PasswordInput2)){
                        for (String user1 : user) {
                            if (user1.equals(UserInput2)) {
                                JOptionPane.showMessageDialog(null, "Already Taken");
                                //username already taken
                                passwordText2.setText("");
                                userText2.setText("");
                                cpText.setText("");
                                break;
                            }
                            else{
                            passwordText2.setText("");
                            userText2.setText("");
                            cpText.setText("");
                            JOptionPane.showMessageDialog(null, "Successfully Created an Account...");
                            break;
                            }
                        }
                    }
                    else if(!ConfirmPassword.equals(PasswordInput2)){
                        JOptionPane.showMessageDialog(null, "Password Doesn't Match! Confirm it again...");
                        cpText.setText("");   
                    }

                }
        } 
        else if(e.getSource() == Back){
            System.out.println("back");
            frame2.setVisible(false);
            
        }    
    }
}
    

