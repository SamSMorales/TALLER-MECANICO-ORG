/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.com.taller.Vista;

/**
 *
 * @author silva
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
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
        txtUsuarioReg = new javax.swing.JTextField();
        txtcontraseñaReg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxRolReg = new javax.swing.JComboBox<>();
        txtDNI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCancelar = new javax.swing.JButton();
        txtRegistrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frmRegistro"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setText("Registro de Personal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, 20));

        txtUsuarioReg.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        txtUsuarioReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioRegActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuarioReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 240, -1));

        txtcontraseñaReg.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        txtcontraseñaReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraseñaRegActionPerformed(evt);
            }
        });
        getContentPane().add(txtcontraseñaReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 240, -1));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, 20));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel4.setText("Rol:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, 20));

        cbxRolReg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cbxRolReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 240, -1));

        txtDNI.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        getContentPane().add(txtDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 240, -1));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel5.setText("DNI:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, 20));

        txtCancelar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtCancelar.setText("Cancelar");
        txtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(txtCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, 40));

        txtRegistrar1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtRegistrar1.setText("Registrar");
        txtRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioRegActionPerformed

    private void txtcontraseñaRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraseñaRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontraseñaRegActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCancelarActionPerformed
        Registro frmReg = new Registro();
        frmReg.setVisible(true);
    }//GEN-LAST:event_txtCancelarActionPerformed

    private void txtRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistrar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxRolReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton txtCancelar;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JButton txtRegistrar1;
    private javax.swing.JTextField txtUsuarioReg;
    private javax.swing.JTextField txtcontraseñaReg;
    // End of variables declaration//GEN-END:variables
}
