
package com.mycompany.bbc_hotelresortreserv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    public static String[] Choice = {"Admin", "Staff"};
    
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

    
    
    JComboBox Position = new JComboBox(Choice);    
    JButton CreateAcc, Back;
    JTextField userText2, passwordText2, cpText;
    JLabel usernameLabel2, passwordLabel2, cpLabel, PosLabel;
    
    int i = 0; //counter signup
    JFrame frame2 = new JFrame();
    
    Security security = new Security();

    
    LoginSignupFormGUI(){
        
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
        userText.setHorizontalAlignment(JTextField.RIGHT);
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
        passwordText.setHorizontalAlignment(JTextField.RIGHT);
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
        
    private void SignUp(){
        JPanel panel2 = new JPanel();
        
        
        
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
        
        String UserInput2 = userText.getText();
        String PasswordInput2 = passwordText.getText();
       
        
        if(e.getSource() == LoginButton){
            //Security Login
            if(UserInput.isEmpty() || PasswordInput.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter both username and password"
                + " then confirm your password.");
            }
            else{

                if (!logged){
                    security.logIn(UserInput, PasswordInput);
                    
                    if (!logged){
                        logAttempts++;
                        System.out.println("Invalid Input. Remaining Tries: " + (loopctr-logAttempts));
                        userText.setText("");
                        passwordText.setText("");
                        
                        if(logAttempts == 3){
                        System.out.println("You have reached maximum amount of tries.");
                        System.out.println("Program Close...");
                        System.exit(0);
                        System.out.println("");
                        System.exit(0);  
                        }
                    }
                }
            }
        }
        
        else if(e.getSource() == SignUpButton){
            SignUp();
            security.signUp(UserInput2, PasswordInput2, SelectedPosition);

            if(e.getSource() == CreateAcc){
                System.out.println("ASD");
                passwordText2.setText("");
                userText2.setText("");
            }
            else if(e.getSource() == Back){
                frame2.setVisible(false);
            } 
    
        }
    }
}
