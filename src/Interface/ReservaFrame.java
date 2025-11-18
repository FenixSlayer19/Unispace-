package Interface;

import conexión.Conexión;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import conexión.Conexión;

public class ReservaFrame extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ReservaFrame.class.getName());
    private String nombreRecurso;
    private String tipoRecurso;
    private Insfractuture_resources padre;

    public ReservaFrame(String nombreRecurso, String tipoRecurso, Insfractuture_resources padre) {
        initComponents();
        this.nombreRecurso = nombreRecurso;
        this.tipoRecurso = tipoRecurso;
        this.padre = padre;

        tituloReservas.setText("Reservar " + nombreRecurso);
    }
    

//    private void abrirReserva(String nombreRecurso, String tipoRecurso) {
//    try {
//        Connection conn = Conexión.getConexion();
//
//        String sql = "SELECT estado FROM Recursos_Infraestructura WHERE nombre_recurso = ?";
//        PreparedStatement pst = conn.prepareStatement(sql);
//        pst.setString(1, nombreRecurso);
//
//        ResultSet rs = pst.executeQuery();
//        if (rs.next()) {
//            String estado = rs.getString("estado");
//
//            if (estado.equalsIgnoreCase("ocupado")) {
//                JOptionPane.showMessageDialog(this,
//                        "Este recurso ya está ocupado.");
//                return; // ❌ NO LO DEJA ENTRAR AL FRAME
//            }
//        }
//
//        // ✔ Si está disponible → se abre el frame
//        ReservaFrame rf = new ReservaFrame(nombreRecurso, tipoRecurso);
//        rf.setVisible(true);
//
//    } catch (Exception e) {
//        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
//    }
//}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cajaTextoFecha = new javax.swing.JTextField();
        cajaTextoHoraIni = new javax.swing.JTextField();
        cajaTextoHoraFin = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        cajaTextoMotivos = new javax.swing.JTextArea();
        tituloReservas = new javax.swing.JLabel();
        tituloFecha = new javax.swing.JLabel();
        tituloHoraIni = new javax.swing.JLabel();
        tituloHoraFin = new javax.swing.JLabel();
        tituloMotivos = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        botonConfirmar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaTextoMotivos.setColumns(20);
        cajaTextoMotivos.setRows(5);
        jScrollPane1.setViewportView(cajaTextoMotivos);

        tituloReservas.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 18)); // NOI18N
        tituloReservas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloReservas.setText("Reservar recurso: ");

        tituloFecha.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 18)); // NOI18N
        tituloFecha.setText("Fecha: ");

        tituloHoraIni.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 18)); // NOI18N
        tituloHoraIni.setText("Hora inicio:");

        tituloHoraFin.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 18)); // NOI18N
        tituloHoraFin.setText("Hora fin:");

        tituloMotivos.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 18)); // NOI18N
        tituloMotivos.setText("Motivos: ");

        botonCancelar.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCancelarMouseClicked(evt);
            }
        });

        botonConfirmar.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        botonConfirmar.setText("Confirmar");
        botonConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonConfirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonConfirmarMouseEntered(evt);
            }
        });
        botonConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 18)); // NOI18N
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tituloReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonConfirmar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(tituloMotivos)
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(tituloHoraFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(234, 234, 234))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tituloFecha)
                                            .addComponent(tituloHoraIni))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cajaTextoFecha)
                                    .addComponent(cajaTextoHoraIni)
                                    .addComponent(cajaTextoHoraFin, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))))
                        .addGap(99, 99, 99))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaTextoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaTextoHoraIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloHoraIni))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaTextoHoraFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloHoraFin))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloMotivos)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 355));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonConfirmarActionPerformed

    private void botonConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConfirmarMouseEntered

    }//GEN-LAST:event_botonConfirmarMouseEntered

    private void botonConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConfirmarMouseClicked
        int idUsuario = Login.usuarioID;   // ID del usuario logueado

        String fecha = cajaTextoFecha.getText().trim();
        String horaInicio = cajaTextoHoraIni.getText().toString();
        String horaFin = cajaTextoHoraFin.getText().toString();
        String motivo = cajaTextoMotivos.getText().trim();

        if (fecha.isEmpty() || motivo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Completa todos los campos.");
            return;
        }

        try {
            Connection conn = Conexión.getConexion();

            // 1️⃣ VALIDAR que esté disponible
            String check = "SELECT estado FROM Recursos_Infraestructura WHERE nombre_recurso = ?";
            PreparedStatement pstCheck = conn.prepareStatement(check);
            pstCheck.setString(1, nombreRecurso);

            ResultSet rs = pstCheck.executeQuery();
            if (rs.next()) {
                String estadoActual = rs.getString("estado");
                if (estadoActual.equalsIgnoreCase("ocupado")) {
                    JOptionPane.showMessageDialog(this, "Este recurso ya está ocupado.");
                    return;
                }
            }

            // 2️⃣ INSERTAR RESERVA
            String sql = "INSERT INTO reservas (id_usuarios, estado, nombre_recurso, tipo_recurso, fecha, hora_inicio, hora_fin, motivos)"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, idUsuario);
            pst.setString(2, "Ocupado");
            pst.setString(3, nombreRecurso);
            pst.setString(4, tipoRecurso);
            pst.setString(5, fecha);
            pst.setString(6, horaInicio);
            pst.setString(7, horaFin);
            pst.setString(8, motivo);

            pst.executeUpdate();

            // 3️⃣ ACTUALIZAR RECURSO → ocupado
            String update = "UPDATE Recursos_Infraestructura SET estado = 'ocupado' "
                    + "WHERE nombre_recurso = ?";
            PreparedStatement pst2 = conn.prepareStatement(update);
            pst2.setString(1, nombreRecurso);
            pst2.executeUpdate();
            // ✔ REFRESCAR AUTOMÁTICAMENTE LA VENTANA DE INFRAESTRUCTURA
            if (padre != null) {
                padre.cargarEstados();
                this.dispose();
            }

            JOptionPane.showMessageDialog(this, "Reserva creada con éxito.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
//        String fecha = cajaTextoFecha.getText();
//        String horaInicio = cajaTextoHoraIni.getText();
//        String horaFin = cajaTextoHoraFin.getText();
//        String motivos = cajaTextoMotivos.getText();
//
//        // Validaciones simples
//        if (fecha.isEmpty() || horaInicio.isEmpty() || horaFin.isEmpty() || motivos.isEmpty()) {
//            javax.swing.JOptionPane.showMessageDialog(this, "Por favor complete todos los campos.");
//            return;
//        }
//
//        try {
//            java.sql.Connection conexion = Conexión.getConexion();
//            String sql = "INSERT INTO reservas (fecha, hora_inicio, hora_fin, motivos) VALUES (?,?,?,?)";
//            java.sql.PreparedStatement ps = conexion.prepareStatement(sql);
//            ps.setString(1, fecha);
//            ps.setString(2, horaInicio);
//            ps.setString(3, horaFin);
//            ps.setString(4, motivos);
//            ps.executeUpdate();
//
//            javax.swing.JOptionPane.showMessageDialog(this, "Reserva guardada exitosamente.");
//
//        } catch (Exception e) {
//            javax.swing.JOptionPane.showMessageDialog(this, "Error al guardar: " + e.getMessage());
//        }
    }//GEN-LAST:event_botonConfirmarMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void botonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_botonCancelarMouseClicked

    public static void main(String args[]) {

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
        //java.awt.EventQueue.invokeLater(() -> new ReservaFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConfirmar;
    private javax.swing.JTextField cajaTextoFecha;
    private javax.swing.JTextField cajaTextoHoraFin;
    private javax.swing.JTextField cajaTextoHoraIni;
    private javax.swing.JTextArea cajaTextoMotivos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tituloFecha;
    private javax.swing.JLabel tituloHoraFin;
    private javax.swing.JLabel tituloHoraIni;
    private javax.swing.JLabel tituloMotivos;
    private javax.swing.JLabel tituloReservas;
    // End of variables declaration//GEN-END:variables
}
