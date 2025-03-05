/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.Session;
import patenio.dentalapp.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author ride1
 */
public class adminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form usersDashboard
     */
    public adminDashboard() {
        initComponents();
    }
    
    
    Color panel = new Color (132,169,214);
    Color opanel= new Color (213,220,233);
    Color lout= new Color (240,240,240);
    Color white= new Color(255,255,255);
    Color blue= new Color (102,169,229);
    
    

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
        jLabel13 = new javax.swing.JLabel();
        acc_name = new javax.swing.JLabel();
        logo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        db = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        app = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        patient = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        services = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        staff_info = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        settings = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(42, 82, 129));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_icon.png"))); // NOI18N
        jLabel13.setText("jLabel13");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, -10, 133, 142));

        acc_name.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        acc_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_name.setText("ADMIN");
        jPanel2.add(acc_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 220, 20));

        mainPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 810, 680));

        logo.setBackground(new java.awt.Color(255, 255, 255));
        logo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/db icon.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 120, 90));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel1.setText("DENTAL APPOINTMENT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 20));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel3.setText("MANAGEMENT SYSTEM");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 100, 90));

        logo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 80));

        db.setBackground(new java.awt.Color(255, 255, 255));
        db.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dbMouseExited(evt);
            }
        });
        db.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DASHBOARD");
        db.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 160, 70));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dashboard_icon.png"))); // NOI18N
        db.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 70));

        logo.add(db, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 260, 70));

        app.setBackground(new java.awt.Color(255, 255, 255));
        app.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                appMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                appMouseExited(evt);
            }
        });
        app.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("APPOINTMENTS");
        app.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 70));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/app_icon.png"))); // NOI18N
        app.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 80));

        logo.add(app, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 260, 70));

        patient.setBackground(new java.awt.Color(255, 255, 255));
        patient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                patientMouseExited(evt);
            }
        });
        patient.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PATIENTS");
        patient.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, 70));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/patient_icon.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        patient.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -10, 180, 80));

        logo.add(patient, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 260, 70));

        services.setBackground(new java.awt.Color(255, 255, 255));
        services.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                servicesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                servicesMouseExited(evt);
            }
        });
        services.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SERVICES");
        services.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 12, 140, 40));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/service_icon.png"))); // NOI18N
        services.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 140, 170));

        logo.add(services, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 260, 70));

        staff_info.setBackground(new java.awt.Color(255, 255, 255));
        staff_info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staff_infoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                staff_infoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                staff_infoMouseExited(evt);
            }
        });
        staff_info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("USERS");
        staff_info.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 160, 60));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/staff_1.png"))); // NOI18N
        staff_info.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 110, 90));

        logo.add(staff_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 260, 70));

        settings.setBackground(new java.awt.Color(255, 255, 255));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                settingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                settingsMouseExited(evt);
            }
        });
        settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SETTINGS");
        settings.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 0, 140, 70));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/settings_icon.png"))); // NOI18N
        settings.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, -40, 370, 110));

        logo.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 260, 70));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jLabel11.setText("jLabel11");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel11MouseEntered(evt);
            }
        });
        logo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 620, 69, 58));

        logout.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        logout.setForeground(new java.awt.Color(153, 153, 153));
        logout.setText("LOGOUT");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
        });
        logo.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, -1, 30));

        mainPanel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 680));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1121, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dbMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbMouseEntered
       db.setBackground(blue);
    }//GEN-LAST:event_dbMouseEntered

    private void dbMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbMouseExited
       db.setBackground(white);
    }//GEN-LAST:event_dbMouseExited

    private void appMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appMouseEntered
       app.setBackground(blue);
    }//GEN-LAST:event_appMouseEntered

    private void appMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appMouseExited
        app.setBackground(white);
    }//GEN-LAST:event_appMouseExited

    private void patientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientMouseEntered
        patient.setBackground(blue);
    }//GEN-LAST:event_patientMouseEntered

    private void patientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientMouseExited
       patient.setBackground(white);
    }//GEN-LAST:event_patientMouseExited

    private void servicesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_servicesMouseEntered
       services.setBackground(blue);
    }//GEN-LAST:event_servicesMouseEntered

    private void servicesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_servicesMouseExited
        services.setBackground(white);
    }//GEN-LAST:event_servicesMouseExited

    private void staff_infoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staff_infoMouseEntered
       staff_info.setBackground(blue);
    }//GEN-LAST:event_staff_infoMouseEntered

    private void staff_infoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staff_infoMouseExited
        staff_info.setBackground(white);
    }//GEN-LAST:event_staff_infoMouseExited

    private void settingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseEntered
        settings.setBackground(blue);
    }//GEN-LAST:event_settingsMouseEntered

    private void settingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseExited
        settings.setBackground(white);
    }//GEN-LAST:event_settingsMouseExited

    private void staff_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staff_infoMouseClicked
        userForm uf= new userForm();
        uf.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_staff_infoMouseClicked

    private void jLabel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseEntered
       
    }//GEN-LAST:event_jLabel11MouseEntered

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
      
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
     if(JOptionPane.showConfirmDialog(null, "Do you want to Logout?", "Confirm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
        loginForm lf= new loginForm();
        lf.setVisible(true);
        this.dispose();
     }
    }//GEN-LAST:event_logoutMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        if(JOptionPane.showConfirmDialog(null, "Do you want to Logout?", "Confirm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
        loginForm lf= new loginForm();
        lf.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_jLabel11MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      Session sess = Session.getInstance();
     if(sess.getUid()== 0){
      JOptionPane.showMessageDialog(null, "No account found, must login!");
      loginForm lf = new loginForm();
      lf.setVisible(true);
      this.dispose();
     }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_name;
    private javax.swing.JPanel app;
    private javax.swing.JPanel db;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel logo;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel patient;
    private javax.swing.JPanel services;
    private javax.swing.JPanel settings;
    private javax.swing.JPanel staff_info;
    // End of variables declaration//GEN-END:variables
}
