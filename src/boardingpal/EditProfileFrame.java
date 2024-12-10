/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package boardingpal;

import java.awt.geom.RoundRectangle2D;
import static boardingpal.LaunchApp.loggedInUser;
import java.time.LocalDate;
/**
 *
 * @author Jan
 */
public class EditProfileFrame extends javax.swing.JFrame {

    boolean isOwnedByUser = false;
    /**
     * Creates new form
     */
    public EditProfileFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public EditProfileFrame(boolean isOwnedByUser) {
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

        jPanel2 = new javax.swing.JPanel();
        fButton2 = new boardingPal.FButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        fButton1 = new boardingPal.FButton();
        nameTf = new javax.swing.JTextField();
        ageTf = new javax.swing.JTextField();
        birthdateTf = new javax.swing.JTextField();
        genderTf = new javax.swing.JTextField();
        residenceStatusTf = new javax.swing.JTextField();
        occupationTf = new javax.swing.JTextField();
        nationalityTf = new javax.swing.JTextField();
        religionTf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        aboutTa = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel3.setText("About");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel8.setText("Roommate Details");

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Name");

        jLabel20.setBackground(new java.awt.Color(153, 153, 153));
        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Age");

        jLabel21.setBackground(new java.awt.Color(153, 153, 153));
        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Birthdate");

        jLabel22.setBackground(new java.awt.Color(153, 153, 153));
        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Gender");

        jLabel31.setBackground(new java.awt.Color(153, 153, 153));
        jLabel31.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("Resident Status");

        jLabel32.setBackground(new java.awt.Color(153, 153, 153));
        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 102, 102));
        jLabel32.setText("Occupation");

        jLabel33.setBackground(new java.awt.Color(153, 153, 153));
        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33.setText("Nationality");

        jLabel34.setBackground(new java.awt.Color(153, 153, 153));
        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(102, 102, 102));
        jLabel34.setText("Religion");

        fButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/ArrowRight.png"))); // NOI18N
        fButton1.setText("Approve changes\n");
        fButton1.setActionCommand(isOwnedByUser ? "Edit Profile" : "Get in touch");
        fButton1.setFillClick(new java.awt.Color(0, 0, 0));
        fButton1.setFillOver(new java.awt.Color(0, 0, 0));
        fButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        fButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        fButton1.setIconTextGap(10);
        fButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        fButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fButton1MouseClicked(evt);
            }
        });
        fButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fButton1ActionPerformed(evt);
            }
        });

        nameTf.setText(loggedInUser.getFullName());
        nameTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTfActionPerformed(evt);
            }
        });

        ageTf.setText(String.valueOf(loggedInUser.getAge()));
        ageTf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTfActionPerformed(evt);
            }
        });

        birthdateTf.setText(loggedInUser.getBirthdate().toString());

        genderTf.setText(loggedInUser.getGender());

        residenceStatusTf.setText(loggedInUser.getResidenceStatus());

        occupationTf.setText(loggedInUser.getOccupation());

        nationalityTf.setText(loggedInUser.getNationality());

        religionTf.setText(loggedInUser.getReligion());

        aboutTa.setColumns(20);
        aboutTa.setRows(5);
        aboutTa.setText(loggedInUser.getAbout());
        jScrollPane1.setViewportView(aboutTa);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(fButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(543, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(fButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel34))
                                .addGap(94, 94, 94)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameTf, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(ageTf)
                                    .addComponent(birthdateTf)
                                    .addComponent(genderTf)
                                    .addComponent(residenceStatusTf)
                                    .addComponent(occupationTf)
                                    .addComponent(nationalityTf)
                                    .addComponent(religionTf))))
                        .addGap(50, 50, 50))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(nameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(ageTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(birthdateTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(genderTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(residenceStatusTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel31)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(occupationTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(nationalityTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(religionTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 180, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fButton1ActionPerformed

    private void fButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fButton1MouseClicked
        if(isOwnedByUser) {
            loggedInUser.setFullName(nameTf.getText());
            loggedInUser.setAge(Integer.parseInt(ageTf.getText()));
            loggedInUser.setBirthdate(LocalDate.parse(birthdateTf.getText()));
            loggedInUser.setGender(genderTf.getText());
            loggedInUser.setResidenceStatus(residenceStatusTf.getText());
            loggedInUser.setOccupation(occupationTf.getText());
            loggedInUser.setNationality(nationalityTf.getText());
            loggedInUser.setReligion(religionTf.getText());
            loggedInUser.setAbout(aboutTa.getText());
            
            ProfileFrame profileFrame = new ProfileFrame(isOwnedByUser);
            profileFrame.setVisible(true);
            profileFrame.setLocationRelativeTo(null);
            profileFrame.pack();
            this.dispose();
        } else {

        }
    }//GEN-LAST:event_fButton1MouseClicked

    private void nameTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTfActionPerformed

    private void ageTfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTfActionPerformed

    private void fButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fButton2MouseClicked
        ProfileFrame profileFrame = new ProfileFrame(isOwnedByUser);
        profileFrame.setVisible(true);
        profileFrame.setLocationRelativeTo(null);
        profileFrame.pack();
        this.dispose();
    }//GEN-LAST:event_fButton2MouseClicked

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
            java.util.logging.Logger.getLogger(EditProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProfileFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProfileFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea aboutTa;
    private javax.swing.JTextField ageTf;
    private javax.swing.JTextField birthdateTf;
    private boardingPal.FButton fButton1;
    private boardingPal.FButton fButton2;
    private javax.swing.JTextField genderTf;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTf;
    private javax.swing.JTextField nationalityTf;
    private javax.swing.JTextField occupationTf;
    private javax.swing.JTextField religionTf;
    private javax.swing.JTextField residenceStatusTf;
    // End of variables declaration//GEN-END:variables
}
