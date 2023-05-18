package com.mycompany.bbc_hotelresortreserv;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.time.LocalDate;

public class Receipt extends JFrame {

    private JButton printbtn = new JButton("Print");
    private JButton cancelbtn = new JButton("Cancel");
    private JTextArea main;
    JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
    JFrame mfrm = new JFrame("Draft");
    
    public Receipt(int rcpttype , Transaction t, double change, ResourcesCRUD rinv) {
        
        buttonPanel.add(printbtn);
        buttonPanel.add(cancelbtn);
        
        if(rcpttype==0){
            StringBuilder receiptText = new StringBuilder();
            receiptText.append("=============================================\n");
            receiptText.append("                    RECEIPT\n");
            receiptText.append("=============================================\n\n");
            receiptText.append("Hotel/Resort Name: BBC Hotel Resort\n");
            receiptText.append("Date: ").append(LocalDate.now()).append("\n");
            receiptText.append("Transaction Code: ").append(t.getTransactID()).append("\n");
            receiptText.append("---------------------------------------------\n");
            for(int i = 0; i<t.getCustomers().length;i++){
                receiptText.append("Customer Name: ").append(t.getCustomers()[i].getName()).append("\n");
                receiptText.append("Customer Age: ").append(t.getCustomers()[i].getAge()).append("\n");
            }
            receiptText.append("---------------------------------------------\n");
            receiptText.append("Hotel Booked:").append(t.getHotel()).append("\n");
            receiptText.append("--------------------------------------------\n");
            receiptText.append("Total Amount: ₱ ").append(t.getTotalAmount()).append("\n");
            receiptText.append("Down Payment: ₱ ").append(t.getDownCash()).append("\n");
            receiptText.append("Full Payment: ₱ ").append(t.getFullCash()).append("\n\n");
            receiptText.append("Change : ₱ ").append(change).append("\n");
            receiptText.append("Remaining Balance : ₱ ").append(t.getRemBal()).append("\n");
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
            receiptText.append("Date: ").append(t.getDateRsrv()).append("\n");
            receiptText.append("Transaction Code: ").append(t.getTransactID()).append("\n");
            receiptText.append("---------------------------------------------\n");
            for(int i = 0; i<t.getCustomers().length;i++){
                receiptText.append("Customer Name: ").append(t.getCustomers()[i].getName()).append("\n");
                receiptText.append("Customer Age: ").append(t.getCustomers()[i].getAge()).append("\n");
            }
            receiptText.append("---------------------------------------------\n");
            receiptText.append("Hotel Booked: ").append(t.getHotel()).append("\n");
            receiptText.append("Date checked in: ").append(t.getDateChkIn()).append("\n");
            receiptText.append("Date checked out: ").append(t.getDateChkOut()).append("\n");
            receiptText.append("---------------EXTRAS------------------------\n");
            for(int i = 0; i<t.getResoUsed().length;i++){
                if(t.getResoUsed()[i]==null)
                    break;
                receiptText.append("*Item Name: ").append(rinv.getReso(t.getResoUsed()[i].getItemID()).getItemName()).append("\n");
                receiptText.append("Price: ₱ ").append(rinv.getReso(t.getResoUsed()[i].getItemID()).getPrice()).append("\n");
                receiptText.append("Qty: ").append(t.getResoUsed()[i].getQty()).append("\n");
            }
            receiptText.append("--------------------------------------------\n");
            receiptText.append("Total Amount: ₱ ").append(t.getTotalAmount()).append("\n");
            receiptText.append("Down Payment: ₱ ").append(t.getDownCash()).append("\n");
            receiptText.append("Full Payment: ₱ ").append(t.getFullCash()).append("\n\n");
            receiptText.append("Change : ₱ ").append(change).append("\n");
            receiptText.append("Remaining Balance : ₱ ").append(t.getRemBal()).append("\n");
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