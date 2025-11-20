package Interface;

import conexión.Conexión;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Historial extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Historial.class.getName());

    private JTable tableHistorial;
    private DefaultTableModel modelHistorial;
    private JScrollPane scrollHistorial;

    public Historial() {
        initComponents();
        // cargar la tabla la primera vez
        cargarHistorial();

        // conectar botones con su lógica
        botonSeleccionar.addActionListener(e -> {
            if (tableHistorial != null) {
                tableHistorial.selectAll();
            }
        });

        botonActualizar.addActionListener(e -> {
            cargarHistorial();
        });

        botonEliminar.addActionListener(e -> {
            eliminarSeleccionados();
        });
        // --- INICIO: agregar tabla historial ---
        modelHistorial = new DefaultTableModel(
                new Object[]{"id_reservas", "Nombre recurso", "Tipo recurso", "Fecha", "Hora inicio", "Motivos"}, 0
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tableHistorial = new JTable(modelHistorial);
        tableHistorial.setFillsViewportHeight(true);
        tableHistorial.setRowHeight(28);
        tableHistorial.setAutoCreateRowSorter(true);

// ocultar la columna id (columna 0)
        tableHistorial.getColumnModel().getColumn(0).setMinWidth(0);
        tableHistorial.getColumnModel().getColumn(0).setMaxWidth(0);
        tableHistorial.getColumnModel().getColumn(0).setWidth(0);

        scrollHistorial = new JScrollPane(tableHistorial);
        scrollHistorial.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

// Añade el scroll al layout absolute. Ajusta las coordenadas si lo necesitas.
// Propuesta: dentro del área blanca (la tuya white_background está en x=250,y=70,width=1010,height=640)
        getContentPane().add(scrollHistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 960, 470));
// --- FIN: agregar tabla historial ---
    }

    public void cargarHistorial() {
        // limpiar modelo
        if (modelHistorial == null) {
            return;
        }
        modelHistorial.setRowCount(0);

        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            conn = Conexión.getConexion();
            // Ajusta este SQL si tus nombres son distintos en la BD
            String sql = "SELECT id_reservas, nombre_recurso, tipo_recurso, fecha, hora_inicio, motivos FROM reservas ORDER BY fecha DESC, hora_inicio DESC";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id_reservas");
                String nombre = rs.getString("nombre_recurso");
                String tipo = rs.getString("tipo_recurso");
                String fecha = rs.getString("fecha");
                String horaInicio = "";
                try {
                    horaInicio = rs.getString("hora_inicio");
                } catch (Exception ex) {
                }
                String motivos = "";
                try {
                    motivos = rs.getString("motivos");
                } catch (Exception ex) {
                }

                modelHistorial.addRow(new Object[]{id, nombre, tipo, fecha, horaInicio, motivos});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error cargando historial: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException ex) {
            }
            try {
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException ex) {
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
            }
        }
    }

private void eliminarSeleccionados() {
    int[] filas = tableHistorial.getSelectedRows();
    if (filas == null || filas.length == 0) {
        JOptionPane.showMessageDialog(this, "No hay filas seleccionadas.");
        return;
    }

    int resp = JOptionPane.showConfirmDialog(
        this,
        "¿Deseas remover estas " + filas.length + " filas SOLO de tu historial visual?\n(No se borrarán de la base de datos)",
        "Confirmar",
        JOptionPane.YES_NO_OPTION
    );

    if (resp != JOptionPane.YES_OPTION) return;

    // eliminar desde la vista (DefaultTableModel)
    // IMPORTANTE: como las filas cambian de índice,
    // las eliminamos de atrás hacia adelante
    for (int i = filas.length - 1; i >= 0; i--) {
        int modelRow = tableHistorial.convertRowIndexToModel(filas[i]);
        modelHistorial.removeRow(modelRow);
    }

    JOptionPane.showMessageDialog(this, "Las filas fueron removidas del historial visual.");
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infrastructure_iconButton = new javax.swing.JLabel();
        unispace_text = new javax.swing.JLabel();
        tecResourses_text = new javax.swing.JLabel();
        start_iconButton = new javax.swing.JLabel();
        tecResources_iconButton = new javax.swing.JLabel();
        logOut_icon1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonSeleccionar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        logOut_Button1 = new javax.swing.JButton();
        start_Button = new javax.swing.JButton();
        tec_resourcesButton = new javax.swing.JButton();
        infrastructure_Button = new javax.swing.JButton();
        whiteLogo = new javax.swing.JLabel();
        white_background = new javax.swing.JLabel();
        background_gradient = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infrastructure_iconButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infrastructure_iconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/infrastructure_icon.png"))); // NOI18N
        getContentPane().add(infrastructure_iconButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 439, 40, 30));

        unispace_text.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 50)); // NOI18N
        unispace_text.setForeground(new java.awt.Color(255, 255, 255));
        unispace_text.setText("UniSpace");
        unispace_text.setToolTipText("");
        getContentPane().add(unispace_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        tecResourses_text.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 38)); // NOI18N
        tecResourses_text.setText("Historial");
        getContentPane().add(tecResourses_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 85, -1, -1));

        start_iconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/start_icon.png"))); // NOI18N
        getContentPane().add(start_iconButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 240, 40, 30));

        tecResources_iconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resources_icon.png"))); // NOI18N
        getContentPane().add(tecResources_iconButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 340, 40, 30));

        logOut_icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logOut_icon.png"))); // NOI18N
        getContentPane().add(logOut_icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 640, 40, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reload_icon.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 133, 30, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/deleted_icon.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 134, 30, 30));

        botonSeleccionar.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 14)); // NOI18N
        botonSeleccionar.setText("Seleccionar todo");
        botonSeleccionar.setBorder(null);
        getContentPane().add(botonSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 134, 160, 30));

        botonActualizar.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 14)); // NOI18N
        botonActualizar.setText("Actualizar");
        botonActualizar.setBorder(null);
        getContentPane().add(botonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 134, 120, 30));

        botonEliminar.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 14)); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.setBorder(null);
        getContentPane().add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 134, 110, 30));

        logOut_Button1.setBackground(new java.awt.Color(44, 44, 44));
        logOut_Button1.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 20)); // NOI18N
        logOut_Button1.setForeground(new java.awt.Color(255, 255, 255));
        logOut_Button1.setText("Cerrar Sesion ");
        logOut_Button1.setBorder(null);
        logOut_Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOut_Button1MouseClicked(evt);
            }
        });
        logOut_Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOut_Button1ActionPerformed(evt);
            }
        });
        getContentPane().add(logOut_Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 250, 70));

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

        whiteLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/start_logo.png"))); // NOI18N
        getContentPane().add(whiteLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 107, 118));

        white_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white_background.png"))); // NOI18N
        getContentPane().add(white_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 1010, 640));

        background_gradient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black_background.png"))); // NOI18N
        getContentPane().add(background_gradient, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void start_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_ButtonMouseClicked
        this.dispose();                     // Cierra la ventana actual (Inicio)
        Inicio start_page = new Inicio(); // Crea la nueva ventana(Infraestructura)
        start_page.setVisible(true);
    }//GEN-LAST:event_start_ButtonMouseClicked

    private void start_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_ButtonActionPerformed

    }//GEN-LAST:event_start_ButtonActionPerformed

    private void logOut_Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOut_Button1MouseClicked
        this.dispose();                     // Cierra la ventana actual (Historial)
        Login close_Seccion = new Login(); // Crea la nueva ventana(Login)
        close_Seccion.setVisible(true);
    }//GEN-LAST:event_logOut_Button1MouseClicked

    private void logOut_Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOut_Button1ActionPerformed

    }//GEN-LAST:event_logOut_Button1ActionPerformed

    private void infrastructure_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infrastructure_ButtonActionPerformed

    }//GEN-LAST:event_infrastructure_ButtonActionPerformed

    private void infrastructure_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infrastructure_ButtonMouseClicked
        this.dispose();                     // Cierra la ventana actual (Historial)
        Insfractuture_resources infraResourses = new Insfractuture_resources(); // Crea la nueva ventana(Infraestructura)
        infraResourses.setVisible(true);
    }//GEN-LAST:event_infrastructure_ButtonMouseClicked

    private void tec_resourcesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tec_resourcesButtonActionPerformed

    }//GEN-LAST:event_tec_resourcesButtonActionPerformed

    private void tec_resourcesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tec_resourcesButtonMouseClicked
        this.dispose();                     // Cierra la ventana actual (Historial)
        tecno_resources tecResourses = new tecno_resources(); // Crea la nueva ventana (tecno_resources)
        tecResourses.setVisible(true);        // La muestra
    }//GEN-LAST:event_tec_resourcesButtonMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new Historial().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_gradient;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonSeleccionar;
    private javax.swing.JButton infrastructure_Button;
    private javax.swing.JLabel infrastructure_iconButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton logOut_Button1;
    private javax.swing.JLabel logOut_icon1;
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
