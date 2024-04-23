/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminDashBoard;

import DBconnector.DBconnector;
import static RegistrationForm.RegistrationForm.emails;
import static RegistrationForm.RegistrationForm.usernames;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.util.Objects.hash;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author PERSONAL
 */
public class createUserForm extends javax.swing.JFrame {

    /**
     * Creates new form createUserForm
     */
    public createUserForm() {
        initComponents();
    }

    public boolean duplicateChecker(){
    
    DBconnector connector = new DBconnector();
        
    try{
        String query = "SELECT * FROM tblassign  WHERE u_username = '" + un.getText() + "' OR u_email = '" + em.getText() + "'";
            ResultSet resultSet = connector.getData(query);
            
            if(resultSet.next()){
                emails = resultSet.getString("u_email");
                
                if(emails.equals(em.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already used");
                    em.setText("");
                }
                
                usernames = resultSet.getString("u_username");
                
                if(usernames.equals(un.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already used");
                    un.setText("");
                }
                
                return true;
                
            }else{
                return false;
            }
        
    }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
  }
    
 }
    
       public boolean updateChecker(){
    
    DBconnector connector = new DBconnector();
        
    try{
        String query = "SELECT * FROM tblassign  WHERE (u_username = '" + un.getText() + "' OR u_email = '" + em.getText() + "') AND u_id !=' "+id.getText()+"'";
            ResultSet resultSet = connector.getData(query);
            
            if(resultSet.next()){
                emails = resultSet.getString("u_email");
                
                if(emails.equals(em.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already used");
                    em.setText("");
                }
                
                usernames = resultSet.getString("u_username");
                
                if(usernames.equals(un.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already used");
                    un.setText("");
                }
                
                return true;
                
            }else{
                return false;
            }
        
    }catch(SQLException ex){
            System.out.println(""+ex);
            return false;
  }
    
 }
    private String hash(String password) {
        return null;
    
 }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        ln = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        un = new javax.swing.JTextField();
        upass = new javax.swing.JTextField();
        utype = new javax.swing.JComboBox<>();
        ustat = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add.setText("Add");
        add.setEnabled(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 94, 100, 35));

        update.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 140, 100, 35));

        refresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        refresh.setText("Refresh");
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 232, 100, 35));

        delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 278, 100, 35));

        clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clear.setText("Clear");
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 186, 100, 35));

        cancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 324, 100, 35));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel2.setText("Enter First Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 141, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setText("Enter Last Name: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 172, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setText("Enter Email: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 203, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("Enter Username:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 234, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel6.setText("Enter Password: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 265, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel7.setText("Choose Account Type: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 296, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel8.setText("Account Status: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 322, -1, -1));
        jPanel1.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 140, 160, -1));
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 171, 160, -1));
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 202, 160, -1));
        jPanel1.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 233, 160, -1));
        jPanel1.add(upass, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 264, 160, -1));

        utype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        jPanel1.add(utype, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 295, 160, -1));

        ustat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        jPanel1.add(ustat, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 321, 160, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel9.setText("User ID:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 110, -1, -1));

        id.setEnabled(false);
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 109, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if(fn.getText().isEmpty() || ln.getText().isEmpty() || em.getText().isEmpty() || un.getText().isEmpty() || upass.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All field are required!");
        
        }else if(upass.getText().length()< 8){
            JOptionPane.showMessageDialog(null, "Password must be 8 above!");
            upass.setText("");
        
        }else if(duplicateChecker()){
            System.out.println("Duplicate Exist");
         
        }else{
        
        DBconnector connector = new DBconnector();
        
        if(connector.insertData("INSERT INTO tblassign(u_fname, u_lname, u_email, u_username, u_password, u_type, u_status)VALUES ('" + fn.getText() + "','" + ln.getText() + "','" + em.getText() + "','" + un.getText() + "','" + upass.getText() + "','" + utype.getSelectedItem() + "','"+ustat.getSelectedItem()+"')")){
        JOptionPane.showMessageDialog(null, "Registered Successfully");
        UsersForm uForm = new UsersForm();
        uForm.setVisible(true);
        this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Connection Error!");
        }
    }     
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(fn.getText().isEmpty()|| ln.getText().isEmpty()|| em.getText().isEmpty()
             ||un.getText().isEmpty()||upass.getText().isEmpty()){
         JOptionPane.showMessageDialog(null, "All fields are required! ");
     }else if(upass.getText().length()<8){
      JOptionPane.showMessageDialog(null, "Password character should be 8 above.");
      upass.setText("");
     }else if(updateChecker()){
         System.out.println("Duplicate Exit! ");
     }else{   
            String hashingpass = hash("(u_password = '"+upass.getText()+"')");
        DBconnector dbc = new DBconnector();
        dbc.updateData("UPDATE tblassign SET u_fname = '"+fn.getText()+"', u_lname = '"+ln.getText()+"',"
                + "u_email = '"+em.getText()+"',u_username = '"+un.getText()+"',u_password = '"+upass.getText()+"',"
          + "u_type = '"+utype.getSelectedItem()+"',u_status = '"+ustat.getSelectedItem()+"' WHERE u_id = '"+id.getText()+"'");
     
      
       UsersForm sfr = new UsersForm();
       sfr.setVisible(true);
       this.dispose();
    }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
           
    }//GEN-LAST:event_deleteActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
            UsersForm uForm = new UsersForm();
            uForm.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

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
    public javax.swing.JButton add;
    public javax.swing.JButton cancel;
    public javax.swing.JButton clear;
    public javax.swing.JButton delete;
    public javax.swing.JTextField em;
    public javax.swing.JTextField fn;
    public javax.swing.JTextField id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField ln;
    public javax.swing.JButton refresh;
    public javax.swing.JTextField un;
    public javax.swing.JTextField upass;
    public javax.swing.JButton update;
    public javax.swing.JComboBox<String> ustat;
    public javax.swing.JComboBox<String> utype;
    // End of variables declaration//GEN-END:variables
}
