
package com.mycompany.bbc_hotelresortreserv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RealTimeViewGUI extends JFrame implements ActionListener,ItemListener{

    JFrame frame = new JFrame();
    JPanel jPanel2 = new JPanel();
    JPanel jPanel3 = new JPanel();
    JPanel jPanel1 = new JPanel();
    String [] y = {"2023","2024","2025"};
    JComboBox yearCmb = new JComboBox(y);
    String [] m = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    JComboBox monthCmb = new JComboBox(m);
    JComboBox dayCmb = new JComboBox();
    JButton resetBtn = new JButton("Reset");
    JPanel jPanel5 = new JPanel();
    JPanel[] custInfoBtnPanel = new JPanel[10];
    JPanel[] custInfoPanel = new JPanel[10];
    JLabel[] custInfoLbl = new JLabel[10];
    JButton[] custInfoBtn = new JButton[10];
    JPanel custInfoPanelMain = new JPanel();
    JScrollPane custInfoScrlPane = new JScrollPane();
    JPanel jPanel8 = new JPanel();
    JLabel jLabel3 = new JLabel();
    JPanel jPanel9 = new JPanel();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JButton jButton5 = new JButton();
    
    int custCountRsrv = 0;
    
    private final HotelCRUD hotelBooked;
    private final CustomerCRUD customersBooked;
    private final TransactionSystem transactionsCompleted;
    
    public RealTimeViewGUI(HotelCRUD hotelBooked, CustomerCRUD customersBooked, TransactionSystem transactionsCompleted) {
        this.hotelBooked=hotelBooked;
        this.customersBooked=customersBooked;
        this.transactionsCompleted=transactionsCompleted;

        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.X_AXIS));

        jPanel3.setLayout(new BoxLayout(jPanel3, BoxLayout.Y_AXIS));

        jPanel1.add(yearCmb);
        jPanel1.add(monthCmb);
        smartDay();
        jPanel1.add(dayCmb);

        monthCmb.addItemListener(this);
        monthCmb.setFont(new Font("Arial", Font.PLAIN, 12));
        yearCmb.addItemListener(this);
        yearCmb.setFont(new Font("Arial", Font.PLAIN, 12));
        dayCmb.setFont(new Font("Arial", Font.PLAIN, 12));
        dayCmb.addItemListener(this);
        resetBtn.setPreferredSize(new Dimension(70, 23));
        resetBtn.addActionListener(this);
        resetBtn.setFont(new Font("Arial", Font.PLAIN, 12));
        jPanel1.add(resetBtn);

        jPanel3.add(jPanel1);

        jPanel5.setBorder(BorderFactory.createTitledBorder("Customers Reserved"));
        jPanel5.setPreferredSize(new Dimension(200, 440));

        custDisplayAll();

        jPanel3.add(jPanel5);

        jPanel2.add(jPanel3);

        custInfoPanelMain.setLayout(new BoxLayout(custInfoPanelMain, BoxLayout.Y_AXIS));
        custInfoScrlPane.setPreferredSize(new Dimension(100, 250));

        jPanel8.setBorder(BorderFactory.createTitledBorder("Customer Information"));
        jPanel8.setLayout(new BorderLayout());

        jLabel3.setText("jLabel3");
        jPanel8.add(jLabel3, BorderLayout.CENTER);

        custInfoScrlPane.setViewportView(jPanel8);

        custInfoPanelMain.add(custInfoScrlPane);

        jButton3.setText("CHECK IN");
        jPanel9.add(jButton3);

        jButton4.setText("EXTRAS");
        jPanel9.add(jButton4);

        jButton5.setText("CHECKOUT");
        jPanel9.add(jButton5);

        custInfoPanelMain.add(jPanel9);

        jPanel2.add(custInfoPanelMain);

        frame.add(jPanel2, BorderLayout.CENTER);
        
        frame.setSize(600,400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    // day computer
    private void smartDay(){
        
                int maxDays = 0;
                //smart day combobox
                switch(monthCmb.getSelectedIndex()){
                    case 0, 2, 4, 6, 7, 9, 11 -> maxDays = 31;
                    case 3, 5, 8, 10 -> maxDays = 30;
                    case 1 -> {
                        if(Integer.parseInt(yearCmb.getSelectedItem()+"")%4 == 0)
                            maxDays = 29;
                        else
                            maxDays = 28;
            }
                }
                
                String[] days = new String[maxDays];
                for (int i =0; i<maxDays ; i++){
                    days[i]= i+1 +"";
                }
                dayCmb.setModel(new DefaultComboBoxModel<>(days));
    }
    //display all cust reserved
    private void custDisplayAll(){
        
        
        String s =  yearCmb.getSelectedItem() + "/" + (monthCmb.getSelectedIndex()+1) + "/" + dayCmb.getSelectedItem();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/dd/mm");  
        Date dateBooked=null;
        try {
            dateBooked = formatter.parse(s);
        } catch (ParseException ex) {
            Logger.getLogger(ReservationGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<Transaction> transFromDate = transactionsCompleted.getTransactionsByDate(dateBooked);
        
        
        for(int i=0; i<transFromDate.size(); i++){
            
            custCountRsrv++;
            
            custInfoLbl[i] = new JLabel();
            custInfoBtn[i] = new JButton();
            custInfoPanel[i] = new JPanel();
            custInfoBtnPanel[i] = new JPanel();
            
            custInfoBtnPanel[i].setPreferredSize(new Dimension(200, 30));
            custInfoBtnPanel[i].setRequestFocusEnabled(false);
            custInfoBtnPanel[i].setLayout(new BoxLayout(custInfoBtnPanel[i], BoxLayout.X_AXIS));

            jPanel5.add(custInfoBtnPanel[i]);
            
            custInfoLbl[i].setFont(new Font("Arial", 0, 14)); // NOI18N
            custInfoLbl[i].setText(transFromDate.get(i).getHotel()+" | " + transFromDate.get(i).getCustomers()[0].getName());
            //custInfoPanel[i].setPreferredSize(new Dimension(250, 16));
            custInfoPanel[i].setLayout(new FlowLayout(FlowLayout.LEFT));
            custInfoPanel[i].setBackground(Color.white);
            custInfoPanel[i].add(custInfoLbl[i]);
            custInfoBtnPanel[i].add(custInfoPanel[i]);
            custInfoBtnPanel[i].setBackground(Color.white);
            custInfoBtnPanel[i].setPreferredSize(new Dimension(250, 30));

            custInfoBtn[i].setText(">");
            custInfoBtnPanel[i].add(custInfoBtn[i]);
            
        }

        jPanel5.repaint();
        jPanel5.revalidate();
        frame.setVisible(true);
        
    }
    //refresh displayed customers
    private void custRefresh(){
        
        for (int i = 0; i < custCountRsrv ; i++){
            jPanel5.remove(custInfoBtnPanel[i]);
        }
        jPanel5.repaint();
        jPanel5.revalidate();
        frame.setVisible(true);
        custCountRsrv = 0;
        
        custDisplayAll();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==resetBtn){
            
            
            Date nowDate = new Date();
            int year = nowDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear();
            int month = nowDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getMonthValue();
            int day = nowDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getDayOfMonth();

            yearCmb.setSelectedIndex(year-2023);
            monthCmb.setSelectedIndex(month-1);
            dayCmb.setSelectedIndex(day-1);
            
            custRefresh();
            
        }
        
        
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==monthCmb || e.getSource()==yearCmb){
            smartDay();
        }
        
        if(e.getSource()==monthCmb || e.getSource()==yearCmb || e.getSource()==dayCmb ){
            custRefresh();
        }
    }
    
    
}
