/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package boardingpal;

import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author Gil
 */
public class Login extends javax.swing.JFrame {
    LaunchApp overlay;
    
    public Login() {
        initComponents();
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 40, 40));
    }
    
    public Login(LaunchApp overlay) {
        initComponents();
        getContentPane().setBackground(Color.white);
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 40, 40));
        this.overlay = overlay;
    }
     

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfemail = new boardingpal.RoundTextField();
        LoginB = new boardingPal.FButton();
        jLabel5 = new javax.swing.JLabel();
        SignUp = new javax.swing.JLabel();
        forgotpass = new javax.swing.JLabel();
        fButton2 = new boardingPal.FButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fButton3 = new boardingPal.FButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        passField = new boardingpal.RoundTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(0, 0));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(551, 720));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 30)); // NOI18N
        jLabel1.setText("Welcome to Boarding");
        jLabel1.setIconTextGap(-1);

        Close.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/close.png"))); // NOI18N
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Email or phone number");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Password");

        tfemail.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 20, 15, 20));
        tfemail.setForeground(new java.awt.Color(153, 153, 153));
        tfemail.setText("Enter your email or phone number");
        tfemail.setFillColor(new java.awt.Color(255, 255, 255));
        tfemail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfemail.setLineColor(new java.awt.Color(153, 153, 153));
        tfemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfemailFocusLost(evt);
            }
        });
        tfemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfemailActionPerformed(evt);
            }
        });

        LoginB.setText("Login");
        LoginB.setFillClick(new java.awt.Color(0, 0, 0));
        LoginB.setFillOver(new java.awt.Color(0, 0, 0));
        LoginB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LoginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Don't have an account?");

        SignUp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SignUp.setForeground(new java.awt.Color(204, 0, 0));
        SignUp.setText("Sign Up");
        SignUp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        SignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpMouseClicked(evt);
            }
        });

        forgotpass.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        forgotpass.setText("Forgot Password?");
        forgotpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        forgotpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotpassMouseClicked(evt);
            }
        });

        fButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/Facebook.png"))); // NOI18N
        fButton2.setText("Continue with Facebook");
        fButton2.setFillClick(new java.awt.Color(51, 102, 255));
        fButton2.setFillOriginal(new java.awt.Color(0, 102, 255));
        fButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fButton2.setIconTextGap(20);
        fButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 51));
        jLabel8.setText("or");

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 51));
        jLabel9.setText("Pal");

        fButton3.setForeground(new java.awt.Color(0, 0, 0));
        fButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/Google.png"))); // NOI18N
        fButton3.setText("Continue with Google");
        fButton3.setFillClick(new java.awt.Color(255, 255, 255));
        fButton3.setFillOriginal(new java.awt.Color(255, 255, 255));
        fButton3.setFillOver(new java.awt.Color(255, 255, 255));
        fButton3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fButton3.setIconTextGap(30);
        fButton3.setLineOriginal(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/weui_eyes-off-outlined.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(320, 16, 30, 30);

        passField.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 20, 15, 20));
        passField.setForeground(new java.awt.Color(153, 153, 153));
        passField.setText("Enter your password");
        passField.setFillColor(new java.awt.Color(255, 255, 255));
        passField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        passField.setLineColor(new java.awt.Color(153, 153, 153));
        passField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFieldFocusLost(evt);
            }
        });
        jPanel1.add(passField);
        passField.setBounds(10, 10, 370, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfemail, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                                .addComponent(LoginB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Close)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)
                                        .addComponent(jLabel8)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(SignUp))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(forgotpass))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel9))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Close)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9))
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginB, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(SignUp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forgotpass)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked

    this.dispose();
    overlay.dispose();
       
       
    }//GEN-LAST:event_CloseMouseClicked

    private void tfemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfemailActionPerformed
       
    }//GEN-LAST:event_tfemailActionPerformed

    private void tfemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfemailFocusGained
         if(tfemail.getText().equals("Enter your email or phone number")){
            tfemail.setText("");
            tfemail.setBackground(new Color(153,153,153));
            
        }
    }//GEN-LAST:event_tfemailFocusGained

    private void tfemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfemailFocusLost
         if(tfemail.getText().equals("")){
            tfemail.setText("Enter your email or phone number");
            tfemail.setBackground(new Color(153,153,153));
            
        }
    }//GEN-LAST:event_tfemailFocusLost

    private void passFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFieldFocusGained
       if(passField.getText().equals("Enter your password")){
            passField.setText("");
            passField.setBackground(new Color(153,153,153));
            
        }
    }//GEN-LAST:event_passFieldFocusGained

    private void passFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFieldFocusLost
       if(passField.getText().equals("")){
            passField.setText("Enter your password");
            passField.setBackground(new Color(153,153,153));
            
        }
    }//GEN-LAST:event_passFieldFocusLost

    private void LoginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBActionPerformed
    LoggedIn loginFrame = new LoggedIn();
    loginFrame.setVisible(true);
    loginFrame.pack();
    loginFrame.setLocationRelativeTo(null);
    this.dispose();
    }//GEN-LAST:event_LoginBActionPerformed

    private void SignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpMouseClicked
    LaunchApp launchAppFrame = new LaunchApp();
    launchAppFrame.setVisible(true);
    launchAppFrame.pack();
    launchAppFrame.setLocationRelativeTo(null);
        
        
    SignUp SignUpFrame = new SignUp(launchAppFrame);
    SignUpFrame.setVisible(true);
    SignUpFrame.pack();
    SignUpFrame.setLocationRelativeTo(null);
    this.dispose();
    overlay.dispose();
    }//GEN-LAST:event_SignUpMouseClicked

    private void forgotpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpassMouseClicked
       LaunchApp forgotPassOverlay = new LaunchApp();
       forgotPassOverlay.setVisible(true);
       forgotPassOverlay.pack();
       forgotPassOverlay.setLocationRelativeTo(null);
     
       ForgotPass forgotPassFrame = new ForgotPass(forgotPassOverlay);
       forgotPassFrame.setVisible(true);
       forgotPassFrame.pack();
       forgotPassFrame.setLocationRelativeTo(null);
       overlay.dispose();
       this.dispose();
       
       
    }//GEN-LAST:event_forgotpassMouseClicked

    private void fButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fButton2ActionPerformed
    
    }//GEN-LAST:event_fButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private boardingPal.FButton LoginB;
    private javax.swing.JLabel SignUp;
    private boardingPal.FButton fButton2;
    private boardingPal.FButton fButton3;
    private javax.swing.JLabel forgotpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private boardingpal.RoundTextField passField;
    private boardingpal.RoundTextField tfemail;
    // End of variables declaration//GEN-END:variables
}
