
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
    JLabel fullCustInfoLbl = new JLabel();
    JPanel jPanel9 = new JPanel();
    JButton chkInBtn = new JButton();
    JButton xtraBtn = new JButton();
    JButton chkOutBtn = new JButton();
    
    int custCountRsrv = 0;
    int transSelectedID = -1;
    
    private final HotelCRUD hotelBooked;
    private final CustomerCRUD customersBooked;
    private final TransactionSystem transactionsCompleted;
    private final ResourcesCRUD resourcesInv;
    
    public RealTimeViewGUI(HotelCRUD hotelBooked, CustomerCRUD customersBooked, TransactionSystem transactionsCompleted, ResourcesCRUD resourcesInv) {
        this.hotelBooked=hotelBooked;
        this.customersBooked=customersBooked;
        this.transactionsCompleted=transactionsCompleted;
        this.resourcesInv=resourcesInv;

        
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

        fullCustInfoLbl.setText(" . . . ");
        fullCustInfoLbl.setFont(new Font("Arial", Font.PLAIN, 15));
        jPanel8.add(fullCustInfoLbl, BorderLayout.CENTER);

        custInfoScrlPane.setViewportView(jPanel8);

        custInfoPanelMain.add(custInfoScrlPane);

        chkInBtn.setText("CHECK IN");
        chkInBtn.addActionListener(this);
        jPanel9.add(chkInBtn);

        xtraBtn.setText("EXTRAS");
        xtraBtn.addActionListener(this);
        jPanel9.add(xtraBtn);

        chkOutBtn.setText("CHECKOUT");
        chkOutBtn.addActionListener(this);
        jPanel9.add(chkOutBtn);

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
            
            Transaction t = transFromDate.get(i);
            
            
            custCountRsrv++;
            
            custInfoLbl[i] = new JLabel();
            custInfoBtn[i] = new JButton();
            custInfoPanel[i] = new JPanel();
            custInfoBtnPanel[i] = new JPanel();
            
            custInfoBtn[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    fullCustInfoDisplay(t);
                    transSelectedID = t.getTransactID();
                }
            });
            
            custInfoBtnPanel[i].setPreferredSize(new Dimension(200, 30));
            custInfoBtnPanel[i].setRequestFocusEnabled(false);
            custInfoBtnPanel[i].setLayout(new BoxLayout(custInfoBtnPanel[i], BoxLayout.X_AXIS));

            jPanel5.add(custInfoBtnPanel[i]);
            
            custInfoLbl[i].setFont(new Font("Arial", 0, 14)); // NOI18N
            custInfoLbl[i].setText(t.getHotel()+" | " + t.getCustomers()[0].getName());
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
    //update full cust info
    private void fullCustInfoDisplay(Transaction t){
        
        if(t == null){
            fullCustInfoLbl.setText(
                            "<html><i>Nothing to show here..." 
                    );
        }else{
        
            fullCustInfoLbl.setText(
                                "<html> Customer Name : <b>" +  t.getCustomers()[0].getName() +
                                "</b><br/>Number of Customers : " +  t.getCustomers().length +
                                "<br/>Hotel Booked : " +  t.getHotel() + " - "  + hotelBooked.getHotel(t.getHotel()).getHotelType() +
                                "<br/>Down Payment : " +  t.getDownCash()+
                                "<br/>Remaining Balance for Hotel : " +  t.getRemBal()+
                                "<br/>Checked In : " +  t.isCheckedIn()+
                                "<br/>Checked In : " +  t.isCheckedOut()

                        );
        }
    }
    //xtra btn creates new jFrame
    
    
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
        else if (e.getSource()==chkInBtn){
            
            Transaction t = transactionsCompleted.getTransaction(transSelectedID);
            
            if(!t.isCheckedIn()){
                t.setCheckedIn(true);
                JOptionPane.showMessageDialog(null, "Successfully checked in!" );
            }
            
            fullCustInfoDisplay(t);
            
        }
        else if (e.getSource()==chkOutBtn){
            
            Transaction t = transactionsCompleted.getTransaction(transSelectedID);
          
            
            if(t!=null){
                if(!t.isCheckedOut() && t.isCheckedIn()){
                    try {
                        if(t.getRemBal() == 0 || (Double.parseDouble(JOptionPane.showInputDialog("Input Cash")) >= t.getRemBal()) ){
                            t.setCheckedOut(true);
                            t.setFullCash(t.getRemBal());
                            t.setRemBal(0);
                            JOptionPane.showMessageDialog(null, "Successfully checked out!" );
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Insufficient funds!" );
                        }
                        
                    } catch (Exception err) {
                        JOptionPane.showMessageDialog(null, "Incorrect input!" );
                    }
                    
                }
            }
            
            
            fullCustInfoDisplay(t);
            
        }
        else if (e.getSource()==xtraBtn){
            
            
            ResourcesOrderGUI resoOrder = new ResourcesOrderGUI(transactionsCompleted.getTransaction(transSelectedID),resourcesInv);
            
        }
        
        
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==monthCmb || e.getSource()==yearCmb){
            smartDay();
        }
        
        if(e.getSource()==monthCmb || e.getSource()==yearCmb || e.getSource()==dayCmb ){
            custRefresh();
            fullCustInfoDisplay(null);
        }
    }
    
    
}
