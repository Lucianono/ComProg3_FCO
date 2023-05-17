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
    
    private JButton rsrcsbtn = new JButton("Resources Used");
    private JButton backbtn = new JButton("Back to Report");
    private JButton nxtbtn = new JButton("Next Year");
    private final String[] months = {"January", "February", "March", "April", 
        "May", "June", "July", "August", "September", "October", "November", "December"};
    private final String[] columnNames = {"Day" , "Sales", "No of Customers"};
    private int yearSelected = 2023;
    
    public Report() {
        JFrame mfrm = new JFrame(yearSelected+"");
        JPanel mpnl = new JPanel();
        
        for (int monthIndex = 0; monthIndex < months.length; monthIndex++) {
            String[][] rowData = new String[getMaxDays(monthIndex)][3];
            for (int dayIndex = 0; dayIndex < rowData.length; dayIndex++) {
                rowData[dayIndex][0] = Integer.toString(dayIndex + 1);
            }
            JTable table = new JTable(rowData, columnNames){
                 @Override
                    public boolean isCellEditable(int row, int column) {
                       //all cells false
                       return false;
                    }
            };
            JPanel tblPnl = new JPanel ();
            
            table.getColumnModel().getColumn(0).setMaxWidth(50);
            JScrollPane scrollPane = new JScrollPane(table);
            scrollPane.setPreferredSize(new Dimension(500,200));
            
            tblPnl.add (scrollPane);
            
            JLabel label = new JLabel(months[monthIndex]);
            mpnl.add(label);
            mpnl.add(tblPnl);
        }
        
        mpnl.setLayout(new BoxLayout(mpnl, BoxLayout.PAGE_AXIS));
        
        JScrollPane scrollPane = new JScrollPane(mpnl);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        mfrm.pack();
        mfrm.add(scrollPane);
        mfrm.setSize(700, 500);
        mfrm.setVisible(true);
        mfrm.setResizable(false);
        mfrm.setLocationRelativeTo(null);
        
        rsrcsbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                SecondFrame sfrm = new SecondFrame();
            }
        });
   
        backbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                mfrm.dispose();
            }
        });
        
        nxtbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //next year
            }
        });
        
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
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
        JFrame sfrm = new JFrame("2023");
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
                yr1 yr2023 = new yr1();
            }
        });
        
        sfrm.getContentPane().add(backbtn, "South");
    }
}
    
    private int getMaxDays(int monthIndex) { 
        return switch (monthIndex) {
            case 1 -> 28;
            case 3, 5, 8, 10 -> 30;
            default -> 31;
        };
    }
}