
package com.mycompany.bbc_hotelresortreserv;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.border.LineBorder;

public class HotelRoomGUI extends JPanel implements ActionListener{
    
    int resoMaxVal = 30;
    
    JPanel jPanel1 = new JPanel();
    JPanel jPanel3 = new JPanel();
    JLabel jLabel1 = new JLabel();
    JPanel jPanel2 = new JPanel();
    JPanel jPanel4 = new JPanel();
    JLabel jLabel12 = new JLabel();
    JScrollPane jScrollPane1 = new JScrollPane();
    JPanel hotelSuperPanel = new JPanel();
    JPanel[] hotelPanel = new JPanel[resoMaxVal];
    JPanel[] hotelIdPanel = new JPanel[resoMaxVal];
    JLabel[] hotelIdLbl = new JLabel[resoMaxVal];
    JPanel[] hotelTypePanel = new JPanel[resoMaxVal];
    JLabel[] hotelTypeLbl = new JLabel[resoMaxVal];
    JPanel[] capPanel = new JPanel[resoMaxVal];
    JPanel[] capLblPanel = new JPanel[resoMaxVal];
    JLabel[] capLbl = new JLabel[resoMaxVal];
    JButton[] capBtn = new JButton[resoMaxVal];
    JPanel[] regratePanel = new JPanel[resoMaxVal];
    JLabel[] regPesoLbl = new JLabel[resoMaxVal];
    JPanel[] regrateLblPanel = new JPanel[resoMaxVal];
    JLabel[] regrateLbl = new JLabel[resoMaxVal];
    JButton[] regrateBtn = new JButton[resoMaxVal];
    JPanel[] proratePanel = new JPanel[resoMaxVal];
    JLabel[] proPesoLbl = new JLabel[resoMaxVal];
    JPanel[] prorateLblPanel = new JPanel[resoMaxVal];
    JLabel[] prorateLbl = new JLabel[resoMaxVal];
    JButton[] prorateBtn = new JButton[resoMaxVal];
    JButton[] removHotelBtn = new JButton[resoMaxVal];
    JPanel jPanel6 = new JPanel();
    JButton addHotelBtn = new JButton();

    private final HotelCRUD hotelSys;
    ArrayList<Hotel> hotel ;
   
    
    public HotelRoomGUI(HotelCRUD hotelreso) {
        
        
        
        this.hotelSys=hotelreso;
        
        jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.Y_AXIS));

        jLabel1.setFont(new Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("HOTEL ROOMS");
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
        jLabel12.setText("| HotelID | Hotel Type                       | Capacity | Regular Rate | Promo Rate | ");
        jPanel4.add(jLabel12);

        jPanel2.add(jPanel4);

        jScrollPane1.setBackground(new Color(179, 154, 135));
        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new Dimension(552, 250));

        hotelSuperPanel.setBackground(new Color(213, 178, 144));
        hotelSuperPanel.setLayout(new BoxLayout(hotelSuperPanel,BoxLayout.Y_AXIS));

        
        refreshHotelSuperPanel();
        

        jScrollPane1.setViewportView(hotelSuperPanel);

        jPanel2.add(jScrollPane1);

        jPanel6.setPreferredSize(new Dimension(550, 35));
        jPanel6.setLayout(new BorderLayout());

        addHotelBtn.setFont(new Font("Verdana", 1, 14)); // NOI18N
        addHotelBtn.setText("ADD HOTEL ROOM");
        addHotelBtn.addActionListener(this);
        jPanel6.add(addHotelBtn, BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel1.add(jPanel2);

        add(jPanel1, BorderLayout.CENTER);

        
    }

    //add a hotel
    private void addHotelPanel(int i, Hotel hr){
        
        hotelPanel[i] = new JPanel();
        hotelIdPanel[i] = new JPanel();
        hotelIdLbl[i] = new JLabel();
        hotelTypePanel[i] = new JPanel();
        hotelTypeLbl[i] = new JLabel();
        capPanel[i] = new JPanel();
        capLblPanel[i] = new JPanel();
        capLbl[i] = new JLabel();
        capBtn[i] = new JButton();
        regratePanel[i] = new JPanel();
        regPesoLbl[i] = new JLabel();
        regrateLblPanel[i] = new JPanel();
        regrateLbl[i] = new JLabel();
        regrateBtn[i] = new JButton();
        proratePanel[i] = new JPanel();
        proPesoLbl[i] = new JLabel();
        prorateLblPanel[i] = new JPanel();
        prorateLbl[i] = new JLabel();
        prorateBtn[i] = new JButton();
        removHotelBtn[i] = new JButton();
        
        Color resoPanelColor;
        if(i%2 == 0){
            resoPanelColor = new Color(255, 255, 255);
        }else{
            resoPanelColor = new Color(235, 235, 235);
        }
        
        hotelPanel[i].setBackground(resoPanelColor);
        hotelPanel[i].setLayout(new FlowLayout(FlowLayout.LEFT,0,5));

        hotelIdPanel[i].setPreferredSize(new Dimension(80, 27));

        hotelIdLbl[i].setFont(new Font("Arial", 0, 14)); // NOI18N
        hotelIdLbl[i].setText(hr.getHotelID());
        hotelIdPanel[i].add(hotelIdLbl[i]);

        hotelPanel[i].add(hotelIdPanel[i]);

        hotelTypePanel[i].setPreferredSize(new Dimension(170, 27));
        hotelTypePanel[i].setLayout(new BoxLayout(hotelTypePanel[i], BoxLayout.Y_AXIS));

        hotelTypeLbl[i].setFont(new Font("Arial", 0, 14)); // NOI18N
        hotelTypeLbl[i].setText(hr.getHotelType());
        hotelTypePanel[i].add(hotelTypeLbl[i]);

        hotelPanel[i].add(hotelTypePanel[i]);

        capLblPanel[i].setPreferredSize(new Dimension(35, 25));

        capLbl[i].setFont(new Font("Arial", 0, 14)); // NOI18N
        capLbl[i].setText(hr.getRoomCap()+"");
        capLblPanel[i].add(capLbl[i]);

        capPanel[i].add(capLblPanel[i]);

        capBtn[i].setText("U");
        capBtn[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int userinput = Integer.parseInt(JOptionPane.showInputDialog(null, "SET ROOM CAPACITY") );
                    if(userinput > 0){
                        hr.setRoomCap(userinput);
                        capLbl[i].setText(hr.getRoomCap()+"");
                    }else{
                        JOptionPane.showMessageDialog(null, "Incorrect input!" );
                    }
                } catch (Exception err) {
                    JOptionPane.showMessageDialog(null, "Incorrect input!" );
                }
            }
        });
        capPanel[i].add(capBtn[i]);

        hotelPanel[i].add(capPanel[i]);

        regratePanel[i].setPreferredSize(new Dimension(95, 35));

        regPesoLbl[i].setText("₱");
        regratePanel[i].add(regPesoLbl[i]);

        regrateLblPanel[i].setPreferredSize(new Dimension(40, 25));

        regrateLbl[i].setFont(new Font("Arial", 0, 12)); // NOI18N
        regrateLbl[i].setText(hr.getRegRate()+"");
        regrateLblPanel[i].add(regrateLbl[i]);

        regratePanel[i].add(regrateLblPanel[i]);

        regrateBtn[i].setText("U");
        regrateBtn[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int userinput = Integer.parseInt(JOptionPane.showInputDialog(null, "SET NEW REGULAR RATE") );
                    if(userinput > 0){
                        hr.setRegRate(userinput);
                        regrateLbl[i].setText(hr.getRegRate()+"");
                    }else{
                        JOptionPane.showMessageDialog(null, "Incorrect input!" );
                    }
                } catch (Exception err) {
                    JOptionPane.showMessageDialog(null, "Incorrect input!" );
                }
            }
        });
        regratePanel[i].add(regrateBtn[i]);

        hotelPanel[i].add(regratePanel[i]);

        proratePanel[i].setPreferredSize(new Dimension(95, 35));

        proPesoLbl[i].setText("₱");
        proratePanel[i].add(proPesoLbl[i]);

        prorateLblPanel[i].setPreferredSize(new Dimension(40, 25));

        prorateLbl[i].setFont(new Font("Arial", 0, 12)); // NOI18N
        prorateLbl[i].setText(hr.getPromoRate()+"");
        prorateLblPanel[i].add(prorateLbl[i]);

        proratePanel[i].add(prorateLblPanel[i]);

        prorateBtn[i].setText("U");
        prorateBtn[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int userinput = Integer.parseInt(JOptionPane.showInputDialog(null, "SET NEW PROMO RATE") );
                    if(userinput > 0){
                        hr.setPromoRate(userinput);
                        prorateLbl[i].setText(hr.getPromoRate()+"");
                    }else{
                        JOptionPane.showMessageDialog(null, "Incorrect input!" );
                    }
                } catch (Exception err) {
                    JOptionPane.showMessageDialog(null, "Incorrect input!" );
                }
            }
        });
        proratePanel[i].add(prorateBtn[i]);

        hotelPanel[i].add(proratePanel[i]);

        removHotelBtn[i].setText("D");
        removHotelBtn[i].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int userinput = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this room?", null, JOptionPane.YES_NO_OPTION);
                if(userinput == 0){
                    hotelSys.deleteHotel(hr.getHotelID());
                    refreshHotelSuperPanel();
                }
            }
        });
        hotelPanel[i].add(removHotelBtn[i]);

        hotelSuperPanel.add(hotelPanel[i]);
    }
    //refesh all hotel
    private void refreshHotelSuperPanel(){
        
        hotel = hotelSys.getHotelData();
        
        for(int i = 0; i < hotel.size()+1; i++){
            if(hotelPanel[i]!=null){
                deleteHotelPanel(i);
            }
        }
        
        for(int i = 0; i < hotel.size(); i++){
            addHotelPanel(i,hotel.get(i));
            
        }
        hotelSuperPanel.repaint();
        hotelSuperPanel.revalidate();
    }
    //deletes hotel panel
    public void deleteHotelPanel(int i){
        hotelSuperPanel.remove(hotelPanel[i]);
        hotelPanel[i]=null;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
            try {
                String hotelID = JOptionPane.showInputDialog("Enter HotelID");
                
                for(int i = 0; i < hotel.size(); i++){
                    if(hotelSys.getAllHotelID()[i].equalsIgnoreCase(hotelID) ){
                        JOptionPane.showMessageDialog(null, "ID should be unique!" );
                        throw new Exception();
                    }
                }
                
                
                
                hotelSys.addHotel(hotelID.toUpperCase(),
                        JOptionPane.showInputDialog("Enter Hotel Type"),true,
                        Integer.parseInt(JOptionPane.showInputDialog("Enter Room Capacity")),
                        Double.parseDouble(JOptionPane.showInputDialog("Enter Regular Rate")),
                        Double.parseDouble(JOptionPane.showInputDialog("Enter Promo Rate")));
                refreshHotelSuperPanel();
            } catch (Exception err) {
                JOptionPane.showMessageDialog(null, "Incorrect input!" );
            }
    }  
    
}
