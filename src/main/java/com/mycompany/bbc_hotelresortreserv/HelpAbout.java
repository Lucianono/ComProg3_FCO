package com.mycompany.bbc_hotelresortreserv;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelpAbout extends JScrollPane{
        JScrollPane jScrollPane1 = new JScrollPane();
        JPanel mainPanel = new JPanel();
        JLabel about = new JLabel();
        JLabel prstb = new JLabel();
        JPanel abt1 = new JPanel();
        JPanel albaPanel = new JPanel();
        JLabel albaName = new JLabel();
        JLabel albaYS = new JLabel();
        JLabel albaNum = new JLabel();
        JLabel albaPic = new JLabel();
        JPanel belonioPanel = new JPanel();
        JLabel belonioName = new JLabel();
        JLabel belonioYS = new JLabel();
        JLabel belonioNum = new JLabel();
        JLabel belonioPic = new JLabel();
        JPanel caluloPanel = new JPanel();
        JLabel caluloName = new JLabel();
        JLabel caluloYS = new JLabel();
        JLabel caluloNum = new JLabel();
        JLabel caluloPic = new JLabel();
        JPanel abt2 = new JPanel();
        JPanel sandiegoPanel = new JPanel();
        JLabel sandiegoName = new JLabel();
        JLabel sandiegoYS = new JLabel();
        JLabel sandiegoNum = new JLabel();
        JLabel sandiegoPic = new JLabel();
        JPanel rosalPanel = new JPanel();
        JLabel rosalName = new JLabel();
        JLabel rosalYS = new JLabel();
        JLabel rosalNum = new JLabel();
        JLabel rosalPic = new JLabel();
        JLabel prstt = new JLabel();
        JPanel engrPanel = new JPanel();
        JLabel engrName = new JLabel();
        JLabel engrCareer = new JLabel();
        JLabel help = new JLabel();
        JLabel mainMenu = new JLabel();
        JPanel jPanel10 = new JPanel();
        JLabel jLabel23 = new JLabel();
        JPanel jPanel11 = new JPanel();
        JLabel jLabel24 = new JLabel();
        JLabel jLabel25 = new JLabel();
        JLabel jLabel26 = new JLabel();
        JLabel jLabel27 = new JLabel();
        JLabel jLabel28 = new JLabel();
        JLabel jLabel29 = new JLabel();
        JPanel jPanel12 = new JPanel();
        JLabel jLabel30 = new JLabel();

    public HelpAbout() {

        about.setFont(new Font("Arial", 1, 24)); // NOI18N
        about.setText("About the Developer");

        prstb.setFont(new Font("Arial", 1, 12)); // NOI18N
        prstb.setText("Presented By:");

        albaName.setFont(new Font("Arial", 1, 12)); // NOI18N
        albaName.setText("Darwin Alba Inigo I. Alba");

        albaYS.setFont(new Font("Arial", 0, 12)); // NOI18N
        albaYS.setText("BSM CS 2A - G1");

        albaNum.setFont(new Font("Arial", 0, 12)); // NOI18N
        albaNum.setText("0920-654-7790");

        ImageIcon darr = new ImageIcon("src/main/resources/images/images/Alba.png");
        Image darrr = darr.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        albaPic.setIcon(new ImageIcon(darrr)); 

        GroupLayout albaPanelLayout = new GroupLayout(albaPanel);
        albaPanel.setLayout(albaPanelLayout);
        albaPanelLayout.setHorizontalGroup(
            albaPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(albaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(albaPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(albaName)
                    .addGroup(GroupLayout.Alignment.TRAILING, albaPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(albaPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(albaYS)
                            .addComponent(albaNum))
                        .addGap(26, 26, 26)))
                .addGap(20, 20, 20))
            .addGroup(albaPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(albaPic, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        albaPanelLayout.setVerticalGroup(
            albaPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(albaPanelLayout.createSequentialGroup()
                .addComponent(albaPic, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(albaName, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(albaYS)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(albaNum)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        belonioName.setFont(new Font("Arial", 1, 12)); // NOI18N
        belonioName.setText("Noren Ester C. Belono");

        belonioYS.setFont(new Font("Arial", 0, 12)); // NOI18N
        belonioYS.setText("BSM CS 2A - G1");

        belonioNum.setFont(new Font("Arial", 0, 12)); // NOI18N
        belonioNum.setText("0912-700-2544");

        belonioPic.setIcon(new ImageIcon(getClass().getResource("/images/Belonio.jpg"))); // NOI18N
        belonioPic.setText("caluloPic");

        GroupLayout belonioPanelLayout = new GroupLayout(belonioPanel);
        belonioPanel.setLayout(belonioPanelLayout);
        belonioPanelLayout.setHorizontalGroup(
            belonioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(belonioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(belonioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(belonioPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(belonioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(belonioYS)
                            .addGroup(belonioPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(belonioNum))))
                    .addComponent(belonioName))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, belonioPanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(belonioPic, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        belonioPanelLayout.setVerticalGroup(
            belonioPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(belonioPanelLayout.createSequentialGroup()
                .addComponent(belonioPic, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(belonioName, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(belonioYS)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(belonioNum)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        caluloName.setFont(new Font("Arial", 1, 12)); // NOI18N
        caluloName.setText("Bryan Jett T. Calulo");

        caluloYS.setFont(new Font("Arial", 0, 12)); // NOI18N
        caluloYS.setText("BSM CS 2A - G1");

        caluloNum.setFont(new Font("Arial", 0, 12)); // NOI18N
        caluloNum.setText("0915-112-0027");

        caluloPic.setIcon(new ImageIcon(getClass().getResource("/images/Calulo.jpeg"))); // NOI18N
        caluloPic.setText("Bryan");

        GroupLayout caluloPanelLayout = new GroupLayout(caluloPanel);
        caluloPanel.setLayout(caluloPanelLayout);
        caluloPanelLayout.setHorizontalGroup(
            caluloPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(caluloPanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(caluloPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(caluloNum)
                    .addComponent(caluloYS))
                .addGap(30, 30, 30))
            .addGroup(caluloPanelLayout.createSequentialGroup()
                .addGroup(caluloPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(caluloPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(caluloName))
                    .addGroup(caluloPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(caluloPic, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        caluloPanelLayout.setVerticalGroup(
            caluloPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(caluloPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caluloPic, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caluloName, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caluloYS)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caluloNum)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout abt1Layout = new GroupLayout(abt1);
        abt1.setLayout(abt1Layout);
        abt1Layout.setHorizontalGroup(
            abt1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(abt1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(albaPanel, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(belonioPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caluloPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        abt1Layout.setVerticalGroup(
            abt1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, abt1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(abt1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(abt1Layout.createSequentialGroup()
                        .addComponent(albaPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(abt1Layout.createSequentialGroup()
                        .addGroup(abt1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(belonioPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(caluloPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))))
        );

        sandiegoName.setFont(new Font("Arial", 1, 12)); // NOI18N
        sandiegoName.setText("Neil Allen H. Sandiego");

        sandiegoYS.setFont(new Font("Arial", 0, 12)); // NOI18N
        sandiegoYS.setText("BSM CS 2A - G1");

        sandiegoNum.setFont(new Font("Arial", 0, 12)); // NOI18N
        sandiegoNum.setText("0923-236-5987");

        sandiegoPic.setIcon(new ImageIcon(getClass().getResource("/images/SanDiego.jpeg"))); // NOI18N
        sandiegoPic.setText("Neil");

        GroupLayout sandiegoPanelLayout = new GroupLayout(sandiegoPanel);
        sandiegoPanel.setLayout(sandiegoPanelLayout);
        sandiegoPanelLayout.setHorizontalGroup(
            sandiegoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(sandiegoPanelLayout.createSequentialGroup()
                .addGroup(sandiegoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(sandiegoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sandiegoName))
                    .addGroup(sandiegoPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(sandiegoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(sandiegoYS)
                            .addComponent(sandiegoNum)))
                    .addGroup(sandiegoPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(sandiegoPic, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sandiegoPanelLayout.setVerticalGroup(
            sandiegoPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(sandiegoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sandiegoPic, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sandiegoName, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sandiegoYS)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sandiegoNum)
                .addContainerGap())
        );

        rosalName.setFont(new Font("Arial", 1, 12)); // NOI18N
        rosalName.setText("Ramil Angelo Jan M. Rosal");

        rosalYS.setFont(new Font("Arial", 0, 12)); // NOI18N
        rosalYS.setText("BSM CS 2A - G1");

        rosalNum.setFont(new Font("Arial", 0, 12)); // NOI18N
        rosalNum.setText("0969-326-9501");

        rosalPic.setIcon(new ImageIcon(getClass().getResource("/images/Rosal.png"))); // NOI18N
        rosalPic.setText("Jelo");

        GroupLayout rosalPanelLayout = new GroupLayout(rosalPanel);
        rosalPanel.setLayout(rosalPanelLayout);
        rosalPanelLayout.setHorizontalGroup(
            rosalPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(rosalPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(rosalPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(rosalPanelLayout.createSequentialGroup()
                        .addComponent(rosalName)
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, rosalPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(rosalPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(rosalNum)
                            .addComponent(rosalYS)
                            .addComponent(rosalPic, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))))
        );
        rosalPanelLayout.setVerticalGroup(
            rosalPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(rosalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rosalPic, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rosalName, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rosalYS, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rosalNum)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout abt2Layout = new GroupLayout(abt2);
        abt2.setLayout(abt2Layout);
        abt2Layout.setHorizontalGroup(
            abt2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, abt2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(rosalPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(sandiegoPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        abt2Layout.setVerticalGroup(
            abt2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(abt2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abt2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(sandiegoPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rosalPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        prstt.setFont(new Font("Arial", 1, 12)); // NOI18N
        prstt.setText("Presented To:");

        engrName.setFont(new Font("Arial", 1, 12)); // NOI18N
        engrName.setText("Engr. Evelyn C. Samson");

        engrCareer.setFont(new Font("Arial", 0, 12)); // NOI18N
        engrCareer.setText("Instructor, MCS 203");

        GroupLayout engrPanelLayout = new GroupLayout(engrPanel);
        engrPanel.setLayout(engrPanelLayout);
        engrPanelLayout.setHorizontalGroup(
            engrPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(engrPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(engrName)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(GroupLayout.Alignment.TRAILING, engrPanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(engrCareer)
                .addGap(31, 31, 31))
        );
        engrPanelLayout.setVerticalGroup(
            engrPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(engrPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(engrName, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(engrCareer)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        help.setFont(new Font("Arial", 1, 24)); // NOI18N
        help.setText(" Help");

        mainMenu.setFont(new Font("Arial", 1, 12)); // NOI18N
        mainMenu.setText("Main Menu");

        GroupLayout jPanel10Layout = new GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        jLabel23.setFont(new Font("Arial", 1, 12)); // NOI18N
        jLabel23.setText("Reservation");

        GroupLayout jPanel11Layout = new GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel24.setFont(new Font("Arial", 1, 12)); // NOI18N
        jLabel24.setText("2.  jhcfdsnbcvsmh gngf");
        jLabel24.setVerticalAlignment(SwingConstants.TOP);

        jLabel25.setFont(new Font("Arial", 1, 12)); // NOI18N
        jLabel25.setText("1. bfkdsbvdjbv jkfvn xcn mjkn m ");
        jLabel25.setVerticalAlignment(SwingConstants.TOP);

        jLabel26.setFont(new Font("Arial", 1, 12)); // NOI18N
        jLabel26.setText("2.  jhcfdsnbcvsmh gngf");
        jLabel26.setVerticalAlignment(SwingConstants.TOP);

        jLabel27.setFont(new Font("Arial", 1, 12)); // NOI18N
        jLabel27.setText("1. bfkdsbvdjbv jkfvn xcn mjkn m ");
        jLabel27.setVerticalAlignment(SwingConstants.TOP);

        jLabel28.setFont(new Font("Arial", 1, 12)); // NOI18N
        jLabel28.setText("2.  jhcfdsnbcvsmh gngf");
        jLabel28.setVerticalAlignment(SwingConstants.TOP);

        jLabel29.setFont(new Font("Arial", 1, 12)); // NOI18N
        jLabel29.setText("1. bfkdsbvdjbv jkfvn xcn mjkn m ");
        jLabel29.setVerticalAlignment(SwingConstants.TOP);

        GroupLayout jPanel12Layout = new GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel30.setFont(new Font("Arial", 1, 12)); // NOI18N
        jLabel30.setText("Report");

        GroupLayout mainPanelLayout = new GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(about))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(prstb))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(prstt))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(engrPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, GroupLayout.PREFERRED_SIZE, 557, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, GroupLayout.PREFERRED_SIZE, 557, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, GroupLayout.PREFERRED_SIZE, 557, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, GroupLayout.PREFERRED_SIZE, 557, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, GroupLayout.PREFERRED_SIZE, 557, GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel30)))
                            .addComponent(abt1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel10, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addGroup(mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(mainMenu, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(help, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(abt2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(671, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(about)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prstb)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(abt1, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(abt2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(prstt)
                .addGap(2, 2, 2)
                .addComponent(engrPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addComponent(help)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainMenu)
                .addGap(0, 0, 0)
                .addComponent(jPanel10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addGap(99, 99, 99))
        );

        setViewportView(mainPanel);
        mainPanel.setPreferredSize(new Dimension(600,1000));
        
        mainPanel.repaint();
        mainPanel.revalidate();

        
             
    }
    
}