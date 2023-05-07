
package com.mycompany.bbc_hotelresortreserv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.ZoneId;
import java.util.Date;

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
    JPanel jPanel6 = new JPanel();
    JPanel jPanelCustInf = new JPanel();
    JLabel jLabel1 = new JLabel();
    JButton jButton1 = new JButton();
    JPanel jPanel4 = new JPanel();
    JScrollPane jScrollPane1 = new JScrollPane();
    JPanel jPanel8 = new JPanel();
    JLabel jLabel3 = new JLabel();
    JPanel jPanel9 = new JPanel();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JButton jButton5 = new JButton();
    
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
        resetBtn.setPreferredSize(new Dimension(70, 23));
        resetBtn.addActionListener(this);
        resetBtn.setFont(new Font("Arial", Font.PLAIN, 12));
        jPanel1.add(resetBtn);

        jPanel3.add(jPanel1);

        jPanel5.setBorder(BorderFactory.createTitledBorder("Customers Reserved"));
        jPanel5.setPreferredSize(new Dimension(335, 440));

        jPanel6.setPreferredSize(new Dimension(250, 50));
        jPanel6.setRequestFocusEnabled(false);
        jPanel6.setLayout(new BoxLayout(jPanel6, BoxLayout.X_AXIS));

        jLabel1.setFont(new Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("jLabel1");
        jPanelCustInf.setPreferredSize(new Dimension(180, 16));
        jPanelCustInf.setLayout(new FlowLayout(FlowLayout.LEFT));
        jPanelCustInf.add(jLabel1);
        jPanel6.add(jPanelCustInf);

        jButton1.setText(">");
        jPanel6.add(jButton1);

        jPanel5.add(jPanel6);

        jPanel3.add(jPanel5);

        jPanel2.add(jPanel3);

        jPanel4.setLayout(new BoxLayout(jPanel4, BoxLayout.Y_AXIS));

        jScrollPane1.setPreferredSize(new Dimension(100, 250));

        jPanel8.setBorder(BorderFactory.createTitledBorder("Customer Information"));
        jPanel8.setLayout(new BorderLayout());

        jLabel3.setText("jLabel3");
        jPanel8.add(jLabel3, BorderLayout.CENTER);

        jScrollPane1.setViewportView(jPanel8);

        jPanel4.add(jScrollPane1);

        jButton3.setText("CHECK IN");
        jPanel9.add(jButton3);

        jButton4.setText("EXTRAS");
        jPanel9.add(jButton4);

        jButton5.setText("CHECKOUT");
        jPanel9.add(jButton5);

        jPanel4.add(jPanel9);

        jPanel2.add(jPanel4);

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
            
            System.out.println(month);
            
        }
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==monthCmb || e.getSource()==yearCmb){
            smartDay();
        }
    }
    
    
}
