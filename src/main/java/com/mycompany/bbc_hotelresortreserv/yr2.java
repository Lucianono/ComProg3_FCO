package com.mycompany.bbc_hotelresortreserv;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.*;

public class yr2 extends JFrame {
    
    private JButton rsrcsbtn = new JButton("Resources Used");
    private JButton backbtn = new JButton("Back to Report");
    private JButton backbtn2 = new JButton("Previous Year");
    private JButton nxtbtn = new JButton("Next Year");
    private final String[] months = {"January", "February", "March", "April", 
        "May", "June", "July", "August", "September", "October", "November", "December"};
    private final String[] columnNames = {"Day of Month" , "Sales", "No of Customers"};
    
    public yr2() {
        JFrame mfrm = new JFrame("2024");
        JPanel mpnl = new JPanel();
        
        for (int monthIndex = 0; monthIndex < months.length; monthIndex++) {
            String[][] rowData = new String[getMaxDays(monthIndex)][3];
            for (int dayIndex = 0; dayIndex < rowData.length; dayIndex++) {
                rowData[dayIndex][0] = Integer.toString(dayIndex + 1);
            }
            JTable table = new JTable(rowData, columnNames);
            JScrollPane scrollPane = new JScrollPane(table);
            JLabel label = new JLabel(months[monthIndex]);
            mpnl.add(label);
            mpnl.add(scrollPane);
        }
        
        mpnl.setLayout(new BoxLayout(mpnl, BoxLayout.PAGE_AXIS));
        
        JScrollPane scrollPane = new JScrollPane(mpnl);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        mfrm.pack();
        mfrm.add(scrollPane);
        mfrm.setSize(600, 400);
        mfrm.setVisible(true);
        mfrm.setResizable(false);
        mfrm.setLocationRelativeTo(null);
        
        rsrcsbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                mfrm.dispose();
                SecondFrame sfrm = new SecondFrame();
            }
        });
   
        backbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                mfrm.dispose();
                Report rm = new Report();
            }
        });
        
        backbtn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                mfrm.dispose();
                yr1 yr2023 = new yr1();
            }
        });
        
        nxtbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                mfrm.dispose();
                yr3 yr2025 = new yr3();
            }
        });
        
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.add(backbtn2);
        buttonPanel.add(backbtn);
        buttonPanel.add(rsrcsbtn);
        buttonPanel.add(nxtbtn);
        
        mfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        mfrm.getContentPane().add(buttonPanel, "South");
    }
  
    public class SecondFrame extends JFrame {
    
    private final String[] columnNames2 = {"Day", "Extra Bed", "Pillow", 
        "Towel", "Reading Light", "Books/Magazine", "Toiletries", 
        "Luggage Rack", "Breakfast", "Lunch", "Dinner", "Drink", "Snack"};
        
   private JButton backbtn = new JButton("Back to Year Report");
    
    public SecondFrame() {
        JFrame sfrm = new JFrame("2024");
        JPanel mpnl2 = new JPanel();
        mpnl2.setLayout(new BoxLayout(mpnl2, BoxLayout.PAGE_AXIS));

        for (int monthIndex = 0; monthIndex < months.length; monthIndex++) {
            String[][] rowData = new String[getMaxDays(monthIndex)][columnNames2.length];
            for (int dayIndex = 0; dayIndex < rowData.length; dayIndex++) {
                rowData[dayIndex][0] = Integer.toString(dayIndex + 1);
            }
            JTable table = new JTable(rowData, columnNames2);
            table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            table.getColumnModel().getColumn(0).setPreferredWidth(50);
            table.setPreferredScrollableViewportSize(new Dimension(950, 400));
            JScrollPane scrollPane = new JScrollPane(table);
            JLabel label = new JLabel(months[monthIndex]);
            mpnl2.add(label);
            mpnl2.add(scrollPane);
        }

        JScrollPane scrollPane = new JScrollPane(mpnl2);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        sfrm.getContentPane().add(scrollPane);

        sfrm.pack();
        sfrm.setSize(600, 400);
        sfrm.setVisible(true);
        sfrm.setResizable(true);
        sfrm.setLocationRelativeTo(null);
        sfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        backbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                yr2 yr2024 = new yr2();
            }
        });
        
        sfrm.getContentPane().add(backbtn, "South");
    }
}
    
    private int getMaxDays(int monthIndex) { 
        return switch (monthIndex) {
            case 1 -> 29;
            case 3, 5, 8, 10 -> 30;
            default -> 31;
        };
    }
}