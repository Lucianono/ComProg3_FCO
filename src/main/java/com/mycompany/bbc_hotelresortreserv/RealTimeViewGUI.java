
package com.mycompany.bbc_hotelresortreserv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RealTimeViewGUI extends JFrame implements ActionListener{

    JFrame frame = new JFrame();
    JComboBox jComboBox1 = new JComboBox<>();
    JPanel jPanel2 = new JPanel();
    JPanel jPanel3 = new JPanel();
    JPanel jPanel1 = new JPanel();
    JComboBox jComboBox2 = new JComboBox<>();
    JComboBox jComboBox3 = new JComboBox<>();
    JComboBox jComboBox4 = new JComboBox<>();
    JButton jButton6 = new JButton();
    JPanel jPanel5 = new JPanel();
    JPanel jPanel6 = new JPanel();
    JLabel jLabel1 = new JLabel();
    JButton jButton1 = new JButton();
    JPanel jPanel7 = new JPanel();
    JLabel jLabel2 = new JLabel();
    JButton jButton2 = new JButton();
    JPanel jPanel4 = new JPanel();
    JScrollPane jScrollPane1 = new JScrollPane();
    JPanel jPanel8 = new JPanel();
    JLabel jLabel3 = new JLabel();
    JPanel jPanel9 = new JPanel();
    JButton jButton3 = new JButton();
    JButton jButton4 = new JButton();
    JButton jButton5 = new JButton();
    
    public RealTimeViewGUI() {
        
        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(this);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.X_AXIS));

        jPanel3.setLayout(new BoxLayout(jPanel3, BoxLayout.Y_AXIS));

        jComboBox2.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2);

        jComboBox3.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox3);

        jComboBox4.setModel(new DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox4);

        jButton6.setText("reset");
        jButton6.setPreferredSize(new Dimension(60, 23));
        jButton6.addActionListener(this);
        jPanel1.add(jButton6);

        jPanel3.add(jPanel1);

        jPanel5.setBorder(BorderFactory.createTitledBorder("Customers Reserved"));
        jPanel5.setPreferredSize(new Dimension(335, 440));

        jPanel6.setPreferredSize(new Dimension(300, 50));
        jPanel6.setRequestFocusEnabled(false);
        jPanel6.setLayout(new BoxLayout(jPanel6, BoxLayout.X_AXIS));

        jLabel1.setFont(new Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new Dimension(250, 16));
        jPanel6.add(jLabel1);

        jButton1.setText(">");
        jPanel6.add(jButton1);

        jPanel5.add(jPanel6);

        jPanel7.setPreferredSize(new Dimension(300, 50));
        jPanel7.setLayout(new BoxLayout(jPanel7, BoxLayout.X_AXIS));

        jLabel2.setFont(new Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("jLabel1");
        jLabel2.setPreferredSize(new Dimension(250, 16));
        jPanel7.add(jLabel2);

        jButton2.setText(">");
        jPanel7.add(jButton2);

        jPanel5.add(jPanel7);

        jPanel3.add(jPanel5);

        jPanel2.add(jPanel3);

        jPanel4.setLayout(new BoxLayout(jPanel4, BoxLayout.Y_AXIS));

        jScrollPane1.setPreferredSize(new Dimension(100, 250));

        jPanel8.setBorder(BorderFactory.createTitledBorder("Customer Information"));
        jPanel8.setLayout(new BorderLayout());

        jLabel3.setText("jLabel3");
        jPanel8.add(jLabel3, BorderLayout.CENTER);

        jScrollPane1.setViewportView(jPanel8);

        jPanel4.add(jScrollPane1);

        jButton3.setText("CHECK IN");
        jPanel9.add(jButton3);

        jButton4.setText("EXTRAS");
        jPanel9.add(jButton4);

        jButton5.setText("CHECKOUT");
        jPanel9.add(jButton5);

        jPanel4.add(jPanel9);

        jPanel2.add(jPanel4);

        frame.add(jPanel2, BorderLayout.CENTER);
        
        frame.setSize(600,400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
}
