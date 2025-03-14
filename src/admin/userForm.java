/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.Session;
import config.connectDB;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import patenio.dentalapp.loginForm;

/**
 *
 * @author ride1
 */
public class userForm extends javax.swing.JFrame {

    /**
     * Creates new form userForm
     */
    public userForm() {
        initComponents();
        displayData();
    }
    
        public void displayData(){
        try{
            connectDB con= new connectDB();
            ResultSet rs = con.getData("SELECT * FROM tbl_user");
            tbl_user.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_user = new javax.swing.JTable();
        back = new javax.swing.JLabel();
        logo = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        services = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        services1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        staff_info = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        edit = new javax.swing.JLabel();
        settings = new javax.swing.JPanel();
        urs = new javax.swing.JLabel();
        usrs_name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(42, 82, 129));
        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_user.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_user);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 770, 560));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/b_icon.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 110, 60));

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

        services.setBackground(new java.awt.Color(255, 255, 255));
        services.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                servicesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                servicesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                servicesMouseExited(evt);
            }
        });
        services.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        services.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, 170, 100));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setText("ADD USER");
        services.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 140, 70));

        services1.setBackground(new java.awt.Color(255, 255, 255));
        services1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                services1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                services1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                services1MouseExited(evt);
            }
        });
        services1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jLabel10.setText("jLabel9");
        services1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, 170, 100));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel6.setText("ADD USER");
        services1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 140, 70));

        services.add(services1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 260, 70));

        logo.add(services, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 260, 70));

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

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel7.setText("EDIT USER");
        staff_info.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 140, 70));

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit_user_icon.png"))); // NOI18N
        edit.setText("jLabel8");
        staff_info.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -20, 100, 110));

        logo.add(staff_info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 260, 70));

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
        logo.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 260, 70));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void servicesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_servicesMouseClicked
        createUserForm cuf= new createUserForm();
        cuf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_servicesMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        adminDashboard ad= new adminDashboard();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void services1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_services1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_services1MouseClicked

    private void services1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_services1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_services1MouseEntered

    private void services1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_services1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_services1MouseExited

    private void staff_infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staff_infoMouseClicked
        int rowIndex=tbl_user.getSelectedRow();
 
        if(rowIndex<0){
            JOptionPane.showMessageDialog(null, "Select an item!");
        }else{
            try {
        connectDB con = new connectDB();
        TableModel tm = tbl_user.getModel();
        ResultSet rs = con.getData("SELECT * FROM tbl_user WHERE u_id= '" + tm.getValueAt(rowIndex, 0) + "'");

        if (rs.next()) {
            createUserForm cuf= new createUserForm();
            cuf.u_id.setText(""+rs.getInt("u_id"));
            cuf.fname.setText(""+rs.getString("fname"));
            cuf.lname.setText(""+rs.getString("lname"));
            cuf.email.setText(""+rs.getString("email"));
            cuf.phone_num.setText(""+rs.getString("phone_num"));
            cuf.pass.setText(""+rs.getString("pass"));
            cuf.type.setSelectedItem(""+rs.getString("u_type"));
            cuf.status.setSelectedItem(""+rs.getString("status"));
            
            cuf.add.setEnabled(false);
            cuf.update.setEnabled(true);
            
            cuf.setVisible(true);
            this.dispose();
        }
} catch (SQLException ex) {
}
        }
    }//GEN-LAST:event_staff_infoMouseClicked

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
            java.util.logging.Logger.getLogger(userForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel edit;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel logo;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel services;
    private javax.swing.JPanel services1;
    private javax.swing.JPanel settings;
    private javax.swing.JPanel staff_info;
    private javax.swing.JTable tbl_user;
    private javax.swing.JLabel urs;
    private javax.swing.JLabel usrs_name;
    // End of variables declaration//GEN-END:variables
}
