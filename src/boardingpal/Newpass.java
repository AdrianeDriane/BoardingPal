/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package boardingpal;

import java.awt.Color;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author Gil
 */
public class Newpass extends javax.swing.JFrame {
   
    /**
     * Creates new form Newpass
     */
    public Newpass() {
        initComponents();
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 40, 40));
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Backbut = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfnewpass = new boardingpal.RoundTextField();
        jLabel5 = new javax.swing.JLabel();
        tfconfirmpass = new boardingpal.RoundTextField();
        fButton1 = new boardingPal.FButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        jLabel1.setText("Reset Password");

        Backbut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/arrow (2).png"))); // NOI18N
        Backbut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackbutMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/weui_eyes-off-outlined.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(410, 80, 30, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("New Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 40, 130, 22);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/weui_eyes-off-outlined.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(410, 200, 30, 40);

        tfnewpass.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 20, 15, 20));
        tfnewpass.setForeground(new java.awt.Color(153, 153, 153));
        tfnewpass.setText("Enter your new password");
        tfnewpass.setFillColor(new java.awt.Color(255, 255, 255));
        tfnewpass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfnewpass.setLineColor(new java.awt.Color(153, 153, 153));
        tfnewpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfnewpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfnewpassFocusLost(evt);
            }
        });
        jPanel1.add(tfnewpass);
        tfnewpass.setBounds(40, 70, 437, 61);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Confirm new password");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 150, 202, 22);

        tfconfirmpass.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 20, 15, 20));
        tfconfirmpass.setForeground(new java.awt.Color(153, 153, 153));
        tfconfirmpass.setText("Confirm your password");
        tfconfirmpass.setFillColor(new java.awt.Color(255, 255, 255));
        tfconfirmpass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfconfirmpass.setLineColor(new java.awt.Color(153, 153, 153));
        tfconfirmpass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfconfirmpassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfconfirmpassFocusLost(evt);
            }
        });
        jPanel1.add(tfconfirmpass);
        tfconfirmpass.setBounds(40, 190, 437, 61);

        fButton1.setText("Confirm");
        fButton1.setFillClick(new java.awt.Color(0, 0, 0));
        fButton1.setFillOver(new java.awt.Color(0, 0, 0));
        fButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(fButton1);
        fButton1.setBounds(40, 320, 437, 67);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Backbut))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Backbut)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackbutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackbutMouseClicked
        this.dispose();
      
    }//GEN-LAST:event_BackbutMouseClicked

    private void fButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fButton1ActionPerformed
       
    }//GEN-LAST:event_fButton1ActionPerformed

    private void tfnewpassFocusGained(java.awt.event.FocusEvent evt) {                                      
        if(tfnewpass.getText().equals("Enter your new password")){
            tfnewpass.setText("");
            tfnewpass.setBackground(new Color(153,153,153));
            
        }
    }
     private void tfnewpassFocusLost(java.awt.event.FocusEvent evt) {
        if(tfnewpass.getText().equals("")){
            tfnewpass.setText("Enter your new password");
            tfnewpass.setBackground(new Color(153,153,153));
            
        }
    }
     private void tfconfirmpassFocusGained(java.awt.event.FocusEvent evt) {
       if(tfconfirmpass.getText().equals("Confirm your password")){
            tfconfirmpass.setText("");
            tfconfirmpass.setBackground(new Color(153,153,153));
            
        }
    }



    private void tfconfirmpassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfconfirmpassFocusLost
         if(tfconfirmpass.getText().equals("")){
            tfconfirmpass.setText("Confirm your password");
            tfconfirmpass.setBackground(new Color(153,153,153));
            
        }
    }//GEN-LAST:event_tfconfirmpassFocusLost

   
   
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
            java.util.logging.Logger.getLogger(Newpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Newpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Newpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Newpass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Newpass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backbut;
    private boardingPal.FButton fButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private boardingpal.RoundTextField tfconfirmpass;
    private boardingpal.RoundTextField tfnewpass;
    // End of variables declaration//GEN-END:variables
}
