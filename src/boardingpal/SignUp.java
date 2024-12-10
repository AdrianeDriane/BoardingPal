
package boardingpal;

import java.awt.Color;
import java.awt.geom.RoundRectangle2D;


public class SignUp extends javax.swing.JFrame {
     LaunchApp overlay;

    public SignUp() {
      
        initComponents();
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 40, 40));
    }
     public SignUp(LaunchApp overlay) {
        initComponents();
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 40, 40));
        this.overlay = overlay;
    }
   
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fButton1 = new boardingPal.FButton();
        tfmail = new boardingpal.RoundTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        fButton2 = new boardingPal.FButton();
        fButton3 = new boardingPal.FButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        roundedPasswordField2 = new boardingpal.RoundedPasswordField();
        roundedPasswordField1 = new boardingpal.RoundedPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        fButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/Facebook.png"))); // NOI18N
        fButton1.setText("Continue with Facebook");
        fButton1.setFillClick(new java.awt.Color(0, 102, 255));
        fButton1.setFillOriginal(new java.awt.Color(0, 102, 255));
        fButton1.setFillOver(new java.awt.Color(0, 102, 255));
        fButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fButton1.setIconTextGap(20);
        fButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fButton1ActionPerformed(evt);
            }
        });

        tfmail.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 20, 15, 20));
        tfmail.setForeground(new java.awt.Color(153, 153, 153));
        tfmail.setText("Enter your email");
        tfmail.setFillColor(new java.awt.Color(255, 255, 255));
        tfmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfmail.setLineColor(new java.awt.Color(153, 153, 153));
        tfmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfmailFocusLost(evt);
            }
        });
        tfmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmailActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Email or phone number");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Password");

        Close.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/close.png"))); // NOI18N
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        jLabel5.setText("Welcome to Boarding");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Already have an account?");

        Login.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Login.setText("Login");
        Login.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setText("or");

        fButton2.setText("Sign Up");
        fButton2.setFillClick(new java.awt.Color(0, 0, 0));
        fButton2.setFillOver(new java.awt.Color(0, 0, 0));
        fButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fButton2ActionPerformed(evt);
            }
        });

        fButton3.setForeground(new java.awt.Color(0, 0, 0));
        fButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/Google.png"))); // NOI18N
        fButton3.setText("Continue with Google");
        fButton3.setFillClick(new java.awt.Color(255, 255, 255));
        fButton3.setFillOriginal(new java.awt.Color(255, 255, 255));
        fButton3.setFillOver(new java.awt.Color(255, 255, 255));
        fButton3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fButton3.setIconTextGap(25);
        fButton3.setInheritsPopupMenu(true);
        fButton3.setLineOriginal(new java.awt.Color(153, 153, 153));
        fButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("Pal");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/weui_eyes-off-outlined.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(390, 20, 40, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/weui_eyes-off-outlined.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(390, 90, 40, 30);

        roundedPasswordField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 20, 15, 20));
        roundedPasswordField2.setLineColor(new java.awt.Color(153, 153, 153));
        roundedPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundedPasswordField2ActionPerformed(evt);
            }
        });
        jPanel1.add(roundedPasswordField2);
        roundedPasswordField2.setBounds(40, 10, 410, 55);

        roundedPasswordField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 20, 15, 20));
        roundedPasswordField1.setLineColor(new java.awt.Color(153, 153, 153));
        roundedPasswordField1.setPlaceholder("  Confirm your password");
        roundedPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundedPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(roundedPasswordField1);
        roundedPasswordField1.setBounds(40, 80, 410, 55);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel5)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(tfmail, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(115, 115, 115)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Login))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(Close)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Close)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfmail, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Login))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(fButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfmailFocusGained
        if(tfmail.getText().equals("Enter your email")){
            tfmail.setText("");
            tfmail.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_tfmailFocusGained

    private void tfmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfmailFocusLost
        if(tfmail.getText().equals("")){
            tfmail.setText("Enter your email");
            tfmail.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_tfmailFocusLost

    private void tfmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmailActionPerformed
        
    }//GEN-LAST:event_tfmailActionPerformed

    private void fButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fButton1ActionPerformed
    
        
        
    
    }//GEN-LAST:event_fButton1ActionPerformed

    private void roundedPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundedPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundedPasswordField1ActionPerformed

    private void roundedPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundedPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundedPasswordField2ActionPerformed

    private void fButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fButton2ActionPerformed

    private void fButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fButton3ActionPerformed

    private void LoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMouseClicked
        
    if(overlay == null){
        LaunchApp launchAppFrame = new LaunchApp("Signup");
        launchAppFrame.setVisible(true);
        launchAppFrame.pack();
        launchAppFrame.setLocationRelativeTo(null);
        overlay.dispose();
    } 
    Login loginFrame = new Login(overlay);
    loginFrame.setVisible(true);
    loginFrame.pack();
    loginFrame.setLocationRelativeTo(null);
   
   
    this.dispose();
    
    
    }//GEN-LAST:event_LoginMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        this.dispose();
        overlay.dispose();
    }//GEN-LAST:event_CloseMouseClicked

 
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Login;
    private boardingPal.FButton fButton1;
    private boardingPal.FButton fButton2;
    private boardingPal.FButton fButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private boardingpal.RoundedPasswordField roundedPasswordField1;
    private boardingpal.RoundedPasswordField roundedPasswordField2;
    private boardingpal.RoundTextField tfmail;
    // End of variables declaration//GEN-END:variables
}
