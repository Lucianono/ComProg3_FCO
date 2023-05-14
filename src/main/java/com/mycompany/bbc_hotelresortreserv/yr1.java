package com.mycompany.bbc_hotelresortreserv;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class yr1 extends JFrame {
    
    private JButton nxtbtn = new JButton("Resources Used");
 
    public yr1() {
        JFrame mfrm = new JFrame("2023");
        JPanel mpnl = new JPanel();
        JLabel lbl1 = new JLabel("January");
        
        String row[][] = new String[31][3];
        
        for (String[] row1 : row) {
            for (int i = 0; i < row1.length; i++) {
                row1[i] = "";
            }
        }
        
        for (int i = 0; i < row.length; i++) {
            row[i][0] = Integer.toString(i + 1);
        }
        
        String column[] = {"Day", "Sales", "#ofCustomers"};
        
        JTable rm1 = new JTable(row, column);
        
        JScrollPane sp1 = new JScrollPane(rm1);
        
        rm1.setBounds(30, 40, 300,3000);
        
        JLabel lbl2 = new JLabel("February");
        
        String row2[][] = new String[28][3];
        
        for (String[] row1 : row2) {
            for (int i = 0; i < row1.length; i++) {
                row1[i] = "";
            }
        }
        
        for (int i = 0; i < row2.length; i++) {
            row2[i][0] = Integer.toString(i + 1);
        }
        
        String column2[] = {"Day", "Sales", "#ofCustomers"};
        
        JTable rm2 = new JTable(row2, column2);
        
        JScrollPane sp2 = new JScrollPane(rm2);
        
        rm2.setBounds(30, 40, 300,3000);
        
        JLabel lbl3 = new JLabel("March");
        
        String row3[][] = new String[31][3];
        
        for (String[] row1 : row3) {
            for (int i = 0; i < row1.length; i++) {
                row1[i] = "";
            }
        }
        
        for (int i = 0; i < row3.length; i++) {
            row3[i][0] = Integer.toString(i + 1);
        }
        
        String column3[] = {"Day", "Sales", "#ofCustomers"};
        
        JTable rm3 = new JTable(row3, column3);
        
        JScrollPane sp3 = new JScrollPane(rm3);
        
        rm3.setBounds(30, 40, 300,3000);
        
        JLabel lbl4 = new JLabel("April");
        
        String row4[][] = new String[30][3];
        
        for (String[] row1 : row4) {
            for (int i = 0; i < row1.length; i++) {
                row1[i] = "";
            }
        }
        
        for (int i = 0; i < row4.length; i++) {
            row4[i][0] = Integer.toString(i + 1);
        }
        
        String column4[] = {"Day", "Sales", "#ofCustomers"};
        
        JTable rm4 = new JTable(row4, column4);
        
        JScrollPane sp4 = new JScrollPane(rm4);
        
        rm4.setBounds(30, 40, 300,3000);
        
        mpnl.setLayout(new BoxLayout(mpnl, BoxLayout.PAGE_AXIS));

        mpnl.add(lbl1);
        mpnl.add(sp1);
        
        mpnl.add(lbl2);
        mpnl.add(sp2);
        
        mpnl.add(lbl3);
        mpnl.add(sp3);
        
        mpnl.add(lbl4);
        mpnl.add(sp4);
        
        JScrollPane scrollPane = new JScrollPane(mpnl);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        mfrm.add(scrollPane);
        mfrm.setSize(600, 400);
        mfrm.setVisible(true);
        mfrm.setResizable(false);
        mfrm.setLocationRelativeTo(null);
        
        nxtbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                mfrm.dispose();
                SecondFrame sfrm = new SecondFrame();
            }
        });
        mfrm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);     
        mfrm.getContentPane().add(nxtbtn, "South");
    }
  
    private static class SecondFrame {
        private JFrame sfrm = new JFrame("Resources Used");
        public SecondFrame() {
            
            String amount[][] = {{"101", "Amit", "670000"},
                            {"102", "Jai", "780000"},
                            {"101", "Sachin", "700000"}};
        
            String column[] = {"Day", "Extra Bed", "Pillow", "Towel", "Reading Light",
            "Books/Magazine", "Toiletries", "Luggage Rack", "Breakfast", "Lunch",
            "Dinner", "Drink", "Snack"};
            
            JTable amntused = new JTable(amount,column);
            JScrollBar hbar = new JScrollBar(JScrollBar.HORIZONTAL, 30, 20, 0, 500);
            JScrollBar vbar = new JScrollBar(JScrollBar.VERTICAL, 30, 40, 0, 500);
            
            JScrollPane sp = new JScrollPane(amntused);
            
            amntused.setBounds(30, 40, 300,300);
            
            sfrm.getContentPane().add(sp);
            sfrm.getContentPane().add(hbar, BorderLayout.SOUTH);
            sfrm.getContentPane().add(vbar, BorderLayout.EAST);
        
            sfrm.add(sp);       
            sfrm.setSize(600, 400);
            sfrm.setVisible(true);
            sfrm.setResizable(false);
            sfrm.setLocationRelativeTo(null);
            sfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}