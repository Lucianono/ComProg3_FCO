package com.mycompany.bbc_hotelresortreserv;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
    /* jelo note
    - only make JFrame for TESTING
    - make a status bar that contains name, age, position. date (if possible)
    - in the form of 2 by 3 matrix. Logo on the left, Name Age, Position Date
    - added empty labels para masolo ni logo yung col
    - 
    */
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
    setLayout(new GridLayout(1, 5)); //change 2 to 1 to reduce height

    // FIRST COLUMN - Logo only
    //-----------------------------------------------------------------------//        
    logoImg = new ImageIcon("src\\main\\resources\\images\\firstlogo.png");
    Image logo = logoImg.getImage();
    Image scaledLogo = logo.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
    logoLbl = new JLabel(new ImageIcon(scaledLogo));
    logoLbl.setVerticalAlignment(SwingConstants.NORTH);
    logoLbl.setHorizontalAlignment(SwingConstants.CENTER);
    add(logoLbl);
    //-----------------------------------------------------------------------//
    // SECOND COLUMN - name of user
    this.name = name;
    nameLbl = new JLabel("Name: " + this.name);
    nameLbl.setFont(new Font("Arial", Font.PLAIN, 12)); 
    add(nameLbl);
    //-----------------------------------------------------------------------//
    // THIRD COLUMN - position admin/staff
    this.pos = position;
    positionLbl = new JLabel("Position: " + this.pos);
    positionLbl.setFont(new Font("Arial", Font.PLAIN, 12)); 
    add(positionLbl);
    //-----------------------------------------------------------------------//
    // FOURTH COLUMN - display date

    dateLbl = new JLabel();
    dateLbl.setFont(new Font("Arial", Font.PLAIN, 12)); 
    add(dateLbl);
    //-----------------------------------------------------------------------//
    // FIFTH COLUMN - display time

    timeLbl = new JLabel();
    timeLbl.setFont(new Font("Arial", Font.PLAIN, 12)); 
    add(timeLbl);

    Timer timer = new Timer(1000, e -> updateDateTime());
    timer.start();
    //-----------------------------------------------------------------------//

    setBackground(Color.WHITE);
}


    // setters for values
    //-----------------------------------------------------------------------//
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

    // extras for TESTING
    //-----------------------------------------------------------------------//
    public static void main(String[] args) {
        StatusBar statBar = new StatusBar("Hello", "Admin");
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(statBar, BorderLayout.NORTH);
        frame.setSize(600, 400);
        frame.setVisible(true);
        statBar.setName("Ike San");
        statBar.setPos("Admin");
    }
    //-----------------------------------------------------------------------//
}
