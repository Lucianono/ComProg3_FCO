package com.mycompany.bbc_hotelresortreserv;

import javax.swing.JFrame;
import javax.swing.*;

public class HelpAbout extends JPanel{
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

        about.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        about.setText("About the Developer");

        prstb.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        prstb.setText("Presented By:");

        albaName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        albaName.setText("Darwin Alba Inigo I. Alba");

        albaYS.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        albaYS.setText("BSM CS 2A - G1");

        albaNum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        albaNum.setText("0920-654-7790");

        albaPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Alba.png"))); // NOI18N
        albaPic.setText("Darwin");

        javax.swing.GroupLayout albaPanelLayout = new javax.swing.GroupLayout(albaPanel);
        albaPanel.setLayout(albaPanelLayout);
        albaPanelLayout.setHorizontalGroup(
            albaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(albaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(albaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(albaName)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, albaPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(albaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(albaYS)
                            .addComponent(albaNum))
                        .addGap(26, 26, 26)))
                .addGap(20, 20, 20))
            .addGroup(albaPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(albaPic, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        albaPanelLayout.setVerticalGroup(
            albaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(albaPanelLayout.createSequentialGroup()
                .addComponent(albaPic, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(albaName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(albaYS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(albaNum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        belonioName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        belonioName.setText("Noren Ester C. Belono");

        belonioYS.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        belonioYS.setText("BSM CS 2A - G1");

        belonioNum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        belonioNum.setText("0912-700-2544");

        belonioPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Belonio.jpg"))); // NOI18N
        belonioPic.setText("caluloPic");

        javax.swing.GroupLayout belonioPanelLayout = new javax.swing.GroupLayout(belonioPanel);
        belonioPanel.setLayout(belonioPanelLayout);
        belonioPanelLayout.setHorizontalGroup(
            belonioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(belonioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(belonioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(belonioPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(belonioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(belonioYS)
                            .addGroup(belonioPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(belonioNum))))
                    .addComponent(belonioName))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, belonioPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(belonioPic, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        belonioPanelLayout.setVerticalGroup(
            belonioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(belonioPanelLayout.createSequentialGroup()
                .addComponent(belonioPic, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(belonioName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(belonioYS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(belonioNum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        caluloName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        caluloName.setText("Bryan Jett T. Calulo");

        caluloYS.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        caluloYS.setText("BSM CS 2A - G1");

        caluloNum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        caluloNum.setText("0915-112-0027");

        caluloPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calulo.jpeg"))); // NOI18N
        caluloPic.setText("Bryan");

        javax.swing.GroupLayout caluloPanelLayout = new javax.swing.GroupLayout(caluloPanel);
        caluloPanel.setLayout(caluloPanelLayout);
        caluloPanelLayout.setHorizontalGroup(
            caluloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caluloPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(caluloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caluloNum)
                    .addComponent(caluloYS))
                .addGap(30, 30, 30))
            .addGroup(caluloPanelLayout.createSequentialGroup()
                .addGroup(caluloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(caluloPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(caluloName))
                    .addGroup(caluloPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(caluloPic, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        caluloPanelLayout.setVerticalGroup(
            caluloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(caluloPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(caluloPic, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caluloName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caluloYS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caluloNum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abt1Layout = new javax.swing.GroupLayout(abt1);
        abt1.setLayout(abt1Layout);
        abt1Layout.setHorizontalGroup(
            abt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abt1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(albaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(belonioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caluloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        abt1Layout.setVerticalGroup(
            abt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abt1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(abt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abt1Layout.createSequentialGroup()
                        .addComponent(albaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(abt1Layout.createSequentialGroup()
                        .addGroup(abt1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(belonioPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caluloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))))
        );

        sandiegoName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sandiegoName.setText("Neil Allen H. Sandiego");

        sandiegoYS.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sandiegoYS.setText("BSM CS 2A - G1");

        sandiegoNum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        sandiegoNum.setText("0923-236-5987");

        sandiegoPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SanDiego.jpeg"))); // NOI18N
        sandiegoPic.setText("Neil");

        javax.swing.GroupLayout sandiegoPanelLayout = new javax.swing.GroupLayout(sandiegoPanel);
        sandiegoPanel.setLayout(sandiegoPanelLayout);
        sandiegoPanelLayout.setHorizontalGroup(
            sandiegoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sandiegoPanelLayout.createSequentialGroup()
                .addGroup(sandiegoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sandiegoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sandiegoName))
                    .addGroup(sandiegoPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(sandiegoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sandiegoYS)
                            .addComponent(sandiegoNum)))
                    .addGroup(sandiegoPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(sandiegoPic, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sandiegoPanelLayout.setVerticalGroup(
            sandiegoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sandiegoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sandiegoPic, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sandiegoName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sandiegoYS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sandiegoNum)
                .addContainerGap())
        );

        rosalName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rosalName.setText("Ramil Angelo Jan M. Rosal");

        rosalYS.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rosalYS.setText("BSM CS 2A - G1");

        rosalNum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rosalNum.setText("0969-326-9501");

        rosalPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Rosal.png"))); // NOI18N
        rosalPic.setText("Jelo");

        javax.swing.GroupLayout rosalPanelLayout = new javax.swing.GroupLayout(rosalPanel);
        rosalPanel.setLayout(rosalPanelLayout);
        rosalPanelLayout.setHorizontalGroup(
            rosalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rosalPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(rosalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rosalPanelLayout.createSequentialGroup()
                        .addComponent(rosalName)
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rosalPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(rosalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rosalNum)
                            .addComponent(rosalYS)
                            .addComponent(rosalPic, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))))
        );
        rosalPanelLayout.setVerticalGroup(
            rosalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rosalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rosalPic, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rosalName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rosalYS, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rosalNum)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout abt2Layout = new javax.swing.GroupLayout(abt2);
        abt2.setLayout(abt2Layout);
        abt2Layout.setHorizontalGroup(
            abt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, abt2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(rosalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(sandiegoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        abt2Layout.setVerticalGroup(
            abt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abt2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abt2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sandiegoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rosalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        prstt.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        prstt.setText("Presented To:");

        engrName.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        engrName.setText("Engr. Evelyn C. Samson");

        engrCareer.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        engrCareer.setText("Instructor, MCS 203");

        javax.swing.GroupLayout engrPanelLayout = new javax.swing.GroupLayout(engrPanel);
        engrPanel.setLayout(engrPanelLayout);
        engrPanelLayout.setHorizontalGroup(
            engrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(engrPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(engrName)
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, engrPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(engrCareer)
                .addGap(31, 31, 31))
        );
        engrPanelLayout.setVerticalGroup(
            engrPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(engrPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(engrName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(engrCareer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        help.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        help.setText(" Help");

        mainMenu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        mainMenu.setText("Main Menu");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setText("Reservation");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel24.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel24.setText("2.  jhcfdsnbcvsmh gngf");
        jLabel24.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setText("1. bfkdsbvdjbv jkfvn xcn mjkn m ");
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel26.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel26.setText("2.  jhcfdsnbcvsmh gngf");
        jLabel26.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel27.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel27.setText("1. bfkdsbvdjbv jkfvn xcn mjkn m ");
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel28.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel28.setText("2.  jhcfdsnbcvsmh gngf");
        jLabel28.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel29.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel29.setText("1. bfkdsbvdjbv jkfvn xcn mjkn m ");
        jLabel29.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel30.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel30.setText("Report");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(engrPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel30)))
                            .addComponent(abt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(help, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(abt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(671, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(about)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prstb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(abt1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(abt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(prstt)
                .addGap(2, 2, 2)
                .addComponent(engrPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addComponent(help)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainMenu)
                .addGap(0, 0, 0)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addGap(18, 18, 18)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addGap(99, 99, 99))
        );

        jScrollPane1.setViewportView(mainPanel);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
        setSize(600,400);
        
             
    }
    
}