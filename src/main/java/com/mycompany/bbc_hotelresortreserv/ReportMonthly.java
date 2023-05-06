package com.mycompany.bbc_hotelresortreserv;
import javax.swing.*;

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
    
    public ReportMonthly() {
        JFrame frm = new JFrame();
        String data[][] = {{"101", "Amit", "670000"},
                            {"102", "Jai", "780000"},
                            {"101", "Sachin", "700000"}};
        String column[] = {"Sales", "#ofCustomers", "ResourcesUsed"};
        JTable rm = new JTable(data, column);
        rm.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(rm);
        frm.add(sp);
        frm.setSize(300, 400);
        frm.setVisible(true);
        frm.setResizable(false);
        frm.setLocationRelativeTo(null);
    }
}