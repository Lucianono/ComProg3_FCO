
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
    
    public MainMenuGUI(HotelCRUD hotelBooked, CustomerCRUD customersBooked,TransactionSystem transactionsCompleted, ResourcesCRUD resourcesInv) {
        
        this.hotelBooked=hotelBooked;
        this.customersBooked=customersBooked;
        this.transactionsCompleted=transactionsCompleted;
        this.resourcesInv=resourcesInv;

        
        ImageIcon logoImg = new ImageIcon("src/main/resources/images/mainMenuImg.png");
        Image logo = logoImg.getImage();
        Image scaledLogo = logo.getScaledInstance(logoImg.getIconWidth()/2, logoImg.getIconHeight()/2, Image.SCALE_SMOOTH);
        defaultImgHolder = new JLabel(new ImageIcon(scaledLogo));
        
        statusPnl = new StatusBar("Bryan","admin");
        reservPnl = new ReservationGUI(hotelBooked, customersBooked, transactionsCompleted);
        rtvPnl = new RealTimeViewGUI(hotelBooked, customersBooked, transactionsCompleted, resourcesInv);
        invPnl = new InventoryGUI(resourcesInv);
        hotelPnl = new HotelRoomGUI(hotelBooked);
        
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
        
        viewPnl.removeAll();
        if(e.getSource()==rsrvBtn){
            viewPnl.add(reservPnl);
        }else if(e.getSource()==chkInOutBtn){
            viewPnl.add(rtvPnl);
        }else if(e.getSource()==resoHotelBtn){
            viewPnl.add(invPnl);
        }
        repaint();
        revalidate();
       
    }
    
    
    
}
