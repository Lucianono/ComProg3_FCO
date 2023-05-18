
package com.mycompany.bbc_hotelresortreserv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;



public class ReservationGUI extends JPanel implements ActionListener,ItemListener,DocumentListener{

    JPanel jPanel1 = new JPanel();
    JButton btnPlus = new JButton();
    JButton btnMinus = new JButton();
    JPanel jPanel2 = new JPanel();
    JLabel hotelLbl = new JLabel();
    JLabel hotelTypeLbl = new JLabel();
    JComboBox hotelCmb = new JComboBox();
    JPanel jPanel3 = new JPanel();
    JTextField cashTxt = new JTextField();
    JPanel jPanel4 = new JPanel();
    JButton btnRsrv50 = new JButton();
    JButton btnRsrv100 = new JButton();
    JPanel jPanelplus = new JPanel();
    JPanel jPanelminus = new JPanel();
    JPanel jPanelPriceBreakdown = new JPanel();
    JScrollPane jScrollPriceBreakdown = new JScrollPane(jPanelPriceBreakdown,
            JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
            JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    
    
    int custCount = 0;
    int custLimit = 1;
    int custMinimum = 1;
    int realCustLimit = 7;
    JTextField[] customer_txt_arr = new JTextField[realCustLimit * 2];
    int custWidth = 110, custHeight = 25;
    JLabel custLabel = new JLabel("      -Name-         -Age-       ");
    double vatAmount = .12;
    
    String [] y = {"2023","2024","2025"};
    JComboBox year = new JComboBox(y);
    String [] m = {"January","February","March","April","May","June","July","August","September","October","November","December"};
    JComboBox month = new JComboBox(m);
    JComboBox day = new JComboBox();
    JLabel avlblLbl = new JLabel("    . . .    ");
    JLabel capLabel = new JLabel("       .    .    .       ");
    JLabel [] expectCashlLbl = new JLabel[20];
    
    
    JPanel panelRight = new JPanel();
    JPanel panelBottom = new JPanel();
    JPanel panelMain = new JPanel();
    JPanel panelSuper = new JPanel();
    
    private final HotelCRUD hotelBooked;
    private final CustomerCRUD customersBooked;
    private final TransactionSystem transactionsCompleted;

    
    ReservationGUI(HotelCRUD hotelBooked, CustomerCRUD customersBooked, TransactionSystem transactionsCompleted) {
        this.hotelBooked=hotelBooked;
        this.customersBooked=customersBooked;
        this.transactionsCompleted=transactionsCompleted;
        
        hotelCmb.setModel(new DefaultComboBoxModel<>(hotelBooked.getAllHotelID()));


        btnPlus.setText("+");
        btnPlus.addActionListener(this);
        btnPlus.setPreferredSize(new Dimension(50,custHeight));
        jPanelplus.add(btnPlus);
        jPanel1.add(jPanelplus);

        btnMinus.setText("-");
        btnMinus.addActionListener(this);
        btnMinus.setPreferredSize(new Dimension(50,custHeight));
        jPanelminus.add(btnMinus);
        jPanel1.add(jPanelminus);
                
        custLabel.setFont(new Font("Verdana",Font.PLAIN,12)  );
        jPanel1.add(custLabel);
        
        addCustTxt();
        
        
        jPanel1.setPreferredSize(new Dimension(250,300));
        jPanel1.setBorder(BorderFactory.createTitledBorder("Customer Information"));


        hotelLbl.setText("<html><u>"+" Hotel");
        hotelLbl.setFont(new Font("Arial",Font.BOLD,15)  );
        jPanel2.add(hotelLbl);
        
        hotelCmb.setFont(new Font("Arial",Font.PLAIN,15)  );
        hotelCmb.setPreferredSize(new Dimension(70,30));
        hotelCmb.addItemListener(this);
        jPanel2.add(hotelCmb);
        
        jPanel2.add(hotelTypeLbl);
        hotelTypeLbl.setFont(new Font("Arial",Font.BOLD,12)  );
        hotelTypeDisplay();
        
        year.setFont(new Font("Arial",Font.PLAIN,12)  );
        year.setPreferredSize(new Dimension(70,24));
        year.addItemListener(this);
        jPanel2.add(year);
        month.setFont(new Font("Arial",Font.PLAIN,12)  );
        month.setPreferredSize(new Dimension(80,24));
        month.setSelectedItem(m[0]);
        month.addItemListener(this);
        
        jPanel2.add(month);
        day.setFont(new Font("Arial",Font.PLAIN,12)  );
        day.setPreferredSize(new Dimension(40,24));
        smartDay();
        day.addItemListener(this);
        avlblLbl.setFont(new Font("Arial",Font.BOLD,15)  );
        capLabel.setFont(new Font("Arial",Font.PLAIN,12)  );
        hotelAvlblDisplay();
        goodForDisplay();
        expectedCashDisplay();
        
        Date nowDate = new Date(); 
        int yearV = nowDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear(); 
        int monthV = nowDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getMonthValue(); 
        int dayV = nowDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getDayOfMonth(); 
 
        year.setSelectedIndex(yearV-2023); 
        month.setSelectedIndex(monthV-1); 
        day.setSelectedIndex(dayV-1); 
        
        jPanel2.add(day);
        jPanel2.add(avlblLbl);
        jPanel2.add(capLabel);
        
        jPanel2.setBorder(BorderFactory.createTitledBorder("Hotel Booking"));



        cashTxt.setText("0");
        cashTxt.setFont(new Font("Arial",Font.BOLD,15)  );
        cashTxt.setPreferredSize(new Dimension(150,30));
        jPanel3.setBorder(BorderFactory.createTitledBorder("Cash"));
        cashTxt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }
        });
        jPanel3.add(cashTxt);
        jPanelPriceBreakdown.setLayout(new BoxLayout(jPanelPriceBreakdown,BoxLayout.Y_AXIS));
        jScrollPriceBreakdown.setPreferredSize(new Dimension(200,90));
        jPanel3.setPreferredSize(new Dimension(150,80));
        jPanel3.add(jScrollPriceBreakdown);
        


        btnRsrv50.setText("RESERVE (50%)");
        btnRsrv50.setPreferredSize(new Dimension(150,30));
        btnRsrv50.addActionListener(this);
        btnRsrv100.setText("RESERVE (100%)");
        btnRsrv100.setPreferredSize(new Dimension(150,30));
        btnRsrv100.addActionListener(this);
        
        panelRight.add(jPanel2);
        panelRight.add(jPanel3);
        panelRight.setLayout(new BoxLayout(panelRight,BoxLayout.Y_AXIS));
        panelRight.setPreferredSize(new Dimension(250,300));
        
        panelMain.add(jPanel1);
        panelMain.add(panelRight);
        
        jPanel4.add(btnRsrv100);
        jPanel4.add(btnRsrv50);
        panelBottom.add(jPanel4);
        
        panelSuper.add(panelMain);
        panelSuper.add(panelBottom);
        panelSuper.setLayout(new BoxLayout(panelSuper,BoxLayout.Y_AXIS));
        
        add(panelSuper,BorderLayout.CENTER);

        
        
    }

    //clear all input/ resets
    private void clearAll(){
        int custCountPast = custCount;
        for(int i = 0; i<custCountPast ; i++){
            
                jPanel1.remove(customer_txt_arr[custCount*2 -1]);
                jPanel1.remove(customer_txt_arr[custCount*2 -2]);
                
                custCount--;
                
            }
        
        cashTxt.setText("0");
        addCustTxt();

        hotelAvlblDisplay();
        resetCashDisplay();
        
        jPanel1.repaint();
        jPanel1.revalidate();

    }
    //day of combobox depnds on month
    private void smartDay(){
        
                int maxDays = 0;
                //smart day combobox
                switch(month.getSelectedIndex()){
                    case 0, 2, 4, 6, 7, 9, 11 -> maxDays = 31;
                    case 3, 5, 8, 10 -> maxDays = 30;
                    case 1 -> {
                        if(Integer.parseInt(year.getSelectedItem()+"")%4 == 0)
                            maxDays = 29;
                        else
                            maxDays = 28;
            }
                }
                
                String[] days = new String[maxDays];
                for (int i =0; i<maxDays ; i++){
                    days[i]= i+1 +"";
                }
                day.setModel(new DefaultComboBoxModel<>(days));
    }
    //available label display
    private void hotelAvlblDisplay(){
        //display if hotel is available that day
        String s =  year.getSelectedItem() + "/" + (month.getSelectedIndex()+1) + "/" + day.getSelectedItem();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");  
        Date dateBooked=null;
        try {
            dateBooked = formatter.parse(s);
        } catch (ParseException ex) {
            Logger.getLogger(ReservationGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<Transaction> transToDate = transactionsCompleted.getTransactionsByDate(dateBooked);
        avlblLbl.setText("     Available     ");
        btnRsrv50.setEnabled(true);
        for(int i=0; i<transToDate.size(); i++){
            if(transToDate.get(i).getHotel().equals(hotelCmb.getSelectedItem()+"")){
                avlblLbl.setText("     Not Available!      ");
                btnRsrv50.setEnabled(false);
                btnRsrv100.setEnabled(false);
                break;
            }
            else{
                avlblLbl.setText("     Available     ");
                btnRsrv50.setEnabled(true);
                btnRsrv100.setEnabled(true);                        
            }
        }
    }
    //cash label display return total amount
    private double expectedCashDisplay(){
        
        resetCashDisplay();
        double hotelAmount = hotelBooked.getHotel(hotelCmb.getSelectedItem()+"").getRegRate();
        double hotelAmountPromo = hotelBooked.getHotel(hotelCmb.getSelectedItem()+"").getPromoRate();
        double totalAmount = 0;
        double discountAmount = 0;
        
        int labelCount = 0;

        for(int i = 0; i<custCount ; i++){
            if(!(customer_txt_arr[i*2].getText().equals("")) && !(customer_txt_arr[i*2+1].getText().equals(""))){
                expectCashlLbl[labelCount] = new JLabel("Regular Rate : " + hotelAmount);
                expectCashlLbl[labelCount].setFont(new Font("Arial",Font.ITALIC,12)  );
                jPanelPriceBreakdown.add(expectCashlLbl[labelCount]);
                labelCount++;
                totalAmount += Math.round(hotelAmount*(1+vatAmount)*100)/100.00;
                expectCashlLbl[labelCount] = new JLabel("VAT : " + hotelAmount*(vatAmount));
                expectCashlLbl[labelCount].setFont(new Font("Arial",Font.ITALIC,12)  );
                jPanelPriceBreakdown.add(expectCashlLbl[labelCount]);
                labelCount++;
                
                
                
                if(Integer.parseInt(customer_txt_arr[i*2+1].getText())>=60){
                    double discount = hotelBooked.getHotel(hotelCmb.getSelectedItem()+"").getRegRate() * .2;
                    expectCashlLbl[labelCount] = new JLabel("*Discount for Senior : " + discount);
                    expectCashlLbl[labelCount].setFont(new Font("Arial",Font.ITALIC,12)  );
                    jPanelPriceBreakdown.add(expectCashlLbl[labelCount]);
                    labelCount++;
                    discountAmount += discount;
                }
                


            }
            
        }
        
        if(hotelBooked.getHotel(hotelCmb.getSelectedItem()+"").getRoomCap() > 1){
                    if(totalAmount < hotelAmount*custMinimum*(1+vatAmount)){
                        totalAmount = Math.round(hotelAmount*custMinimum*(1+vatAmount)*100)/100.0;
                        expectCashlLbl[labelCount] = new JLabel("*Minimum Amount : "+ totalAmount+"     ");
                        expectCashlLbl[labelCount].setFont(new Font("Arial",Font.ITALIC,12)  );
                        jPanelPriceBreakdown.add(expectCashlLbl[labelCount]);
                        labelCount++;
                    }
                }
        
        totalAmount -= discountAmount;
        expectCashlLbl[labelCount] = new JLabel("<html>============== <br/> Total Amount : "+ totalAmount+"     ");
        expectCashlLbl[labelCount].setFont(new Font("Arial",Font.ITALIC,12)  );
        jPanelPriceBreakdown.add(expectCashlLbl[labelCount]);
        labelCount++;
        
        expectCashlLbl[labelCount] = new JLabel("*50% Down Payment : "+ totalAmount/2+"     ");
        expectCashlLbl[labelCount].setFont(new Font("Arial",Font.ITALIC,10)  );
        jPanelPriceBreakdown.add(expectCashlLbl[labelCount]);
        labelCount++;
        
        String dp100;
        if(totalAmount!= 0)
            if(hotelBooked.getHotel(hotelCmb.getSelectedItem()+"").getRoomCap() > 1)
                dp100 = totalAmount  + "";
            else
                dp100 = (Math.round(hotelAmountPromo*(1+vatAmount)*100)/100.0)  + "";
        else
            dp100 = "0.0";
        expectCashlLbl[labelCount] = new JLabel("<html>*100% Down Payment :"+ dp100 +"<br/>-->(Promo applied)");
        expectCashlLbl[labelCount].setFont(new Font("Arial",Font.ITALIC,10)  );
        jPanelPriceBreakdown.add(expectCashlLbl[labelCount]);
        labelCount++;
        
        jPanelPriceBreakdown.repaint();
        jPanelPriceBreakdown.revalidate();
        
        
        return totalAmount;
    }
    //resets cash label
    private void resetCashDisplay(){
        for (int i = 0; i<expectCashlLbl.length; i++){
            if(expectCashlLbl[i]!=null){
                jPanelPriceBreakdown.remove(expectCashlLbl[i]);
                expectCashlLbl[i]=null;
            }
        }
    }
    //display room needed cusotmer
    private void goodForDisplay(){
        int cap = hotelBooked.getHotel(hotelCmb.getSelectedItem()+"").getRoomCap();
        if(cap == 1){
            capLabel.setText("     Only 1 customer needed.    ");
        }else{
            capLabel.setText("     Good for "+cap+" people!    \n * minimum of " +cap+ ". *");
        }
    }
    //customer textfields referesh
    private void customerCountRefresh(){
        
        int indicator = custMinimum - custCount ;
        
            System.out.println(custMinimum);
        
        if(indicator<0){
            for(int i = 0; i<Math.abs(indicator); i++){
                removeCustTxt();
            }
        }else{
            for(int i = 0; i<indicator; i++){
                addCustTxt();
            }
        }
    }
    //hotel type indicatior
    private void hotelTypeDisplay(){
        
        System.out.println(hotelCmb.getSelectedItem()+"");
        hotelTypeLbl.setText(hotelBooked.getHotel(hotelCmb.getSelectedItem()+"").getHotelType());
        
    }
    //add cusotmer text field
    private void addCustTxt(){
        if(custCount < custLimit){
                customer_txt_arr[custCount*2] = new JTextField();
                customer_txt_arr[custCount*2 +1] = new JTextField();

                jPanel1.add(customer_txt_arr[custCount*2]);
                jPanel1.add(customer_txt_arr[custCount*2 +1]);
                
                customer_txt_arr[custCount*2].setPreferredSize(new Dimension(custWidth,custHeight));
                customer_txt_arr[custCount*2 +1].setPreferredSize(new Dimension(custWidth,custHeight));
                
                customer_txt_arr[custCount*2].getDocument().addDocumentListener(this);
                customer_txt_arr[custCount*2 +1].getDocument().addDocumentListener(this);
                
                customer_txt_arr[custCount*2 +1].addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(KeyEvent e) {
                        char c = e.getKeyChar();
                        if (!Character.isDigit(c)) {
                            e.consume();
                        }
                    }
                });
                
                custCount++;

             
            }
    }
    //remove cusotmer text field
    private void removeCustTxt(){
        if(custCount > 1){

                jPanel1.remove(customer_txt_arr[custCount*2 -1]);
                jPanel1.remove(customer_txt_arr[custCount*2 -2]);
                
                custCount--;
                
                jPanel1.repaint();
                jPanel1.revalidate();

            }
    } 
    //process transaction
    private void processTransaction(int type){
        Customer[] custArr = new Customer[custCount];
        int realCustCount = 0;
        String hotelSelected = hotelCmb.getSelectedItem()+"" ;
        double cashInput = Double.parseDouble(cashTxt.getText());

        for(int i = 0; i<custCount ; i++){
            if(!(customer_txt_arr[i*2].getText().equals("")) && !(customer_txt_arr[i*2+1].getText().equals(""))){

                custArr[realCustCount] = customersBooked.createCustomer(customer_txt_arr[i*2].getText(), Integer.parseInt(customer_txt_arr[i*2 +1].getText()));
                System.out.println(custArr[realCustCount].getName() + " "+ custArr[realCustCount].getAge());
                realCustCount++;


            }
        }

        double custCash = 0;
        double realAmount = 0;
        
        if (type == 0){
            realAmount = expectedCashDisplay();
            custCash = realAmount / 2 ;
        }
        else if (type == 1){
            custCash = expectedCashDisplay() - (hotelBooked.getHotel(hotelSelected).getRegRate()- hotelBooked.getHotel(hotelSelected).getPromoRate())*1.12;
            realAmount = custCash;
            System.out.println(custCash);
        }
        
        if( (custCash <= cashInput) && realCustCount > 0){

                String s =  year.getSelectedItem() + "/" + (month.getSelectedIndex()+1) + "/" + day.getSelectedItem();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");  
                Date dateBooked = null;
                try {
                    dateBooked = formatter.parse(s);
                } catch (ParseException ex) {
                    Logger.getLogger(ReservationGUI.class.getName()).log(Level.SEVERE, null, ex);
                }

                transactionsCompleted.createReservation(custArr, hotelSelected, cashInput,dateBooked,0,realAmount-custCash,null);
                System.out.println("Transaction was successful");

                JOptionPane.showMessageDialog(null, "Reservation completed!");

                clearAll();
                
            }
    }
    //check if paste date
    private void checkPastDate(){
        
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
        Date nowDate = new Date();
        
        int yearV = nowDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear();
        int monthV = nowDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getMonthValue();
        int dayV = nowDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getDayOfMonth();
        
        String s1 =  yearV+ "/" + monthV + "/" + dayV;
        String s2 =  year.getSelectedItem() + "/" + (month.getSelectedIndex()+1) + "/" + day.getSelectedItem();
        Date selectedDated = new Date();
        try {
            selectedDated = formatter.parse(s2);
            nowDate = formatter.parse(s1);
        } catch (ParseException ex) {
            Logger.getLogger(ReservationGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(selectedDated.before(nowDate)){
            btnRsrv50.setEnabled(false);
            btnRsrv100.setEnabled(false);
            avlblLbl.setText("Date expired");
        }else{
            btnRsrv50.setEnabled(true);
            btnRsrv100.setEnabled(true);
        }
            
    }//
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==btnPlus){
            
            addCustTxt();

        }
        
        else if(e.getSource()==btnMinus){
            
            removeCustTxt();

        }
        else if(e.getSource()==btnRsrv50){
            
            processTransaction(0);
            Receipt receipt = new Receipt(0);
            
        }
        else if(e.getSource()==btnRsrv100){
            
            processTransaction(1);
            Receipt receipt = new Receipt(0);
            
        }

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        
        if(e.getSource() == month || e.getSource() == year ){

            smartDay();
                
        }
        
        if(e.getSource() == month || e.getSource() == year || e.getSource() == day || e.getSource() == hotelCmb){
            expectedCashDisplay();
            goodForDisplay();
            hotelAvlblDisplay();
            checkPastDate(); 
        }
        
        if(e.getSource() == hotelCmb){
            
            hotelTypeDisplay();
            
            if(hotelBooked.getHotel(hotelCmb.getSelectedItem()+"").getRoomCap() > 1){
                custLimit = realCustLimit;
                custMinimum=hotelBooked.getHotel(hotelCmb.getSelectedItem()+"").getRoomCap();
            }else{
                custLimit = 1;
                custMinimum = 1;
            }
            
            
            customerCountRefresh();
        }
    }
    
    @Override
    public void insertUpdate(DocumentEvent e) {
        expectedCashDisplay();
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        expectedCashDisplay();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        expectedCashDisplay();
    }
    
    private JButton printbtn = new JButton("Print Receipt");
    private JButton cancelbtn = new JButton("Cancel Transaction");
    private JTextArea main;
    
    public void Receipt() {
        JFrame mfrm = new JFrame("Draft");
        
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.add(printbtn);
        buttonPanel.add(cancelbtn);
        
        StringBuilder receiptText = new StringBuilder();
        receiptText.append("=============================================\n");
        receiptText.append("                    RECEIPT\n");
        receiptText.append("=============================================\n\n");
        receiptText.append("Hotel/Resort Name: BBC Hotel Resort\n");
        receiptText.append("Date: ").append(LocalDate.now()).append("\n");
        receiptText.append("Reservation Code: [Reservation Code]\n");
        receiptText.append("Customer Age: [Customer Name]\n");
        receiptText.append("Customer Email: [Customer Email]\n");
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
        
        mfrm.setSize(600, 400); 
        mfrm.setLocationRelativeTo(null);
        mfrm.setResizable(false);
        mfrm.setVisible(true);
        mfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        mfrm.getContentPane().add(buttonPanel, "North");
        
        printbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JScrollPane scrollPane = new JScrollPane(main);
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                mfrm.getContentPane().add(scrollPane);
                mfrm.pack();
                mfrm.setSize(355,400);
                mfrm.setLocationRelativeTo(null);
                mfrm.setResizable(false);
            }
        }); 
      }
    
}
