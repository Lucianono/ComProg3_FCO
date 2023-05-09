
package com.mycompany.bbc_hotelresortreserv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ResourcesOrderGUI extends JFrame implements ActionListener,ItemListener {

    int resoMaxVal = 30;
    int j = 0;
    
    JFrame frame = new JFrame();
    JPanel jResoPanel2 = new JPanel();
    JScrollPane jScrollPane1 = new JScrollPane();
    JPanel jResoPanel10 = new JPanel();
    JPanel [] resoEachPanel = new JPanel[resoMaxVal];
    JPanel [] resoLblPanel = new JPanel[resoMaxVal];
    JLabel [] resoLbl = new JLabel[resoMaxVal];
    JButton [] plusBtn = new JButton[resoMaxVal];
    JLabel [] qtyCountLbl = new JLabel[resoMaxVal];
    JButton [] minusBtn = new JButton[resoMaxVal];
    JLabel [] maxCountLbl = new JLabel[resoMaxVal];
    JPanel jResoPanel3 = new JPanel();
    JScrollPane jScrollPane2 = new JScrollPane();
    JPanel jResoPanel11 = new JPanel();
    JLabel totalOrderLbl = new JLabel();
    JPanel jResoPanel17 = new JPanel();
    JButton confirmBtn = new JButton();
    
    private final Transaction transactionSelected;
    private final ResourcesCRUD resourcesInv;
    
    ArrayList<Resources> reso;
    Resources [] resoOrdered = new Resources[resoMaxVal]  ;
    
    public ResourcesOrderGUI(Transaction transactionSelected, ResourcesCRUD resourcesInv) {
        
        this.transactionSelected = transactionSelected;
        this.resourcesInv = resourcesInv;
        reso = resourcesInv.getResoData();

        jResoPanel2.setLayout(new BoxLayout(jResoPanel2, BoxLayout.X_AXIS));

        jScrollPane1.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane1.setPreferredSize(new Dimension(350, 100));
        jScrollPane1.setRequestFocusEnabled(false);

        jScrollPane1.setBorder(BorderFactory.createTitledBorder("Buy a Resources"));
        //jResoPanel10.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        //jResoPanel10.setPreferredSize(new Dimension(150, 189));
        jResoPanel10.setLayout(new BoxLayout(jResoPanel10, BoxLayout.Y_AXIS));

        refreshResourcePane();

        jScrollPane1.setViewportView(jResoPanel10);

        jResoPanel2.add(jScrollPane1);

        jResoPanel3.setPreferredSize(new Dimension(50, 100));
        jResoPanel3.setLayout(new BoxLayout(jResoPanel3, BoxLayout.Y_AXIS));

        jScrollPane2.setPreferredSize(new Dimension(50, 150));

        jResoPanel11.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        //jResoPanel11.setPreferredSize(new Dimension(20, 187));
        jResoPanel11.setLayout(new BoxLayout(jResoPanel11, BoxLayout.Y_AXIS));

        totalOrderLbl.setText(" . . . ");
        totalOrderLbl.setFont(new Font("Arial", Font.ITALIC, 9)); 
        jResoPanel11.add(totalOrderLbl);

        jScrollPane2.setViewportView(jResoPanel11);

        jResoPanel3.add(jScrollPane2);

        jResoPanel17.setPreferredSize(new Dimension(20, 20));
        jResoPanel17.setLayout(new BorderLayout());

        confirmBtn.setText("CONFIRM");
        confirmBtn.addActionListener(this);
        jResoPanel17.add(confirmBtn, BorderLayout.CENTER);

        jResoPanel3.add(jResoPanel17);

        jResoPanel2.add(jResoPanel3);

        frame.add(jResoPanel2, BorderLayout.CENTER);
        frame.setSize(500,200);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        
    }

    //adds a resource to order
    public void addResourcePanel(int i, int j , Resources r){
        
        resoEachPanel[i] = new JPanel();
        resoLblPanel[i] = new JPanel();
        resoLbl[i] = new JLabel();
        plusBtn[i] = new JButton();
        qtyCountLbl[i] = new JLabel();
        minusBtn[i] = new JButton();
        maxCountLbl[i] = new JLabel();
                
        
        resoEachPanel[i].setLayout(new FlowLayout(FlowLayout.LEFT));

        resoLblPanel[i].setPreferredSize(new Dimension(240, 30));
        resoLblPanel[i].setLayout(new FlowLayout(FlowLayout.LEFT));
        
        resoLbl[i].setFont(new Font("Arial", Font.BOLD, 15)); // NOI18N
        resoLbl[i].setText("₱"+ r.getPrice() + " - " + r.getItemName());
        resoLblPanel[i].add(resoLbl[i]);
        maxCountLbl[i].setFont(new Font("Verdana", Font.ITALIC, 9)); // NOI18N
        maxCountLbl[i].setText("MAX: " + r.getQty());
        resoLblPanel[i].add(maxCountLbl[i]);

        resoEachPanel[i].add(resoLblPanel[i]);

        minusBtn[i].setText("-");
        minusBtn[i].setPreferredSize(new Dimension(20, 20));
        minusBtn[i].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        minusBtn[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(0<Integer.parseInt(qtyCountLbl[i].getText())){
                    qtyCountLbl[i].setText(Integer.parseInt(qtyCountLbl[i].getText())-1+"");
                    updateTotalOrder();
                }
                
            }
        });
        resoEachPanel[i].add(minusBtn[i]);
       
        qtyCountLbl[i].setFont(new Font("Arial", Font.BOLD, 12)); 
        qtyCountLbl[i].setText("0");
        qtyCountLbl[i].setPreferredSize(new Dimension(15, 10));
        qtyCountLbl[i].setAlignmentX(CENTER_ALIGNMENT);
        resoEachPanel[i].add(qtyCountLbl[i]);
        
        plusBtn[i].setText("+");
        plusBtn[i].setPreferredSize(new Dimension(20, 20));
        plusBtn[i].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        plusBtn[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(r.getQty()>Integer.parseInt(qtyCountLbl[i].getText())){
                    qtyCountLbl[i].setText(Integer.parseInt(qtyCountLbl[i].getText())+1+"");
                    updateTotalOrder();
                }
                
            }
        });
        resoEachPanel[i].add(plusBtn[i]);
        
        jResoPanel10.add(resoEachPanel[i]);
        
    }
    //refresh resource order pane
    private void refreshResourcePane(){
        j=0;
        for(int i = 0; i < reso.size(); i++){
            addResourcePanel(i,j,reso.get(i));
        }
        jResoPanel10.repaint();
        jResoPanel10.revalidate();
    }
    //updates totalOrderLbl
    private void updateTotalOrder(){
        String disp = "<html>";
        Double totalAmount = 0.0;
        totalOrderLbl.setText(disp);
        for (int i = 0;  i < reso.size(); i++){
            if(Integer.parseInt(qtyCountLbl[i].getText())>0){
                Double amount = Integer.parseInt(qtyCountLbl[i].getText()) * reso.get(i).getPrice();
                disp = qtyCountLbl[i].getText() + " " + reso.get(i).getItemName() + " - ₱ " + amount;
                totalOrderLbl.setText(totalOrderLbl.getText()+"<br/> "+ disp);
                totalAmount += amount;
            }
        }
        totalOrderLbl.setText(totalOrderLbl.getText()+"<br/> ================== <br/> ₱ "+ totalAmount);
        
        
        
    }
    //submit orders
    private void confirmOrder(){
        Double totalAmount = 0.0;
        int resoCount = 0;
        for (int i = 0;  i < reso.size(); i++){
            if(Integer.parseInt(qtyCountLbl[i].getText())>0){
                Double amount = Integer.parseInt(qtyCountLbl[i].getText()) * reso.get(i).getPrice();
                resoOrdered[resoCount] = resourcesInv.orderItem(reso.get(i).getItemID(), Integer.parseInt(qtyCountLbl[i].getText()));
                resoOrdered[resoCount].setQty(Integer.parseInt(qtyCountLbl[i].getText()));
                reso.get(i).setQty(reso.get(i).getQty()- Integer.parseInt(qtyCountLbl[i].getText()));
                totalAmount += amount;
                resoCount++;
            }
        }
        transactionSelected.setResoUsed(resoOrdered);
    }
            
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==confirmBtn){
            
            confirmOrder();
            frame.dispose();
            
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        
    }
    
    
     
}
