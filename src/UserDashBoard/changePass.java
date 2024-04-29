/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDashBoard;

import AdminDashBoard.*;
import DBconnector.DBconnector;
import DBconnector.Session;
import DBconnector.passwordHasher;
import LoginForm.LoginForm;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author PERSONAL
 */
public class changePass extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashBoard
     */
    public changePass() {
        initComponents();
        
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTable7 = new javax.swing.JLabel();
        acc_id = new javax.swing.JLabel();
        acc_name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        oldpass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        newpass = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        conpass = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setText("Change Password");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel1)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -8, 540, 70));

        jTable7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-female-user-120.png"))); // NOI18N
        jPanel1.add(jTable7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 110, 110));

        acc_id.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        acc_id.setText("ID");
        jPanel1.add(acc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 40, -1));

        acc_name.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        acc_name.setText("NAME");
        jPanel1.add(acc_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setText("Enter old password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 127, -1, -1));
        jPanel1.add(oldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 127, 155, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setText("Enter new password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, -1));
        jPanel1.add(newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 155, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Confirm password:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));
        jPanel1.add(conpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 155, -1));

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setLayout(null);

        jLabel6.setBackground(new java.awt.Color(255, 204, 204));
        jLabel6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Save");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel6);
        jLabel6.setBounds(0, 0, 90, 40);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 248, 89, 42));

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Back");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel7);
        jLabel7.setBounds(0, 0, 90, 40);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 248, 89, 42));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ping.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 540, 700));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
        
        
            acc_name.setText("Name: "+sess.getFname());
            acc_id.setText("User ID: "+sess.getUid());
            
        
    }//GEN-LAST:event_formWindowActivated

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
            
          try{
            DBconnector dbc = new DBconnector();
            Session sess = Session.getInstance();

            String query = "SELECT * FROM tblassign WHERE u_id = '"+ sess.getUid() +"'";
            ResultSet rs = dbc.getData(query);

            if(rs.next()){
                String olddbpass = rs.getString("u_password");
                String oldhash = passwordHasher.hashPassword(oldpass.getText());

                if (oldpass.getText().isEmpty() || newpass.getText().isEmpty() || conpass.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "All fields must be required!");
                } else if (newpass.getText().length() < 8 || conpass.getText().length() < 8){
                    JOptionPane.showMessageDialog(null, "Password must be 8 aboves!");
                } else {
                    if(olddbpass.equals(oldhash)){
                        if (newpass.getText().equals(conpass.getText())){
                            if (oldpass.getText().equals(newpass.getText()) || oldpass.getText().equals(newpass.getText())){
                                JOptionPane.showMessageDialog(null, "Please ensure your new password is different from your previous one!");
                            } else {
                                String npass = passwordHasher.hashPassword(newpass.getText());
                                dbc.updateData("UPDATE tblassign SET u_password = '"+ npass +"'WHERE u_id = '"+ sess.getUid()+"'");
                                LoginForm lf = new LoginForm();
                                lf.setVisible(true);
                                this.dispose();
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Password doesnt match!");
                        }    
                    }else{
                        JOptionPane.showMessageDialog(null, "Old Password is incorrect!");
                    } 
                }      
            }
        }catch(SQLException | NoSuchAlgorithmException ex){
            System.out.println(""+ex);
        }
       
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        accountDetails ad = new accountDetails();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel acc_id;
    private javax.swing.JLabel acc_name;
    private javax.swing.JTextField conpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JLabel jTable7;
    private javax.swing.JTextField newpass;
    private javax.swing.JTextField oldpass;
    // End of variables declaration//GEN-END:variables
}
