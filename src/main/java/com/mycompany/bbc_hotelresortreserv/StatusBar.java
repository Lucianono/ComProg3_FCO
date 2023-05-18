package com.mycompany.bbc_hotelresortreserv;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class StatusBar extends JPanel {
      
    private String name;
    private String pos;
    private final JLabel nameLbl;
    private final JLabel positionLbl;
    private final JLabel dateLbl;
    private final JLabel timeLbl;
    private final ImageIcon logoImg;
    private final JLabel logoLbl;
    
    private final JPanel leftPnl;
    private final JPanel rightPnl;


    public StatusBar(String name, String position) {  
        
    setLayout(new GridLayout(1, 2)); 
    
    
    leftPnl = new JPanel();
    rightPnl = new JPanel();
    rightPnl.setLayout(new GridLayout(2, 2));
    leftPnl.setLayout(new BorderLayout( ));
    
      
    logoImg = new ImageIcon("src/main/resources/images/logo_orig_side.png");
    Image logo = logoImg.getImage();
    Image scaledLogo = logo.getScaledInstance(logoImg.getIconWidth()/10, logoImg.getIconHeight()/10, Image.SCALE_SMOOTH);
    logoLbl = new JLabel(new ImageIcon(scaledLogo));
    logoLbl.setHorizontalAlignment(SwingConstants.LEFT);
    leftPnl.add(logoLbl,BorderLayout.CENTER);

    this.name = name;
    nameLbl = new JLabel("<html>Username : <b>" + this.name);
    nameLbl.setFont(new Font("Arial", Font.PLAIN, 12)); 
    rightPnl.add(nameLbl);
  
    this.pos = position;
    positionLbl = new JLabel("<html>Position: <b>" + this.pos);
    positionLbl.setFont(new Font("Arial", Font.PLAIN, 12)); 
    rightPnl.add(positionLbl);
 

    dateLbl = new JLabel();
    dateLbl.setFont(new Font("Arial", Font.PLAIN, 12)); 
    rightPnl.add(dateLbl);
 
    timeLbl = new JLabel();
    timeLbl.setFont(new Font("Arial", Font.PLAIN, 12)); 
    rightPnl.add(timeLbl);

    setPreferredSize(new Dimension(getWidth(),40));
    add(leftPnl);
    add(rightPnl);
    
    
    updateDateTime();
    Timer timer = new Timer(1000 * 30, e -> updateDateTime());
    timer.start();

    setBackground(Color.WHITE);
    
}
    @Override
    public void setName(String name) {
        this.name = name;
        nameLbl.setText("Name: " + this.name);
    }

    public void setPos(String position) {
        this.pos = position;
        positionLbl.setText("Position: " + this.pos);
    }

    private void updateDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedDate = now.format(dateFormatter);
        String formattedTime = now.format(timeFormatter);
        dateLbl.setText("" + formattedDate);
        timeLbl.setText("" + formattedTime);
        repaint();
        revalidate();
    }

    
}
