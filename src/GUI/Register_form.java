/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import CONTROLLER.Customer_prepared_statement;
import MODEL.User;

/**
 *
 * @author USER
 */
public class Register_form extends javax.swing.JFrame {

    /**
     * Creates new form Register_form
     */
    public Register_form() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PasswordTextField = new javax.swing.JTextField();
        EmailTextField = new javax.swing.JTextField();
        register_form = new javax.swing.JButton();
        Back_form = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        ContactInfoTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Role = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jLabel1.setText("Register Form");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 77, 223, -1));

        jLabel2.setText("EMAIL:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 67, -1));

        jLabel3.setText("PASSWORD:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        PasswordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 383, -1));

        EmailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(EmailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 383, -1));

        register_form.setText("Register");
        register_form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_formActionPerformed(evt);
            }
        });
        getContentPane().add(register_form, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        Back_form.setText("Back");
        Back_form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_formActionPerformed(evt);
            }
        });
        getContentPane().add(Back_form, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, -1));

        jLabel5.setText("NAME:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        ContactInfoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactInfoTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(ContactInfoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 380, -1));

        jLabel6.setText("CONTACT INFO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 380, -1));

        jLabel7.setText("Role");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, -1, -1));

        Role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Admin" }));
        Role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleActionPerformed(evt);
            }
        });
        getContentPane().add(Role, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 120, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pexels-photo-1108099.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1230, 970));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordTextFieldActionPerformed

    private void ContactInfoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactInfoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactInfoTextFieldActionPerformed

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextFieldActionPerformed

    private void register_formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_formActionPerformed
        User cust1 = new User();
        cust1.setName(NameTextField.getText());
        cust1.setEmail(EmailTextField.getText());
        cust1.setPassword(PasswordTextField.getText());
        cust1.setContactInfo(ContactInfoTextField.getText());
        Customer_prepared_statement.Save(cust1);
    }//GEN-LAST:event_register_formActionPerformed

    private void Back_formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_formActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Login_form().setVisible(true);
    }//GEN-LAST:event_Back_formActionPerformed

    private void EmailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailTextFieldActionPerformed

    private void RoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoleActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
    }//GEN-LAST:event_RoleActionPerformed

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
            java.util.logging.Logger.getLogger(Register_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display   the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_form;
    private javax.swing.JTextField ContactInfoTextField;
    private javax.swing.JTextField EmailTextField;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField PasswordTextField;
    private javax.swing.JComboBox<String> Role;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton register_form;
    // End of variables declaration//GEN-END:variables
}
