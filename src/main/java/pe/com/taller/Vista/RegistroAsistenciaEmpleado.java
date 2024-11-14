package pe.com.taller.Vista;

import javax.swing.DefaultComboBoxModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import pe.com.taller.Modelo.Asistencia;
import pe.com.taller.Modelo.Conexion;
import pe.com.taller.Modelo.SQLAsistencia;

public class RegistroAsistenciaEmpleado extends javax.swing.JPanel {

    DefaultComboBoxModel a1;
    private Asistencia modelo;
    private SQLAsistencia consultas;

    public RegistroAsistenciaEmpleado() {
        initComponents();
        txtIdAsistencia.setVisible(false);
        txtIdEmpleado.setVisible(false);
        a1 = new DefaultComboBoxModel();
        cargarlistaPersonal();
        modelo = new Asistencia();
        consultas = new SQLAsistencia();
        consultas.MostrarTabla(tablaAsistencia);

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxEvento = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        CbxDniPersonal = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        txtIdEmpleado = new javax.swing.JTextField();
        txtIdAsistencia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAsistencia = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(770, 400));
        setPreferredSize(new java.awt.Dimension(770, 400));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 1, 20)); // NOI18N
        jLabel1.setText("Registro de Asistencia");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        cbxEvento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INGRESO", "SALIDA" }));
        jPanel1.add(cbxEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 180, -1));

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        CbxDniPersonal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(CbxDniPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 180, -1));

        btnRegistrar.setBackground(new java.awt.Color(0, 204, 51));
        btnRegistrar.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));
        jPanel1.add(txtIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 50, -1));
        jPanel1.add(txtIdAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 150, 50, -1));

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel8.setText("Evento:");
        jLabel8.setDoubleBuffered(true);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 400));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel3.setText("Control de Asistencia");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        txtBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 330, 30));

        tablaAsistencia.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaAsistencia);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, 180));

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jLabel7.setText("Evento:");
        jLabel7.setDoubleBuffered(true);
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 20));

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel5.setText("Buscar : ");
        jLabel5.setDoubleBuffered(true);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 83, -1, 20));
    }// </editor-fold>//GEN-END:initComponents

    public void cargarlistaPersonal() {
        Conexion con = new Conexion();
        ResultSet res;
        try {
            con.getconexion();
            String sql = "SELECT * FROM empleado";
            PreparedStatement pre = con.getconexion().prepareCall(sql);
            res = pre.executeQuery();
            a1.removeAllElements(); // Limpiar antes de agregar nuevos elementos

            while (res.next()) {
                String nombre = res.getString("nombre");
                String dni = res.getString("dni");
                String concatenado = nombre + " (" + dni + ")"; // Concatenar nombre y DNI
                a1.addElement(concatenado); // Agregar la cadena concatenada al modelo
            }

            CbxDniPersonal.setModel(a1); // Establecer el modelo en el combo box
        } catch (SQLException e) {
            System.out.println("ERROR: "+e);
        }
    }


    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (evt.getSource() == btnRegistrar) {

            modelo.setEvento((String) cbxEvento.getSelectedItem());
            modelo.setPersonal(CbxDniPersonal.getSelectedItem().toString().split(" ")[0]);

            try {
                consultas.insertarAsistencia(modelo);
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                consultas.MostrarTabla(tablaAsistencia);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error : " + ex.getMessage());
            }

        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public void limpiar() {

        cbxEvento.setSelectedItem(0);
        CbxDniPersonal.setSelectedItem(0);

    }

    public void ejecutarBusqueda() {
        String input = txtBuscar.getText();
        consultas.buscarAsistencia(input, tablaAsistencia);
    }

    public String obtenerNombreEmpleado(String dni) {
        // Lógica para obtener el nombre del empleado a partir del DNI
        String nombre = "Nombre Empleado";
        return nombre + " (" + dni + ")";
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> CbxDniPersonal;
    private javax.swing.JButton btnRegistrar;
    public javax.swing.JComboBox<String> cbxEvento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAsistencia;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtIdAsistencia;
    private javax.swing.JTextField txtIdEmpleado;
    // End of variables declaration//GEN-END:variables
}
