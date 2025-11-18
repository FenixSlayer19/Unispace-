/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import conexión.Conexión;

public class Insfractuture_resources extends javax.swing.JFrame {

    public Insfractuture_resources() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel9, "src/images/skyBlue_square.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel10, "src/images/skyBlue_square.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel11, "src/images/skyBlue_square.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel12, "src/images/skyBlue_square.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel13, "src/images/skyBlue_square.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel14, "src/images/skyBlue_square.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel15, "src/images/skyBlue_square.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel16, "src/images/skyBlue_square.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(jLabel17, "src/images/skyBlue_square.png");
    }

   private void abrirReserva(String nombreRecurso, String tipoRecurso) {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        conn = Conexión.getConexion();

        String sql = "SELECT estado FROM Recursos_Infraestructura WHERE nombre_recurso = ?";
        pst = conn.prepareStatement(sql);
        pst.setString(1, nombreRecurso);

        rs = pst.executeQuery();
        if (rs.next()) {
            String estado = rs.getString("estado");

            if (estado.equalsIgnoreCase("ocupado")) {
                JOptionPane.showMessageDialog(this, "Este recurso ya está ocupado.");
                return;
            }
        }

        // Si está disponible → abrir el Frame
        new ReservaFrame(nombreRecurso, tipoRecurso).setVisible(true);

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error en la BD: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (conn != null) conn.close(); // ❗muy importante
        } catch (SQLException ex) {
            System.out.println("Error cerrando: " + ex.getMessage());
        }
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo_salon = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        reservas9 = new javax.swing.JButton();
        reservas8 = new javax.swing.JButton();
        reservas1 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        reservas3 = new javax.swing.JButton();
        reservas4 = new javax.swing.JButton();
        reservas5 = new javax.swing.JButton();
        reservas6 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        reservas2 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        reservas7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        tecResources_iconButton = new javax.swing.JLabel();
        logOut_icon1 = new javax.swing.JLabel();
        infrastructure_iconButton = new javax.swing.JLabel();
        start_iconButton = new javax.swing.JLabel();
        logOut_Button = new javax.swing.JButton();
        infrastructure_Button = new javax.swing.JButton();
        tec_resourcesButton = new javax.swing.JButton();
        start_Button = new javax.swing.JButton();
        tecResourses_text = new javax.swing.JLabel();
        unispace_text = new javax.swing.JLabel();
        white_background = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        whiteLogo = new javax.swing.JLabel();
        infraestructura_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo_salon.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        titulo_salon.setText("Salón 7- 403");
        getContentPane().add(titulo_salon, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jLabel27.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel27.setText("Salón 7- 401");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, -1, -1));

        jLabel29.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel29.setText("Salón 7- 405");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, -1, -1));

        jLabel31.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Salón 7-406");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, -1, -1));

        jLabel33.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel33.setText("Salón 7- 301");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 520, -1, -1));

        jLabel22.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel22.setText("Salón 7- 303");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, -1));

        jLabel23.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel23.setText("Salón 7- 402");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, -1, -1));

        jLabel24.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel24.setText("Salón 7- 503");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));

        jLabel25.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel25.setText("Salón 7- 404");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));

        reservas9.setBackground(new java.awt.Color(0, 0, 0));
        reservas9.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        reservas9.setForeground(new java.awt.Color(255, 255, 255));
        reservas9.setText("Reservar");
        reservas9.setBorder(null);
        reservas9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservas9MouseClicked(evt);
            }
        });
        reservas9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservas9ActionPerformed(evt);
            }
        });
        getContentPane().add(reservas9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 610, 100, 22));

        reservas8.setBackground(new java.awt.Color(0, 0, 0));
        reservas8.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        reservas8.setForeground(new java.awt.Color(255, 255, 255));
        reservas8.setText("Reservar");
        reservas8.setBorder(null);
        reservas8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservas8MouseClicked(evt);
            }
        });
        reservas8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservas8ActionPerformed(evt);
            }
        });
        getContentPane().add(reservas8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, 100, 22));

        reservas1.setBackground(new java.awt.Color(0, 0, 0));
        reservas1.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        reservas1.setForeground(new java.awt.Color(255, 255, 255));
        reservas1.setText("Reservar");
        reservas1.setBorder(null);
        reservas1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservas1MouseClicked(evt);
            }
        });
        reservas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservas1ActionPerformed(evt);
            }
        });
        getContentPane().add(reservas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 260, 100, 22));

        jLabel44.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        jLabel44.setText("Disponible");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 242, -1, -1));

        jLabel45.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Disponible");
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 412, -1, -1));

        jLabel46.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Disponible");
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, -1, -1));

        jLabel47.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Disponible");
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 592, -1, -1));

        reservas3.setBackground(new java.awt.Color(0, 0, 0));
        reservas3.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        reservas3.setForeground(new java.awt.Color(255, 255, 255));
        reservas3.setText("Reservar");
        reservas3.setBorder(null);
        reservas3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservas3MouseClicked(evt);
            }
        });
        reservas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservas3ActionPerformed(evt);
            }
        });
        getContentPane().add(reservas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 100, 22));

        reservas4.setBackground(new java.awt.Color(0, 0, 0));
        reservas4.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        reservas4.setForeground(new java.awt.Color(255, 255, 255));
        reservas4.setText("Reservar");
        reservas4.setBorder(null);
        reservas4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservas4MouseClicked(evt);
            }
        });
        reservas4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservas4ActionPerformed(evt);
            }
        });
        getContentPane().add(reservas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 100, 22));

        reservas5.setBackground(new java.awt.Color(0, 0, 0));
        reservas5.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        reservas5.setForeground(new java.awt.Color(255, 255, 255));
        reservas5.setText("Reservar");
        reservas5.setBorder(null);
        reservas5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservas5MouseClicked(evt);
            }
        });
        reservas5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservas5ActionPerformed(evt);
            }
        });
        getContentPane().add(reservas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 100, 22));

        reservas6.setBackground(new java.awt.Color(0, 0, 0));
        reservas6.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        reservas6.setForeground(new java.awt.Color(255, 255, 255));
        reservas6.setText("Reservar");
        reservas6.setBorder(null);
        reservas6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservas6MouseClicked(evt);
            }
        });
        reservas6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservas6ActionPerformed(evt);
            }
        });
        getContentPane().add(reservas6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 100, 22));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, 150));

        jLabel34.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        jLabel34.setText("Disponible");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 242, -1, -1));

        reservas2.setBackground(new java.awt.Color(0, 0, 0));
        reservas2.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        reservas2.setForeground(new java.awt.Color(255, 255, 255));
        reservas2.setText("Reservar");
        reservas2.setBorder(null);
        reservas2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservas2MouseClicked(evt);
            }
        });
        reservas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservas2ActionPerformed(evt);
            }
        });
        getContentPane().add(reservas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 100, 22));

        jLabel35.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Disponible");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 242, -1, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 160, 150));

        jLabel36.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Disponible");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, -1, 150));

        jButton18.setBackground(new java.awt.Color(0, 0, 0));
        jButton18.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("Reservar");
        jButton18.setBorder(null);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 100, 22));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 160, 150));

        jLabel38.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Disponible");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 412, -1, -1));

        jButton19.setBackground(new java.awt.Color(0, 0, 0));
        jButton19.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Reservar");
        jButton19.setBorder(null);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 100, 22));

        jButton20.setBackground(new java.awt.Color(0, 0, 0));
        jButton20.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("Reservar");
        jButton20.setBorder(null);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 100, 22));

        jLabel37.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Disponible");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 412, -1, -1));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, 150));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 160, 150));

        jLabel39.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Disponible");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, -1, -1));

        jButton21.setBackground(new java.awt.Color(0, 0, 0));
        jButton21.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("Reservar");
        jButton21.setBorder(null);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 100, 22));

        jLabel40.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Disponible");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 592, -1, -1));

        reservas7.setBackground(new java.awt.Color(0, 0, 0));
        reservas7.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        reservas7.setForeground(new java.awt.Color(255, 255, 255));
        reservas7.setText("Reservar");
        reservas7.setBorder(null);
        reservas7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reservas7MouseClicked(evt);
            }
        });
        reservas7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservas7ActionPerformed(evt);
            }
        });
        getContentPane().add(reservas7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 100, 22));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 160, 150));

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 160, 150));

        jLabel42.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Disponible");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 592, -1, -1));

        jLabel43.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Disponible");
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 590, -1, -1));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 160, 150));

        tecResources_iconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resources_icon.png"))); // NOI18N
        getContentPane().add(tecResources_iconButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 340, 40, 30));

        logOut_icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logOut_icon.png"))); // NOI18N
        getContentPane().add(logOut_icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 640, 40, 30));

        infrastructure_iconButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infrastructure_iconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/infrastructure_icon.png"))); // NOI18N
        getContentPane().add(infrastructure_iconButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 439, 40, 30));

        start_iconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/start_icon.png"))); // NOI18N
        getContentPane().add(start_iconButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 240, 40, 30));

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

        infrastructure_Button.setBackground(new java.awt.Color(44, 44, 44));
        infrastructure_Button.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 20)); // NOI18N
        infrastructure_Button.setForeground(new java.awt.Color(255, 255, 255));
        infrastructure_Button.setText("Infraestructura");
        infrastructure_Button.setBorder(null);
        infrastructure_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infrastructure_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(infrastructure_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 250, 70));

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

        tecResourses_text.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 38)); // NOI18N
        tecResourses_text.setText("Recursos de Infraestructura");
        getContentPane().add(tecResourses_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        unispace_text.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 50)); // NOI18N
        unispace_text.setForeground(new java.awt.Color(255, 255, 255));
        unispace_text.setText("UniSpace");
        unispace_text.setToolTipText("");
        getContentPane().add(unispace_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        white_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white_background.png"))); // NOI18N
        getContentPane().add(white_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 1010, 640));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, 150));

        jLabel21.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel21.setText("Salón 7- 403");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        whiteLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/start_logo.png"))); // NOI18N
        getContentPane().add(whiteLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 107, 118));

        infraestructura_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black_background.png"))); // NOI18N
        getContentPane().add(infraestructura_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reservas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservas3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservas3ActionPerformed

    private void reservas4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservas4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservas4ActionPerformed

    private void reservas5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservas5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservas5ActionPerformed

    private void reservas6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservas6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservas6ActionPerformed

    private void reservas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservas1ActionPerformed

    private void reservas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservas2ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void reservas7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservas7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservas7ActionPerformed

    private void reservas9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservas9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservas9ActionPerformed

    private void reservas8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservas8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservas8ActionPerformed

    private void start_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_ButtonActionPerformed

    }//GEN-LAST:event_start_ButtonActionPerformed

    private void tec_resourcesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tec_resourcesButtonActionPerformed

    }//GEN-LAST:event_tec_resourcesButtonActionPerformed

    private void infrastructure_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infrastructure_ButtonActionPerformed
        //Nada por ahora.
    }//GEN-LAST:event_infrastructure_ButtonActionPerformed

    private void logOut_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOut_ButtonActionPerformed

    }//GEN-LAST:event_logOut_ButtonActionPerformed

    private void start_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_ButtonMouseClicked
        this.dispose();                     // Cierra la ventana actual (Infraestructura)
        Inicio start_page = new Inicio(); // Crea la nueva ventana(Inicio)
        start_page.setVisible(true);
    }//GEN-LAST:event_start_ButtonMouseClicked

    private void tec_resourcesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tec_resourcesButtonMouseClicked
        this.dispose();                     // Cierra la ventana actual (Infrastructura)
        tecno_resources tecResourses = new tecno_resources(); // Crea la nueva ventana (tecno_resources)
        tecResourses.setVisible(true);        // La muestra
    }//GEN-LAST:event_tec_resourcesButtonMouseClicked

    private void logOut_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOut_ButtonMouseClicked
        this.dispose();                     // Cierra la ventana actual (Infraestructura)
        Login close_Seccion = new Login(); // Crea la nueva ventana(Login)
        close_Seccion.setVisible(true);
    }//GEN-LAST:event_logOut_ButtonMouseClicked

    private void reservas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservas1MouseClicked

        String nombreRecurso = "Salón 7- 403";
        String tipoRecurso = "Aula";

        abrirReserva(nombreRecurso, tipoRecurso);
//        String nombreRecurso = "Salón 7- 403";
//        String tipoRecurso = "Aula";
//
//        java.awt.EventQueue.invokeLater(()
//                -> new ReservaFrame(nombreRecurso, tipoRecurso).setVisible(true));
    }//GEN-LAST:event_reservas1MouseClicked

    private void reservas2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservas2MouseClicked
        String nombreRecurso = "Salón 7- 303";
        String tipoRecurso = "Aula";

        abrirReserva(nombreRecurso, tipoRecurso);
    }//GEN-LAST:event_reservas2MouseClicked

    private void reservas3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservas3MouseClicked
        String nombreRecurso = "Salón 7- 402";
        String tipoRecurso = "Aula";

        abrirReserva(nombreRecurso, tipoRecurso);
    }//GEN-LAST:event_reservas3MouseClicked

    private void reservas4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservas4MouseClicked
        String nombreRecurso = "Salón 7- 503";
        String tipoRecurso = "Aula";

        abrirReserva(nombreRecurso, tipoRecurso);
    }//GEN-LAST:event_reservas4MouseClicked

    private void reservas5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservas5MouseClicked
        String nombreRecurso = "Salón 7- 404";
        String tipoRecurso = "Aula";

        abrirReserva(nombreRecurso, tipoRecurso);
    }//GEN-LAST:event_reservas5MouseClicked

    private void reservas6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservas6MouseClicked
        String nombreRecurso = "Salón 7- 401";
        String tipoRecurso = "Aula";

        abrirReserva(nombreRecurso, tipoRecurso);
    }//GEN-LAST:event_reservas6MouseClicked

    private void reservas7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservas7MouseClicked
        String nombreRecurso = "Salón 7- 405";
        String tipoRecurso = "Aula";

        abrirReserva(nombreRecurso, tipoRecurso);
    }//GEN-LAST:event_reservas7MouseClicked

    private void reservas8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservas8MouseClicked
        String nombreRecurso = "Salón 7-406";
        String tipoRecurso = "Aula";

        abrirReserva(nombreRecurso, tipoRecurso);
    }//GEN-LAST:event_reservas8MouseClicked

    private void reservas9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reservas9MouseClicked
        String nombreRecurso = "Salón 7- 301";
        String tipoRecurso = "Aula";

        abrirReserva(nombreRecurso, tipoRecurso);
    }//GEN-LAST:event_reservas9MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insfractuture_resources().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel infraestructura_fondo;
    private javax.swing.JButton infrastructure_Button;
    private javax.swing.JLabel infrastructure_iconButton;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton logOut_Button;
    private javax.swing.JLabel logOut_icon1;
    private javax.swing.JButton reservas1;
    private javax.swing.JButton reservas2;
    private javax.swing.JButton reservas3;
    private javax.swing.JButton reservas4;
    private javax.swing.JButton reservas5;
    private javax.swing.JButton reservas6;
    private javax.swing.JButton reservas7;
    private javax.swing.JButton reservas8;
    private javax.swing.JButton reservas9;
    private javax.swing.JButton start_Button;
    private javax.swing.JLabel start_iconButton;
    private javax.swing.JLabel tecResources_iconButton;
    private javax.swing.JLabel tecResourses_text;
    private javax.swing.JButton tec_resourcesButton;
    private javax.swing.JLabel titulo_salon;
    private javax.swing.JLabel unispace_text;
    private javax.swing.JLabel whiteLogo;
    private javax.swing.JLabel white_background;
    // End of variables declaration//GEN-END:variables
}
