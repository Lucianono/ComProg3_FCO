
package com.mycompany.bbc_hotelresortreserv;

/*
This class is for Splash Screen JFrame

TODO:
-Splash Screen is the first screen to be seen by the user
-after a short period of time, splash screen will be closed
-Splashscreen should have Logo, Company Name, License, Copyright, ProgressBar
-Logo can be from internet, AI generated, or original
-ProgressBar should depends on seconds before splashscreen to be closed, progressbar is like the "loading"

-BE CREATIVE! BE Mindful on the layouts. Layouts should be responsive
*/

public class SplashScreen extends javax.swing.JFrame {

    
    public SplashScreen() {
        initComponents();
        this.setVisible(true);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Splash Screen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
