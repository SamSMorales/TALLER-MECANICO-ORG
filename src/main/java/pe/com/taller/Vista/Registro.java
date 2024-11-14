package pe.com.taller.Vista;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import pe.com.taller.Controlador.ControladorRegistro;
import pe.com.taller.Modelo.Conexion;
import pe.com.taller.Modelo.SqlUsuarios;
import pe.com.taller.Modelo.Usuarios;

/**
 *
 * @author silva
 */
public class Registro extends javax.swing.JFrame {

    private ControladorRegistro controlador;
    DefaultComboBoxModel a1;

    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
        a1 = new DefaultComboBoxModel();
        cargarlistaRoles();
        controlador = new ControladorRegistro();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtUsuarioReg = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcontraseñaCon = new javax.swing.JPasswordField();
        txtcontraseñaReg = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        cbxRoles = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Usuarios");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(600, 530));
        setName("frmRegistro"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, 20));

        txtUsuarioReg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUsuarioReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioRegActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuarioReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 240, -1));

        btnCancelar.setBackground(new java.awt.Color(244, 67, 54));
        btnCancelar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, 30));

        btnRegistrar.setBackground(new java.awt.Color(0, 210, 148));
        btnRegistrar.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, 30));

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel6.setText("Contraseña:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, 20));

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel8.setText("Confirmar Contraseña:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 150, 40));

        txtcontraseñaCon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtcontraseñaCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 240, -1));

        txtcontraseñaReg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(txtcontraseñaReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 240, -1));

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel9.setText("Rol:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 30, 40));

        cbxRoles.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRolesActionPerformed(evt);
            }
        });
        getContentPane().add(cbxRoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 240, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\archivos\\UTP\\VIII_CICLO_AGOSTO_2024\\CURSO_INTEGRADOR_I\\PROYECTO\\FS\\PROY-TALLER-MECANICO\\src\\main\\java\\pe\\com\\taller\\img\\registro.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 80, 80));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel1.setText("Registro de Usuarios");
        jLabel1.setAlignmentX(20.0F);
        jLabel1.setAlignmentY(1.0F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(120, 120, 120))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(457, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioRegActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        String usuario = txtUsuarioReg.getText();
        String password = txtcontraseñaReg.getText();
        String passwordconf = txtcontraseñaCon.getText();
        String roles = (String) cbxRoles.getSelectedItem();

        SqlUsuarios modSql = new SqlUsuarios();
        Usuarios mod = new Usuarios();

        if (password.equals("") || passwordconf.equals("") || usuario.equals("")) {

            JOptionPane.showMessageDialog(null, "Hay campos vacios, debe llenar todos los campos");

        } else {

            if (password.equals(passwordconf)) {

                if (modSql.existeUsuario(usuario) == 0) {

                    controlador.agregar(usuario, password, roles);
                    limpiar();

                } else {

                    JOptionPane.showMessageDialog(null, "El usuario ya existe");

                }

            } else {

                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");

            }

        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cbxRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRolesActionPerformed

    }//GEN-LAST:event_cbxRolesActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    public void limpiar() {

        txtUsuarioReg.setText("");
        txtcontraseñaCon.setText("");
        txtcontraseñaCon.setText("");
        cbxRoles.setSelectedItem(0);

    }

    public void cargarlistaRoles() {
        Conexion con = new Conexion();
        ResultSet res;
        try {
            con.getconexion();
            String sql = "SELECT * FROM tipo_usuario";
            PreparedStatement pre = con.getconexion().prepareCall(sql);
            res = pre.executeQuery();
            a1.removeAllElements(); // Limpiar antes de agregar nuevos elementos

            while (res.next()) {
                String tipo = res.getString("tipo");
                a1.addElement(tipo); // Agregar la cadena concatenada al modelo
            }

            cbxRoles.setModel(a1); // Establecer el modelo en el combo box

        } catch (SQLException e) {

            System.out.println("ERROR: " + e);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxRoles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtUsuarioReg;
    private javax.swing.JPasswordField txtcontraseñaCon;
    private javax.swing.JPasswordField txtcontraseñaReg;
    // End of variables declaration//GEN-END:variables
}
