package com.mycompany.bbc_hotelresortreserv;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
This class is for Monthly Report JFrame

TODO:
-Create a jframe that could handle multiple data from a month
    - 28 to 31 data, depends on the month
-Data includes the sales, #ofCustomers, ResourcesUsed

-Create a new jframe file for annual report which handles data for each month
-Create a new jframe file for amenities/resources report which displays the current stock or inventory of resources
-Create a new jframe file for receipt which allows user to print/view a TXT or ASCII styled receipt

-BE CREATIVE! BE Mindful on the layouts. Layouts should be responsive
*/

/*yr1 yr2023 = new yr1();
 yr2 yr2024 = new yr2();
 yr3 yr2025 = new yr3();
*/

public class Report{
    
    public Report() {
        JFrame main = new JFrame("Report");
        JPanel panel = new JPanel(new BorderLayout());

        JLabel label = new JLabel("Select a year:");
        label.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label, BorderLayout.NORTH);

        ButtonGroup yrs = new ButtonGroup();
        JButton yr1 = new JButton("2023");
        JButton yr2 = new JButton("2024");
        JButton yr3 = new JButton("2025");

        yrs.add(yr1);
        yrs.add(yr2);
        yrs.add(yr3);

        JPanel buttonPanel = new JPanel(new GridLayout(3,1));
        buttonPanel.add(yr1);
        buttonPanel.add(yr2);
        buttonPanel.add(yr3);
        panel.add(buttonPanel, BorderLayout.CENTER);

        yr1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yr1 yr2023 = new yr1();
                main.dispose();
            }
        });
    
        yr2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yr2 yr2024 = new yr2();
                main.dispose();
            }
        });
    
        yr3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                yr3 yr2025 = new yr3();
                main.dispose();
            }
        });
    
        main.setContentPane(panel);
        main.setSize(600, 400);
        main.setVisible(true);
        main.setResizable(false);
        main.setLocationRelativeTo(null);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
    }
}