package Interface;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import javax.swing.border.LineBorder;
import java.sql.Connection;
import conexión.Conexión;

public class booking_page extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(booking_page.class.getName());

    public booking_page() {
        initComponents();
            cargarReservasUsuario();

    }
    private void cargarReservasUsuario() {
    jPanelContenedorReserva.removeAll(); 

    int idUsuario = Login.usuarioID;

    String sql = "SELECT * FROM reservas WHERE id_usuarios = ? AND estado = 'Ocupado'";

    try (Connection conn = Conexión.getConexion();
         PreparedStatement pst = conn.prepareStatement(sql)) {

        pst.setInt(1, idUsuario);
        ResultSet rs = pst.executeQuery();

        while (rs.next()) {

            String nombre = rs.getString("nombre_recurso");
            String tipo = rs.getString("tipo_recurso");
            String fecha = rs.getString("fecha");
            String inicio = rs.getString("hora_inicio");
            String fin = rs.getString("hora_fin");

            JPanel panel = crearTarjetaReserva(nombre, tipo, fecha, inicio, fin);
            jPanelContenedorReserva.add(panel);
        }

        jPanelContenedorReserva.revalidate();
        jPanelContenedorReserva.repaint();

    } catch (SQLException e) {
        System.out.println("Error cargando reservas: " + e.getMessage());
    }
}
private JPanel crearTarjetaReserva(String nombre, String tipo, String fecha, String hInicio, String hFin) {

    JPanel p = new JPanel();
    p.setLayout(null);
    p.setPreferredSize(new Dimension(820, 160));
    p.setBackground(Color.WHITE);
    p.setBorder(new LineBorder(Color.BLACK, 2, true));

    JLabel lblImg = new JLabel();
    lblImg.setBounds(20, 20, 120, 120);

    if (tipo.equalsIgnoreCase("tecnológico")) {
        lblImg.setIcon(new ImageIcon("src/img/laptop.png"));
    } else {
        lblImg.setIcon(new ImageIcon("src/img/salon.png"));
    }

    p.add(lblImg);

    JLabel lblNombre = new JLabel(nombre);
    lblNombre.setFont(new Font("Arial", Font.BOLD, 22));
    lblNombre.setBounds(160, 20, 400, 40);
    p.add(lblNombre);

    JLabel lblFecha = new JLabel(fecha);
    lblFecha.setFont(new Font("Arial", Font.PLAIN, 18));
    lblFecha.setBounds(160, 60, 400, 30);
    p.add(lblFecha);

    JLabel lblHoras = new JLabel(hInicio + " - " + hFin);
    lblHoras.setFont(new Font("Arial", Font.PLAIN, 18));
    lblHoras.setBounds(160, 95, 400, 30);
    p.add(lblHoras);

    JButton btnCancelar = new JButton("Cancelar");
    btnCancelar.setBounds(650, 55, 120, 45);

    btnCancelar.addActionListener(e ->
            cancelarReserva(nombre, tipo)
    );

    p.add(btnCancelar);

    return p;
}
private void cancelarReserva(String nombre, String tipo) {

    int opcion = JOptionPane.showConfirmDialog(this,
            "¿Cancelar esta reserva?",
            "Confirmar",
            JOptionPane.YES_NO_OPTION);

    if (opcion != JOptionPane.YES_OPTION) return;

    int idUsuario = Login.usuarioID;

    try (Connection conn = Conexión.getConexion()) {

        PreparedStatement pst1 = conn.prepareStatement(
                "UPDATE reservas SET estado='Cancelado' WHERE nombre_recurso=? AND id_usuarios=?"
        );
        pst1.setString(1, nombre);
        pst1.setInt(2, idUsuario);
        pst1.executeUpdate();

        String tabla = tipo.equalsIgnoreCase("tecnológico")
                ? "Recursos_tecno"
                : "Recursos_infraestructura";

        PreparedStatement pst2 = conn.prepareStatement(
                "UPDATE " + tabla + " SET estado='Disponible' WHERE nombre_recurso=?"
        );
        pst2.setString(1, nombre);
        pst2.executeUpdate();

        JOptionPane.showMessageDialog(this, "Reserva cancelada.");

        cargarReservasUsuario();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelContenedorReserva = new javax.swing.JPanel();
        tecResources_iconButton = new javax.swing.JLabel();
        infrastructure_iconButton = new javax.swing.JLabel();
        start_iconButton = new javax.swing.JLabel();
        unispace_Text = new javax.swing.JLabel();
        logOut_icon = new javax.swing.JLabel();
        start_button = new javax.swing.JButton();
        tec_resourcesButton = new javax.swing.JButton();
        infrastructureButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        tecResourses_text = new javax.swing.JLabel();
        reportarError_Icon = new javax.swing.JLabel();
        whiteLogo = new javax.swing.JLabel();
        white_background = new javax.swing.JLabel();
        booking_background = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelContenedorReserva.setLayout(new javax.swing.BoxLayout(jPanelContenedorReserva, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(jPanelContenedorReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 970, 550));

        tecResources_iconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resources_icon.png"))); // NOI18N
        getContentPane().add(tecResources_iconButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 340, 40, 30));

        infrastructure_iconButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infrastructure_iconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/infrastructure_icon.png"))); // NOI18N
        getContentPane().add(infrastructure_iconButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 439, 40, 30));

        start_iconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/start_icon.png"))); // NOI18N
        getContentPane().add(start_iconButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 240, 40, 30));

        unispace_Text.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 50)); // NOI18N
        unispace_Text.setForeground(new java.awt.Color(255, 255, 255));
        unispace_Text.setText("UniSpace");
        unispace_Text.setToolTipText("");
        getContentPane().add(unispace_Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

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

        tec_resourcesButton.setBackground(new java.awt.Color(44, 44, 44));
        tec_resourcesButton.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 20)); // NOI18N
        tec_resourcesButton.setForeground(new java.awt.Color(255, 255, 255));
        tec_resourcesButton.setText("Tecnologicos ");
        tec_resourcesButton.setBorder(null);
        tec_resourcesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tec_resourcesButtonMouseClicked(evt);
            }
        });
        tec_resourcesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tec_resourcesButtonActionPerformed(evt);
            }
        });
        getContentPane().add(tec_resourcesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 250, 70));

        infrastructureButton.setBackground(new java.awt.Color(44, 44, 44));
        infrastructureButton.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 20)); // NOI18N
        infrastructureButton.setForeground(new java.awt.Color(255, 255, 255));
        infrastructureButton.setText("Infraestructura");
        infrastructureButton.setBorder(null);
        infrastructureButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infrastructureButtonMouseClicked(evt);
            }
        });
        infrastructureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infrastructureButtonActionPerformed(evt);
            }
        });
        getContentPane().add(infrastructureButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 250, 70));

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

        tecResourses_text.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 38)); // NOI18N
        tecResourses_text.setText("Mis reservas");
        getContentPane().add(tecResourses_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 83, -1, -1));

        reportarError_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/booking_icon_black.png"))); // NOI18N
        getContentPane().add(reportarError_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 40, -1));

        whiteLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/start_logo.png"))); // NOI18N
        getContentPane().add(whiteLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 107, 118));

        white_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white_background.png"))); // NOI18N
        getContentPane().add(white_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 1010, 640));

        booking_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black_background.png"))); // NOI18N
        getContentPane().add(booking_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 710));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void start_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_buttonActionPerformed

    }//GEN-LAST:event_start_buttonActionPerformed

    private void tec_resourcesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tec_resourcesButtonActionPerformed

    }//GEN-LAST:event_tec_resourcesButtonActionPerformed

    private void infrastructureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infrastructureButtonActionPerformed

    }//GEN-LAST:event_infrastructureButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed

    }//GEN-LAST:event_logOutButtonActionPerformed

    private void start_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_buttonMouseClicked
        this.dispose();                     // Cierra la ventana actual (Reservas)
        Inicio start_page = new Inicio(); // Crea la nueva ventana(Inicio)
        start_page.setVisible(true);
    }//GEN-LAST:event_start_buttonMouseClicked

    private void tec_resourcesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tec_resourcesButtonMouseClicked
        this.dispose();                     // Cierra la ventana actual (Inicio)
        tecno_resources tecResourses = new tecno_resources(); // Crea la nueva ventana (tecno_resources)
        tecResourses.setVisible(true);        // La muestra:
    }//GEN-LAST:event_tec_resourcesButtonMouseClicked

    private void infrastructureButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infrastructureButtonMouseClicked
        this.dispose();                     // Cierra la ventana actual (Inicio)
        Insfractuture_resources infraResourses = new Insfractuture_resources(); // Crea la nueva ventana(Infraestructura)
        infraResourses.setVisible(true);
    }//GEN-LAST:event_infrastructureButtonMouseClicked

    private void logOutButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseClicked
        this.dispose();                     // Cierra la ventana actual (Reservas)
        Login login = new Login(); // Crea la nueva ventana(Login)
        login.setVisible(true);        // La muestra
    }//GEN-LAST:event_logOutButtonMouseClicked

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
        java.awt.EventQueue.invokeLater(() -> new booking_page().setVisible(true));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel booking_background;
    private javax.swing.JButton infrastructureButton;
    private javax.swing.JLabel infrastructure_iconButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanelContenedorReserva;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel logOut_icon;
    private javax.swing.JLabel reportarError_Icon;
    private javax.swing.JButton start_button;
    private javax.swing.JLabel start_iconButton;
    private javax.swing.JLabel tecResources_iconButton;
    private javax.swing.JLabel tecResourses_text;
    private javax.swing.JButton tec_resourcesButton;
    private javax.swing.JLabel unispace_Text;
    private javax.swing.JLabel whiteLogo;
    private javax.swing.JLabel white_background;
    // End of variables declaration//GEN-END:variables
}
