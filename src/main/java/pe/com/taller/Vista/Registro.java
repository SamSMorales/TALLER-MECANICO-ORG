package pe.com.taller.Vista;

import static java.util.Objects.hash;
import javax.swing.JOptionPane;
import pe.com.taller.Modelo.SqlUsuarios;
import pe.com.taller.Modelo.Usuarios;

/**
 *
 * @author silva
 */
public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuarioReg = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNombreReg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcontraseñaCon = new javax.swing.JPasswordField();
        txtcontraseñaReg = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 500));
        setName("frmRegistro"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setText("Registro de Personal");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, 20));

        txtUsuarioReg.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        txtUsuarioReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioRegActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuarioReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 240, -1));

        btnCancelar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, 40));

        btnRegistrar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel5.setText("Nombre:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, 20));

        txtNombreReg.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        txtNombreReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreRegActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 240, -1));

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel6.setText("Contraseña:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, 20));

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel8.setText("Confirmar Contraseña:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 150, 40));

        txtcontraseñaCon.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        getContentPane().add(txtcontraseñaCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 240, -1));

        txtcontraseñaReg.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        getContentPane().add(txtcontraseñaReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 240, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioRegActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Registro frmReg = new Registro();
        frmReg.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        SqlUsuarios modSql = new SqlUsuarios();
        Usuarios mod = new Usuarios();

        String pass = new String(txtcontraseñaReg.getPassword());
        String passCon = new String(txtcontraseñaCon.getPassword());

        if (txtNombreReg.getText().equals("") || pass.equals("") || passCon.equals("") || txtUsuarioReg.getText().equals("")) {

            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");

        } else {

            if (pass.equals(passCon)) {

                if (modSql.existeUsuario(txtUsuarioReg.getText()) == 0) {

                    //String nuevoPass = hash.sha1(pass);
                    mod.setNombre(txtNombreReg.getText());
                    mod.setUsuario(txtUsuarioReg.getText());
                    mod.setPassword(txtcontraseñaReg.getText());
                    mod.setId_tipo(1);

                    if (modSql.registrar(mod)) {

                        JOptionPane.showMessageDialog(null, "Registro Exitoso");

                    } else {

                        JOptionPane.showMessageDialog(null, "Error al guardar datos");

                    }
                } else {

                    JOptionPane.showMessageDialog(null, "El usuario ya existe");

                }

            } else {

                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");

            }

        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtNombreRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreRegActionPerformed

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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtNombreReg;
    private javax.swing.JTextField txtUsuarioReg;
    private javax.swing.JPasswordField txtcontraseñaCon;
    private javax.swing.JPasswordField txtcontraseñaReg;
    // End of variables declaration//GEN-END:variables
}
