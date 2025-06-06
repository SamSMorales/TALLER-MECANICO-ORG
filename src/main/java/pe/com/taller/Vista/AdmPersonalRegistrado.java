package pe.com.taller.Vista;

public class AdmPersonalRegistrado extends javax.swing.JFrame {

    GestionPersonal gp = new GestionPersonal();
    RegistroAsistencia ra = new RegistroAsistencia();
    GestionPlanilla planilla = new GestionPlanilla();
    
    public AdmPersonalRegistrado() {
        initComponents();
        main.add(gp);
        main.add(ra);
        main.add(planilla);
        gp.setVisible(false);
        ra.setVisible(false);
        planilla.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        BtnPersonal = new javax.swing.JButton();
        btnRegistroAsistencia = new javax.swing.JButton();
        btnPagos = new javax.swing.JButton();
        main = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración");
        setMinimumSize(new java.awt.Dimension(900, 560));
        setPreferredSize(new java.awt.Dimension(900, 560));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(680, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\archivos\\UTP\\VIII_CICLO_AGOSTO_2024\\CURSO_INTEGRADOR_I\\PROYECTO\\FS\\PROY-TALLER-MECANICO\\src\\main\\java\\pe\\com\\taller\\img\\banner.jpg")); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 150));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 140));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 140));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(39, 77, 96));
        btnSalir.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\archivos\\UTP\\VIII_CICLO_AGOSTO_2024\\CURSO_INTEGRADOR_I\\PROYECTO\\JAVA\\PROY-TALLER-MECANICO\\src\\main\\java\\pe\\com\\taller\\img\\closeAdm.jpg")); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 110, 57));

        BtnPersonal.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\archivos\\UTP\\VIII_CICLO_AGOSTO_2024\\CURSO_INTEGRADOR_I\\PROYECTO\\JAVA\\PROY-TALLER-MECANICO\\src\\main\\java\\pe\\com\\taller\\img\\userAdm.jpg")); // NOI18N
        BtnPersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPersonalActionPerformed(evt);
            }
        });
        jPanel2.add(BtnPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 57));

        btnRegistroAsistencia.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\archivos\\UTP\\VIII_CICLO_AGOSTO_2024\\CURSO_INTEGRADOR_I\\PROYECTO\\FS\\PROY-TALLER-MECANICO\\src\\main\\java\\pe\\com\\taller\\img\\asistencia.jpg")); // NOI18N
        btnRegistroAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroAsistenciaActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistroAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 110, 57));

        btnPagos.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\archivos\\UTP\\VIII_CICLO_AGOSTO_2024\\CURSO_INTEGRADOR_I\\PROYECTO\\JAVA\\PROY-TALLER-MECANICO\\src\\main\\java\\pe\\com\\taller\\img\\moneyAdm.jpg")); // NOI18N
        btnPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagosActionPerformed(evt);
            }
        });
        jPanel2.add(btnPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 110, 57));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 110, 400));

        main.setLayout(new java.awt.CardLayout());
        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 770, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        Login login = new Login();
        login.setVisible(true);

    }//GEN-LAST:event_btnSalirActionPerformed

    private void BtnPersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPersonalActionPerformed

        gp.setVisible(true);
        ra.setVisible(false);
        planilla.setVisible(false);

    }//GEN-LAST:event_BtnPersonalActionPerformed

    private void btnRegistroAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroAsistenciaActionPerformed

        gp.setVisible(false);
        ra.setVisible(true);
        planilla.setVisible(false);
    }//GEN-LAST:event_btnRegistroAsistenciaActionPerformed

    private void btnPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagosActionPerformed
        gp.setVisible(false);
        ra.setVisible(false);
        planilla.setVisible(true);
    }//GEN-LAST:event_btnPagosActionPerformed

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
            java.util.logging.Logger.getLogger(AdmPersonalRegistrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmPersonalRegistrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmPersonalRegistrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmPersonalRegistrado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmPersonalRegistrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPersonal;
    private javax.swing.JButton btnPagos;
    private javax.swing.JButton btnRegistroAsistencia;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLayeredPane main;
    // End of variables declaration//GEN-END:variables
}
