package Interface;

import conexión.Conexión;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JFileChooser;
import java.sql.Connection;

public class Reportar_error extends javax.swing.JFrame {

    private String rutaMultimediaSeleccionada = "";

    private String recursoSeleccionado = "";

    public Reportar_error() {
        initComponents();
    }

    private String copiarArchivoMultimedia(File origen) throws IOException {
        if (origen == null) {
            return "";
        }

        File carpetaDestino = new File(System.getProperty("user.dir"), "multimedia_reportes");
        if (!carpetaDestino.exists()) {
            carpetaDestino.mkdirs();
        }

        
        String nombreUnico = System.currentTimeMillis() + "_" + origen.getName();
        File destino = new File(carpetaDestino, nombreUnico);

        Files.copy(origen.toPath(), destino.toPath(), StandardCopyOption.REPLACE_EXISTING);
        
        return "multimedia_reportes/" + nombreUnico;
    }

    private void guardarReporte() {
        String asunto = cajaTextoAsunto.getText().trim();
        String descripcion = CajaTextoDescripcion.getText().trim();
        String multimediaRuta = rutaMultimediaSeleccionada; // puede estar vacío
        int idUsuario = Login.usuarioID;
        String nombreRecurso = recursoSeleccionado == null ? "" : recursoSeleccionado;
        String estado = "Sin revisar";

        if (asunto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor escribe un asunto.");
            return;
        }
        if (descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor escribe una descripción.");
            return;
        }

        LocalDateTime ahora = LocalDateTime.now();
        String fechaHora = ahora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy - hh:mma"));

        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = Conexión.getConexion();
            String sql = "INSERT INTO reportar_error (id_usuario, nombre_recurso, asunto, descripcion, fecha_hora_error, estado, multimedia) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";

            pst = conn.prepareStatement(sql);
            pst.setInt(1, idUsuario);
            pst.setString(2, nombreRecurso);
            pst.setString(3, asunto);
            pst.setString(4, descripcion);
            pst.setString(5, fechaHora);
            pst.setString(6, estado);
            pst.setString(7, multimediaRuta);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Reporte enviado correctamente.");

            cajaTextoAsunto.setText("");
            CajaTextoDescripcion.setText("");
            rutaMultimediaSeleccionada = "";
            labelNombreArchivo.setText("Ningún archivo seleccionado");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error guardando reporte: " + ex.getMessage());
        } finally {
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

        jButton1 = new javax.swing.JButton();
        labelNombreArchivo = new javax.swing.JLabel();
        reportarError_Icon = new javax.swing.JLabel();
        start_iconButton = new javax.swing.JLabel();
        start_Button = new javax.swing.JButton();
        tecResources_iconButton = new javax.swing.JLabel();
        tec_resourcesButton = new javax.swing.JButton();
        infrastructure_iconButton = new javax.swing.JLabel();
        infrastructure_Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CajaTextoDescripcion = new javax.swing.JTextArea();
        logOut_icon1 = new javax.swing.JLabel();
        logOut_Button1 = new javax.swing.JButton();
        botonEnviar = new javax.swing.JButton();
        cajaTextoAsunto = new javax.swing.JTextField();
        tecResourses_text = new javax.swing.JLabel();
        gray_background = new javax.swing.JLabel();
        whiteLogo = new javax.swing.JLabel();
        unispace_text = new javax.swing.JLabel();
        white_background = new javax.swing.JLabel();
        Error_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(175, 175, 175));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clip.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 580, 40, 50));

        labelNombreArchivo.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 12)); // NOI18N
        getContentPane().add(labelNombreArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 590, 390, 40));

        reportarError_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/error_icon_1.png"))); // NOI18N
        getContentPane().add(reportarError_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 75, -1, -1));

        start_iconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/start_icon.png"))); // NOI18N
        getContentPane().add(start_iconButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 240, 40, 30));

        start_Button.setBackground(new java.awt.Color(44, 44, 44));
        start_Button.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 20)); // NOI18N
        start_Button.setForeground(new java.awt.Color(255, 255, 255));
        start_Button.setText("Inicio");
        start_Button.setBorder(null);
        start_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                start_ButtonMouseClicked(evt);
            }
        });
        start_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(start_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 250, 70));

        tecResources_iconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resources_icon.png"))); // NOI18N
        getContentPane().add(tecResources_iconButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 340, 40, 30));

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

        infrastructure_iconButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infrastructure_iconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/infrastructure_icon.png"))); // NOI18N
        getContentPane().add(infrastructure_iconButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 439, 40, 30));

        infrastructure_Button.setBackground(new java.awt.Color(44, 44, 44));
        infrastructure_Button.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 20)); // NOI18N
        infrastructure_Button.setForeground(new java.awt.Color(255, 255, 255));
        infrastructure_Button.setText("Infraestructura");
        infrastructure_Button.setBorder(null);
        infrastructure_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infrastructure_ButtonMouseClicked(evt);
            }
        });
        infrastructure_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infrastructure_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(infrastructure_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 250, 70));

        CajaTextoDescripcion.setColumns(20);
        CajaTextoDescripcion.setFont(new java.awt.Font("League Spartan Thin", 0, 14)); // NOI18N
        CajaTextoDescripcion.setRows(5);
        jScrollPane1.setViewportView(CajaTextoDescripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 690, 330));

        logOut_icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logOut_icon.png"))); // NOI18N
        getContentPane().add(logOut_icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 640, 40, 30));

        logOut_Button1.setBackground(new java.awt.Color(44, 44, 44));
        logOut_Button1.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 20)); // NOI18N
        logOut_Button1.setForeground(new java.awt.Color(255, 255, 255));
        logOut_Button1.setText("Cerrar Sesion ");
        logOut_Button1.setBorder(null);
        logOut_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOut_Button1ActionPerformed(evt);
            }
        });
        getContentPane().add(logOut_Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 250, 70));

        botonEnviar.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 20)); // NOI18N
        botonEnviar.setText("Enviar");
        botonEnviar.setToolTipText("");
        botonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(botonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 590, 110, 40));

        cajaTextoAsunto.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 18)); // NOI18N
        cajaTextoAsunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaTextoAsuntoActionPerformed(evt);
            }
        });
        getContentPane().add(cajaTextoAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 690, 60));

        tecResourses_text.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 38)); // NOI18N
        tecResourses_text.setText("Reportar Error");
        getContentPane().add(tecResourses_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        gray_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gray_backgroundSingUp.png"))); // NOI18N
        getContentPane().add(gray_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 711, 518));

        whiteLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/start_logo.png"))); // NOI18N
        getContentPane().add(whiteLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 107, 118));

        unispace_text.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 50)); // NOI18N
        unispace_text.setForeground(new java.awt.Color(255, 255, 255));
        unispace_text.setText("UniSpace");
        unispace_text.setToolTipText("");
        getContentPane().add(unispace_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        white_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white_background.png"))); // NOI18N
        getContentPane().add(white_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 1000, 620));

        Error_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black_background.png"))); // NOI18N
        getContentPane().add(Error_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaTextoAsuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaTextoAsuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaTextoAsuntoActionPerformed

    private void start_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_ButtonActionPerformed

    }//GEN-LAST:event_start_ButtonActionPerformed

    private void tec_resourcesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tec_resourcesButtonActionPerformed

    }//GEN-LAST:event_tec_resourcesButtonActionPerformed

    private void infrastructure_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infrastructure_ButtonActionPerformed

    }//GEN-LAST:event_infrastructure_ButtonActionPerformed

    private void logOut_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOut_Button1ActionPerformed
        this.dispose();                     // Cierra la ventana actual (Infraestructura)
        Login close_Seccion = new Login(); // Crea la nueva ventana(Login)
        close_Seccion.setVisible(true);
    }//GEN-LAST:event_logOut_Button1ActionPerformed

    private void start_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_ButtonMouseClicked
        this.dispose();                     // Cierra la ventana actual (Inicio)
        Inicio start_page = new Inicio(); // Crea la nueva ventana(Infraestructura)
        start_page.setVisible(true);
    }//GEN-LAST:event_start_ButtonMouseClicked

    private void tec_resourcesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tec_resourcesButtonMouseClicked
        this.dispose();                     // Cierra la ventana actual (Reportar error)
        tecno_resources tecResourses = new tecno_resources(); // Crea la nueva ventana (tecno_resources)
        tecResourses.setVisible(true);        // La muestra
    }//GEN-LAST:event_tec_resourcesButtonMouseClicked

    private void infrastructure_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infrastructure_ButtonMouseClicked
        this.dispose();                     // Cierra la ventana actual (Reportar error )
        Insfractuture_resources infraResourses = new Insfractuture_resources(); // Crea la nueva ventana(Infraestructura)
        infraResourses.setVisible(true);
    }//GEN-LAST:event_infrastructure_ButtonMouseClicked

    private void botonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEnviarActionPerformed
        String asunto = cajaTextoAsunto.getText().trim();
        String descripcion = CajaTextoDescripcion.getText().trim();

        if (asunto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El asunto no puede estar vacío.");
            return;
        }
        if (descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La descripción no puede estar vacía.");
            return;
        }

        guardarReporte(); 
       
        cajaTextoAsunto.setText("");
        CajaTextoDescripcion.setText("");
        labelNombreArchivo.setText("Sin archivo");
        rutaMultimediaSeleccionada = "";
    }//GEN-LAST:event_botonEnviarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Seleccionar imagen o video");

        int result = chooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {

            File seleccionado = chooser.getSelectedFile();
            try {
                String rutaRel = copiarArchivoMultimedia(seleccionado);
                rutaMultimediaSeleccionada = rutaRel;

                labelNombreArchivo.setText(seleccionado.getName());

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this,
                        "No se pudo copiar el archivo:\n" + ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
                rutaMultimediaSeleccionada = "";
                labelNombreArchivo.setText("Sin archivo");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Reportar_error.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportar_error.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportar_error.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportar_error.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportar_error().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea CajaTextoDescripcion;
    private javax.swing.JLabel Error_fondo;
    private javax.swing.JButton botonEnviar;
    private javax.swing.JTextField cajaTextoAsunto;
    private javax.swing.JLabel gray_background;
    private javax.swing.JButton infrastructure_Button;
    private javax.swing.JLabel infrastructure_iconButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNombreArchivo;
    private javax.swing.JButton logOut_Button1;
    private javax.swing.JLabel logOut_icon1;
    private javax.swing.JLabel reportarError_Icon;
    private javax.swing.JButton start_Button;
    private javax.swing.JLabel start_iconButton;
    private javax.swing.JLabel tecResources_iconButton;
    private javax.swing.JLabel tecResourses_text;
    private javax.swing.JButton tec_resourcesButton;
    private javax.swing.JLabel unispace_text;
    private javax.swing.JLabel whiteLogo;
    private javax.swing.JLabel white_background;
    // End of variables declaration//GEN-END:variables
}
