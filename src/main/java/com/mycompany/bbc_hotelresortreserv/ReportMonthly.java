package com.mycompany.bbc_hotelresortreserv;
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

public class ReportMonthly {

private JButton nxtbtn = new JButton("Next");

    public ReportMonthly() {
        JFrame mfrm = new JFrame("Monthly Report");
        
        String data[][] = {{"101", "Amit", "670000"},
                            {"102", "Jai", "780000"},
                            {"101", "Sachin", "700000"}};
        
        String column[] = {"Sales", "#ofCustomers", "ResourcesUsed"};
        
        JTable rm = new JTable(data, column);
        
        JScrollPane sp = new JScrollPane(rm);
        
        rm.setBounds(30, 40, 200, 300);
        
        mfrm.add(sp);
        mfrm.setSize(1390, 737);
        mfrm.setVisible(true);
        mfrm.setResizable(false);
        mfrm.setLocationRelativeTo(null);
        
        mfrm.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        mfrm.getContentPane().add(nxtbtn);
        
        nxtbtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                mfrm.dispose();
                SecondFrame sfrm = new SecondFrame();
            }
        });
        
        JPanel panel = new JPanel();
        panel.add(nxtbtn);
        mfrm.getContentPane().add(panel, "South");
        
        mfrm.setVisible(true);
    }

    private static class SecondFrame {
        private JFrame sfrm = new JFrame("Monthly Report");
        public SecondFrame() {
            close();
            sfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            sfrm.setSize(300,400);
            sfrm.setVisible(true);
            sfrm.setResizable(false);
            sfrm.setLocationRelativeTo(null);   
        }

        private void close() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}