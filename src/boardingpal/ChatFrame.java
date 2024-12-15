/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package boardingpal;

import static boardingpal.BoardingPal.conversations;
import java.awt.geom.RoundRectangle2D;
import static boardingpal.BoardingPal.loggedInUser;
import boardingpal.models.BedSpace;
import boardingpal.models.Conversation;
import boardingpal.models.User;
import boardingpal.models.Message;
import java.awt.Color;
import java.awt.Image;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author Gil
 */
public class ChatFrame extends javax.swing.JFrame {
    public String bedspace1;
    public String bedspace2;
    public String bedspace3;
    public String bedspace4;
    public String bedspace5;
    public String bedspace6;
        
    List<String> userConversationIds = loggedInUser.getConversationsId();
    
    Profiledrop profileNav = new Profiledrop();
    public boolean isProfileNavDropped = false;
    boolean isOwnedByUser;
    boolean isRequestButtonOpen = false;
    int currentOpenedConvoIndex = -1;
    /**
     * Creates new form LoggedIn
     */
    public ChatFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 40, 40));
        populateConversations();
        setMessageDefaultColor();
    }
    
    public ChatFrame(boolean isOwnedByUser) {
        initComponents();
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 40, 40));
        this.isOwnedByUser = isOwnedByUser;
        populateConversations();
        setMessageDefaultColor();
    }

    public void setMessageDefaultColor() {
        Color fillColor = new Color(243, 244, 247);
        Color lineColor = new Color(243, 244, 247);

        // For left fields
        left1.setFillColor(fillColor);
        left1.setLineColor(lineColor);
        left1.repaint();

        left2.setFillColor(fillColor);
        left2.setLineColor(lineColor);
        left2.repaint();

        left3.setFillColor(fillColor);
        left3.setLineColor(lineColor);
        left3.repaint();

        left4.setFillColor(fillColor);
        left4.setLineColor(lineColor);
        left4.repaint();

        left5.setFillColor(fillColor);
        left5.setLineColor(lineColor);
        left5.repaint();

        left6.setFillColor(fillColor);
        left6.setLineColor(lineColor);
        left6.repaint();

        left7.setFillColor(fillColor);
        left7.setLineColor(lineColor);
        left7.repaint();

        left8.setFillColor(fillColor);
        left8.setLineColor(lineColor);
        left8.repaint();

        left9.setFillColor(fillColor);
        left9.setLineColor(lineColor);
        left9.repaint();

        left10.setFillColor(fillColor);
        left10.setLineColor(lineColor);
        left10.repaint();

        left11.setFillColor(fillColor);
        left11.setLineColor(lineColor);
        left11.repaint();

        left12.setFillColor(fillColor);
        left12.setLineColor(lineColor);
        left12.repaint();

        left13.setFillColor(fillColor);
        left13.setLineColor(lineColor);
        left13.repaint();

        // For right fields
        right1.setFillColor(fillColor);
        right1.setLineColor(lineColor);
        right1.repaint();

        right2.setFillColor(fillColor);
        right2.setLineColor(lineColor);
        right2.repaint();

        right3.setFillColor(fillColor);
        right3.setLineColor(lineColor);
        right3.repaint();

        right4.setFillColor(fillColor);
        right4.setLineColor(lineColor);
        right4.repaint();

        right5.setFillColor(fillColor);
        right5.setLineColor(lineColor);
        right5.repaint();

        right6.setFillColor(fillColor);
        right6.setLineColor(lineColor);
        right6.repaint();

        right7.setFillColor(fillColor);
        right7.setLineColor(lineColor);
        right7.repaint();

        right8.setFillColor(fillColor);
        right8.setLineColor(lineColor);
        right8.repaint();

        right9.setFillColor(fillColor);
        right9.setLineColor(lineColor);
        right9.repaint();

        right10.setFillColor(fillColor);
        right10.setLineColor(lineColor);
        right10.repaint();

        right11.setFillColor(fillColor);
        right11.setLineColor(lineColor);
        right11.repaint();

        right12.setFillColor(fillColor);
        right12.setLineColor(lineColor);
        right12.repaint();

        right13.setFillColor(fillColor);
        right13.setLineColor(lineColor);
        right13.repaint();
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
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        profileNavButton = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fButton1 = new boardingPal.FButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        roundTextField2 = new boardingpal.RoundTextField();
        jPanel6 = new javax.swing.JPanel();
        convo1 = new javax.swing.JPanel();
        convoBsName1 = new javax.swing.JLabel();
        convoLatestC1 = new javax.swing.JLabel();
        convoImg1 = new javax.swing.JLabel();
        convo2 = new javax.swing.JPanel();
        convoBsName2 = new javax.swing.JLabel();
        convoLatestC2 = new javax.swing.JLabel();
        convoImg2 = new javax.swing.JLabel();
        convo3 = new javax.swing.JPanel();
        convoBsName3 = new javax.swing.JLabel();
        convoLatestC3 = new javax.swing.JLabel();
        convoImg3 = new javax.swing.JLabel();
        convo4 = new javax.swing.JPanel();
        convoBsName4 = new javax.swing.JLabel();
        convoLatestC4 = new javax.swing.JLabel();
        convoImg4 = new javax.swing.JLabel();
        convo5 = new javax.swing.JPanel();
        convoBsName5 = new javax.swing.JLabel();
        convoLatestC5 = new javax.swing.JLabel();
        convoImg5 = new javax.swing.JLabel();
        convo6 = new javax.swing.JPanel();
        convoBsName6 = new javax.swing.JLabel();
        convoLatestC6 = new javax.swing.JLabel();
        convoImg6 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        roundTextField14 = new boardingpal.RoundTextField();
        jLabel31 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        left13 = new boardingpal.RoundTextField();
        right13 = new boardingpal.RoundTextField();
        jPanel12 = new javax.swing.JPanel();
        left12 = new boardingpal.RoundTextField();
        right12 = new boardingpal.RoundTextField();
        jPanel13 = new javax.swing.JPanel();
        left11 = new boardingpal.RoundTextField();
        right11 = new boardingpal.RoundTextField();
        jPanel14 = new javax.swing.JPanel();
        left10 = new boardingpal.RoundTextField();
        right10 = new boardingpal.RoundTextField();
        jPanel15 = new javax.swing.JPanel();
        right8 = new boardingpal.RoundTextField();
        left8 = new boardingpal.RoundTextField();
        jPanel16 = new javax.swing.JPanel();
        left9 = new boardingpal.RoundTextField();
        right9 = new boardingpal.RoundTextField();
        jPanel17 = new javax.swing.JPanel();
        left7 = new boardingpal.RoundTextField();
        right7 = new boardingpal.RoundTextField();
        jPanel18 = new javax.swing.JPanel();
        left6 = new boardingpal.RoundTextField();
        right6 = new boardingpal.RoundTextField();
        jPanel21 = new javax.swing.JPanel();
        left5 = new boardingpal.RoundTextField();
        right5 = new boardingpal.RoundTextField();
        jPanel22 = new javax.swing.JPanel();
        left4 = new boardingpal.RoundTextField();
        right4 = new boardingpal.RoundTextField();
        jPanel23 = new javax.swing.JPanel();
        left3 = new boardingpal.RoundTextField();
        right3 = new boardingpal.RoundTextField();
        jPanel28 = new javax.swing.JPanel();
        left2 = new boardingpal.RoundTextField();
        right2 = new boardingpal.RoundTextField();
        jPanel29 = new javax.swing.JPanel();
        left1 = new boardingpal.RoundTextField();
        right1 = new boardingpal.RoundTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 766));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(243, 244, 247));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 768));

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

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/AdrianeDilaoSmallNavbarIcon.png"))); // NOI18N
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, -1, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel7.setMaximumSize(new java.awt.Dimension(1306, 69));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel8.setText("Select Conversation to Continue");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 600, 40));
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel8.setMaximumSize(new java.awt.Dimension(1306, 69));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel4.setText("Select a Conversation");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Select a Conversation");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        fButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/ArrowRight.png"))); // NOI18N
        fButton1.setText("Request to Join");
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

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(fButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(139, 139, 139))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(fButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        fButton1.setVisible(isRequestButtonOpen);

        jPanel9.setBackground(new java.awt.Color(243, 244, 247));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel9.setMaximumSize(new java.awt.Dimension(1306, 69));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel11.setMaximumSize(new java.awt.Dimension(1306, 69));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 32)); // NOI18N
        jLabel1.setText("Messages");
        jPanel11.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/arrow-left.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel11.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 30, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/ell.png"))); // NOI18N
        jPanel11.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 30, 30));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 80));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/boardingpal/img/icons/search.png"))); // NOI18N
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 30, -1));

        roundTextField2.setBackground(new java.awt.Color(135, 135, 135));
        roundTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 55, 15, 55));
        roundTextField2.setForeground(new java.awt.Color(153, 153, 153));
        roundTextField2.setText("Search Messages");
        roundTextField2.setFillColor(new java.awt.Color(255, 255, 255));
        roundTextField2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        roundTextField2.setLineColor(new java.awt.Color(255, 255, 255));
        roundTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundTextField2ActionPerformed(evt);
            }
        });
        jPanel9.add(roundTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 300, 60));

        jPanel6.setBackground(new java.awt.Color(243, 244, 247));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        convo1.setBackground(new java.awt.Color(255, 255, 255));
        convo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convo1MouseClicked(evt);
            }
        });

        convoBsName1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        convoBsName1.setText("Bedspace Name");

        convoLatestC1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        convoLatestC1.setForeground(new java.awt.Color(102, 102, 102));
        convoLatestC1.setText("Bedspace Name");

        convoImg1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        javax.swing.GroupLayout convo1Layout = new javax.swing.GroupLayout(convo1);
        convo1.setLayout(convo1Layout);
        convo1Layout.setHorizontalGroup(
            convo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(convo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(convoImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(convo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(convoLatestC1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convoBsName1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        convo1Layout.setVerticalGroup(
            convo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(convo1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(convo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(convo1Layout.createSequentialGroup()
                        .addComponent(convoBsName1)
                        .addGap(0, 0, 0)
                        .addComponent(convoLatestC1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(convoImg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        convo2.setBackground(new java.awt.Color(255, 255, 255));
        convo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convo2MouseClicked(evt);
            }
        });

        convoBsName2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        convoBsName2.setText("Bedspace Name");

        convoLatestC2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        convoLatestC2.setForeground(new java.awt.Color(102, 102, 102));
        convoLatestC2.setText("Bedspace Name");

        convoImg2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        javax.swing.GroupLayout convo2Layout = new javax.swing.GroupLayout(convo2);
        convo2.setLayout(convo2Layout);
        convo2Layout.setHorizontalGroup(
            convo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(convo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(convoImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(convo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(convoLatestC2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convoBsName2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        convo2Layout.setVerticalGroup(
            convo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(convo2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(convo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(convo2Layout.createSequentialGroup()
                        .addComponent(convoBsName2)
                        .addGap(0, 0, 0)
                        .addComponent(convoLatestC2)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(convoImg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        convo3.setBackground(new java.awt.Color(255, 255, 255));
        convo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convo3MouseClicked(evt);
            }
        });

        convoBsName3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        convoBsName3.setText("Bedspace Name");

        convoLatestC3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        convoLatestC3.setForeground(new java.awt.Color(102, 102, 102));
        convoLatestC3.setText("Bedspace Name");

        convoImg3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        javax.swing.GroupLayout convo3Layout = new javax.swing.GroupLayout(convo3);
        convo3.setLayout(convo3Layout);
        convo3Layout.setHorizontalGroup(
            convo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(convo3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(convoImg3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(convo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(convoLatestC3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convoBsName3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        convo3Layout.setVerticalGroup(
            convo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(convo3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(convo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(convo3Layout.createSequentialGroup()
                        .addComponent(convoBsName3)
                        .addGap(0, 0, 0)
                        .addComponent(convoLatestC3)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(convoImg3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        convo4.setBackground(new java.awt.Color(255, 255, 255));
        convo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convo4MouseClicked(evt);
            }
        });

        convoBsName4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        convoBsName4.setText("Bedspace Name");

        convoLatestC4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        convoLatestC4.setForeground(new java.awt.Color(102, 102, 102));
        convoLatestC4.setText("Bedspace Name");

        convoImg4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        javax.swing.GroupLayout convo4Layout = new javax.swing.GroupLayout(convo4);
        convo4.setLayout(convo4Layout);
        convo4Layout.setHorizontalGroup(
            convo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(convo4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(convoImg4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(convo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(convoLatestC4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convoBsName4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        convo4Layout.setVerticalGroup(
            convo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(convo4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(convo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(convo4Layout.createSequentialGroup()
                        .addComponent(convoBsName4)
                        .addGap(0, 0, 0)
                        .addComponent(convoLatestC4)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(convoImg4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        convo5.setBackground(new java.awt.Color(255, 255, 255));
        convo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convo5MouseClicked(evt);
            }
        });

        convoBsName5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        convoBsName5.setText("Bedspace Name");

        convoLatestC5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        convoLatestC5.setForeground(new java.awt.Color(102, 102, 102));
        convoLatestC5.setText("Bedspace Name");

        convoImg5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        javax.swing.GroupLayout convo5Layout = new javax.swing.GroupLayout(convo5);
        convo5.setLayout(convo5Layout);
        convo5Layout.setHorizontalGroup(
            convo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(convo5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(convoImg5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(convo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(convoLatestC5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convoBsName5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        convo5Layout.setVerticalGroup(
            convo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(convo5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(convo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(convo5Layout.createSequentialGroup()
                        .addComponent(convoBsName5)
                        .addGap(0, 0, 0)
                        .addComponent(convoLatestC5)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(convoImg5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        convo6.setBackground(new java.awt.Color(255, 255, 255));
        convo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convo6MouseClicked(evt);
            }
        });

        convoBsName6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        convoBsName6.setText("Bedspace Name");

        convoLatestC6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        convoLatestC6.setForeground(new java.awt.Color(102, 102, 102));
        convoLatestC6.setText("Bedspace Name");

        convoImg6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N

        javax.swing.GroupLayout convo6Layout = new javax.swing.GroupLayout(convo6);
        convo6.setLayout(convo6Layout);
        convo6Layout.setHorizontalGroup(
            convo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(convo6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(convoImg6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(convo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(convoLatestC6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convoBsName6, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        convo6Layout.setVerticalGroup(
            convo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(convo6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(convo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(convo6Layout.createSequentialGroup()
                        .addComponent(convoBsName6)
                        .addGap(0, 0, 0)
                        .addComponent(convoLatestC6)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(convoImg6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(convo6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(convo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(convo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(convo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(convo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(convo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(convo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(convo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 340, 530));

        jPanel32.setBackground(new java.awt.Color(243, 244, 247));

        roundTextField14.setBackground(new java.awt.Color(135, 135, 135));
        roundTextField14.setBorder(javax.swing.BorderFactory.createEmptyBorder(7, 55, 7, 55));
        roundTextField14.setForeground(new java.awt.Color(153, 153, 153));
        roundTextField14.setText("Send a message...");
        roundTextField14.setFillColor(new java.awt.Color(255, 255, 255));
        roundTextField14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        roundTextField14.setLineColor(new java.awt.Color(255, 255, 255));
        roundTextField14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                roundTextField14FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                roundTextField14FocusLost(evt);
            }
        });
        roundTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roundTextField1ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(roundTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(roundTextField14, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel31.setHorizontalAlignment(SwingConstants.CENTER);
        SwingUtilities.invokeLater(() -> {
            // Get the dimensions of the JLabel after it has been rendered
            int width = jLabel31.getWidth();
            int height = jLabel31.getHeight();

            // Check if dimensions are valid
            if (width > 0 && height > 0) {
                String imageUrl = "/boardingpal/img/icons/send-icon.png";
                ImageIcon icon = new ImageIcon(getClass().getResource(imageUrl));

                // Scale the image to the JLabel's size
                Image image = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
                jLabel31.setIcon(new ImageIcon(image)); // Set the scaled image as the icon
            } else {
                System.err.println("JLabel dimensions not available!");
            }
        });

        jPanel33.setBackground(new java.awt.Color(243, 244, 247));

        jPanel2.setBackground(new java.awt.Color(243, 244, 247));

        left13.setEditable(false);
        left13.setBackground(new java.awt.Color(135, 135, 135));
        left13.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        left13.setForeground(new java.awt.Color(51, 51, 51));
        left13.setFillColor(new java.awt.Color(255, 255, 255));
        left13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        left13.setLineColor(new java.awt.Color(255, 255, 255));
        left13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                left13ActionPerformed(evt);
            }
        });

        right13.setEditable(false);
        right13.setBackground(new java.awt.Color(135, 135, 135));
        right13.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        right13.setForeground(new java.awt.Color(255, 255, 255));
        right13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        right13.setFillColor(new java.awt.Color(255, 255, 255));
        right13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        right13.setLineColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(left13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(right13, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(right13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel12.setBackground(new java.awt.Color(243, 244, 247));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 244, 247)));

        left12.setEditable(false);
        left12.setBackground(new java.awt.Color(135, 135, 135));
        left12.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        left12.setForeground(new java.awt.Color(51, 51, 51));
        left12.setFillColor(new java.awt.Color(255, 255, 255));
        left12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        left12.setLineColor(new java.awt.Color(255, 255, 255));
        left12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                left12ActionPerformed(evt);
            }
        });

        right12.setEditable(false);
        right12.setBackground(new java.awt.Color(135, 135, 135));
        right12.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        right12.setForeground(new java.awt.Color(255, 255, 255));
        right12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        right12.setFillColor(new java.awt.Color(255, 255, 255));
        right12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        right12.setLineColor(new java.awt.Color(255, 255, 255));
        right12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                right12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addComponent(left12, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(right12, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(right12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel13.setBackground(new java.awt.Color(243, 244, 247));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 244, 247)));

        left11.setEditable(false);
        left11.setBackground(new java.awt.Color(135, 135, 135));
        left11.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        left11.setForeground(new java.awt.Color(51, 51, 51));
        left11.setFillColor(new java.awt.Color(255, 255, 255));
        left11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        left11.setLineColor(new java.awt.Color(255, 255, 255));

        right11.setEditable(false);
        right11.setBackground(new java.awt.Color(135, 135, 135));
        right11.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        right11.setForeground(new java.awt.Color(255, 255, 255));
        right11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        right11.setFillColor(new java.awt.Color(255, 255, 255));
        right11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        right11.setLineColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addComponent(left11, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(right11, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(right11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel14.setBackground(new java.awt.Color(243, 244, 247));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 244, 247)));

        left10.setEditable(false);
        left10.setBackground(new java.awt.Color(135, 135, 135));
        left10.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        left10.setForeground(new java.awt.Color(51, 51, 51));
        left10.setFillColor(new java.awt.Color(255, 255, 255));
        left10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        left10.setLineColor(new java.awt.Color(255, 255, 255));

        right10.setEditable(false);
        right10.setBackground(new java.awt.Color(135, 135, 135));
        right10.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        right10.setForeground(new java.awt.Color(255, 255, 255));
        right10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        right10.setFillColor(new java.awt.Color(255, 255, 255));
        right10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        right10.setLineColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addComponent(left10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(right10, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(right10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel15.setBackground(new java.awt.Color(243, 244, 247));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 244, 247)));

        right8.setEditable(false);
        right8.setBackground(new java.awt.Color(135, 135, 135));
        right8.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        right8.setForeground(new java.awt.Color(255, 255, 255));
        right8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        right8.setFillColor(new java.awt.Color(255, 255, 255));
        right8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        right8.setLineColor(new java.awt.Color(255, 255, 255));

        left8.setEditable(false);
        left8.setBackground(new java.awt.Color(135, 135, 135));
        left8.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        left8.setForeground(new java.awt.Color(51, 51, 51));
        left8.setFillColor(new java.awt.Color(255, 255, 255));
        left8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        left8.setLineColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(left8, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(right8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(left8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(right8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel16.setBackground(new java.awt.Color(243, 244, 247));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 244, 247)));

        left9.setEditable(false);
        left9.setBackground(new java.awt.Color(135, 135, 135));
        left9.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        left9.setForeground(new java.awt.Color(51, 51, 51));
        left9.setFillColor(new java.awt.Color(255, 255, 255));
        left9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        left9.setLineColor(new java.awt.Color(255, 255, 255));

        right9.setEditable(false);
        right9.setBackground(new java.awt.Color(135, 135, 135));
        right9.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        right9.setForeground(new java.awt.Color(255, 255, 255));
        right9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        right9.setFillColor(new java.awt.Color(255, 255, 255));
        right9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        right9.setLineColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addComponent(left9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(right9, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(right9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel17.setBackground(new java.awt.Color(243, 244, 247));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 244, 247)));

        left7.setEditable(false);
        left7.setBackground(new java.awt.Color(135, 135, 135));
        left7.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        left7.setForeground(new java.awt.Color(51, 51, 51));
        left7.setFillColor(new java.awt.Color(255, 255, 255));
        left7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        left7.setLineColor(new java.awt.Color(255, 255, 255));

        right7.setEditable(false);
        right7.setBackground(new java.awt.Color(135, 135, 135));
        right7.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        right7.setForeground(new java.awt.Color(255, 255, 255));
        right7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        right7.setFillColor(new java.awt.Color(255, 255, 255));
        right7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        right7.setLineColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addComponent(left7, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(right7, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(right7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel18.setBackground(new java.awt.Color(243, 244, 247));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 244, 247)));

        left6.setEditable(false);
        left6.setBackground(new java.awt.Color(135, 135, 135));
        left6.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        left6.setForeground(new java.awt.Color(51, 51, 51));
        left6.setFillColor(new java.awt.Color(255, 255, 255));
        left6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        left6.setLineColor(new java.awt.Color(255, 255, 255));

        right6.setEditable(false);
        right6.setBackground(new java.awt.Color(135, 135, 135));
        right6.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        right6.setForeground(new java.awt.Color(255, 255, 255));
        right6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        right6.setFillColor(new java.awt.Color(255, 255, 255));
        right6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        right6.setLineColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addComponent(left6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(right6, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(right6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel21.setBackground(new java.awt.Color(243, 244, 247));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 244, 247)));

        left5.setEditable(false);
        left5.setBackground(new java.awt.Color(135, 135, 135));
        left5.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        left5.setForeground(new java.awt.Color(51, 51, 51));
        left5.setFillColor(new java.awt.Color(255, 255, 255));
        left5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        left5.setLineColor(new java.awt.Color(255, 255, 255));

        right5.setEditable(false);
        right5.setBackground(new java.awt.Color(135, 135, 135));
        right5.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        right5.setForeground(new java.awt.Color(255, 255, 255));
        right5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        right5.setFillColor(new java.awt.Color(255, 255, 255));
        right5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        right5.setLineColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addComponent(left5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(right5, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(right5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel22.setBackground(new java.awt.Color(243, 244, 247));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 244, 247)));

        left4.setEditable(false);
        left4.setBackground(new java.awt.Color(135, 135, 135));
        left4.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        left4.setForeground(new java.awt.Color(51, 51, 51));
        left4.setFillColor(new java.awt.Color(255, 255, 255));
        left4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        left4.setLineColor(new java.awt.Color(255, 255, 255));

        right4.setEditable(false);
        right4.setBackground(new java.awt.Color(135, 135, 135));
        right4.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        right4.setForeground(new java.awt.Color(255, 255, 255));
        right4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        right4.setFillColor(new java.awt.Color(255, 255, 255));
        right4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        right4.setLineColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addComponent(left4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(right4, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(right4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel23.setBackground(new java.awt.Color(243, 244, 247));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 244, 247)));

        left3.setEditable(false);
        left3.setBackground(new java.awt.Color(135, 135, 135));
        left3.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        left3.setForeground(new java.awt.Color(51, 51, 51));
        left3.setFillColor(new java.awt.Color(255, 255, 255));
        left3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        left3.setLineColor(new java.awt.Color(255, 255, 255));

        right3.setEditable(false);
        right3.setBackground(new java.awt.Color(135, 135, 135));
        right3.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        right3.setForeground(new java.awt.Color(255, 255, 255));
        right3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        right3.setFillColor(new java.awt.Color(255, 255, 255));
        right3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        right3.setLineColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addComponent(left3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(right3, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(right3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel28.setBackground(new java.awt.Color(243, 244, 247));
        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 244, 247)));

        left2.setEditable(false);
        left2.setBackground(new java.awt.Color(135, 135, 135));
        left2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        left2.setForeground(new java.awt.Color(51, 51, 51));
        left2.setFillColor(new java.awt.Color(255, 255, 255));
        left2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        left2.setLineColor(new java.awt.Color(255, 255, 255));

        right2.setEditable(false);
        right2.setBackground(new java.awt.Color(135, 135, 135));
        right2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        right2.setForeground(new java.awt.Color(255, 255, 255));
        right2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        right2.setFillColor(new java.awt.Color(255, 255, 255));
        right2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        right2.setLineColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addComponent(left2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(right2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(right2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel29.setBackground(new java.awt.Color(243, 244, 247));
        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(243, 244, 247)));

        left1.setEditable(false);
        left1.setBackground(new java.awt.Color(135, 135, 135));
        left1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        left1.setForeground(new java.awt.Color(51, 51, 51));
        left1.setFillColor(new java.awt.Color(255, 255, 255));
        left1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        left1.setLineColor(new java.awt.Color(255, 255, 255));

        right1.setEditable(false);
        right1.setBackground(new java.awt.Color(135, 135, 135));
        right1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));
        right1.setForeground(new java.awt.Color(255, 255, 255));
        right1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        right1.setFillColor(new java.awt.Color(255, 255, 255));
        right1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        right1.setLineColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addComponent(left1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(right1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(right1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(left1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public List<Conversation> getConversationsOwnedByUser(User loggedInUser) {
        List<String> userConversationIds = loggedInUser.getConversationsId();
        System.out.println("User's Conversation IDs: " + userConversationIds);

        // Filter global conversations for matching IDs
        return conversations.stream()
            .filter(c -> userConversationIds.contains(c.getChat_id()))
            .collect(Collectors.toList());
    }
    
    public void generateChats(int index) {
        System.out.println("generateChats called with index: " + index);

        // Get user-specific conversations
        List<Conversation> userConversations = getConversationsOwnedByUser(loggedInUser);
        System.out.println("User-specific conversations: " + userConversations);

        // Ensure the index is valid for user-specific conversations
        if (index < 0 || index >= userConversations.size()) {
            System.out.println("Error: Invalid index for user conversations: " + index);
            return;
        }

        // Clear text fields
        RoundTextField[] left = {left1, left2, left3, left4, left5, left6, left7, left8, left9, left10, left11, left12, left13};
        RoundTextField[] right = {right1, right2, right3, right4, right5, right6, right7, right8, right9, right10, right11, right12, right13};

        for (RoundTextField field : left) {
            field.setText("");
            field.setFillColor(new Color(243, 244, 247)); // Reset to default color
            field.setLineColor(new Color(243, 244, 247)); // Reset to default color
        }
        for (RoundTextField field : right) {
            field.setText("");
            field.setFillColor(new Color(243, 244, 247)); // Reset to default color
            field.setLineColor(new Color(243, 244, 247)); // Reset to default color
        }

        // Get the messages from the selected conversation
        Conversation selectedConversation = userConversations.get(index);
        List<Message> messages = selectedConversation.getMessages();
        System.out.println("Messages in selected conversation: " + messages);

        // Populate the fields starting from the latest message
        int maxFields = Math.min(messages.size(), left.length);
        for (int i = 0; i < maxFields; i++) {
            Message message = messages.get(messages.size() - 1 - i); // Reverse order: latest message first
            System.out.println("Processing message: " + message);

            if (message.getMessageAuthor().equals(loggedInUser)) {
                // If the message author is the logged-in user, populate the right fields
                System.out.println("Populating right field at index " + i + " with: " + message.getMessageText());
                right[i].setText(message.getMessageText());
                right[i].setFillColor(new Color(102, 102, 102)); // Set right field fill color
                right[i].setLineColor(new Color(102, 102, 102)); // Set right field line color
            } else {
                // Otherwise, populate the left fields
                System.out.println("Populating left field at index " + i + " with: " + message.getMessageText());
                left[i].setText(message.getMessageText());
                left[i].setFillColor(new Color(255, 255, 255)); // Set left field fill color
                left[i].setLineColor(new Color(255, 255, 255)); // Set left field line color
            }
        }
    }



    
    public void populateConversations() {
        List<Conversation> userConversations = conversations.stream()
            .filter(chat -> userConversationIds.contains(chat.getChat_id()))
            .collect(Collectors.toList());
        
        JPanel[] convoPanels = {convo1, convo2, convo3, convo4, convo5, convo6};
        JLabel[] convoBsNames = {convoBsName1, convoBsName2, convoBsName3, convoBsName4, convoBsName5, convoBsName6};
        JLabel[] convoLatestCs = {convoLatestC1, convoLatestC2, convoLatestC3, convoLatestC4, convoLatestC5, convoLatestC6};
        JLabel[] convoImgs = {convoImg1, convoImg2, convoImg3, convoImg4, convoImg5, convoImg6};
        for (int i = 0; i < convoPanels.length && i < userConversations.size(); i++) {
            Conversation conversation = userConversations.get(i);
            
            // Set the bedspace name
            String name = conversation.getMembers().get(0).getFullName().equals(loggedInUser.getFullName()) ? conversation.getMembers().get(1).getFullName() : conversation.getMembers().get(0).getFullName();
            convoBsNames[i].setText(conversation.getTitle() + name);

            // Set the latest chat teaser
            if (!conversation.getMessages().isEmpty()) {
                Message latestMessage = conversation.getMessages().get(conversation.getMessages().size() - 1);
                convoLatestCs[i].setText(latestMessage.getMessageText());
            } else {
                convoLatestCs[i].setText("No messages yet");
            }
            
            
            BedSpace bedspace = conversation.getBedspaceOwner().getBedspace(); // Avoid multiple calls to randomUsers.get(i)

            // Construct image URL and scale the image to fit the JLabel size
            String imageUrl = "/boardingpal/img/browseBedspace/" + bedspace.getId() + ".png";
            ImageIcon icon = new ImageIcon(getClass().getResource(imageUrl));

            // Scale the image to the JLabel's size
            Image image = icon.getImage().getScaledInstance(convoImgs[i].getWidth(), convoImgs[i].getHeight(), Image.SCALE_SMOOTH);
            convoImgs[i].setIcon(new ImageIcon(image)); // Set the scaled image as the icon
            
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
                case 3 -> {
                    bedspace4 = bedspace.getId();
                }
                case 4 -> {
                    bedspace5 = bedspace.getId();
                }
                case 5 -> {
                    bedspace6 = bedspace.getId();
                }
            }

            // Make the conversation panel visible or clickable
            convoPanels[i].setVisible(true);
        }

        // Hide unused panels
        for (int i = userConversations.size(); i < convoPanels.length; i++) {
            convoPanels[i].setVisible(false);
        }
    }
    
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

    private void roundTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundTextField2ActionPerformed

    private void fButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fButton1MouseClicked

    }//GEN-LAST:event_fButton1MouseClicked

    private void fButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fButton1ActionPerformed

    private void roundTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roundTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roundTextField1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        LoggedIn loginFrame = new LoggedIn();
                loginFrame.setVisible(true);
                loginFrame.pack();
                loginFrame.setLocationRelativeTo(null);
                this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void convo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convo1MouseClicked
        System.out.println("convo1MouseClicked triggered.");
    System.out.println("Opening conversation at index 0.");

    populateConversationPane(0);
    generateChats(0);
    currentOpenedConvoIndex = 0;

    // Log currentOpenedConvoIndex
    System.out.println("currentOpenedConvoIndex set to: " + currentOpenedConvoIndex);
    }//GEN-LAST:event_convo1MouseClicked

    private void convo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convo2MouseClicked
        System.out.println("convo1MouseClicked triggered.");
    System.out.println("Opening conversation at index 1.");

    populateConversationPane(1);
    generateChats(1);
    currentOpenedConvoIndex = 1;

    // Log currentOpenedConvoIndex
    System.out.println("currentOpenedConvoIndex set to: " + currentOpenedConvoIndex);
    }//GEN-LAST:event_convo2MouseClicked

    private void convo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convo3MouseClicked
        System.out.println("convo1MouseClicked triggered.");
    System.out.println("Opening conversation at index 2.");

    populateConversationPane(2);
    generateChats(2);
    currentOpenedConvoIndex = 2;

    // Log currentOpenedConvoIndex
    System.out.println("currentOpenedConvoIndex set to: " + currentOpenedConvoIndex);
    }//GEN-LAST:event_convo3MouseClicked

    private void convo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convo4MouseClicked
        System.out.println("convo1MouseClicked triggered.");
    System.out.println("Opening conversation at index 3.");

    populateConversationPane(3);
    generateChats(3);
    currentOpenedConvoIndex = 3;

    // Log currentOpenedConvoIndex
    System.out.println("currentOpenedConvoIndex set to: " + currentOpenedConvoIndex);
    }//GEN-LAST:event_convo4MouseClicked

    private void convo5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convo5MouseClicked
        System.out.println("convo1MouseClicked triggered.");
    System.out.println("Opening conversation at index 4.");

    populateConversationPane(4);
    generateChats(4);
    currentOpenedConvoIndex = 4;

    // Log currentOpenedConvoIndex
    System.out.println("currentOpenedConvoIndex set to: " + currentOpenedConvoIndex);
    }//GEN-LAST:event_convo5MouseClicked

    private void convo6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convo6MouseClicked
        System.out.println("convo1MouseClicked triggered.");
    System.out.println("Opening conversation at index 5.");

    populateConversationPane(5);
    generateChats(5);
    currentOpenedConvoIndex = 5;

    // Log currentOpenedConvoIndex
    System.out.println("currentOpenedConvoIndex set to: " + currentOpenedConvoIndex);
    }//GEN-LAST:event_convo6MouseClicked

    private void left13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_left13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_left13ActionPerformed

    private void left12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_left12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_left12ActionPerformed

    private void right12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_right12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_right12ActionPerformed

    private void roundTextField14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_roundTextField14FocusGained
        if(roundTextField14.getText().equals("Send a message...")){
            roundTextField14.setText("");
            roundTextField14.setBackground(new Color(153,153,153));
            
        }                                 
    }//GEN-LAST:event_roundTextField14FocusGained

    private void roundTextField14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_roundTextField14FocusLost
        if(roundTextField14.getText().equals("")){
            roundTextField14.setText("Send a message...");
            roundTextField14.setBackground(new Color(153,153,153));   
        }
    }//GEN-LAST:event_roundTextField14FocusLost

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        System.out.println("jLabel31MouseClicked triggered.");

        // Check and log userConversationIds
        System.out.println("userConversationIds: " + userConversationIds);

        List<Conversation> userConversations = conversations.stream()
            .filter(chat -> userConversationIds.contains(chat.getChat_id()))
            .collect(Collectors.toList());

        // Log filtered userConversations
        System.out.println("Filtered userConversations: " + userConversations);

        if (currentOpenedConvoIndex < 0 || currentOpenedConvoIndex >= userConversations.size()) {
            System.out.println("Error: Invalid currentOpenedConvoIndex: " + currentOpenedConvoIndex);
            return; // Exit to prevent further errors
        }

        // Log the message being added
        String messageText = roundTextField14.getText();
        System.out.println("Message text: " + messageText);

        Message message = new Message(messageText, loggedInUser);
        System.out.println("Message created: " + message);

        userConversations.get(currentOpenedConvoIndex).addMessage(message);
        System.out.println("Message added to conversation: " + currentOpenedConvoIndex);

        roundTextField14.setText("");
        generateChats(currentOpenedConvoIndex);
    }//GEN-LAST:event_jLabel31MouseClicked
    
    
    
    public void populateConversationPane(int index){
        List<Conversation> userConversations = conversations.stream()
            .filter(chat -> userConversationIds.contains(chat.getChat_id()))
            .collect(Collectors.toList());
        Conversation convo = userConversations.get(index);
        jLabel8.setText(convo.getTitle() + convo.getBedspaceOwner().getFullName());
        BedSpace bedspace = convo.getBedspaceOwner().getBedspace();
        String imageUrl = "/boardingpal/img/browseBedspace/" + bedspace.getId() + ".png";
        ImageIcon icon = new ImageIcon(getClass().getResource(imageUrl));

        // Scale the image to the JLabel's size
        Image image = icon.getImage().getScaledInstance(jLabel29.getWidth(), jLabel29.getHeight(), Image.SCALE_SMOOTH);
        jLabel29.setIcon(new ImageIcon(image)); // Set the scaled image as the icon
        jLabel4.setText(convo.getBedspaceOwner().getBedspace().getBedspaceName());
        jLabel6.setText(convo.getBedspaceOwner().getBedspace().getAddress());
        Image image2 = icon.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), Image.SCALE_SMOOTH);
        jLabel5.setIcon(new ImageIcon(image2)); 
        isRequestButtonOpen = true;
        fButton1.setVisible(isRequestButtonOpen);
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
            java.util.logging.Logger.getLogger(ChatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel convo1;
    private javax.swing.JPanel convo2;
    private javax.swing.JPanel convo3;
    private javax.swing.JPanel convo4;
    private javax.swing.JPanel convo5;
    private javax.swing.JPanel convo6;
    private javax.swing.JLabel convoBsName1;
    private javax.swing.JLabel convoBsName2;
    private javax.swing.JLabel convoBsName3;
    private javax.swing.JLabel convoBsName4;
    private javax.swing.JLabel convoBsName5;
    private javax.swing.JLabel convoBsName6;
    private javax.swing.JLabel convoImg1;
    private javax.swing.JLabel convoImg2;
    private javax.swing.JLabel convoImg3;
    private javax.swing.JLabel convoImg4;
    private javax.swing.JLabel convoImg5;
    private javax.swing.JLabel convoImg6;
    private javax.swing.JLabel convoLatestC1;
    private javax.swing.JLabel convoLatestC2;
    private javax.swing.JLabel convoLatestC3;
    private javax.swing.JLabel convoLatestC4;
    private javax.swing.JLabel convoLatestC5;
    private javax.swing.JLabel convoLatestC6;
    private boardingPal.FButton fButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private boardingpal.RoundTextField left1;
    private boardingpal.RoundTextField left10;
    private boardingpal.RoundTextField left11;
    private boardingpal.RoundTextField left12;
    private boardingpal.RoundTextField left13;
    private boardingpal.RoundTextField left2;
    private boardingpal.RoundTextField left3;
    private boardingpal.RoundTextField left4;
    private boardingpal.RoundTextField left5;
    private boardingpal.RoundTextField left6;
    private boardingpal.RoundTextField left7;
    private boardingpal.RoundTextField left8;
    private boardingpal.RoundTextField left9;
    private javax.swing.JLabel profileNavButton;
    private boardingpal.RoundTextField right1;
    private boardingpal.RoundTextField right10;
    private boardingpal.RoundTextField right11;
    private boardingpal.RoundTextField right12;
    private boardingpal.RoundTextField right13;
    private boardingpal.RoundTextField right2;
    private boardingpal.RoundTextField right3;
    private boardingpal.RoundTextField right4;
    private boardingpal.RoundTextField right5;
    private boardingpal.RoundTextField right6;
    private boardingpal.RoundTextField right7;
    private boardingpal.RoundTextField right8;
    private boardingpal.RoundTextField right9;
    private boardingpal.RoundTextField roundTextField14;
    private boardingpal.RoundTextField roundTextField2;
    private boardingpal.RoundTextField roundTextField39;
    private boardingpal.RoundTextField roundTextField40;
    private boardingpal.RoundTextField roundTextField41;
    private boardingpal.RoundTextField roundTextField42;
    private boardingpal.RoundTextField roundTextField43;
    private boardingpal.RoundTextField roundTextField44;
    private boardingpal.RoundTextField roundTextField45;
    private boardingpal.RoundTextField roundTextField46;
    // End of variables declaration//GEN-END:variables
}
