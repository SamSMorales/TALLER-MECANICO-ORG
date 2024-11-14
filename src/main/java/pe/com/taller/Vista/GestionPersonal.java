package pe.com.taller.Vista;

import javax.swing.JOptionPane;
import pe.com.taller.Modelo.Personal;
import pe.com.taller.Modelo.SQLPersonal;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import pe.com.taller.Controlador.PersonalControlador;

public class GestionPersonal extends javax.swing.JPanel {

    private Personal modelo;
    private SQLPersonal consultas;
    private PersonalControlador controlador;

    public GestionPersonal() {
        initComponents();
        modelo = new Personal();
        consultas = new SQLPersonal();
        controlador = new PersonalControlador();
        txtId.setVisible(false);
        consultas.MostrarTable(tablaPersonal);

        txtBuscar.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                ejecutarBusqueda();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                ejecutarBusqueda();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                ejecutarBusqueda();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBuscar = new javax.swing.JTextField();
        btnReporte = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();
        cbxPuesto = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPersonal = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtRegistro = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(770, 400));
        setPreferredSize(new java.awt.Dimension(770, 400));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 390, 30));

        btnReporte.setBackground(new java.awt.Color(3, 47, 48));
        btnReporte.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte.setText("Generar Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        add(btnReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, -1, 30));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(210, 769));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 40, 60, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 190, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel5.setText("Apellido:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 70, -1));

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 190, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel6.setText("DNI:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 60, -1));

        txtDni.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, 30));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel7.setText("Puesto:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 60, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial Narrow", 0, 16)); // NOI18N
        jLabel8.setText("Sueldo:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 60, -1));

        txtSueldo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 190, 30));

        cbxPuesto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mecanico", "Practicante", "Asistente" }));
        jPanel1.add(cbxPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 190, 30));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 40, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel9.setText("Registrar Personal");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 400));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel3.setText("Reporte Personal");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(180, 24, 45));
        btnEliminar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));

        BtnModificar.setBackground(new java.awt.Color(227, 107, 44));
        BtnModificar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        BtnModificar.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });
        add(BtnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(3, 47, 48));
        btnGuardar.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Registrar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        tablaPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPersonalMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaPersonal);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 480, 200));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel4.setText("Buscar : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 65, -1, 20));

        txtRegistro.setBackground(new java.awt.Color(39, 77, 96));
        txtRegistro.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        txtRegistro.setForeground(new java.awt.Color(255, 255, 255));
        txtRegistro.setText("Agregar Usuario");
        txtRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroActionPerformed(evt);
            }
        });
        add(txtRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, -1, 30));
    }// </editor-fold>//GEN-END:initComponents

    /**/

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        controlador.eliminar(Integer.parseInt(txtId.getText()));
        consultas.MostrarTable(tablaPersonal);
        limpiarentradas();


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed

        int id = Integer.parseInt(txtId.getText());
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String dni = txtDni.getText();
        String puesto = (String) cbxPuesto.getSelectedItem();
        double sueldo = Double.parseDouble(txtSueldo.getText());
        controlador.modificar(id, nombre, apellido, dni, puesto, sueldo);
        consultas.MostrarTable(tablaPersonal);
        limpiarentradas();


    }//GEN-LAST:event_BtnModificarActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed

        consultas.reporte();

    }//GEN-LAST:event_btnReporteActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String dni = txtDni.getText();
        String puesto = (String) cbxPuesto.getSelectedItem();
        double sueldo = Double.parseDouble(txtSueldo.getText());
        controlador.guardar(nombre, apellido, dni, puesto, sueldo);
        consultas.MostrarTable(tablaPersonal);
        limpiarentradas();


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed

    }//GEN-LAST:event_txtIdActionPerformed

    private void tablaPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPersonalMouseClicked

        int fila = tablaPersonal.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Usuario no seleccionado");
        } else {
            // Obtener el ID como Integer
            int id = (Integer) tablaPersonal.getValueAt(fila, 0); // Asumiendo que el ID es un Integer
            String nombre = (String) tablaPersonal.getValueAt(fila, 1);
            String apellido = (String) tablaPersonal.getValueAt(fila, 2);
            String dni = (String) tablaPersonal.getValueAt(fila, 3);
            String puesto = (String) tablaPersonal.getValueAt(fila, 4);

            // Obtener el salario como Double
            double salario = (Double) tablaPersonal.getValueAt(fila, 5); // Cambia a Double

            // Establecer los valores en los campos de texto
            txtId.setText(String.valueOf(id)); // Convertir id a String
            txtNombre.setText(nombre);
            txtApellido.setText(apellido);
            txtDni.setText(dni);
            cbxPuesto.setSelectedItem(puesto);
            txtSueldo.setText(String.valueOf(salario)); // Convertir salario a String
        }


    }//GEN-LAST:event_tablaPersonalMouseClicked

    private void txtRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroActionPerformed
        
        Registro frm_registro = new Registro();
        frm_registro.setVisible(true);
        
    }//GEN-LAST:event_txtRegistroActionPerformed

    public void limpiarentradas() {

        txtBuscar.setText("");
        txtId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtDni.setText("");
        cbxPuesto.setSelectedItem(0);
        txtSueldo.setText("");

    }

    public void ejecutarBusqueda() {
        String input = txtBuscar.getText();
        consultas.buscar(input, tablaPersonal);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BtnModificar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnReporte;
    public javax.swing.JComboBox<String> cbxPuesto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tablaPersonal;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtNombre;
    private javax.swing.JButton txtRegistro;
    public javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
