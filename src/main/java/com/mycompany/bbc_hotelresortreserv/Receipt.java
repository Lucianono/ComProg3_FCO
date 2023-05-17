package com.mycompany.bbc_hotelresortreserv;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.time.LocalDate;

public class Receipt extends JFrame {

    private JButton printbtn = new JButton("Print Receipt");
    private JButton cancelbtn = new JButton("Cancel Transaction");
    private JTextArea main;
    JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
    JFrame mfrm = new JFrame("Draft");
    
    public Receipt(int rcpttype) {
        
        buttonPanel.add(printbtn);
        buttonPanel.add(cancelbtn);
        
        if(rcpttype==0){
        StringBuilder receiptText = new StringBuilder();
        receiptText.append("=============================================\n");
        receiptText.append("                    RECEIPT\n");
        receiptText.append("=============================================\n\n");
        receiptText.append("Hotel/Resort Name: BBC Hotel Resort\n");
        receiptText.append("Date: ").append(LocalDate.now()).append("\n");
        receiptText.append("Reservation Code: [Reservation Code]\n");
        receiptText.append("Customer Name: [Customer Name]\n");
        receiptText.append("Customer Age: [Customer Age]\n");
        receiptText.append("Customer Phone: [Customer Phone]\n");
        receiptText.append("---------------------------------------------\n");
        receiptText.append("Hotel Booked: [Room Type]\n");
        receiptText.append("Check-in Date: [Check-in Date]\n");
        receiptText.append("Number of Guests: [Number of Guests]\n");
        receiptText.append("--------------------------------------------\n");
        receiptText.append("Down Payment: $[Down Payment]\n");
        receiptText.append("Tax: $[Tax Amount]\n");
        receiptText.append("Total Amount: $[Total Amount]\n");
        receiptText.append("---------------------------------------------\n");
        receiptText.append("Payment Method: [Payment Method]\n");
        receiptText.append("Transaction ID: [Transaction ID]\n");
        receiptText.append("---------------------------------------------\n\n");
        receiptText.append("Thank you for choosing BBC Hotel Resort.\n");
        receiptText.append("For any inquiries, please contact our\n");
        receiptText.append("customer service.\n\n");
        receiptText.append("=============================================\n");
        
        main = new JTextArea(receiptText.toString());
        main.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
        main.setEditable(false);
        main.setFont(new Font("Monospaced", Font.PLAIN, 12));
        
        JScrollPane scrollPane = new JScrollPane(main);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        mfrm.getContentPane().add(scrollPane);
        mfrm.pack();
        mfrm.setSize(355,400);
        mfrm.setLocationRelativeTo(null);
        mfrm.setResizable(false);
        mfrm.setVisible(true);
        mfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        mfrm.getContentPane().add(buttonPanel, "North");
        
        printbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Printing" );
            }
        }); 
        
        cancelbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JScrollPane scrollPane = new JScrollPane(main);
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                mfrm.dispose();
            }
        }); 
        }
        else if(rcpttype==1){
        
        StringBuilder receiptText = new StringBuilder();
        receiptText.append("=============================================\n");
        receiptText.append("                    RECEIPT\n");
        receiptText.append("=============================================\n\n");
        receiptText.append("Hotel/Resort Name: BBC Hotel Resort\n");
        receiptText.append("Date: ").append(LocalDate.now()).append("\n");
        receiptText.append("Reservation Code: [Reservation Code]\n");
        receiptText.append("Customer Name: [Customer Name]\n");
        receiptText.append("Customer Age: [Customer Age]\n");
        receiptText.append("Customer Phone: [Customer Phone]\n");
        receiptText.append("---------------------------------------------\n");
        receiptText.append("Room Type: [Room Type]\n");
        receiptText.append("Check-in Date: [Check-in Date]\n");
        receiptText.append("Check-out Date: [Check-out Date]\n");
        receiptText.append("Number of Guests: [Number of Guests]\n");
        receiptText.append("--------------------------------------------\n");
        receiptText.append("Subtotal: $[Subtotal]\n");
        receiptText.append("Tax: $[Tax Amount]\n");
        receiptText.append("Total Amount: $[Total Amount]\n");
        receiptText.append("---------------------------------------------\n");
        receiptText.append("Payment Method: [Payment Method]\n");
        receiptText.append("Transaction ID: [Transaction ID]\n");
        receiptText.append("---------------------------------------------\n\n");
        receiptText.append("Thank you for choosing BBC Hotel Resort.\n");
        receiptText.append("For any inquiries, please contact our\n");
        receiptText.append("customer service.\n\n");
        receiptText.append("=============================================\n");
        
        main = new JTextArea(receiptText.toString());
        main.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
        main.setEditable(false);
        main.setFont(new Font("Monospaced", Font.PLAIN, 12));
        
        JScrollPane scrollPane = new JScrollPane(main);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        mfrm.getContentPane().add(scrollPane);
        mfrm.pack();
        mfrm.setSize(355,400);
        mfrm.setLocationRelativeTo(null);
        mfrm.setResizable(false);
        mfrm.setVisible(true);
        mfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        mfrm.getContentPane().add(buttonPanel, "North");
        
        printbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Printing" );
            }
        }); 
        
        cancelbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JScrollPane scrollPane = new JScrollPane(main);
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                mfrm.dispose();
            }
        }); 
        }
    }
}