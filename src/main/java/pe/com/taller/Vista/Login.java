package pe.com.taller.Vista;

import javax.swing.JOptionPane;
import pe.com.taller.Modelo.ConsultaUsuarios;
import pe.com.taller.Modelo.Usuarios;

public class Login extends javax.swing.JFrame {

    Registro frmReg;

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxRol = new javax.swing.JComboBox<>();
        txtIngresar = new javax.swing.JButton();
        txtRegistrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setName("frmLogin"); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 519));
        setResizable(false);
        setSize(new java.awt.Dimension(583, 419));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel1.setText("Taller Mecanico ChikiCard");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, 20));

        txtUsuario.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 240, -1));

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, 20));

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel4.setText("Rol:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, -1, 20));

        cbxRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "EMPLEADO" }));
        getContentPane().add(cbxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 240, -1));

        txtIngresar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtIngresar.setText("Ingresar");
        txtIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(txtIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        txtRegistrar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        txtRegistrar.setText("Registrarme");
        txtRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(txtRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\archivos\\UTP\\VIII_CICLO_AGOSTO_2024\\CURSO_INTEGRADOR_I\\PROYECTO\\JAVA\\PROY-TALLER-MECANICO\\src\\main\\java\\pe\\com\\taller\\img\\iconUser.png")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 120, 110));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 240, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistrarActionPerformed

        if (frmReg == null) {

            frmReg = new Registro();
            frmReg.setVisible(true);

        }

    }//GEN-LAST:event_txtRegistrarActionPerformed

    private void txtIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresarActionPerformed

        // Verificar que los campos no sean nulos
        if (txtUsuario == null || txtPassword == null || cbxRol == null) {
            JOptionPane.showMessageDialog(null, "Los campos de entrada son nulos.");
            return;
        }

        String usuario = txtUsuario.getText();
        String pass = new String(txtPassword.getPassword());

         // Verificar que los campos no estén vacíos
        if (!usuario.isEmpty() && !pass.isEmpty() && cbxRol.getSelectedItem() != null) {
            Usuarios mod = new Usuarios(0, usuario, pass, cbxRol.getSelectedItem().toString());

            ConsultaUsuarios modSql = new ConsultaUsuarios();
            if (modSql.login(mod)) {
                this.dispose();
                AdmPersonalRegistrado apr = new AdmPersonalRegistrado();
                apr.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Datos Incorrectos");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar sus datos");
        }

    }//GEN-LAST:event_txtIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton txtIngresar;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JButton txtRegistrar;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
