
package com.mycompany.bbc_hotelresortreserv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;

public class InventoryGUI extends JFrame implements ActionListener,ItemListener{

    JFrame frame = new JFrame();
    JPanel jPanel1 = new JPanel();
    JPanel jPanel3 = new JPanel();
    JLabel jLabel1 = new JLabel();
    JPanel jPanel2 = new JPanel();
    JPanel jPanel4 = new JPanel();
    JLabel jLabel12 = new JLabel();
    JScrollPane jScrollPane1 = new JScrollPane();
    JPanel jPanel5 = new JPanel();
    JPanel jPanel9 = new JPanel();
    JPanel jPanel18 = new JPanel();
    JLabel jLabel13 = new JLabel();
    JPanel jPanel19 = new JPanel();
    JLabel jLabel14 = new JLabel();
    JPanel jPanel20 = new JPanel();
    JPanel jPanel21 = new JPanel();
    JLabel jLabel15 = new JLabel();
    JButton jButton9 = new JButton();
    JButton jButton10 = new JButton();
    JPanel jPanel22 = new JPanel();
    JLabel jLabel16 = new JLabel();
    JPanel jPanel23 = new JPanel();
    JLabel jLabel17 = new JLabel();
    JButton jButton11 = new JButton();
    JButton jButton12 = new JButton();
    JPanel jPanel6 = new JPanel();
    JButton jButton1 = new JButton();
    
    public InventoryGUI(ResourcesCRUD resources) {
        

        jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.Y_AXIS));

        jLabel1.setFont(new Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("INVENTORY");
        jPanel3.add(jLabel1);

        jPanel1.add(jPanel3);

        jPanel2.setBackground(new Color(204, 204, 204));
        jPanel2.setPreferredSize(new Dimension(560, 350));

        jPanel4.setBackground(new Color(255, 255, 255));
        jPanel4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
        jPanel4.setPreferredSize(new Dimension(550, 30));
        jPanel4.setLayout(new FlowLayout(FlowLayout.LEFT));

        jLabel12.setFont(new Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel12.setText("   | ItemID | Name                                       |  Quantity         |   Price             |");
        jPanel4.add(jLabel12);

        jPanel2.add(jPanel4);

        jScrollPane1.setBackground(new Color(179, 154, 135));
        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new Dimension(552, 260));

        jPanel5.setBackground(new Color(213, 178, 144));
        jPanel5.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

        jPanel9.setBackground(new Color(255, 255, 255));
        jPanel9.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        jPanel9.setPreferredSize(new Dimension(550, 50));

        jPanel18.setPreferredSize(new Dimension(50, 27));

        jLabel13.setFont(new Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("101");
        jPanel18.add(jLabel13);

        jPanel9.add(jPanel18);

        jPanel19.setPreferredSize(new Dimension(200, 27));
        jPanel19.setLayout(new FlowLayout(FlowLayout.LEFT));

        jLabel14.setFont(new Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Extra Bed");
        jPanel19.add(jLabel14);

        jPanel9.add(jPanel19);

        jPanel21.setPreferredSize(new Dimension(40, 25));

        jLabel15.setFont(new Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("10");
        jPanel21.add(jLabel15);

        jPanel20.add(jPanel21);

        jButton9.setText("+");
        jPanel20.add(jButton9);

        jButton10.setText("-");
        jButton10.addActionListener(this);
        jPanel20.add(jButton10);

        jPanel9.add(jPanel20);

        jLabel16.setText("₱");
        jPanel22.add(jLabel16);

        jPanel23.setPreferredSize(new Dimension(50, 25));

        jLabel17.setFont(new Font("Arial", 0, 14)); // NOI18N
        jLabel17.setText("100");
        jPanel23.add(jLabel17);

        jPanel22.add(jPanel23);

        jButton11.setText("U");
        jButton11.addActionListener(this);
        jPanel22.add(jButton11);

        jPanel9.add(jPanel22);

        jButton12.setText("D");
        jPanel9.add(jButton12);

        jPanel5.add(jPanel9);

        jScrollPane1.setViewportView(jPanel5);

        jPanel2.add(jScrollPane1);

        jPanel6.setPreferredSize(new Dimension(550, 35));
        jPanel6.setLayout(new BorderLayout());

        jButton1.setFont(new Font("Verdana", 1, 14)); // NOI18N
        jButton1.setText("ADD ITEM");
        jPanel6.add(jButton1, BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel1.add(jPanel2);

        frame.add(jPanel1, BorderLayout.CENTER);

        frame.setSize(600,400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
    }
    
}
