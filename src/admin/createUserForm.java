/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.connectDB;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import patenio.dentalapp.loginForm;

/**
 *
 * @author ride1
 */
public class createUserForm extends javax.swing.JFrame {

    /**
     * Creates new form createUserForm
     */
    public createUserForm() {
        initComponents();
    }
    
    public static String em;

public boolean duplicateCheck() {
    connectDB con = new connectDB();

    try {
        String query = "SELECT * FROM tbl_user WHERE email='" + email.getText() + "'";
        ResultSet resultSet = con.getData(query);
        if (resultSet.next()) {  
            em = resultSet.getString("email");
            if (em.equals(email.getText())) {
                JOptionPane.showMessageDialog(null, "Email already exists!");
                email.setText("");
                return true;
            }
        }
    } catch (SQLException ex) {
        System.out.println("Error: " + ex);
    }
    return false;
}   
    
    Color panel = new Color (132,169,214);
    Color opanel= new Color (213,220,233);
    Color lout= new Color (240,240,240);
    Color white= new Color(255,255,255);
    Color blue= new Color (102,169,229);
    Color bg1 = new Color (153,153,153);
    Color login_b= new Color (82,107,136);
    Color bg= new Color (42,82,129);
    Color signup= new Color (122,122,122);
    Color signup_1= new Color (167,167,167);
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        acc_type = new javax.swing.JLabel();
        fname_lbl = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        lname_lbl = new javax.swing.JLabel();
        phone_num = new javax.swing.JTextField();
        pn_label = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        email_lbl = new javax.swing.JLabel();
        pass_lbl = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        status_lbl = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        login_layout = new javax.swing.JPanel();
        login_button1 = new javax.swing.JLabel();
        logo = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        add_user = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        add_u = new javax.swing.JLabel();
        n1 = new javax.swing.JPanel();
        n2 = new javax.swing.JPanel();
        urs = new javax.swing.JLabel();
        usrs_name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(42, 82, 129));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b_icon.png"))); // NOI18N
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 110, 60));

        jPanel1.setBackground(new java.awt.Color(236, 235, 235));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        acc_type.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        acc_type.setForeground(new java.awt.Color(0, 51, 51));
        acc_type.setText("Account Type");

        fname_lbl.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        fname_lbl.setForeground(new java.awt.Color(0, 51, 51));
        fname_lbl.setText("First Name");

        type.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        type.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        type.setPreferredSize(new java.awt.Dimension(50, 20));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        fname.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        fname.setPreferredSize(new java.awt.Dimension(50, 20));

        lname.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        lname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        lname.setPreferredSize(new java.awt.Dimension(50, 20));
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });

        lname_lbl.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lname_lbl.setForeground(new java.awt.Color(0, 51, 51));
        lname_lbl.setText("Last Name");

        phone_num.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        phone_num.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        phone_num.setPreferredSize(new java.awt.Dimension(50, 20));
        phone_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone_numActionPerformed(evt);
            }
        });

        pn_label.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        pn_label.setForeground(new java.awt.Color(0, 51, 51));
        pn_label.setText("Phone Number");

        email.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        email.setPreferredSize(new java.awt.Dimension(50, 20));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        email_lbl.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        email_lbl.setForeground(new java.awt.Color(0, 51, 51));
        email_lbl.setText("Email");

        pass_lbl.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        pass_lbl.setForeground(new java.awt.Color(0, 51, 51));
        pass_lbl.setText("Password");

        status.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        status.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        status.setPreferredSize(new java.awt.Dimension(50, 20));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });

        status_lbl.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        status_lbl.setForeground(new java.awt.Color(0, 51, 51));
        status_lbl.setText("Status");

        pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(status_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(258, 258, 258))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pn_label)
                            .addComponent(phone_num, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fname_lbl)
                                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pass_lbl)
                                    .addComponent(pass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lname_lbl)
                                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email_lbl)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(acc_type, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(127, 127, 127))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fname_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lname_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pn_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phone_num, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(email_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_lbl)
                    .addComponent(acc_type))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(type, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(pass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(status_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 770, 550));

        login_layout.setBackground(new java.awt.Color(42, 82, 129));
        login_layout.setForeground(new java.awt.Color(42, 82, 129));
        login_layout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_layoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_layoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_layoutMouseExited(evt);
            }
        });
        login_layout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_button1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        login_button1.setForeground(new java.awt.Color(255, 255, 255));
        login_button1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_button1.setText("ADD");
        login_layout.add(login_button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, 30));

        jPanel2.add(login_layout, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 130, 50));

        mainPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 810, 680));

        logo.setBackground(new java.awt.Color(255, 255, 255));
        logo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/db icon.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 120, 90));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel1.setText("DENTAL APPOINTMENT");
        header.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 20));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel3.setText("MANAGEMENT SYSTEM");
        header.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        header.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 100, 90));

        logo.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 80));

        add_user.setBackground(new java.awt.Color(255, 255, 255));
        add_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add_userMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add_userMouseExited(evt);
            }
        });
        add_user.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        add.setText("jLabel9");
        add_user.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, 170, 100));

        add_u.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        add_u.setText("ADD USER");
        add_user.add(add_u, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 140, 70));

        logo.add(add_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 260, 70));

        n1.setBackground(new java.awt.Color(255, 255, 255));
        n1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                n1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                n1MouseExited(evt);
            }
        });
        n1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        logo.add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 260, 70));

        n2.setBackground(new java.awt.Color(255, 255, 255));
        n2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                n2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                n2MouseExited(evt);
            }
        });
        n2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        logo.add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 260, 70));

        urs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b_staff_icon.png"))); // NOI18N
        urs.setText("jLabel17");
        logo.add(urs, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 190, 160));

        usrs_name.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        usrs_name.setText("USERS");
        logo.add(usrs_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 90, -1));

        mainPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_userMouseEntered
        add_user.setBackground(blue);
    }//GEN-LAST:event_add_userMouseEntered

    private void add_userMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_userMouseExited
        add_user.setBackground(white);
    }//GEN-LAST:event_add_userMouseExited

    private void n1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n1MouseEntered
        n1.setBackground(blue);
    }//GEN-LAST:event_n1MouseEntered

    private void n1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n1MouseExited
        n1.setBackground(white);
    }//GEN-LAST:event_n1MouseExited

    private void n2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n2MouseEntered
        n2.setBackground(blue);
    }//GEN-LAST:event_n2MouseEntered

    private void n2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_n2MouseExited
        n2.setBackground(white);
    }//GEN-LAST:event_n2MouseExited

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void phone_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone_numActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void login_layoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_layoutMouseClicked
        if (fname.getText().isEmpty() || lname.getText().isEmpty() ||
            phone_num.getText().isEmpty() || email.getText().isEmpty() ||
            pass.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "All fields must be filled out.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //    if (!phone_num.matches("\\d{11}")) {
            //    JOptionPane.showMessageDialog(this, "Please enter a valid phone number (11 digits only).", "Input Error", JOptionPane.ERROR_MESSAGE);
            //    return;
            //    }
        //
        if (pass.getText().length() < 8) {
            JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long.", "Input Error", JOptionPane.ERROR_MESSAGE);
            pass.setText("");
            return;
        }

        if (duplicateCheck()) {
            System.out.println("Duplicate Exists");
            return;
        }
        
        connectDB con = new connectDB();
    int result = con.insertData("INSERT INTO tbl_user (fname, lname, phone_num, email, pass, u_type, status) " 
        + "VALUES('" + fname.getText() + "', '" + lname.getText() + "', '" + phone_num.getText() + "', '" 
        + email.getText() + "', '" + pass.getText() + "', '" + type.getSelectedItem() + "', '" + status.getSelectedItem() + "')");

    if (result > 0) { 
        JOptionPane.showMessageDialog(null, "Sign up successfully!");
        userForm uf= new userForm();
        uf.setVisible(true);
        this.dispose();
       
    } else {
        JOptionPane.showMessageDialog(null, "Connection Error");
    }
    }//GEN-LAST:event_login_layoutMouseClicked

    private void login_layoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_layoutMouseEntered
        login_layout.setBackground(login_b);
    }//GEN-LAST:event_login_layoutMouseEntered

    private void login_layoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_layoutMouseExited
        login_layout.setBackground(bg);
    }//GEN-LAST:event_login_layoutMouseExited

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
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_type;
    private javax.swing.JLabel add;
    private javax.swing.JLabel add_u;
    private javax.swing.JPanel add_user;
    private javax.swing.JLabel back;
    private javax.swing.JTextField email;
    private javax.swing.JLabel email_lbl;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel fname_lbl;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel lname_lbl;
    private javax.swing.JLabel login_button1;
    private javax.swing.JPanel login_layout;
    private javax.swing.JPanel logo;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel n1;
    private javax.swing.JPanel n2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel pass_lbl;
    private javax.swing.JTextField phone_num;
    private javax.swing.JLabel pn_label;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JLabel status_lbl;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JLabel urs;
    private javax.swing.JLabel usrs_name;
    // End of variables declaration//GEN-END:variables
}
