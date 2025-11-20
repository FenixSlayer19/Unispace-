package Interface_employed;

import Interface.Inicio;
import Interface.Login;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import conexión.Conexión;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;


public class report_page extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(report_page.class.getName());

    public report_page() {
        initComponents();
        cargarReportes(); // <<--- AÑADIR ESTO
        botonActualizar.addActionListener(e -> cargarReportes());

    }

    private void cargarReportes() {
        DefaultTableModel modelo = (DefaultTableModel) tabla_reportes.getModel();
        modelo.setRowCount(0); // Limpiar tabla

        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            conn = conexión.Conexión.getConexion();

            // Query que trae el NOMBRE del usuario que hizo el reporte
            String sql = "SELECT u.nombre, r.descripcion, r.fecha_hora_error, r.estado "
                    + "FROM reportar_error r "
                    + "JOIN usuario u ON u.id_usuario = r.id_usuario "
                    + "ORDER BY r.id_error DESC";

            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                String nombreUsuario = rs.getString("nombre");
                String descripcion = rs.getString("descripcion");
                String fecha = rs.getString("fecha_hora_error");
                String estado = rs.getString("estado");

                modelo.addRow(new Object[]{nombreUsuario, descripcion, fecha, estado});
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error cargando reportes: " + ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
            }
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_reportes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        botonActualizar = new javax.swing.JButton();
        report_icon = new javax.swing.JLabel();
        report_text = new javax.swing.JLabel();
        start_iconButton = new javax.swing.JLabel();
        logOut_icon = new javax.swing.JLabel();
        start_button = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        panelScroll = new javax.swing.JPanel();
        white_background = new javax.swing.JLabel();
        whiteLogo = new javax.swing.JLabel();
        unispace_Text = new javax.swing.JLabel();
        background_Space = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_reportes.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 12)); // NOI18N
        tabla_reportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Usuario", "Descripcion", "Fecha ", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_reportes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 870, 500));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reload_icon.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 30, 30));

        botonActualizar.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 14)); // NOI18N
        botonActualizar.setText("Actualizar");
        botonActualizar.setBorder(null);
        getContentPane().add(botonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 120, 30));

        report_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/error_icon_1.png"))); // NOI18N
        getContentPane().add(report_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 75, 40, 40));

        report_text.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 38)); // NOI18N
        report_text.setText("Reportes");
        getContentPane().add(report_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        start_iconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/start_icon.png"))); // NOI18N
        getContentPane().add(start_iconButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 240, 40, 30));

        logOut_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logOut_icon.png"))); // NOI18N
        getContentPane().add(logOut_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 640, 40, 30));

        start_button.setBackground(new java.awt.Color(44, 44, 44));
        start_button.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 20)); // NOI18N
        start_button.setForeground(new java.awt.Color(255, 255, 255));
        start_button.setText("Inicio");
        start_button.setBorder(null);
        start_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                start_buttonMouseClicked(evt);
            }
        });
        start_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(start_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 250, 70));

        logOutButton.setBackground(new java.awt.Color(44, 44, 44));
        logOutButton.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 20)); // NOI18N
        logOutButton.setForeground(new java.awt.Color(255, 255, 255));
        logOutButton.setText("Cerrar Sesion ");
        logOutButton.setBorder(null);
        logOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutButtonMouseClicked(evt);
            }
        });
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 250, 70));
        getContentPane().add(panelScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 870, 490));

        white_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white_background.png"))); // NOI18N
        getContentPane().add(white_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 1010, 640));

        whiteLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/start_logo.png"))); // NOI18N
        getContentPane().add(whiteLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 107, 118));

        unispace_Text.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 50)); // NOI18N
        unispace_Text.setForeground(new java.awt.Color(255, 255, 255));
        unispace_Text.setText("UniSpace");
        unispace_Text.setToolTipText("");
        getContentPane().add(unispace_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        background_Space.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black_background.png"))); // NOI18N
        getContentPane().add(background_Space, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void start_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_buttonActionPerformed
        // Nada por el momento
    }//GEN-LAST:event_start_buttonActionPerformed

    private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseClicked
        this.dispose();                     // Cierra la ventana actual (Infraestructura)
        Login cerrarS = new Login(); // Crea la nueva ventana(Inicio)
        cerrarS.setVisible(true);
    }//GEN-LAST:event_logOutButtonMouseClicked

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed

    }//GEN-LAST:event_logOutButtonActionPerformed

    private void start_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_buttonMouseClicked
        this.dispose();                     // Cierra la ventana actual (Infraestructura)
        inicio_empleado start_pageEmp = new inicio_empleado(); // Crea la nueva ventana(Inicio)
        start_pageEmp.setVisible(true);
    }//GEN-LAST:event_start_buttonMouseClicked

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new report_page().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_Space;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel logOut_icon;
    private javax.swing.JPanel panelScroll;
    private javax.swing.JLabel report_icon;
    private javax.swing.JLabel report_text;
    private javax.swing.JButton start_button;
    private javax.swing.JLabel start_iconButton;
    private javax.swing.JTable tabla_reportes;
    private javax.swing.JLabel unispace_Text;
    private javax.swing.JLabel whiteLogo;
    private javax.swing.JLabel white_background;
    // End of variables declaration//GEN-END:variables
}
