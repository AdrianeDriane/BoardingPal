/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package boardingpal;

import static boardingpal.LaunchApp.loggedInUser;
import boardingpal.Profiledrop;
import boardingpal.models.BedSpace;
import boardingpal.models.User;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

/**
 *
 * @author Gil
 */
public class Bedspace2 extends javax.swing.JFrame {
    boolean isOwnedByUser = false;
    BedSpace bedspace;
    
    Profiledrop profileNav = new Profiledrop();
    public boolean isProfileNavDropped = false;
        

    /**
     * Creates new form Bedspace2
     */
    public Bedspace2() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public Bedspace2(boolean isOwnedByUser) {
        this.isOwnedByUser = isOwnedByUser;
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public Bedspace2(boolean isOwnedByUser, BedSpace bedspace) {
        this.bedspace = bedspace;
        this.isOwnedByUser = isOwnedByUser;
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        fButton2 = new boardingPal.FButton();
        bedspaceName = new javax.swing.JLabel();
        bedspaceAddress = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        numberOfOccupants = new javax.swing.JLabel();
        isAircon = new javax.swing.JLabel();
        sizePerSqm = new javax.swing.JLabel();
        monthlyFee = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        fButton1 = new boardingPal.FButton();
        jLabel19 = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        bedspaceImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Bed Space");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 120, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Roommate");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(551, 21, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel12.setText("Boarding");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("Pal");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("___________________");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, 9));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/message.png"))); // NOI18N
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, -1, 40));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/bell (1).png"))); // NOI18N
        jLabel24.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel24.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 30, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, -1, 55));

        jLabel25.setBackground(new java.awt.Color(255, 51, 51));
        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 51));
        jLabel25.setText("4");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 20, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/AdrianeDilaoSmallNavbarIcon.png"))); // NOI18N
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, -1, -1));

        jLabel35.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel35.setText(loggedInUser.getFullName());
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, -1, 32));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/down-arrow.png"))); // NOI18N
        jLabel36.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 30, -1, -1));

        fButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/arrow-left.png"))); // NOI18N
        fButton2.setFillClick(new java.awt.Color(255, 255, 255));
        fButton2.setFillOriginal(new java.awt.Color(255, 255, 255));
        fButton2.setFillOver(new java.awt.Color(255, 255, 255));
        fButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        fButton2.setLineOriginal(new java.awt.Color(204, 204, 204));
        fButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fButton2MouseClicked(evt);
            }
        });

        bedspaceName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        bedspaceName.setText(bedspace.getBedspaceName());

        bedspaceAddress.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        bedspaceAddress.setForeground(new java.awt.Color(153, 153, 153));
        bedspaceAddress.setText(bedspace.getAddress());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setText("Details");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Monthly Fee");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Size");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Aircon");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Occupants");

        numberOfOccupants.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        numberOfOccupants.setText(String.valueOf(bedspace.getOccupants()));

        isAircon.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        isAircon.setText(bedspace.isAirconditioned() ? "Yes" : "No");

        sizePerSqm.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        sizePerSqm.setText(String.valueOf(bedspace.getSizePerSqm()) + " sqm");

        monthlyFee.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        monthlyFee.setText("₱ " + bedspace.getMonthlyFee());

        jLabel37.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel37.setText("Your Roommates");

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/Ellipse 3 (2).png"))); // NOI18N

        jLabel38.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel38.setText("Annette Black");

        jLabel43.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(153, 153, 153));
        jLabel43.setText("24  -  Male ");

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/Ellipse 4 (1).png"))); // NOI18N

        jLabel39.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel39.setText("Annette Black");

        jLabel42.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(153, 153, 153));
        jLabel42.setText("24  -  Female ");

        fButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/ArrowRight.png"))); // NOI18N
        fButton1.setText("Get in touch");
        fButton1.setFillClick(new java.awt.Color(0, 0, 0));
        fButton1.setFillOver(new java.awt.Color(0, 0, 0));
        fButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        fButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        fButton1.setIconTextGap(10);
        fButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Address");

        address.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        address.setText(bedspace.getAddress());

        bedspaceImg.setMaximumSize(new java.awt.Dimension(360, 300));
        bedspaceImg.setMinimumSize(new java.awt.Dimension(360, 300));
        bedspaceImg.setPreferredSize(new java.awt.Dimension(360, 300));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(fButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(bedspaceAddress))
                    .addComponent(bedspaceName))
                .addGap(544, 544, 544)
                .addComponent(fButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(bedspaceImg, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monthlyFee)
                    .addComponent(sizePerSqm)
                    .addComponent(isAircon)
                    .addComponent(numberOfOccupants)
                    .addComponent(address))
                .addGap(193, 193, 193)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel43)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel42)))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(fButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(bedspaceAddress))
                    .addComponent(bedspaceName)
                    .addComponent(fButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel16)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel15)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel17)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel18)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(monthlyFee)
                        .addGap(12, 12, 12)
                        .addComponent(sizePerSqm)
                        .addGap(12, 12, 12)
                        .addComponent(isAircon)
                        .addGap(12, 12, 12)
                        .addComponent(numberOfOccupants)
                        .addGap(12, 12, 12)
                        .addComponent(address))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel37)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel43)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel42))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(bedspaceImg, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(201, Short.MAX_VALUE))
        );

        SwingUtilities.invokeLater(() -> {
            // Get the dimensions of the JLabel after it has been rendered
            int width = bedspaceImg.getWidth();
            int height = bedspaceImg.getHeight();

            // Check if dimensions are valid
            if (width > 0 && height > 0) {
                String imageUrl = "/boardingpal/img/browseBedspace/" + bedspace.getId() + ".png";
                ImageIcon icon = new ImageIcon(getClass().getResource(imageUrl));

                // Scale the image to the JLabel's size
                Image image = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
                bedspaceImg.setIcon(new ImageIcon(image)); // Set the scaled image as the icon
            } else {
                System.err.println("JLabel dimensions not available!");
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fButton2MouseClicked
        LoggedIn loginFrame = new LoggedIn();
        loginFrame.setVisible(true);
        loginFrame.pack();
        loginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_fButton2MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        if(!isProfileNavDropped){
            isProfileNavDropped = true;
            profileNav.setVisible(true);
            profileNav.pack();
        } else {
            isProfileNavDropped = false;
            profileNav.dispose();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel36MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bedspace2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bedspace2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bedspace2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bedspace2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bedspace2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel bedspaceAddress;
    private javax.swing.JLabel bedspaceImg;
    private javax.swing.JLabel bedspaceName;
    private boardingPal.FButton fButton1;
    private boardingPal.FButton fButton2;
    private javax.swing.JLabel isAircon;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel monthlyFee;
    private javax.swing.JLabel numberOfOccupants;
    private javax.swing.JLabel sizePerSqm;
    // End of variables declaration//GEN-END:variables
}
