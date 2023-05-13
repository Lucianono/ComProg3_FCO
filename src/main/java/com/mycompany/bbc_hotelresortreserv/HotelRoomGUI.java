
package com.mycompany.bbc_hotelresortreserv;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.border.LineBorder;

public class HotelRoomGUI extends JFrame implements ActionListener{
    
    int resoMaxVal = 30;
    
    JFrame frame = new JFrame();
    JPanel jPanel1 = new JPanel();
    JPanel jPanel3 = new JPanel();
    JLabel jLabel1 = new JLabel();
    JPanel jPanel2 = new JPanel();
    JPanel jPanel4 = new JPanel();
    JLabel jLabel12 = new JLabel();
    JScrollPane jScrollPane1 = new JScrollPane();
    JPanel hotelSuperPanel = new JPanel();
    JPanel[] hotelTypePanel = new JPanel[resoMaxVal];
    JPanel[] hotelIdPanel = new JPanel[resoMaxVal];
    JLabel[] hotelIdLbl = new JLabel[resoMaxVal];
    JPanel[] hotelPanel = new JPanel[resoMaxVal];
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
        jScrollPane1.setPreferredSize(new Dimension(552, 220));

        hotelSuperPanel.setBackground(new Color(213, 178, 144));
        hotelSuperPanel.setLayout(new BoxLayout(hotelSuperPanel,BoxLayout.Y_AXIS));

        
        refreshHotelSuperPanel();
        

        jScrollPane1.setViewportView(hotelSuperPanel);

        jPanel2.add(jScrollPane1);

        jPanel6.setPreferredSize(new Dimension(550, 35));
        jPanel6.setLayout(new BorderLayout());

        addHotelBtn.setFont(new Font("Verdana", 1, 14)); // NOI18N
        addHotelBtn.setText("ADD HOTEL ROOM");
        jPanel6.add(addHotelBtn, BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel1.add(jPanel2);

        frame.add(jPanel1, BorderLayout.CENTER);

        frame.setSize(600,400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }

    //add a hotel
    private void addHotelPanel(int i, Hotel hr){
        
        hotelTypePanel[i] = new JPanel();
        hotelIdPanel[i] = new JPanel();
        hotelIdLbl[i] = new JLabel();
        hotelPanel[i] = new JPanel();
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
        
        hotelTypePanel[i].setBackground(new Color(255, 255, 255));
        hotelTypePanel[i].setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        hotelTypePanel[i].setPreferredSize(new Dimension(550, 50));

        hotelIdPanel[i].setPreferredSize(new Dimension(70, 27));

        hotelIdLbl[i].setFont(new Font("Arial", 0, 14)); // NOI18N
        hotelIdLbl[i].setText(hr.getHotelID());
        hotelIdPanel[i].add(hotelIdLbl[i]);

        hotelTypePanel[i].add(hotelIdPanel[i]);

        hotelPanel[i].setPreferredSize(new Dimension(170, 27));
        hotelPanel[i].setLayout(new BoxLayout(hotelPanel[i], BoxLayout.Y_AXIS));

        hotelTypeLbl[i].setFont(new Font("Arial", 0, 14)); // NOI18N
        hotelTypeLbl[i].setText(hr.getHotelType());
        hotelPanel[i].add(hotelTypeLbl[i]);

        hotelTypePanel[i].add(hotelPanel[i]);

        capLblPanel[i].setPreferredSize(new Dimension(25, 25));

        capLbl[i].setFont(new Font("Arial", 0, 14)); // NOI18N
        capLbl[i].setText(hr.getRoomCap()+"");
        capLblPanel[i].add(capLbl[i]);

        capPanel[i].add(capLblPanel[i]);

        capBtn[i].setText("U");
        capBtn[i].addActionListener(this);
        capPanel[i].add(capBtn[i]);

        hotelTypePanel[i].add(capPanel[i]);

        regratePanel[i].setPreferredSize(new Dimension(90, 35));

        regPesoLbl[i].setText("₱");
        regratePanel[i].add(regPesoLbl[i]);

        regrateLblPanel[i].setPreferredSize(new Dimension(30, 25));

        regrateLbl[i].setFont(new Font("Arial", 0, 14)); // NOI18N
        regrateLbl[i].setText(hr.getRegRate()+"");
        regrateLblPanel[i].add(regrateLbl[i]);

        regratePanel[i].add(regrateLblPanel[i]);

        regrateBtn[i].setText("U");
        regrateBtn[i].addActionListener(this);
        regratePanel[i].add(regrateBtn[i]);

        hotelTypePanel[i].add(regratePanel[i]);

        proratePanel[i].setPreferredSize(new Dimension(90, 35));

        proPesoLbl[i].setText("₱");
        proratePanel[i].add(proPesoLbl[i]);

        prorateLblPanel[i].setPreferredSize(new Dimension(30, 25));

        prorateLbl[i].setFont(new Font("Arial", 0, 14)); // NOI18N
        prorateLbl[i].setText(hr.getPromoRate()+"");
        prorateLblPanel[i].add(prorateLbl[i]);

        proratePanel[i].add(prorateLblPanel[i]);

        prorateBtn[i].setText("U");
        prorateBtn[i].addActionListener(this);
        proratePanel[i].add(prorateBtn[i]);

        hotelTypePanel[i].add(proratePanel[i]);

        removHotelBtn[i].setText("D");
        hotelTypePanel[i].add(removHotelBtn[i]);

        hotelSuperPanel.add(hotelTypePanel[i]);
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
        };
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
        
    }
    
    
    
}
