
package com.mycompany.bbc_hotelresortreserv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ResourcesOrderGUI extends JFrame implements ActionListener,ItemListener {

    JFrame frame = new JFrame();
    JPanel jPanel2 = new JPanel();
    JScrollPane jScrollPane1 = new JScrollPane();
    JPanel jPanel10 = new JPanel();
    JPanel [] resoEachPanel = new JPanel[20];
    JPanel [] resoLblPanel = new JPanel[20];
    JLabel [] resoLbl = new JLabel[20];
    JButton [] plusBtn = new JButton[20];
    JLabel [] qtyCountLbl = new JLabel[20];
    JButton [] minusBtn = new JButton[20];
    JPanel jPanel3 = new JPanel();
    JScrollPane jScrollPane2 = new JScrollPane();
    JPanel jPanel11 = new JPanel();
    JLabel jLabel3 = new JLabel();
    JPanel jPanel17 = new JPanel();
    JButton jButton3 = new JButton();
    
    private final Transaction transactionSelected;
    private final ResourcesCRUD resourcesInv;
    
    public ResourcesOrderGUI(Transaction transactionSelected, ResourcesCRUD resourcesInv) {
        
        this.transactionSelected = transactionSelected;
        this.resourcesInv = resourcesInv;
        

        jPanel2.setLayout(new BoxLayout(jPanel2, BoxLayout.X_AXIS));

        jScrollPane1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane1.setPreferredSize(new Dimension(320, 100));
        jScrollPane1.setRequestFocusEnabled(false);

        jScrollPane1.setBorder(BorderFactory.createTitledBorder("Buy a Resources"));
        jPanel10.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        //jPanel10.setPreferredSize(new Dimension(150, 189));
        jPanel10.setLayout(new BoxLayout(jPanel10, BoxLayout.Y_AXIS));

        refreshResourcePane();

        jScrollPane1.setViewportView(jPanel10);

        jPanel2.add(jScrollPane1);

        jPanel3.setPreferredSize(new Dimension(50, 100));
        jPanel3.setLayout(new BoxLayout(jPanel3, BoxLayout.Y_AXIS));

        jScrollPane2.setPreferredSize(new Dimension(50, 150));

        jPanel11.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        //jPanel11.setPreferredSize(new Dimension(20, 187));
        jPanel11.setLayout(new BoxLayout(jPanel11, BoxLayout.Y_AXIS));

        jLabel3.setText("2 eXTRA bEDS - 600.00");
        jLabel3.setFont(new Font("Arial", Font.ITALIC, 9)); 
        jPanel11.add(jLabel3);

        jScrollPane2.setViewportView(jPanel11);

        jPanel3.add(jScrollPane2);

        jPanel17.setPreferredSize(new Dimension(20, 20));
        jPanel17.setLayout(new BorderLayout());

        jButton3.setText("CONFIRM");
        jPanel17.add(jButton3, BorderLayout.CENTER);

        jPanel3.add(jPanel17);

        jPanel2.add(jPanel3);

        frame.add(jPanel2, BorderLayout.CENTER);
        frame.setSize(500,200);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        
    }

    //adds a resource to order
    public void addResourcePanel(int i, Resources r){
        
        resoEachPanel[i] = new JPanel();
        resoLblPanel[i] = new JPanel();
        resoLbl[i] = new JLabel();
        plusBtn[i] = new JButton();
        qtyCountLbl[i] = new JLabel();
        minusBtn[i] = new JButton();
                
        
        resoEachPanel[i].setLayout(new FlowLayout(FlowLayout.LEFT));

        resoLblPanel[i].setPreferredSize(new Dimension(210, 30));
        resoLblPanel[i].setLayout(new FlowLayout(FlowLayout.LEFT));
        
        resoLbl[i].setFont(new Font("Arial", 2, 15)); // NOI18N
        resoLbl[i].setText(r.getPrice() + " - " + r.getItemName());
        resoLblPanel[i].add(resoLbl[i]);

        resoEachPanel[i].add(resoLblPanel[i]);

        plusBtn[i].setText("+");
        plusBtn[i].setPreferredSize(new Dimension(20, 20));
        plusBtn[i].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resoEachPanel[i].add(plusBtn[i]);

        qtyCountLbl[i].setFont(new Font("Arial", Font.BOLD, 12)); // NOI18N
        qtyCountLbl[i].setText("0");
        resoEachPanel[i].add(qtyCountLbl[i]);

        minusBtn[i].setText("-");
        minusBtn[i].setPreferredSize(new Dimension(20, 20));
        minusBtn[i].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resoEachPanel[i].add(minusBtn[i]);
        
        jPanel10.add(resoEachPanel[i]);
        
    }
    //refresh resource order pane
    public void refreshResourcePane(){
        ArrayList<Resources> reso = resourcesInv.getResoData();
        for(int i = 0; i < reso.size(); i++){
            addResourcePanel(i,reso.get(i));
            System.out.println("wow");
        }
    }
            
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
    }
    
    
     
}
