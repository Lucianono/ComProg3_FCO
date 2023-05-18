
package com.mycompany.bbc_hotelresortreserv;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
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
        
    //for signUp
    String[] Choice = {"Admin", "Staff"};
    
    JFrame frame = new JFrame();
    JPanel jPanel1 = new JPanel();
    Box.Filler filler2 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(0, 32767));
    JPanel jPanel8 = new JPanel();
    JPanel jPanel9 = new JPanel();
    JPanel jPanel2 = new JPanel();
    JPanel jPanel11 = new JPanel();
    JLabel jLabel3 = new JLabel();
    JPanel jPanel12 = new JPanel();
    JLabel jLabel4 = new JLabel();
    JPanel jPanel13 = new JPanel();
    Box.Filler filler5 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
    JPanel jPanel14 = new JPanel();
    JPanel jPanel3 = new JPanel();
    JLabel usernameLabel = new JLabel();
    JPanel jPanel4 = new JPanel();
    JTextField userText = new JTextField();
    JPanel jPanel5 = new JPanel();
    JLabel passwordLabel = new JLabel();
    JPanel jPanel6 = new JPanel();
    JTextField passwordText = new JTextField();
    JPanel jPanel7 = new JPanel();
    JButton LoginButton = new JButton();
    JButton SignUpButton = new JButton();
    Box.Filler filler6 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
    Box.Filler filler1 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(0, 32767));

    
    
    int i = 0; //counter signup
        
    Security security = new Security();

    
    LoginSignupFormGUI(Security security){
        this.security = security;
        
        jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.Y_AXIS));
        jPanel1.add(filler2);

        jPanel9.setLayout(new BoxLayout(jPanel9, BoxLayout.Y_AXIS));

        jPanel2.setPreferredSize(new Dimension(450, 200));
        jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.Y_AXIS));

        jLabel3.setFont(new Font("Verdana", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Black Bean Company");
        jPanel11.add(jLabel3);

        jPanel2.add(jPanel11);

        jPanel12.setPreferredSize(new Dimension(598, 35));

        jLabel4.setFont(new Font("Arial Narrow", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("Hotel and Resort Management System");

        GroupLayout jPanel12Layout = new GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
                jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 450, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
                jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 35, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel12Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel12);

        jPanel13.setLayout(new BoxLayout(jPanel13, BoxLayout.X_AXIS));
        jPanel13.add(filler5);

        jPanel14.setPreferredSize(new Dimension(250, 110));
        jPanel14.setRequestFocusEnabled(false);
        jPanel14.setLayout(new BoxLayout(jPanel14, BoxLayout.Y_AXIS));

        jPanel3.setPreferredSize(new Dimension(300, 35));
        jPanel3.setLayout(new BoxLayout(jPanel3, BoxLayout.X_AXIS));

        usernameLabel.setFont(new Font("Arial", 1, 14)); // NOI18N
        usernameLabel.setHorizontalAlignment(SwingConstants.LEFT);
        usernameLabel.setText("Username : ");
        jPanel3.add(usernameLabel);

        jPanel4.setLayout(new FlowLayout(FlowLayout.RIGHT));

        userText.setFont(new Font("Arial", 0, 14)); // NOI18N
        userText.setHorizontalAlignment(JTextField.LEFT);
        userText.setPreferredSize(new Dimension(200, 22));
        jPanel4.add(userText);

        jPanel3.add(jPanel4);

        jPanel14.add(jPanel3);

        jPanel5.setPreferredSize(new Dimension(300, 35));
        jPanel5.setLayout(new BoxLayout(jPanel5, BoxLayout.X_AXIS));

        passwordLabel.setFont(new Font("Arial", 1, 14)); // NOI18N
        passwordLabel.setHorizontalAlignment(SwingConstants.LEFT);
        passwordLabel.setText("Password : ");
        jPanel5.add(passwordLabel);

        jPanel6.setLayout(new FlowLayout(FlowLayout.RIGHT));

        passwordText.setFont(new Font("Arial", 0, 14)); // NOI18N
        passwordText.setHorizontalAlignment(JTextField.LEFT);
        passwordText.setPreferredSize(new Dimension(200, 22));
        jPanel6.add(passwordText);

        jPanel5.add(jPanel6);

        jPanel14.add(jPanel5);

        LoginButton.setText("Login");
        LoginButton.addActionListener(this);
        jPanel7.add(LoginButton);

        SignUpButton.setText("Register");
        SignUpButton.addActionListener(this);
        jPanel7.add(SignUpButton);

        jPanel14.add(jPanel7);

        jPanel13.add(jPanel14);
        jPanel13.add(filler6);

        jPanel2.add(jPanel13);

        jPanel9.add(jPanel2);

        jPanel8.add(jPanel9);

        jPanel1.add(jPanel8);
        jPanel1.add(filler1);

        frame.add(jPanel1, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Login and SignUp Form");
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
    }
    
    JPanel bjPanel1 = new JPanel(); 
    Box.Filler bfiller2 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(0, 32767)); 
    JPanel bjPanel8 = new JPanel(); 
    JPanel bjPanel9 = new JPanel(); 
    JPanel bjPanel2 = new JPanel(); 
    JPanel bjPanel11 = new JPanel(); 
    JLabel bjLabel3 = new JLabel(); 
    JPanel bjPanel12 = new JPanel(); 
    JLabel bjLabel4 = new JLabel(); 
    JPanel bjPanel13 = new JPanel(); 
    Box.Filler bfiller5 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0)); 
    JPanel bjPanel14 = new JPanel(); 
    JPanel bjPanel3 = new JPanel(); 
    JLabel usernameLabel2 = new JLabel(); 
    JPanel bjPanel4 = new JPanel(); 
    JTextField userText2 = new JTextField(); 
    JPanel bjPanel5 = new JPanel(); 
    JLabel passwordLabel2 = new JLabel(); 
    JPanel bjPanel6 = new JPanel(); 
    JTextField passwordText2 = new JTextField(); 
    JPanel jPanel10 = new JPanel(); 
    JPanel bjPanel18 = new JPanel(); 
    JLabel cLabel = new JLabel(); 
    JLabel pLabel = new JLabel(); 
    JPanel bjPanel15 = new JPanel(); 
    JTextField cpText = new JTextField(); 
    JPanel bjPanel16 = new JPanel(); 
    JLabel PosLabel = new JLabel(); 
    JPanel bjPanel17 = new JPanel(); 
    JComboBox<String> Position = new JComboBox<>(Choice); 
    JPanel bjPanel7 = new JPanel(); 
    JButton CreateAcc = new JButton(); 
    JButton Back = new JButton(); 
    Box.Filler bfiller6 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0)); 
    Box.Filler bfiller1 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(0, 32767)); 
    JFrame frame2 = new JFrame(); 
        
    private void SignUp(){

        bjPanel1.setLayout(new BoxLayout(bjPanel1, BoxLayout.Y_AXIS));
        bjPanel1.add(bfiller2);

        bjPanel8.setMinimumSize(new Dimension(438, 400));
        bjPanel8.setPreferredSize(null);

        bjPanel9.setMinimumSize(new Dimension(428, 300));
        bjPanel9.setPreferredSize(new Dimension(400, 300));
        bjPanel9.setLayout(new BoxLayout(bjPanel9, BoxLayout.Y_AXIS));

        bjPanel2.setMinimumSize(new Dimension(430, 204));
        bjPanel2.setPreferredSize(new Dimension(500, 200));
        bjPanel2.setLayout(new BoxLayout(bjPanel2, BoxLayout.Y_AXIS));

        bjPanel11.setPreferredSize(new Dimension(648, 10));

        bjLabel3.setFont(new Font("Verdana", 1, 24)); // NOI18N
        bjLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        bjLabel3.setText("Welcome new user!");
        bjPanel11.add(bjLabel3);

        bjPanel2.add(bjPanel11);

        bjPanel12.setPreferredSize(new Dimension(300, 10));

        bjLabel4.setFont(new Font("Arial Narrow", 0, 18)); // NOI18N
        bjLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        bjLabel4.setText("Create an account");
        bjPanel12.add(bjLabel4);

        bjPanel2.add(bjPanel12);

        bjPanel13.setPreferredSize(new Dimension(500, 110));
        bjPanel13.setLayout(new BoxLayout(bjPanel13, BoxLayout.X_AXIS));
        bjPanel13.add(bfiller5);

        bjPanel14.setPreferredSize(new Dimension(250, 110));
        bjPanel14.setRequestFocusEnabled(false);
        bjPanel14.setLayout(new BoxLayout(bjPanel14, BoxLayout.Y_AXIS));

        bjPanel3.setPreferredSize(new Dimension(300, 35));
        bjPanel3.setLayout(new BoxLayout(bjPanel3, BoxLayout.X_AXIS));

        usernameLabel2.setFont(new Font("Arial", 1, 14)); // NOI18N
        usernameLabel2.setHorizontalAlignment(SwingConstants.LEFT);
        usernameLabel2.setText("Username : ");
        bjPanel3.add(usernameLabel2);

        bjPanel4.setLayout(new FlowLayout(FlowLayout.RIGHT));

        userText2.setFont(new Font("Arial", 0, 14)); // NOI18N
        userText2.setHorizontalAlignment(JTextField.LEFT);
        userText2.setPreferredSize(new Dimension(200, 22));
        
        bjPanel4.add(userText2);

        bjPanel3.add(bjPanel4);

        bjPanel14.add(bjPanel3);

        bjPanel5.setPreferredSize(new Dimension(300, 35));
        bjPanel5.setLayout(new BoxLayout(bjPanel5, BoxLayout.X_AXIS));

        passwordLabel2.setFont(new Font("Arial", 1, 14)); // NOI18N
        passwordLabel2.setHorizontalAlignment(SwingConstants.LEFT);
        passwordLabel2.setText("Password : ");
        bjPanel5.add(passwordLabel2);

        bjPanel6.setLayout(new FlowLayout(FlowLayout.RIGHT));

        passwordText2.setFont(new Font("Arial", 0, 14)); // NOI18N
        passwordText2.setHorizontalAlignment(JTextField.LEFT);
        passwordText2.setPreferredSize(new Dimension(200, 22));
        bjPanel6.add(passwordText2);

        bjPanel5.add(bjPanel6);

        bjPanel14.add(bjPanel5);

        jPanel10.setPreferredSize(new Dimension(300, 35));
        jPanel10.setLayout(new BoxLayout(jPanel10, BoxLayout.X_AXIS));

        bjPanel18.setLayout(new BoxLayout(bjPanel18, BoxLayout.Y_AXIS));

        cLabel.setFont(new Font("Arial", 1, 14)); // NOI18N
        cLabel.setHorizontalAlignment(SwingConstants.LEFT);
        cLabel.setText("Confirm");
        bjPanel18.add(cLabel);

        pLabel.setFont(new Font("Arial", 1, 14)); // NOI18N
        pLabel.setHorizontalAlignment(SwingConstants.LEFT);
        pLabel.setText("Password : ");
        bjPanel18.add(pLabel);

        jPanel10.add(bjPanel18);

        bjPanel15.setLayout(new FlowLayout(FlowLayout.RIGHT));

        cpText.setFont(new Font("Arial", 0, 14)); // NOI18N
        cpText.setHorizontalAlignment(JTextField.LEFT);
        cpText.setPreferredSize(new Dimension(200, 22));
        bjPanel15.add(cpText);

        jPanel10.add(bjPanel15);

        bjPanel14.add(jPanel10);

        bjPanel16.setPreferredSize(new Dimension(300, 35));
        bjPanel16.setLayout(new BoxLayout(bjPanel16, BoxLayout.X_AXIS));

        PosLabel.setFont(new Font("Arial", 1, 14)); // NOI18N
        PosLabel.setHorizontalAlignment(SwingConstants.LEFT);
        PosLabel.setText("Position : ");
        bjPanel16.add(PosLabel);

        bjPanel17.setLayout(new FlowLayout(FlowLayout.RIGHT));

        Position.setPreferredSize(new Dimension(100, 22));
        bjPanel17.add(Position);

        bjPanel16.add(bjPanel17);

        bjPanel14.add(bjPanel16);

        CreateAcc.setText("Sign Up");
        CreateAcc.addActionListener(this);
        bjPanel7.add(CreateAcc);

        Back.setText("Cancel");
        Back.addActionListener(this);
        bjPanel7.add(Back);

        bjPanel14.add(bjPanel7);

        bjPanel13.add(bjPanel14);
        bjPanel13.add(bfiller6);

        bjPanel2.add(bjPanel13);

        bjPanel9.add(bjPanel2);

        bjPanel8.add(bjPanel9);

        bjPanel1.add(bjPanel8);
        bjPanel1.add(bfiller1);

        frame2.add(bjPanel1, BorderLayout.CENTER);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setResizable(false);
        frame2.setTitle("Login and SignUp Form");
        frame2.setSize(600,400);
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);
        
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

                if (!security.logged){
                    
                    if(security.logIn(UserInput, PasswordInput)){
                         //Added User,PassChange variable kasabay nung Account
                        Account acc = new Account(UserInput, PasswordInput,security);
                        logAttempts=0;
                        frame.dispose();

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
    

