
package com.mycompany.bbc_hotelresortreserv;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Account extends JPanel{
    
    JLabel userNameLbl = new JLabel();

    String UserChange;
    String PassChange;
    Security security;
    
    public void ChangeUsername(){
        JFrame frame2 = new JFrame("Change Username/Password");
        frame2.setSize(300, 200);
        frame2.setLocationRelativeTo(null);

        JPanel panel2 = new JPanel();
        
        JLabel usernameLabel = new JLabel("Enter New Username:");
        panel2.add(usernameLabel);

        JTextField usernameField = new JTextField(20);
        panel2.add(usernameField);

        JLabel passwordLabel = new JLabel("Enter Password:");
        panel2.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField(20);
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
                    
                    int i = security.loggedIndex;
                    
                        System.out.println(security.user[i] + security.Decrypt(security.pass[i]));
                        if (security.Decrypt(security.pass[i]).equals(EnterPass)){
                                //Hinahanap ung username ng iniiba na pw then gagawing = sa NewPassText
                                
                                security.user[i] = NewUserText;
                                System.out.println(security.user[i] + security.Decrypt(security.pass[i]));
                                UserChange = NewUserText;
                                userNameLbl.setText(UserChange);
                                JOptionPane.showMessageDialog(null, "Successfully Changed Username");
                                
                        }else {
                            JOptionPane.showMessageDialog(null, "Incorrect password!",null,JOptionPane.ERROR_MESSAGE);

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
        frame3.setSize(300, 200);
        frame3.setLocationRelativeTo(null);

        JPanel panel3 = new JPanel();

        JLabel NewPassLabel = new JLabel("Enter New Password:");
        panel3.add(NewPassLabel);

        JPasswordField NewPassField = new JPasswordField(20);
        panel3.add(NewPassField);

        JLabel ConfirmPassLabel = new JLabel("Confirm New Password");
        panel3.add(ConfirmPassLabel);

        JPasswordField ConfirmPassField = new JPasswordField(20);
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
                    
                    
                    int i = security.loggedIndex;
                    
                            if(ConfirmNewPass.equals(NewPassText))
                            {
                                 //Hinahanap ung username ng iniiba na pw then gagawing = sa NewPassText
                                security.pass[i] = security.Encrypt(NewPassText);
                                System.out.println(security.Decrypt(security.pass[i]));
                                
                                JOptionPane.showMessageDialog(null, "Successfully Changed Password");
                                
                                
                            }else {
                            JOptionPane.showMessageDialog(null, "Password does not match!",null,JOptionPane.ERROR_MESSAGE);

                        }
                        
                    }
                
            }
        });

        Back2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame3.dispose();
                security.logged=false;
            }
        });
        
    }
    
    
    Account(String userinput, String userpass, Security security){
        
        this.UserChange = userinput;
        this.PassChange = userpass;
        this.security = security;
      
        JPanel bjPanel1 = new JPanel();
        Box.Filler bfiller2 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(0, 32767));
        JPanel bjPanel8 = new JPanel();
        JPanel bjPanel9 = new JPanel();
        JPanel bjPanel2 = new JPanel();
        JPanel bjPanel19 = new JPanel();
        JLabel bjLabel8 = new JLabel();
        JPanel bjPanel11 = new JPanel();
        JPanel bjPanel12 = new JPanel();
        JLabel bjLabel4 = new JLabel();
        JPanel bjPanel13 = new JPanel();
        Box.Filler bfiller5 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
        JPanel bjPanel14 = new JPanel();
        JPanel bjPanel7 = new JPanel();
        JButton ChangeUsernameBtn = new JButton();
        JButton ChangePasswordBtn = new JButton();
        JButton LogoutBtn = new JButton();
        Box.Filler bfiller6 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
        Box.Filler bfiller1 = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(0, 32767));


        bjPanel1.setLayout(new BoxLayout(bjPanel1, BoxLayout.Y_AXIS));
        bjPanel1.add(bfiller2);

        bjPanel8.setMinimumSize(new Dimension(438, 400));

        bjPanel9.setMinimumSize(new Dimension(428, 300));
        bjPanel9.setPreferredSize(new Dimension(400, 300));
        bjPanel9.setLayout(new BoxLayout(bjPanel9, BoxLayout.Y_AXIS));

        bjPanel2.setMinimumSize(new Dimension(430, 204));
        bjPanel2.setPreferredSize(new Dimension(500, 200));
        bjPanel2.setLayout(new BoxLayout(bjPanel2, BoxLayout.Y_AXIS));

        bjPanel19.setPreferredSize(new Dimension(648, 60));

        ImageIcon logoImg = new ImageIcon("src/main/resources/images/accIcon.png"); 
        Image logoVar = logoImg.getImage().getScaledInstance(logoImg.getIconWidth()/6, logoImg.getIconHeight()/6, Image.SCALE_SMOOTH); 

        
        bjLabel8.setFont(new Font("Verdana", 1, 24)); // NOI18N
        bjLabel8.setHorizontalAlignment(SwingConstants.CENTER);
        bjLabel8.setIcon(new ImageIcon(logoVar)); // NOI18N
        bjPanel19.add(bjLabel8);

        bjPanel2.add(bjPanel19);

        bjPanel11.setPreferredSize(new Dimension(648, 10));
        bjPanel11.setLayout(new GridLayout());

        userNameLbl.setFont(new Font("Verdana", 1, 24)); // NOI18N
        userNameLbl.setHorizontalAlignment(SwingConstants.CENTER);
        userNameLbl.setText(UserChange);
        bjPanel11.add(userNameLbl);

        bjPanel2.add(bjPanel11);

        bjPanel12.setPreferredSize(new Dimension(300, 0));
        bjPanel12.setLayout(new GridLayout());

        bjLabel4.setFont(new Font("Arial Narrow", 0, 18)); // NOI18N
        bjLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        bjLabel4.setText("<html>Role : <b>" + security.pos[security.loggedIndex].toUpperCase());
        bjLabel4.setPreferredSize(new Dimension(126, 16));
        bjPanel12.add(bjLabel4);

        bjPanel2.add(bjPanel12);

        bjPanel13.setPreferredSize(new Dimension(500, 110));
        bjPanel13.setLayout(new BoxLayout(bjPanel13, BoxLayout.X_AXIS));
        bjPanel13.add(bfiller5);

        bjPanel14.setPreferredSize(new Dimension(250, 110));
        bjPanel14.setRequestFocusEnabled(false);
        bjPanel14.setLayout(new BoxLayout(bjPanel14, BoxLayout.Y_AXIS));

        bjPanel7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 20));

        ChangeUsernameBtn.setText("<html>Change <br/>Username");
        ChangeUsernameBtn.setHorizontalTextPosition(SwingConstants.CENTER);
        ChangeUsernameBtn.setPreferredSize(new Dimension(120, 40));
        bjPanel7.add(ChangeUsernameBtn);

        ChangePasswordBtn.setText("<html>Change <br/>Password");
        ChangePasswordBtn.setHorizontalTextPosition(SwingConstants.CENTER);
        ChangePasswordBtn.setPreferredSize(new Dimension(120, 40));
        bjPanel7.add(ChangePasswordBtn);

        LogoutBtn.setText("Exit");
        LogoutBtn.setPreferredSize(new Dimension(100, 40));
        bjPanel7.add(LogoutBtn);

        bjPanel14.add(bjPanel7);

        bjPanel13.add(bjPanel14);
        bjPanel13.add(bfiller6);

        bjPanel2.add(bjPanel13);

        bjPanel9.add(bjPanel2);

        bjPanel8.add(bjPanel9);

        bjPanel1.add(bjPanel8);
        bjPanel1.add(bfiller1);

        add(bjPanel1, BorderLayout.CENTER);

        setSize(600, 400);
        setVisible(true);
        
        //Button Action
        ChangeUsernameBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ChangeUsername();
            }
        });
        ChangePasswordBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ChangePass();
                
            }
        });
        LogoutBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                security.logged=false;
                security.loggedIndex = -1;
                System.exit(0);
            }
        });
        
        
        
    }
    
    
    
    
}
