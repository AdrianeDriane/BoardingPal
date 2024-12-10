
package boardingpal;

import static boardingpal.LaunchApp.users;
import boardingpal.models.User;
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

        tfmail = new boardingpal.RoundTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        signUpButton = new boardingPal.FButton();
        jLabel7 = new javax.swing.JLabel();
        tfConfirmPassword = new boardingpal.RoundTextField();
        tfPassword = new boardingpal.RoundTextField();
        jLabel10 = new javax.swing.JLabel();
        tfFullName = new boardingpal.RoundTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        signUpButton.setText("Sign Up");
        signUpButton.setFillClick(new java.awt.Color(0, 0, 0));
        signUpButton.setFillOver(new java.awt.Color(0, 0, 0));
        signUpButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("Pal");

        tfConfirmPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 20, 15, 20));
        tfConfirmPassword.setForeground(new java.awt.Color(153, 153, 153));
        tfConfirmPassword.setText("Confirm your password");
        tfConfirmPassword.setFillColor(new java.awt.Color(255, 255, 255));
        tfConfirmPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfConfirmPassword.setLineColor(new java.awt.Color(153, 153, 153));
        tfConfirmPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfConfirmPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfConfirmPasswordFocusLost(evt);
            }
        });
        tfConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfConfirmPasswordActionPerformed(evt);
            }
        });

        tfPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 20, 15, 20));
        tfPassword.setForeground(new java.awt.Color(153, 153, 153));
        tfPassword.setText("Enter your password");
        tfPassword.setFillColor(new java.awt.Color(255, 255, 255));
        tfPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfPassword.setLineColor(new java.awt.Color(153, 153, 153));
        tfPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPasswordFocusLost(evt);
            }
        });
        tfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPasswordActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Password");

        tfFullName.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 20, 15, 20));
        tfFullName.setForeground(new java.awt.Color(153, 153, 153));
        tfFullName.setText("Enter your full name");
        tfFullName.setFillColor(new java.awt.Color(255, 255, 255));
        tfFullName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfFullName.setLineColor(new java.awt.Color(153, 153, 153));
        tfFullName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfFullNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfFullNameFocusLost(evt);
            }
        });
        tfFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFullNameActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Enter Full Name");

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
                                    .addComponent(tfmail, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(416, 416, 416)
                                        .addComponent(jLabel2))
                                    .addComponent(tfConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Login))
                                    .addComponent(tfFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addComponent(Close))))
                .addContainerGap(57, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Login))
                .addGap(73, 73, 73))
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

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        String email = tfmail.getText();
        String password = tfPassword.getText();
        String fullName = tfFullName.getText();
        
        users.add(new User(email, password, fullName));
        
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
    }//GEN-LAST:event_signUpButtonActionPerformed

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

    private void tfConfirmPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfConfirmPasswordFocusGained
        if(tfConfirmPassword.getText().equals("Confirm your password")){
            tfConfirmPassword.setText("");
            tfConfirmPassword.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_tfConfirmPasswordFocusGained

    private void tfConfirmPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfConfirmPasswordFocusLost
        if(tfConfirmPassword.getText().equals("")){
            tfConfirmPassword.setText("Confirm your password");
            tfConfirmPassword.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_tfConfirmPasswordFocusLost

    private void tfConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfConfirmPasswordActionPerformed

    private void tfPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPasswordFocusGained
        if(tfPassword.getText().equals("Enter your password")){
            tfPassword.setText("");
            tfPassword.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_tfPasswordFocusGained

    private void tfPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPasswordFocusLost
        if(tfPassword.getText().equals("")){
            tfPassword.setText("Enter your password");
            tfPassword.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_tfPasswordFocusLost

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordActionPerformed

    private void tfFullNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfFullNameFocusGained
        if(tfFullName.getText().equals("Enter your full name")){
            tfFullName.setText("");
            tfFullName.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_tfFullNameFocusGained

    private void tfFullNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfFullNameFocusLost
        if(tfFullName.getText().equals("")){
            tfFullName.setText("Enter your full name");
            tfFullName.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_tfFullNameFocusLost

    private void tfFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFullNameActionPerformed

 
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private boardingPal.FButton signUpButton;
    private boardingpal.RoundTextField tfConfirmPassword;
    private boardingpal.RoundTextField tfFullName;
    private boardingpal.RoundTextField tfPassword;
    private boardingpal.RoundTextField tfmail;
    // End of variables declaration//GEN-END:variables
}
