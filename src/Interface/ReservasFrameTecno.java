package Interface;

import conexión.Conexión;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import javax.swing.JOptionPane;

public class ReservasFrameTecno extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ReservasFrameTecno.class.getName());
    private String nombreRecursoT;
    private String marca;
    private String tipoRecurso;
    private tecno_resources padre;
    

    public ReservasFrameTecno(String nombreRecursoT,String marca, String tipoRecurso, tecno_resources padre) {
        initComponents();
        this.nombreRecursoT = nombreRecursoT;
        this.marca = marca;
        this.tipoRecurso = tipoRecurso;
        this.padre = padre;
        tituloReservas.setText("Reservar " + nombreRecursoT + " - " + marca + " - " + tipoRecurso);

        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        cajaTextoFecha.setText(hoy.format(formato));
        cajaTextoFecha.setEditable(false); 

    }

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
        cerrarVentana = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cajaTextoMotivos.setColumns(20);
        cajaTextoMotivos.setRows(5);
        jScrollPane1.setViewportView(cajaTextoMotivos);

        tituloReservas.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 18)); // NOI18N
        tituloReservas.setText("Reservar recurso: ");
        tituloReservas.setToolTipText("");

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

        cerrarVentana.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 18)); // NOI18N
        cerrarVentana.setText("X");
        cerrarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarVentanaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(73, 73, 73)
                .addComponent(cerrarVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cerrarVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 645, 355));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_botonCancelarMouseClicked

    private void botonConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConfirmarMouseClicked
        int idUsuario = Login.usuarioID;   
        String fecha = cajaTextoFecha.getText().trim();
        String horaInicio = cajaTextoHoraIni.getText().trim();
        String horaFin = cajaTextoHoraFin.getText().trim();
        String motivo = cajaTextoMotivos.getText().trim();
        
        try {
            Connection conn = Conexión.getConexion();

            String check = "SELECT estado FROM Recursos_tecno WHERE nombre_recurso = ?";
            PreparedStatement pstCheck = conn.prepareStatement(check);
            pstCheck.setString(1, nombreRecursoT);

            ResultSet rs = pstCheck.executeQuery();
            if (rs.next()) {
                String estadoActual = rs.getString("estado");
                if (estadoActual.equalsIgnoreCase("ocupado")) {
                    JOptionPane.showMessageDialog(this, "Este recurso ya está ocupado.");
                    return;
                }
            }

            LocalTime inicio;
            try {
                inicio = LocalTime.parse(horaInicio);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                        "Formato de hora inválido. Use HH:mm (ej: 14:30)");

                return;
            }
            LocalTime fin;
            try {
                fin = LocalTime.parse(horaFin);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                        "Formato de hora de fin inválido. Use HH:mm (ej: 16:00)");
                return;
            }
            LocalTime now = LocalTime.now();
            if (inicio.isBefore(now)) {
                JOptionPane.showMessageDialog(this,
                        "La hora de inicio no puede ser una hora pasada.");
                return;
            }
            long horas = java.time.Duration.between(inicio, fin).toHours();
            if (horas > 24) {
                JOptionPane.showMessageDialog(this,
                        "La duración máxima de una reserva es de 24 horas.");
                return;

            }
            String sql = "INSERT INTO reservas (id_usuarios, estado, nombre_recurso, tipo_recurso, fecha, hora_inicio, hora_fin, motivos)"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setInt(1, idUsuario);
            pst.setString(2, "Ocupado");
            pst.setString(3, nombreRecursoT);
            pst.setString(4, tipoRecurso);
            pst.setString(5, fecha);
            pst.setString(6, horaInicio);
            pst.setString(7, horaFin);
            pst.setString(8, motivo);

            pst.executeUpdate();

            String update = "UPDATE Recursos_tecno SET estado = 'ocupado' "
                    + "WHERE nombre_recurso = ?";
            PreparedStatement pst2 = conn.prepareStatement(update);
            pst2.setString(1, nombreRecursoT);
            pst2.executeUpdate();
       
            if (padre != null) {
                padre.cargarEstados();
                this.dispose();
            }

            JOptionPane.showMessageDialog(this, "Reserva creada con éxito.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_botonConfirmarMouseClicked

    private void botonConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConfirmarMouseEntered

    }//GEN-LAST:event_botonConfirmarMouseEntered

    private void botonConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonConfirmarActionPerformed

    private void cerrarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarVentanaMouseClicked
        this.dispose();
    }//GEN-LAST:event_cerrarVentanaMouseClicked

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
            java.util.logging.Logger.getLogger(ReservasFrameTecno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservasFrameTecno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservasFrameTecno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservasFrameTecno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new ReservasFrameTecno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConfirmar;
    private javax.swing.JTextField cajaTextoFecha;
    private javax.swing.JTextField cajaTextoHoraFin;
    private javax.swing.JTextField cajaTextoHoraIni;
    private javax.swing.JTextArea cajaTextoMotivos;
    private javax.swing.JLabel cerrarVentana;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tituloFecha;
    private javax.swing.JLabel tituloHoraFin;
    private javax.swing.JLabel tituloHoraIni;
    private javax.swing.JLabel tituloMotivos;
    private javax.swing.JLabel tituloReservas;
    // End of variables declaration//GEN-END:variables
}
