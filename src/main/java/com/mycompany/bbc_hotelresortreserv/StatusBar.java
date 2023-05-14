package com.mycompany.bbc_hotelresortreserv;

import java.awt.BorderLayout;
import java.awt.Color;
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


    public StatusBar(String name, String position) {
    setLayout(new GridLayout(1, 5)); 

      
    logoImg = new ImageIcon("src\\main\\resources\\images\\firstlogo.png");
    Image logo = logoImg.getImage();
    Image scaledLogo = logo.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    logoLbl = new JLabel(new ImageIcon(scaledLogo));
    logoLbl.setVerticalAlignment(SwingConstants.NORTH);
    logoLbl.setHorizontalAlignment(SwingConstants.CENTER);
    add(logoLbl);

    this.name = name;
    nameLbl = new JLabel("Name: " + this.name);
    nameLbl.setFont(new Font("Arial", Font.PLAIN, 12)); 
    add(nameLbl);
  
    this.pos = position;
    positionLbl = new JLabel("Position: " + this.pos);
    positionLbl.setFont(new Font("Arial", Font.PLAIN, 12)); 
    add(positionLbl);
 

    dateLbl = new JLabel();
    dateLbl.setFont(new Font("Arial", Font.PLAIN, 12)); 
    add(dateLbl);
 
    timeLbl = new JLabel();
    timeLbl.setFont(new Font("Arial", Font.PLAIN, 12)); 
    add(timeLbl);

    Timer timer = new Timer(1000, e -> updateDateTime());
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
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedDate = now.format(dateFormatter);
        String formattedTime = now.format(timeFormatter);
        dateLbl.setText("Date: " + formattedDate);
        timeLbl.setText("Time: " + formattedTime);
    }

    
}
