package Interface_employed;

import Interface.Login;
import conexión.Conexión;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Gestión_reservas extends javax.swing.JFrame {

    public Gestión_reservas() {
        initComponents();
        cargarTablaReservas();
    }

    public void cargarTablaReservas() {

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Nombre");
        modelo.addColumn("ID Usuario");
        modelo.addColumn("Recurso");
        modelo.addColumn("Tipo");
        modelo.addColumn("Fecha");

        String sql = "SELECT u.nombre, r.id_usuarios, r.nombre_recurso, r.tipo_recurso, r.fecha "
                + "FROM reservas r "
                + "INNER JOIN Usuario u ON r.id_usuarios = u.id_usuario";

        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = Conexión.getConexion();
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Object[] fila = new Object[5];

                fila[0] = rs.getString("nombre");
                fila[1] = rs.getString("id_usuarios");
                fila[2] = rs.getString("nombre_recurso");
                fila[3] = rs.getString("tipo_recurso");
                fila[4] = rs.getString("fecha");

                modelo.addRow(fila);
            }

            jTableReservas.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar datos: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (st != null) {
                    st.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception ex) {
                System.out.println("Error al cerrar conexión: " + ex.getMessage());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReservas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tecResourses_text = new javax.swing.JLabel();
        unispace_text = new javax.swing.JLabel();
        whiteLogo = new javax.swing.JLabel();
        start_iconButton = new javax.swing.JLabel();
        start_Button = new javax.swing.JButton();
        logOut_icon1 = new javax.swing.JLabel();
        logOut_Button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        botonActualizar = new javax.swing.JButton();
        white_background = new javax.swing.JLabel();
        tecno_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1290, 710));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableReservas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTableReservas.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 12)); // NOI18N
        jTableReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Usuario", "ID", "Tipo Recurso", "Recurso", "Fecha Reserva", "Fecha Entrega"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableReservas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(jTableReservas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 880, 460));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 40, 40));

        tecResourses_text.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 38)); // NOI18N
        tecResourses_text.setText("Gestión de reservas");
        getContentPane().add(tecResourses_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        unispace_text.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 50)); // NOI18N
        unispace_text.setForeground(new java.awt.Color(255, 255, 255));
        unispace_text.setText("UniSpace");
        unispace_text.setToolTipText("");
        getContentPane().add(unispace_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        whiteLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/start_logo.png"))); // NOI18N
        getContentPane().add(whiteLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 107, 118));

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

        logOut_icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logOut_icon.png"))); // NOI18N
        getContentPane().add(logOut_icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 640, 40, 30));

        logOut_Button.setBackground(new java.awt.Color(44, 44, 44));
        logOut_Button.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 20)); // NOI18N
        logOut_Button.setForeground(new java.awt.Color(255, 255, 255));
        logOut_Button.setText("Cerrar Sesion ");
        logOut_Button.setBorder(null);
        logOut_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOut_ButtonMouseClicked(evt);
            }
        });
        logOut_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOut_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logOut_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 250, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reload_icon.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 129, 30, 30));

        botonActualizar.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 14)); // NOI18N
        botonActualizar.setText("Actualizar");
        botonActualizar.setBorder(null);
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(botonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 120, 30));

        white_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white_background.png"))); // NOI18N
        getContentPane().add(white_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 69, 1010, 640));

        tecno_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black_background.png"))); // NOI18N
        getContentPane().add(tecno_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void start_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_ButtonMouseClicked
        this.dispose();                     // Cierra la ventana actual (Inicio)
        inicio_empleado start_pageEmp = new inicio_empleado(); // Crea la nueva ventana(Infraestructura)
        start_pageEmp.setVisible(true);
    }//GEN-LAST:event_start_ButtonMouseClicked

    private void start_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_ButtonActionPerformed

    }//GEN-LAST:event_start_ButtonActionPerformed

    private void logOut_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOut_ButtonMouseClicked
        this.dispose();                     // Cierra la ventana actual (Recursos tecnologicos)
        Login login = new Login(); // Crea la nueva ventana(Login)
        login.setVisible(true);        // La muestra
    }//GEN-LAST:event_logOut_ButtonMouseClicked

    private void logOut_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOut_ButtonActionPerformed

    }//GEN-LAST:event_logOut_ButtonActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        cargarTablaReservas();
    }//GEN-LAST:event_botonActualizarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestión_reservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableReservas;
    private javax.swing.JButton logOut_Button;
    private javax.swing.JLabel logOut_icon1;
    private javax.swing.JButton start_Button;
    private javax.swing.JLabel start_iconButton;
    private javax.swing.JLabel tecResourses_text;
    private javax.swing.JLabel tecno_background;
    private javax.swing.JLabel unispace_text;
    private javax.swing.JLabel whiteLogo;
    private javax.swing.JLabel white_background;
    // End of variables declaration//GEN-END:variables
}
