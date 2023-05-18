
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
    double vatAmount = .12;
    
    private final HotelCRUD hotelBooked;
    private final TransactionSystem transactionsCompleted;
    private final ResourcesCRUD resourcesInv;
    private final CustomerCRUD customersBooked;
    
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

        fullCustInfoDisplay(null);
        
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
        refreshBtns();
        
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
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");  
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
                    refreshBtns();
                    
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
    private double fullCustInfoDisplay(Transaction t){
        
        if(t == null){
            fullCustInfoLbl.setText(
                            "<html><i>Nothing to show here..." 
                    );
            return 0.0;
        }else{
            
            
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd hh:mm");
            String ssdI = "Not yet Checked In";
            String ssdO = "Not yet Checked Out";
            if(t.getDateChkIn()!=null)
                ssdI = formatter.format(t.getDateChkIn());
            if(t.getDateChkOut()!=null)
                ssdO = formatter.format(t.getDateChkOut());
        
            Double totalAmount = 0.0;
            fullCustInfoLbl.setText(
                                "<html> Customer Name : <b>" +  t.getCustomers()[0].getName() +
                                "</b><br/>Number of Customers : " +  t.getCustomers().length +
                                "<br/>Hotel Booked : " +  t.getHotel() + " - "  + hotelBooked.getHotel(t.getHotel()).getHotelType() +
                                "<br/>Down Payment : " +  t.getDownCash()+
                                "<br/>Remaining Balance for Hotel : " +  t.getRemBal()+
                                "<br/>Checked In : <b>" +  t.isCheckedIn()+ "</b>" +
                                "<br/>Date Checked In : <i>" + ssdI + "</i>" +
                                "<br/>Checked In <b>: " +  t.isCheckedOut() + "</b>" +
                                "<br/>Date Checked In : <i>" +  ssdO + "</i>"

                        );
            
            if(t.getResoUsed()!=null){
                String disp = "<html>  <br/>-->Extras :";
                totalAmount = 0.0;
                fullCustInfoLbl.setText(fullCustInfoLbl.getText()+"<br/> "+ disp);
                for (int i = 0;  i < t.getResoUsed().length; i++){
                    if(t.getResoUsed()[i]==null){
                        break;
                    }
                    Double amount = t.getResoUsed()[i].getQty() * resourcesInv.getReso(t.getResoUsed()[i].getItemID()).getPrice();
                    disp = t.getResoUsed()[i].getQty() + " " + resourcesInv.getReso(t.getResoUsed()[i].getItemID()).getItemName()+ " - ₱ " + amount;
                    fullCustInfoLbl.setText(fullCustInfoLbl.getText()+"<br/> "+ disp);
                    totalAmount += amount;
                    
                }  
                
                fullCustInfoLbl.setText(fullCustInfoLbl.getText()+"<br/> Total VAT : " + Math.round(totalAmount*vatAmount*100)/100.0);
                totalAmount = Math.round(totalAmount*(1+vatAmount)*100)/100.0;
                
                if(t.isCheckedOut())
                    fullCustInfoLbl.setText(fullCustInfoLbl.getText()+"<br/> ---------- <br/> <b> Fully Paid!");
                else
                    fullCustInfoLbl.setText(fullCustInfoLbl.getText()+"<br/> ---------- <br/> + ₱ " + totalAmount +"<br/> Remaining Balance : <br/> ₱ <b>" + (t.getRemBal()+totalAmount));
            }
            
            
            return t.getRemBal()+totalAmount;
            
        }
    }
    //refresh buttons
    private void refreshBtns(){
        boolean chosen ;
        chosen = transSelectedID != -1;
        chkInBtn.setEnabled(chosen);
        chkOutBtn.setEnabled(chosen);
        xtraBtn.setEnabled(chosen);
        
        if(chosen){
        chkInBtn.setEnabled(!transactionsCompleted.getTransaction(transSelectedID).isCheckedIn());
        chkOutBtn.setEnabled(!transactionsCompleted.getTransaction(transSelectedID).isCheckedOut() && transactionsCompleted.getTransaction(transSelectedID).isCheckedIn());
        xtraBtn.setEnabled(!transactionsCompleted.getTransaction(transSelectedID).isCheckedOut() && transactionsCompleted.getTransaction(transSelectedID).isCheckedIn());
        }
        
        
        
    }
    
    
    int resoMaxVal = 30;
    
    JFrame frame2;
    JPanel jResoPanel2;
    JScrollPane jScrollPane1;;
    JPanel jResoPanel10;
    JPanel [] resoEachPanel;
    JPanel [] resoLblPanel;
    JLabel [] resoLbl;
    JButton [] plusBtn;
    JLabel [] qtyCountLbl;
    JButton [] minusBtn;
    JLabel [] maxCountLbl;
    JPanel jResoPanel3;
    JScrollPane jScrollPane2;;
    JPanel jResoPanel11;
    JLabel totalOrderLbl;
    JPanel jResoPanel17;
    JButton confirmBtn;
    
    
    ArrayList<Resources> reso;
    
    private void openResourcesOrderGUI() {
        
        frame2 = new JFrame();
        jResoPanel2 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jResoPanel10 = new JPanel();
        resoEachPanel = new JPanel[resoMaxVal];
        resoLblPanel = new JPanel[resoMaxVal];
        resoLbl = new JLabel[resoMaxVal];
        plusBtn = new JButton[resoMaxVal];
        qtyCountLbl = new JLabel[resoMaxVal];
        minusBtn = new JButton[resoMaxVal];
        maxCountLbl = new JLabel[resoMaxVal];
        jResoPanel3 = new JPanel();
        jScrollPane2 = new JScrollPane();
        jResoPanel11 = new JPanel();
        totalOrderLbl = new JLabel();
        jResoPanel17 = new JPanel();
        confirmBtn = new JButton();
        
        reso = resourcesInv.getResoData();

        jResoPanel2.setLayout(new BoxLayout(jResoPanel2, BoxLayout.X_AXIS));

        jScrollPane1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane1.setPreferredSize(new Dimension(350, 100));
        jScrollPane1.setRequestFocusEnabled(false);

        jScrollPane1.setBorder(BorderFactory.createTitledBorder("Buy a Resources"));
        jResoPanel10.setLayout(new BoxLayout(jResoPanel10, BoxLayout.Y_AXIS));

        refreshResourcePane();

        jScrollPane1.setViewportView(jResoPanel10);

        jResoPanel2.add(jScrollPane1);

        jResoPanel3.setPreferredSize(new Dimension(50, 100));
        jResoPanel3.setLayout(new BoxLayout(jResoPanel3, BoxLayout.Y_AXIS));

        jScrollPane2.setPreferredSize(new Dimension(50, 150));

        jResoPanel11.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jResoPanel11.setLayout(new BoxLayout(jResoPanel11, BoxLayout.Y_AXIS));

        totalOrderLbl.setText(" . . . ");
        totalOrderLbl.setFont(new Font("Arial", Font.ITALIC, 9)); 
        jResoPanel11.add(totalOrderLbl);

        jScrollPane2.setViewportView(jResoPanel11);

        jResoPanel3.add(jScrollPane2);

        jResoPanel17.setPreferredSize(new Dimension(20, 20));
        jResoPanel17.setLayout(new BorderLayout());

        confirmBtn.setText("CONFIRM");
        confirmBtn.addActionListener(this);
        jResoPanel17.add(confirmBtn, BorderLayout.CENTER);

        jResoPanel3.add(jResoPanel17);

        jResoPanel2.add(jResoPanel3);

        frame2.add(jResoPanel2, BorderLayout.CENTER);
        frame2.setSize(500,200);
        frame2.setResizable(false);
        frame2.setLocationRelativeTo(null);
        frame2.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        frame2.setVisible(true);
        
    }

    //adds a resource to order
    private void addResourcePanel(int i, Resources r){
        
        resoEachPanel[i] = new JPanel();
        resoLblPanel[i] = new JPanel();
        resoLbl[i] = new JLabel();
        plusBtn[i] = new JButton();
        qtyCountLbl[i] = new JLabel();
        minusBtn[i] = new JButton();
        maxCountLbl[i] = new JLabel();
                
        
        resoEachPanel[i].setLayout(new FlowLayout(FlowLayout.LEFT));

        resoLblPanel[i].setPreferredSize(new Dimension(240, 30));
        resoLblPanel[i].setLayout(new FlowLayout(FlowLayout.LEFT));
        
        resoLbl[i].setFont(new Font("Arial", Font.BOLD, 15)); // NOI18N
        resoLbl[i].setText("₱"+ r.getPrice() + " - " + r.getItemName());
        resoLblPanel[i].add(resoLbl[i]);
        maxCountLbl[i].setFont(new Font("Verdana", Font.ITALIC, 9)); // NOI18N
        maxCountLbl[i].setText("MAX: " + r.getQty());
        resoLblPanel[i].add(maxCountLbl[i]);

        resoEachPanel[i].add(resoLblPanel[i]);

        minusBtn[i].setText("-");
        minusBtn[i].setPreferredSize(new Dimension(20, 20));
        minusBtn[i].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        minusBtn[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(0<Integer.parseInt(qtyCountLbl[i].getText())){
                    qtyCountLbl[i].setText(Integer.parseInt(qtyCountLbl[i].getText())-1+"");
                    updateTotalOrder();
                }
                
            }
        });
        resoEachPanel[i].add(minusBtn[i]);
       
        qtyCountLbl[i].setFont(new Font("Arial", Font.BOLD, 12)); 
        qtyCountLbl[i].setText("0");
        qtyCountLbl[i].setPreferredSize(new Dimension(15, 10));
        qtyCountLbl[i].setAlignmentX(CENTER_ALIGNMENT);
        resoEachPanel[i].add(qtyCountLbl[i]);
        
        plusBtn[i].setText("+");
        plusBtn[i].setPreferredSize(new Dimension(20, 20));
        plusBtn[i].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plusBtn[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(r.getQty()>Integer.parseInt(qtyCountLbl[i].getText())){
                    qtyCountLbl[i].setText(Integer.parseInt(qtyCountLbl[i].getText())+1+"");
                    updateTotalOrder();
                }
                
            }
        });
        resoEachPanel[i].add(plusBtn[i]);
        
        jResoPanel10.add(resoEachPanel[i]);
        
    }
    //refresh resource order pane
    private void refreshResourcePane(){
        if(resoEachPanel[0]!=null){
            for(int i = 0; i < reso.size(); i++){
                deleteResourcePanel(i);
            }
        }
        
        for(int i = 0; i < reso.size(); i++){
            addResourcePanel(i,reso.get(i));
        }
        jResoPanel10.repaint();
        jResoPanel10.revalidate();
    }
    //deletes resurce panel
    private void deleteResourcePanel(int i){
        jResoPanel10.remove(resoEachPanel[i]);
        resoEachPanel[i]=null;
    }
    //updates totalOrderLbl
    private void updateTotalOrder(){
        String disp = "<html>";
        Double totalAmount = 0.0;
        totalOrderLbl.setText(disp);
        for (int i = 0;  i < reso.size(); i++){
            if(Integer.parseInt(qtyCountLbl[i].getText())>0){
                Double amount = Integer.parseInt(qtyCountLbl[i].getText()) * reso.get(i).getPrice();
                disp = qtyCountLbl[i].getText() + " " + reso.get(i).getItemName() + " - ₱ " + amount;
                totalOrderLbl.setText(totalOrderLbl.getText()+"<br/> "+ disp);
                totalAmount += amount;
            }
        }
        totalOrderLbl.setText(totalOrderLbl.getText()+"<br/> ================== <br/> ₱ "+ totalAmount);
        
        
        
    }
    //submit orders
    private void confirmOrder(){
        Resources [] resoOrdered = new Resources[resoMaxVal]  ;
        Double totalAmount = 0.0;
        int resoCount = 0;
        
        
        
        for (int i = 0;  i < reso.size(); i++){
            
            int totalQtyOrdered = Integer.parseInt(qtyCountLbl[i].getText());
            for(int k = 0; k < resoMaxVal ; k++){
                if(transactionsCompleted.getTransaction(transSelectedID).getResoUsed()!= null &&  transactionsCompleted.getTransaction(transSelectedID).getResoUsed()[k]!=null && reso.get(i).getItemID() == transactionsCompleted.getTransaction(transSelectedID).getResoUsed()[k].getItemID()){
                    totalQtyOrdered += transactionsCompleted.getTransaction(transSelectedID).getResoUsed()[k].getQty();
                    break;
                }
            }
            
            
            if(totalQtyOrdered>0){
                Double amount = Integer.parseInt(qtyCountLbl[i].getText()) * reso.get(i).getPrice();
                reso.get(i).setQty(reso.get(i).getQty()- Integer.parseInt(qtyCountLbl[i].getText()));
                totalAmount += amount;
                resoOrdered[resoCount] = resourcesInv.orderItem(reso.get(i).getItemID(), totalQtyOrdered);
                resoCount++;
            }
            
            
        }
        transactionsCompleted.getTransaction(transSelectedID).setResoUsed(resoOrdered);
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
            
            transSelectedID = -1;
            refreshBtns();
            
            custRefresh();
            
        }
        else if (e.getSource()==chkInBtn){
            
            Transaction t = transactionsCompleted.getTransaction(transSelectedID);
            
            if(hotelBooked.getHotel(t.getHotel()).getAvailability()){
                if(!t.isCheckedIn()){
                    t.setCheckedIn(true);
                    t.setDateChkIn(new Date());
                    System.out.println(t.getDateChkIn());
                    hotelBooked.getHotel(t.getHotel()).setAvailability(false);
                    JOptionPane.showMessageDialog(null, "Successfully checked in!" );
                }
            }else{
                JOptionPane.showMessageDialog(null, "Can't checked in! Room is currently not available." );
            }
            
            
            fullCustInfoDisplay(t);
            refreshBtns();
            
        }
        else if (e.getSource()==chkOutBtn){
            
            Transaction t = transactionsCompleted.getTransaction(transSelectedID);
            Double totalRemBal = fullCustInfoDisplay(t);
            
            if(t!=null){
                if(!t.isCheckedOut() && t.isCheckedIn()){
                    try {
                        if(totalRemBal == 0 || (Double.valueOf(JOptionPane.showInputDialog("Input Cash")) >= totalRemBal) ){
                            t.setCheckedOut(true);
                            hotelBooked.getHotel(t.getHotel()).setAvailability(true);
                            t.setDateChkOut(new Date());
                            t.setFullCash(t.getRemBal());
                            t.setRemBal(0);
                            JOptionPane.showMessageDialog(null, "Successfully checked out!" );
                            Receipt receipt = new Receipt(1);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Insufficient funds!" );
                        }
                        
                    } catch (Exception err) {
                        JOptionPane.showMessageDialog(null, "Invalid input!" );
                    }
                    
                }
            }
            
            
            fullCustInfoDisplay(t);
            refreshBtns();
            
        }
        else if (e.getSource()==xtraBtn){
            
            openResourcesOrderGUI();
            
            
        }
        if(e.getSource()==confirmBtn){
            
            confirmOrder();
            fullCustInfoDisplay(transactionsCompleted.getTransaction(transSelectedID));
            frame2.dispose();
            
        }
        
        
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==monthCmb || e.getSource()==yearCmb){
            smartDay();
        }
        
        if(e.getSource()==monthCmb || e.getSource()==yearCmb || e.getSource()==dayCmb ){
            transSelectedID = -1;
            refreshBtns();
            
            custRefresh();
            fullCustInfoDisplay(null);
        }
    }
    
    
}
