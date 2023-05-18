
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
    JPanel reportPnl;
    JPanel abtPnl;
    
    
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
        
        super("Black Bean Company Hotel and Resort Reservation System");
        
        this.hotelBooked=hotelBooked;
        this.customersBooked=customersBooked;
        this.transactionsCompleted=transactionsCompleted;
        this.resourcesInv=resourcesInv;
        this.security=security;

        ImageIcon logoImg = new ImageIcon("src/main/resources/images/mainMenuImg.png");
        Image logo = logoImg.getImage();
        int imgw = (int) ((int)logoImg.getIconWidth()/1.5);
        int imgh = (int) ((int)logoImg.getIconHeight()/1.5);
        Image scaledLogo = logo.getScaledInstance(imgw, imgh, Image.SCALE_SMOOTH);
        defaultImgHolder = new JLabel(new ImageIcon(scaledLogo));
        
        statusPnl = new StatusBar(security);
        reservPnl = new ReservationGUI(hotelBooked, customersBooked, transactionsCompleted);
        rtvPnl = new RealTimeViewGUI(hotelBooked, customersBooked, transactionsCompleted, resourcesInv);
        invPnl = new InventoryGUI(resourcesInv);
        hotelPnl = new HotelRoomGUI(hotelBooked);
        accPnl = new Account(security.user[security.loggedIndex], security.pass[security.loggedIndex], security);
        reportPnl = new Report(transactionsCompleted);
        abtPnl = new HelpAbout();
        
        rsrvBtn.addActionListener(this);
        chkInOutBtn.addActionListener(this);
        resoHotelBtn.addActionListener(this);
        reportBtn.addActionListener(this);
        abtHelpBtn.addActionListener(this);
        accBtn.addActionListener(this);

        if(security.pos[security.loggedIndex].equalsIgnoreCase("admin"))
            reportBtn.setEnabled(true);
        else
            reportBtn.setEnabled(false);
        
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        getContentPane().add(statusPnl, BorderLayout.NORTH);

        
        mainPnl.setLayout(new BoxLayout(mainPnl, BoxLayout.X_AXIS));
        mainPnl.setBackground(BbcUI.lightbrown);

        
        btnPnl.setPreferredSize(new Dimension(70, 508));
        btnPnl.setBackground(BbcUI.brown);
        btnPnl.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 8));

        JLabel rsrvLbl = new JLabel("Reserve");
        rsrvLbl.setFont(new Font("Verdana", Font.BOLD,8));
        rsrvLbl.setForeground(Color.WHITE);
        rsrvLbl.setHorizontalAlignment(SwingConstants.CENTER);
        rsrvBtn.setLayout(new FlowLayout(FlowLayout.CENTER));
        rsrvBtn.add(new JLabel(new ImageIcon("src/main/resources/images/bed.png")));
        rsrvBtn.add(rsrvLbl);
        rsrvBtn.setPreferredSize(new Dimension(60, 60));
        btnPnl.add(rsrvBtn);

        JLabel chkLbl = new JLabel("CheckIn/Out");
        chkLbl.setFont(new Font("Verdana", Font.BOLD,7));
        chkLbl.setForeground(Color.WHITE);
        chkLbl.setHorizontalAlignment(SwingConstants.CENTER);
        chkInOutBtn.setLayout(new FlowLayout(FlowLayout.CENTER));
        chkInOutBtn.add(new JLabel(new ImageIcon("src/main/resources/images/door.png")));
        chkInOutBtn.add(chkLbl);
        chkInOutBtn.setPreferredSize(new Dimension(60, 60));
        btnPnl.add(chkInOutBtn);

        JLabel rhLbl = new JLabel("Manage");
        rhLbl.setFont(new Font("Verdana", Font.BOLD,8));
        rhLbl.setForeground(Color.WHITE);
        rhLbl.setHorizontalAlignment(SwingConstants.CENTER);
        resoHotelBtn.setLayout(new FlowLayout(FlowLayout.CENTER));
        resoHotelBtn.add(new JLabel(new ImageIcon("src/main/resources/images/box.png")));
        resoHotelBtn.add(rhLbl);
        resoHotelBtn.setPreferredSize(new Dimension(60, 60));
        btnPnl.add(resoHotelBtn);

        JLabel repLbl = new JLabel("Report");
        repLbl.setFont(new Font("Verdana", Font.BOLD,8));
        repLbl.setForeground(Color.WHITE);
        repLbl.setHorizontalAlignment(SwingConstants.CENTER);
        reportBtn.setLayout(new FlowLayout(FlowLayout.CENTER));
        reportBtn.add(new JLabel(new ImageIcon("src/main/resources/images/bill.png")));
        reportBtn.add(repLbl);
        reportBtn.setPreferredSize(new Dimension(60, 60));
        btnPnl.add(reportBtn);

        JLabel abtLbl = new JLabel("About");
        abtLbl.setFont(new Font("Verdana", Font.BOLD,8));
        abtLbl.setForeground(Color.WHITE);
        abtLbl.setHorizontalAlignment(SwingConstants.CENTER);
        abtHelpBtn.setLayout(new FlowLayout(FlowLayout.CENTER));
        abtHelpBtn.add(new JLabel(new ImageIcon("src/main/resources/images/help.png")));
        abtHelpBtn.add(abtLbl);
        abtHelpBtn.setPreferredSize(new Dimension(60, 60));
        btnPnl.add(abtHelpBtn);

        JLabel accLbl = new JLabel("Account");
        accLbl.setFont(new Font("Verdana", Font.BOLD,8));
        accLbl.setForeground(Color.WHITE);
        accLbl.setHorizontalAlignment(SwingConstants.CENTER);
        accBtn.setLayout(new FlowLayout(FlowLayout.CENTER));
        accBtn.add(new JLabel(new ImageIcon("src/main/resources/images/user.png")));
        accBtn.add(accLbl);
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
            reservPnl = new ReservationGUI(hotelBooked, customersBooked, transactionsCompleted); 
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
            resoBtn.setText("Inventory");
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
        }else if(e.getSource()==reportBtn){
            viewPnl.removeAll();
            viewPnl.add(reportPnl);
        }else if(e.getSource()==abtHelpBtn){
            viewPnl.removeAll();
            viewPnl.add(abtPnl);
        }
        
       
        revalidate();
        repaint();
        setVisible(true);
       
    }
    
    
    
}
