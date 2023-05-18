
package com.mycompany.bbc_hotelresortreserv;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenuGUI extends JFrame implements ActionListener{

    
    JLabel defaultImgHolder; 
    
    JPanel statusPnl ;
    JPanel reservPnl ;
    JPanel rtvPnl ;
    JPanel invPnl ;
    JPanel hotelPnl ;
    JPanel accPnl ;
    
    
    JPanel mainPnl = new JPanel();
    JPanel btnPnl = new JPanel();
    JButton rsrvBtn = new JButton();
    JButton chkInOutBtn = new JButton();
    JButton resoHotelBtn = new JButton();
    JButton reportBtn = new JButton();
    JButton abtHelpBtn = new JButton();
    JButton accBtn = new JButton();
    JPanel viewPnl = new JPanel();

    HotelCRUD hotelBooked;
    CustomerCRUD customersBooked;
    TransactionSystem transactionsCompleted;
    ResourcesCRUD resourcesInv;
    Security security;
    
    public MainMenuGUI(HotelCRUD hotelBooked, CustomerCRUD customersBooked,TransactionSystem transactionsCompleted, ResourcesCRUD resourcesInv,Security security) {
        
        this.hotelBooked=hotelBooked;
        this.customersBooked=customersBooked;
        this.transactionsCompleted=transactionsCompleted;
        this.resourcesInv=resourcesInv;
        this.security=security;

        
        ImageIcon logoImg = new ImageIcon("src/main/resources/images/mainMenuImg.png");
        Image logo = logoImg.getImage();
        Image scaledLogo = logo.getScaledInstance(logoImg.getIconWidth()/2, logoImg.getIconHeight()/2, Image.SCALE_SMOOTH);
        defaultImgHolder = new JLabel(new ImageIcon(scaledLogo));
        
        statusPnl = new StatusBar("Bryan","admin");
        reservPnl = new ReservationGUI(hotelBooked, customersBooked, transactionsCompleted);
        rtvPnl = new RealTimeViewGUI(hotelBooked, customersBooked, transactionsCompleted, resourcesInv);
        invPnl = new InventoryGUI(resourcesInv);
        hotelPnl = new HotelRoomGUI(hotelBooked);
        accPnl = new Account(security.user[security.loggedIndex], security.pass[security.loggedIndex], security);
        
        rsrvBtn.addActionListener(this);
        chkInOutBtn.addActionListener(this);
        resoHotelBtn.addActionListener(this);
        reportBtn.addActionListener(this);
        abtHelpBtn.addActionListener(this);
        accBtn.addActionListener(this);

        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        getContentPane().add(statusPnl, BorderLayout.NORTH);

        
        mainPnl.setLayout(new BoxLayout(mainPnl, BoxLayout.X_AXIS));
        btnPnl.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        
        btnPnl.setPreferredSize(new Dimension(70, 508));
        btnPnl.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 8));

        rsrvBtn.setText("Reserve");
        rsrvBtn.setPreferredSize(new Dimension(60, 60));
        btnPnl.add(rsrvBtn);

        chkInOutBtn.setText("CheckIn/CheckOut");
        chkInOutBtn.setPreferredSize(new Dimension(60, 60));
        btnPnl.add(chkInOutBtn);

        resoHotelBtn.setText("Resources/Hotel");
        resoHotelBtn.setPreferredSize(new Dimension(60, 60));
        btnPnl.add(resoHotelBtn);

        reportBtn.setText("Report");
        reportBtn.setPreferredSize(new Dimension(60, 60));
        btnPnl.add(reportBtn);

        abtHelpBtn.setText("About/ Help");
        abtHelpBtn.setPreferredSize(new Dimension(60, 60));
        btnPnl.add(abtHelpBtn);

        accBtn.setText("Account");
        accBtn.setPreferredSize(new Dimension(60, 60));
        btnPnl.add(accBtn);

        viewPnl.setPreferredSize(new Dimension(530, 60));
        
        mainPnl.add(btnPnl);

        viewPnl.setLayout(new BorderLayout());
        viewPnl.add(defaultImgHolder,BorderLayout.CENTER);
        mainPnl.add(viewPnl);

        getContentPane().add(mainPnl, BorderLayout.CENTER);
        
        setVisible(true);
        setResizable(false);
        setSize(700,500);
        setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==rsrvBtn){
            viewPnl.removeAll();
            viewPnl.add(reservPnl);
        }else if(e.getSource()==chkInOutBtn){
            viewPnl.removeAll();
            viewPnl.add(rtvPnl);
        }else if(e.getSource()==resoHotelBtn){
            viewPnl.removeAll();
            
            JPanel hotelResoBtnPnl = new JPanel();
            JButton resoBtn = new JButton();
            JButton hotelBtn = new JButton();

            hotelResoBtnPnl.setLayout(new FlowLayout(FlowLayout.CENTER, 80, 150));

            resoBtn.setFont(new Font("Arial", 1, 14)); // NOI18N
            resoBtn.setText("Resources");
            resoBtn.setPreferredSize(new Dimension(200, 100));
            resoBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    viewPnl.removeAll();
                    viewPnl.add(invPnl);
                    revalidate();
                    repaint();
                }
            });
            hotelResoBtnPnl.add(resoBtn);

            hotelBtn.setFont(new Font("Arial", 1, 14)); // NOI18N
            hotelBtn.setText("Hotel");
            hotelBtn.setPreferredSize(new Dimension(200, 100));
            hotelBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    viewPnl.removeAll();
                    viewPnl.add(hotelPnl);
                    revalidate();
                    repaint();
                }
            });
            hotelResoBtnPnl.add(hotelBtn);
           
            

            viewPnl.add(hotelResoBtnPnl);

        }else if(e.getSource()==accBtn){
            viewPnl.removeAll();
            viewPnl.add(accPnl);
        }
       
        revalidate();
        repaint();
        setVisible(true);
       
    }
    
    
    
}
