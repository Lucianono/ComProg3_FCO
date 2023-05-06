
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
    
    int custCount = 0;
    int custLimit = 8;
    JTextField[] customer_txt_arr = new JTextField[custLimit * 2];
    int custWidth = 110, custHeight = 25;
    
    JPanel panelRight = new JPanel();
    JPanel panelBottom = new JPanel();
    JPanel panelMain = new JPanel();
    JPanel panelSuper = new JPanel();
    
    HotelCRUD hotelBooked = new HotelCRUD();
    CustomerCRUD customersBooked = new CustomerCRUD();
    
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
        
        custCount++;
        
        jPanel1.setPreferredSize(new Dimension(250,300));
        jPanel1.setBorder(BorderFactory.createTitledBorder("Customer Information"));


        jLabel1.setText(" Hotel");
        jLabel1.setFont(new Font("Arial",Font.BOLD,15)  );
        jPanel2.add(jLabel1);
        
        jComboBox1.setFont(new Font("Arial",Font.PLAIN,15)  );
        jComboBox1.setPreferredSize(new Dimension(100,30));
        jPanel2.add(jComboBox1);
        
        jPanel2.setBorder(BorderFactory.createTitledBorder("Hotel Booking"));



        jTextField7.setText("");
        jTextField7.setFont(new Font("Arial",Font.BOLD,15)  );
        jTextField7.setPreferredSize(new Dimension(150,30));
        jPanel3.setBorder(BorderFactory.createTitledBorder("Cash"));
        jPanel3.add(jTextField7);


        jButton3.setText("CHECK IN");
        jButton3.setPreferredSize(new Dimension(120,30));
        jButton3.addActionListener(this);
        
        panelRight.add(jPanel2);
        panelRight.add(jPanel3);
        panelRight.setLayout(new BoxLayout(panelRight,BoxLayout.Y_AXIS));
        panelRight.setPreferredSize(new Dimension(250,300));
        
        panelMain.add(jPanel1);
        panelMain.add(panelRight);
        
        
        jPanel4.add(jButton3);
        panelBottom.add(jPanel4);
        
        panelSuper.add(panelMain);
        panelSuper.add(panelBottom);
        panelSuper.setLayout(new BoxLayout(panelSuper,BoxLayout.Y_AXIS));
        


        

        frame.add(panelSuper);

        
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
        
        else if(e.getSource()==jButton2){
            
            if(custCount > 1){

                jPanel1.remove(customer_txt_arr[custCount*2 -1]);
                jPanel1.remove(customer_txt_arr[custCount*2 -2]);
                
                custCount--;
                
                jPanel1.repaint();
                jPanel1.revalidate();

                frame.setVisible(true);
            }

        }
        else if(e.getSource()==jButton3){
            
            //String hotelBooked = jComboBox1.getSelectedItem()+"";
            //hotelBooked.getHotelIndex(jComboBox1.getSelectedItem()+"");
            Customer[] custArr = new Customer[custCount];
            int realCustCount = 0;
            
            if(hotelBooked.bookHotel(jComboBox1.getSelectedItem()+"")){
                System.out.println(jComboBox1.getSelectedItem()+"");
            }
            
            for(int i = 0; i<custCount ; i++){
                if(!(customer_txt_arr[i*2].getText().equals("")) && !(customer_txt_arr[i*2+1].getText().equals(""))){
                    
                    customersBooked.createCustomer(1, customer_txt_arr[i*2].getText(), Integer.parseInt(customer_txt_arr[i*2 +1].getText()));
                    custArr[realCustCount] = customersBooked.getCustomer(1);
                    realCustCount++;
                    System.out.println(customersBooked.getCustomer(1).getName() + " "+ customersBooked.getCustomer(1).getAge());
                    
                }
            }
            
            

        }

    }
    
    
    
}
