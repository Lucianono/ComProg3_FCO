
package com.mycompany.bbc_hotelresortreserv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class TransactionGUI extends JFrame implements ActionListener{

    JFrame frame = new JFrame();
    JPanel jPanel1 = new JPanel();
    JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JPanel jPanel2 = new JPanel();
    JLabel jLabel1 = new JLabel();
    JComboBox jComboBox1 = new JComboBox(new HotelCRUD().getAllHotelID());
    JPanel jPanel3 = new JPanel();
    JTextField jTextField7 = new JTextField();
    JPanel jPanel4 = new JPanel();
    JButton jButton3 = new JButton();
    
    int custCount = 1;
    int custLimit = 8;
    JTextField[] customer_txt_arr = new JTextField[custLimit * 2];
    int custWidth = 110, custHeight = 25;
    
    JPanel panelRight = new JPanel();
    JPanel panelMain = new JPanel();
    
    TransactionGUI() {
        frame.setSize(600,400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);



        jButton1.setText("+");
        jButton1.addActionListener(this);
        jButton1.setPreferredSize(new Dimension(custWidth,custHeight));
        jPanel1.add(jButton1);

        jButton2.setText("-");
        jButton2.addActionListener(this);
        jButton2.setPreferredSize(new Dimension(custWidth,custHeight));
        jPanel1.add(jButton2);
        
        customer_txt_arr[custCount*2] = new JTextField();
        customer_txt_arr[custCount*2 +1] = new JTextField();

        jPanel1.add(customer_txt_arr[custCount*2]);
        jPanel1.add(customer_txt_arr[custCount*2 +1]);
        
        customer_txt_arr[custCount*2].setPreferredSize(new Dimension(custWidth,custHeight));
        customer_txt_arr[custCount*2 +1].setPreferredSize(new Dimension(custWidth,custHeight));
        
        jPanel1.setPreferredSize(new Dimension(250,300));
        jPanel1.setBorder(BorderFactory.createTitledBorder("Customer Information"));

        jLabel1.setText(" Hotel");
        jPanel2.add(jLabel1);

        jPanel2.add(jComboBox1);


        jTextField7.setText("Cash");
        jPanel3.add(jTextField7);


        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton3.setText("CheckIn");
        
        panelRight.add(jPanel2);
        panelRight.add(jPanel3);
        panelRight.setLayout(new BoxLayout(panelRight,BoxLayout.Y_AXIS));
        
        panelMain.add(jPanel1);
        panelMain.add(panelRight);
        //panelMain.setLayout(new BoxLayout(panelMain,BoxLayout.X_AXIS));
        


        jPanel4.add(jButton3, java.awt.BorderLayout.CENTER);

        frame.add(panelMain);
        frame.add(jPanel4,BorderLayout.SOUTH);

        
        frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==jButton1){
            
            if(custCount < custLimit){
                customer_txt_arr[custCount*2] = new JTextField();
                customer_txt_arr[custCount*2 +1] = new JTextField();

                jPanel1.add(customer_txt_arr[custCount*2]);
                jPanel1.add(customer_txt_arr[custCount*2 +1]);
                
                customer_txt_arr[custCount*2].setPreferredSize(new Dimension(custWidth,custHeight));
                customer_txt_arr[custCount*2 +1].setPreferredSize(new Dimension(custWidth,custHeight));
                
                custCount++;

             
                frame.setVisible(true);
            }

        }
        
        if(e.getSource()==jButton2){
            
            if(custCount > 1){

                jPanel1.remove(customer_txt_arr[custCount*2 -1]);
                jPanel1.remove(customer_txt_arr[custCount*2 -2]);
                
                custCount--;
                
                jPanel1.repaint();
                jPanel1.revalidate();

                frame.setVisible(true);
            }

        }

    }
    
    
    
}
