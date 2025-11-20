package Interface_employed;

import java.io.File;

public class asuntoFrame extends javax.swing.JFrame {
// campo para guardar el id del reporte que mostramos

    private int idError = -1;

    public asuntoFrame() {
        initComponents();
        // después de initComponents();
        botonRevisado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRevisadoActionPerformed(evt);
            }
        });

    }
    // constructor nuevo: recibe id_error y carga directamente la info

    public asuntoFrame(int idError) {
        initComponents();
        this.idError = idError;
        cargarReporte(idError);
    }

    private void cargarReporte(int idError) {
        java.sql.Connection conn = null;
        java.sql.PreparedStatement pst = null;
        java.sql.ResultSet rs = null;
        try {
            conn = conexión.Conexión.getConexion();

            String sql = "SELECT r.asunto, r.descripcion, r.fecha_hora_error, r.multimedia, r.estado, u.nombre "
                    + "FROM Reportar_error r LEFT JOIN Usuario u ON r.id_usuario = u.id_usuario "
                    + "WHERE r.id_error = ?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idError);
            rs = pst.executeQuery();

            if (rs.next()) {
                String asunto = rs.getString("asunto");
                String descripcion = rs.getString("descripcion");
                String fechaHora = rs.getString("fecha_hora_error");
                String multimedia = rs.getString("multimedia");
                String nombreUsuario = rs.getString("nombre");
                String estado = rs.getString("estado");

                labelAsunto.setText(asunto != null ? asunto : "Sin asunto");
                jTextArea1.setText(descripcion != null ? descripcion : "");
                labelFechaHora.setText(fechaHora != null ? fechaHora : "");
                labeNombre.setText(nombreUsuario != null ? nombreUsuario : "Usuario desconocido");

                // Manejo multimedia: si es imagen la mostramos escalada, si no mostramos nombre/ruta
                if (multimedia != null && !multimedia.trim().isEmpty()) {
                    File f = new File(System.getProperty("user.dir"), multimedia);
                    if (f.exists()) {
                        String lower = multimedia.toLowerCase();
                        if (lower.endsWith(".jpg") || lower.endsWith(".jpeg") || lower.endsWith(".png")
                                || lower.endsWith(".gif") || lower.endsWith(".bmp")) {
                            // Escalar al tamaño del label
                            javax.swing.ImageIcon icon = new javax.swing.ImageIcon(f.getAbsolutePath());
                            java.awt.Image img = icon.getImage();
                            int w = labelImagen.getWidth();
                            int h = labelImagen.getHeight();
                            if (w <= 0 || h <= 0) {
                                w = 420;
                                h = 240;
                            } // fallback
                            java.awt.Image scaled = img.getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH);
                            labelImagen.setIcon(new javax.swing.ImageIcon(scaled));
                            labelImagen.setText("");
                        } else {
                            // no es imagen: mostramos el nombre del archivo
                            labelImagen.setIcon(null);
                            labelImagen.setText(f.getName());
                        }
                    } else {
                        labelImagen.setIcon(null);
                        labelImagen.setText("Archivo no encontrado: " + multimedia);
                    }
                } else {
                    labelImagen.setIcon(null);
                    labelImagen.setText("Sin archivo adjunto");
                }

                // Si ya está revisado, desactivar el botón
                if (estado != null && estado.equalsIgnoreCase("Revisado")) {
                    botonRevisado.setEnabled(false);
                    botonRevisado.setText("Ya revisado");
                } else {
                    botonRevisado.setEnabled(true);
                    botonRevisado.setText("Revisado");
                }

            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Reporte no encontrado (id: " + idError + ")");
                this.dispose();
            }

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error cargando reporte: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (Exception ex) {
            }
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception ex) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex) {
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAsunto = new javax.swing.JLabel();
        labeNombre = new javax.swing.JLabel();
        labelFechaHora = new javax.swing.JLabel();
        labelImagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        botonRevisado = new javax.swing.JButton();
        cerrarVentana = new javax.swing.JLabel();
        reportarError_Icon = new javax.swing.JLabel();
        tecResourses_text = new javax.swing.JLabel();
        white_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelAsunto.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 24)); // NOI18N
        labelAsunto.setText("Titulo");
        getContentPane().add(labelAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 510, 40));

        labeNombre.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 22)); // NOI18N
        labeNombre.setText("Juanjo");
        getContentPane().add(labeNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 480, 40));

        labelFechaHora.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 18)); // NOI18N
        labelFechaHora.setText("Horita");
        getContentPane().add(labelFechaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 160, 40));

        labelImagen.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 18)); // NOI18N
        labelImagen.setText("IMG");
        getContentPane().add(labelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 80, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("League Spartan Thin", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 750, 190));

        botonRevisado.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 24)); // NOI18N
        botonRevisado.setText("Revisado");
        botonRevisado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRevisadoActionPerformed(evt);
            }
        });
        getContentPane().add(botonRevisado, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 530, 180, 70));

        cerrarVentana.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 24)); // NOI18N
        cerrarVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarVentana.setText("<==");
        cerrarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarVentanaMouseClicked(evt);
            }
        });
        getContentPane().add(cerrarVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 50, -1));

        reportarError_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/error_icon_1.png"))); // NOI18N
        getContentPane().add(reportarError_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        tecResourses_text.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 38)); // NOI18N
        tecResourses_text.setText("Asunto");
        getContentPane().add(tecResourses_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        white_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white_background.png"))); // NOI18N
        getContentPane().add(white_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarVentanaMouseClicked
        this.dispose();
    }//GEN-LAST:event_cerrarVentanaMouseClicked

    private void botonRevisadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRevisadoActionPerformed
        if (idError <= 0) {
            return;
        }
        int r = javax.swing.JOptionPane.showConfirmDialog(this, "Marcar este reporte como REVISADO?", "Confirmar", javax.swing.JOptionPane.YES_NO_OPTION);
        if (r != javax.swing.JOptionPane.YES_OPTION) {
            return;
        }

        java.sql.Connection conn = null;
        java.sql.PreparedStatement pst = null;
        try {
            conn = conexión.Conexión.getConexion();
            String sql = "UPDATE Reportar_error SET estado = 'Revisado' WHERE id_error = ?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, idError);
            int updated = pst.executeUpdate();
            if (updated > 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Reporte marcado como revisado.");
                botonRevisado.setEnabled(false);
                botonRevisado.setText("Ya revisado");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "No se pudo actualizar el estado.");
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error actualizando: " + e.getMessage());
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (Exception ex) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex) {
            }
        }
    }//GEN-LAST:event_botonRevisadoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new asuntoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRevisado;
    private javax.swing.JLabel cerrarVentana;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labeNombre;
    private javax.swing.JLabel labelAsunto;
    private javax.swing.JLabel labelFechaHora;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel reportarError_Icon;
    private javax.swing.JLabel tecResourses_text;
    private javax.swing.JLabel white_background;
    // End of variables declaration//GEN-END:variables
}
