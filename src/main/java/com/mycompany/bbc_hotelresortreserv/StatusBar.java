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
    private int age;
    private String pos;
    private final JLabel nameLbl;
    private final JLabel ageLbl;
    private final JLabel positionLbl;
    private final JLabel dateLbl;
    private final ImageIcon logoImg;
    private final JLabel logoLbl;

    public StatusBar(String name, int age, String position) {
        setLayout(new GridLayout(2, 3)); //layout of panel

        // FIRST ROW FIRST COLUMN - Logo only
//-----------------------------------------------------------------------//        
        logoImg = new ImageIcon(getClass().getResource("/images/updIcon.png")); // <--------- I removed it muna :)
        Image logo = logoImg.getImage();
        Image scaledLogo = logo.getScaledInstance(25, 25, Image.SCALE_SMOOTH); // <-------- adjust width and height 
        logoLbl = new JLabel(new ImageIcon(scaledLogo));
        logoLbl.setVerticalAlignment(SwingConstants.CENTER);
        logoLbl.setHorizontalAlignment(SwingConstants.CENTER);
        add(logoLbl);
//-----------------------------------------------------------------------//
        // FIRST ROW SECOND COLUMN - name of user
//-----------------------------------------------------------------------//
        this.name = name;
        nameLbl = new JLabel("Name: " + this.name);
        nameLbl.setFont(new Font("Arial", Font.PLAIN, 12)); 
        add(nameLbl);
//-----------------------------------------------------------------------//
        // FIRST ROW THIRD COLUMN - position admin/staff
        this.pos = position;
        positionLbl = new JLabel("Position: " + this.pos);
        positionLbl.setFont(new Font("Arial", Font.PLAIN, 12)); 
        add(positionLbl);
//-----------------------------------------------------------------------//
        // SECOND ROW FIRST COLUMN - essentially eats the second row first column space
//-----------------------------------------------------------------------//
        JLabel emptyLbl = new JLabel();
        emptyLbl.setPreferredSize(new Dimension(0, 0));
        add(emptyLbl);
//-----------------------------------------------------------------------//
        // SECOND ROW SECOND COLUMN - display age of user
//-----------------------------------------------------------------------//
        this.age = age;
        ageLbl = new JLabel("Age: " + this.age);
        ageLbl.setFont(new Font("Arial", Font.PLAIN, 12)); 
        add(ageLbl);
//-----------------------------------------------------------------------//
        // SECOND ROW THIRD COLUMN - date and time
//-----------------------------------------------------------------------//
        dateLbl = new JLabel();
        dateLbl.setFont(new Font("Arial", Font.PLAIN, 12)); 
        add(dateLbl);

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

    public void setAge(int age) {
        this.age = age;
        ageLbl.setText("Age: " + this.age);
    }

    public void setPos(String position) {
        this.pos = position;
        positionLbl.setText("Position: " + this.pos);
    }

    private void updateDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm"+ "      " + "dd/MM/yyyy");
        String formattedDate = now.format(formatter);
        dateLbl.setText(formattedDate);
    }
//extras for TESTING
//-----------------------------------------------------------------------//
    public static void main(String[] args) {
        StatusBar statBar = new StatusBar("Hello", 32, "Admin");
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(statBar, BorderLayout.NORTH);
        frame.setSize(600, 400);
        frame.setVisible(true);
        statBar.setName("Ike San");
        statBar.setAge(25);
        statBar.setPos("Admin");
    }
//-----------------------------------------------------------------------//
}
