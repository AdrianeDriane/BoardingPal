/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package boardingpal;

import java.awt.geom.RoundRectangle2D;
import static boardingpal.BoardingPal.loggedInUser;
import boardingpal.models.BedSpace;
import boardingpal.models.User;
import java.awt.Image;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Gil
 */
public class LoggedIn extends javax.swing.JFrame {
    public String bedspace1;
    public String bedspace2;
    public String bedspace3;
    
    Profiledrop profileNav = new Profiledrop();
    public boolean isProfileNavDropped = false;
    /**
     * Creates new form LoggedIn
     */
    public LoggedIn() {
        initComponents();
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 40, 40));
        populateBedSpaceCards();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        roundTextField1 = new boardingpal.RoundTextField();
        fButton1 = new boardingPal.FButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        profileNavButton = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bsImg2 = new javax.swing.JLabel();
        bsName2 = new javax.swing.JLabel();
        bsAddress2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        card2Owner = new javax.swing.JLabel();
        card2NoOfRoommates = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        bsImg1 = new javax.swing.JLabel();
        bsName1 = new javax.swing.JLabel();
        bsAddress1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        card1Owner = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        card1NoOfRoommates = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        bsImg3 = new javax.swing.JLabel();
        bsName3 = new javax.swing.JLabel();
        bsAddress3 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        card3Owner = new javax.swing.JLabel();
        card3NoOfRoommates = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Back2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 766));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(243, 244, 247));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 56)); // NOI18N
        jLabel1.setText("Browse Bed Space");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jPanel2.setBackground(new java.awt.Color(243, 244, 247));
        jPanel2.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/search.png"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(50, 40, 24, 20);

        roundTextField1.setBackground(new java.awt.Color(135, 135, 135));
        roundTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 55, 15, 55));
        roundTextField1.setForeground(new java.awt.Color(153, 153, 153));
        roundTextField1.setText("Search Location");
        roundTextField1.setFillColor(new java.awt.Color(255, 255, 255));
        roundTextField1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        roundTextField1.setLineColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(roundTextField1);
        roundTextField1.setBounds(30, 20, 980, 60);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 1025, 104));

        fButton1.setForeground(new java.awt.Color(0, 0, 0));
        fButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/filter.png"))); // NOI18N
        fButton1.setText("Filter");
        fButton1.setFillClick(new java.awt.Color(255, 255, 255));
        fButton1.setFillOriginal(new java.awt.Color(255, 255, 255));
        fButton1.setFillOver(new java.awt.Color(255, 255, 255));
        fButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        fButton1.setIconTextGap(12);
        jPanel1.add(fButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 220, 159, 57));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel5.setMaximumSize(new java.awt.Dimension(1306, 69));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Bed Space");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 120, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Roommate");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel12.setText("Boarding");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 0, 0));
        jLabel13.setText("Pal");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/message.png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, 30, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/bell (1).png"))); // NOI18N
        jLabel24.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel24.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 20, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, -1, 49));

        jLabel25.setBackground(new java.awt.Color(255, 51, 51));
        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 51));
        jLabel25.setText("4");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 10, -1));

        jLabel35.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel35.setText(loggedInUser.getFullName());
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, -1, 32));

        profileNavButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/down-arrow.png"))); // NOI18N
        profileNavButton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        profileNavButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileNavButtonMouseClicked(evt);
            }
        });
        jPanel5.add(profileNavButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 30, -1, 24));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("___________________");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, 9));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/AdrianeDilaoSmallNavbarIcon.png"))); // NOI18N
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        bsName2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        bsAddress2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bsAddress2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setToolTipText("");
        jLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("No. of Roommates");

        card2NoOfRoommates.setText("1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bsImg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bsAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsName2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 17, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGap(148, 148, 148)
                .addComponent(card2NoOfRoommates, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(card2Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(bsImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bsName2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bsAddress2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(card2NoOfRoommates))
                    .addComponent(card2Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 350, 360));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        bsName1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        bsAddress1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bsAddress1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setToolTipText("");
        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("No. of Roommates");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setToolTipText("");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        card1NoOfRoommates.setText("1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bsImg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel19)
                        .addGap(135, 135, 135)
                        .addComponent(card1NoOfRoommates, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(card1Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bsAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bsName1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(11, 11, 11))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(bsImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bsName1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bsAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(card1NoOfRoommates))
                    .addComponent(card1Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 350, 360));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        bsName3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N

        bsAddress3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bsAddress3.setForeground(new java.awt.Color(102, 102, 102));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(204, 204, 204));
        jLabel27.setToolTipText("");
        jLabel27.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(102, 102, 102));
        jLabel28.setText("No. of Roommates");

        card3NoOfRoommates.setText("1");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bsImg3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel28)
                        .addGap(148, 148, 148)
                        .addComponent(card3NoOfRoommates, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card3Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bsName3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bsAddress3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(bsImg3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bsName3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bsAddress3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28)
                        .addComponent(card3NoOfRoommates))
                    .addComponent(card3Owner, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, 350, 360));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/right-chevron-.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 480, -1, -1));

        Back2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/next.png"))); // NOI18N
        Back2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back2MouseClicked(evt);
            }
        });
        jPanel1.add(Back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static BedSpace findBedspaceById(String id) {
        for (BedSpace bedspace : BoardingPal.bedspaces) {
            if (bedspace.getId().equals(id)) {
                return bedspace; // Return the user if the fullName matches
            }
        }
        return null; // Return null if no user with the given fullName is found
    }
    
    private void NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseClicked
        Roommate roommateFrame = new Roommate();
        roommateFrame.setVisible(true);
        roommateFrame.pack();
        roommateFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_NextMouseClicked

    private void Next1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Next1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Next1MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        
    }//GEN-LAST:event_jLabel36MouseClicked

    private void profileNavButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileNavButtonMouseClicked
        if(!isProfileNavDropped){
            isProfileNavDropped = true;
            profileNav.setVisible(true);
            profileNav.pack();
        } else {
            isProfileNavDropped = false;
            profileNav.dispose();
        }
    }//GEN-LAST:event_profileNavButtonMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        RoommateUi2 browseRoommates = new RoommateUi2();
        browseRoommates.setVisible(true);
        browseRoommates.pack();
        browseRoommates.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        populateBedSpaceCards();
    }//GEN-LAST:event_jLabel17MouseClicked

    private void Back2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back2MouseClicked
        populateBedSpaceCards();
    }//GEN-LAST:event_Back2MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        Bedspace2 bedspace = new Bedspace2(false, findBedspaceById(bedspace1));
        bedspace.setVisible(true);
        bedspace.pack();
        bedspace.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        Bedspace2 bedspace = new Bedspace2(false, findBedspaceById(bedspace2));
        bedspace.setVisible(true);
        bedspace.pack();
        bedspace.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        Bedspace2 bedspace = new Bedspace2(false, findBedspaceById(bedspace3));
        bedspace.setVisible(true);
        bedspace.pack();
        bedspace.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        ChatFrame chatFrame = new ChatFrame(true);
        chatFrame.setVisible(true);
        chatFrame.pack();
        chatFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel23MouseClicked
    
    public void populateBedSpaceCards(){
        Collections.shuffle(BoardingPal.bedspaces);
        
        List<BedSpace> randomBedSpaces;
        randomBedSpaces = BoardingPal.bedspaces.subList(0, Math.min(3, BoardingPal.bedspaces.size()));
        
        if (randomBedSpaces.contains(BoardingPal.loggedInUser.getBedspace())) {
            populateBedSpaceCards(); // Rerun the method if the logged-in user is included
            return; // Exit the current execution to prevent further processing
        }
        
        JLabel[] bedspaceImages = {bsImg1, bsImg2, bsImg3};
        JLabel[] bedspaceName = {bsName1, bsName2, bsName3};
        JLabel[] bedspaceAddress = {bsAddress1, bsAddress2, bsAddress3};
        JLabel[] bedspaceOwnerImg = {card1Owner, card2Owner, card3Owner};
        JLabel[] bedspaceNoOfRm = {card1NoOfRoommates, card2NoOfRoommates, card3NoOfRoommates};
    
        for (int i = 0; i < Math.min(3, randomBedSpaces.size()); i++) {
            BedSpace bedspace = randomBedSpaces.get(i); // Avoid multiple calls to randomUsers.get(i)

            // Construct image URL and scale the image to fit the JLabel size
            String imageUrl = "/boardingpal/img/browseBedspace/" + bedspace.getId() + ".png";
            ImageIcon icon = new ImageIcon(getClass().getResource(imageUrl));

            // Scale the image to the JLabel's size
            Image image = icon.getImage().getScaledInstance(bedspaceImages[i].getWidth(), bedspaceImages[i].getHeight(), Image.SCALE_SMOOTH);
            bedspaceImages[i].setIcon(new ImageIcon(image)); // Set the scaled image as the icon
            
            switch(i){
                case 0 -> {
                    bedspace1 = bedspace.getId();
                }
                case 1 -> {
                    bedspace2 = bedspace.getId();
                }
                case 2 -> {
                    bedspace3 = bedspace.getId();
                }
            }
            // Set text and subtext
            String ownerImageUrl = "/boardingpal/img/browseBoardmates/" + bedspace.getIsOwnedBy().getImageUrl()+ "BoardMateFind.png";
            ImageIcon ownerIcon = new ImageIcon(getClass().getResource(ownerImageUrl));

            // Scale the image to the JLabel's size
            Image ownerImage = ownerIcon.getImage().getScaledInstance(bedspaceOwnerImg[i].getWidth(), bedspaceOwnerImg[i].getHeight(), Image.SCALE_SMOOTH);
            bedspaceOwnerImg[i].setIcon(new ImageIcon(ownerImage));
            
            bedspaceName[i].setText(bedspace.getBedspaceName());
            bedspaceAddress[i].setText(bedspace.getAddress());
            bedspaceNoOfRm[i].setText(String.valueOf(bedspace.getRoommates().size()));
        }
    }
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
            java.util.logging.Logger.getLogger(LoggedIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoggedIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoggedIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoggedIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoggedIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back2;
    private javax.swing.JLabel bsAddress1;
    private javax.swing.JLabel bsAddress2;
    private javax.swing.JLabel bsAddress3;
    private javax.swing.JLabel bsImg1;
    private javax.swing.JLabel bsImg2;
    private javax.swing.JLabel bsImg3;
    private javax.swing.JLabel bsName1;
    private javax.swing.JLabel bsName2;
    private javax.swing.JLabel bsName3;
    private javax.swing.JLabel card1NoOfRoommates;
    private javax.swing.JLabel card1Owner;
    private javax.swing.JLabel card2NoOfRoommates;
    private javax.swing.JLabel card2Owner;
    private javax.swing.JLabel card3NoOfRoommates;
    private javax.swing.JLabel card3Owner;
    private boardingPal.FButton fButton1;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel profileNavButton;
    private boardingpal.RoundTextField roundTextField1;
    // End of variables declaration//GEN-END:variables
}
