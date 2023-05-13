
package com.mycompany.bbc_hotelresortreserv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.border.LineBorder;

public class InventoryGUI extends JFrame implements ActionListener,ItemListener{

    int resoMaxVal = 30;
    
    JFrame frame = new JFrame();
    JPanel jPanel1 = new JPanel();
    JPanel jPanel3 = new JPanel();
    JLabel jLabel1 = new JLabel();
    JPanel jPanel2 = new JPanel();
    JPanel jPanel4 = new JPanel();
    JLabel jLabel12 = new JLabel();
    JScrollPane jScrollPane1 = new JScrollPane();
    JPanel resoSuperPanel = new JPanel();
    JPanel [] resoPanel = new JPanel[resoMaxVal];
    JPanel [] itemIDPanel = new JPanel[resoMaxVal];
    JLabel [] itemIDLbl = new JLabel[resoMaxVal];
    JPanel [] itemNamePanel = new JPanel[resoMaxVal];
    JLabel [] itemNameLbl = new JLabel[resoMaxVal];
    JPanel [] itemQtySuperPanel = new JPanel[resoMaxVal];
    JPanel [] itemQtyPanel = new JPanel[resoMaxVal];
    JLabel [] itemQtyLbl = new JLabel[resoMaxVal];
    JButton [] addBtn = new JButton[resoMaxVal];
    JButton [] removeBtn = new JButton[resoMaxVal];
    JPanel [] itemPriceSuperPanel = new JPanel[resoMaxVal];
    JLabel [] pesoLbl = new JLabel[resoMaxVal];
    JPanel [] itemPricePanel = new JPanel[resoMaxVal];
    JLabel [] itemPriceLbl = new JLabel[resoMaxVal];
    JButton [] setPriceBtn = new JButton[resoMaxVal];
    JButton [] deleteItemBtn = new JButton[resoMaxVal];
    JPanel jPanel6 = new JPanel();
    JButton jButton1 = new JButton();
    
    private final ResourcesCRUD resourcesInv;
    ArrayList<Resources> reso;
    
    public InventoryGUI(ResourcesCRUD resources) {
        
        this.resourcesInv=resources;
        reso = resourcesInv.getResoData();

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
        jScrollPane1.setPreferredSize(new Dimension(552, 220));
        
        resoSuperPanel.setBackground(new Color(213, 178, 144));
        resoSuperPanel.setLayout(new BoxLayout(resoSuperPanel,BoxLayout.Y_AXIS));

        refreshResoSuperPanel();
        
        jScrollPane1.setViewportView(resoSuperPanel);

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

    //add a resource
    private void addResourcePanel(int i, Resources r){

        resoPanel[i] = new JPanel();
        itemIDPanel[i] = new JPanel();
        itemIDLbl[i] = new JLabel();
        itemNamePanel[i] = new JPanel();
        itemNameLbl[i] = new JLabel();
        itemQtySuperPanel[i] = new JPanel();
        itemQtyPanel[i] = new JPanel();
        itemQtyLbl[i] = new JLabel();
        addBtn[i] = new JButton();
        removeBtn[i] = new JButton();
        itemPriceSuperPanel[i] = new JPanel();
        pesoLbl[i] = new JLabel();
        itemPricePanel[i] = new JPanel();
        itemPriceLbl[i] = new JLabel();
        setPriceBtn[i] = new JButton();
        deleteItemBtn[i] = new JButton();
        
        Color resoPanelColor;
        if(i%2 == 0){
            resoPanelColor = new Color(255, 255, 255);
        }else{
            resoPanelColor = new Color(235, 235, 235);
        }
        
        resoPanel[i].setBackground(resoPanelColor);
        resoPanel[i].setPreferredSize(new Dimension(550, 50));

        itemIDPanel[i].setPreferredSize(new Dimension(50, 27));

        itemIDLbl[i].setFont(new Font("Arial", 0, 14)); // NOI18N
        itemIDLbl[i].setText(r.getItemID()+"");
        itemIDPanel[i].add(itemIDLbl[i]);

        resoPanel[i].add(itemIDPanel[i]);

        itemNamePanel[i].setPreferredSize(new Dimension(200, 27));
        itemNamePanel[i].setLayout(new FlowLayout(FlowLayout.LEFT));

        itemNameLbl[i].setFont(new Font("Arial", 0, 14)); // NOI18N
        itemNameLbl[i].setText(r.getItemName());
        itemNamePanel[i].add(itemNameLbl[i]);

        resoPanel[i].add(itemNamePanel[i]);

        itemQtyPanel[i].setPreferredSize(new Dimension(40, 25));

        itemQtyLbl[i].setFont(new Font("Arial", 0, 14)); // NOI18N
        itemQtyLbl[i].setText(r.getQty()+"");
        itemQtyPanel[i].add(itemQtyLbl[i]);

        itemQtySuperPanel[i].add(itemQtyPanel[i]);

        addBtn[i].setText("+");
        addBtn[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int userinput = Integer.parseInt(JOptionPane.showInputDialog(null, "ADD ITEMS") );
                    if(userinput > 0){
                        r.setQty(r.getQty() + userinput);
                        itemQtyLbl[i].setText(r.getQty()+"");
                    }else{
                        JOptionPane.showMessageDialog(null, "Incorrect input!" );
                    }
                } catch (Exception err) {
                    JOptionPane.showMessageDialog(null, "Incorrect input!" );
                }
            }
        });
        itemQtySuperPanel[i].add(addBtn[i]);

        removeBtn[i].setText("-");
        removeBtn[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int userinput = Integer.parseInt(JOptionPane.showInputDialog(null, "REMOVE ITEMS") );
                    if(userinput > 0){
                        r.setQty(r.getQty() - userinput);
                        itemQtyLbl[i].setText(r.getQty()+"");
                    }else{
                        JOptionPane.showMessageDialog(null, "Incorrect input!" );
                    }
                } catch (Exception err) {
                    JOptionPane.showMessageDialog(null, "Incorrect input!" );
                }
            }
        });
        itemQtySuperPanel[i].add(removeBtn[i]);

        resoPanel[i].add(itemQtySuperPanel[i]);

        pesoLbl[i].setText("₱");
        itemPriceSuperPanel[i].add(pesoLbl[i]);

        itemPricePanel[i].setPreferredSize(new Dimension(50, 25));

        itemPriceLbl[i].setFont(new Font("Arial", 0, 14)); // NOI18N
        itemPriceLbl[i].setText(r.getPrice()+"");
        itemPricePanel[i].add(itemPriceLbl[i]);

        itemPriceSuperPanel[i].add(itemPricePanel[i]);

        setPriceBtn[i].setText("U");
        setPriceBtn[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int userinput = Integer.parseInt(JOptionPane.showInputDialog(null, "SET NEW PRICE") );
                    if(userinput > 0){
                        r.setPrice(userinput);
                        itemPriceLbl[i].setText(r.getPrice()+"");
                    }else{
                        JOptionPane.showMessageDialog(null, "Incorrect input!" );
                    }
                } catch (Exception err) {
                    JOptionPane.showMessageDialog(null, "Incorrect input!" );
                }
            }
        });
        itemPriceSuperPanel[i].add(setPriceBtn[i]);

        resoPanel[i].add(itemPriceSuperPanel[i]);

        deleteItemBtn[i].setText("D");
        deleteItemBtn[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
        resoPanel[i].add(deleteItemBtn[i]);

        resoSuperPanel.add(resoPanel[i]);
        
    }
    //adds all resources
    private void refreshResoSuperPanel(){
        if(resoPanel[0]!=null){
            for(int i = 0; i < reso.size(); i++){
                deleteResourcePanel(i);
            }
        }
        
        
        for(int i = 0; i < reso.size(); i++){
            addResourcePanel(i,reso.get(i));
        }
        resoSuperPanel.repaint();
        resoSuperPanel.revalidate();
    }
    //deletes resurce panel
    public void deleteResourcePanel(int i){
        resoSuperPanel.remove(resoPanel[i]);
        resoPanel[i]=null;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
    }
    
}
