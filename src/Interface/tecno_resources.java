package Interface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import conexión.Conexión;
import javax.swing.JOptionPane;

public class tecno_resources extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(tecno_resources.class.getName());

    public tecno_resources() {
        initComponents();
        cargarEstados();
    }
    
    public void cargarEstados() {
        System.out.println("Cargando estados...");
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        conn = Conexión.getConexion();

        String sql = "SELECT nombre_recurso, marca, estado FROM Recursos_tecno";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();

        while (rs.next()) {
            
            String nombre = rs.getString("nombre_recurso");
            String marca  = rs.getString("marca");
            String estado = rs.getString("estado");
            System.out.println("leyendo: " + nombre + "/ "+ estado );
            // -------------------------
            // COMPUTADORES
            // -------------------------
            if (nombre.equals("Laptop-123SCZ")) {boton_disponible1compu.setText(estado);}
            if (nombre.equals("Laptop-331VGD")) {boton_disponible2compu.setText(estado);}
            if (nombre.equals("Laptop-421FDX")) {boton_disponible3compu.setText(estado);}
            if (nombre.equals("Laptop-236VCH")) {boton_disponible4compu.setText(estado);}
            if (nombre.equals("Laptop-321DSG")) {boton_disponible5compu.setText(estado);}
            // -------------------------
            // VIDEO BEAMS
            // -------------------------
            if (nombre.equals("Proyector-745SXZ")) {boton_disponible1video.setText(estado);}
            if (nombre.equals("Proyector-325SDA")) {boton_disponible2video.setText(estado);}
            if (nombre.equals("Proyector-777JLO")) {boton_disponible3video.setText(estado);}
            if (nombre.equals("Proyector-154JHG")) {boton_disponible4video.setText(estado);}
            if (nombre.equals("Proyector-615NGS")) {boton_disponible5video.setText(estado);}
            // -------------------------
            // TABLETS
            // -------------------------
            if (nombre.equals("Tablet-441MHU")) {boton_disponible1tablet.setText(estado);}
            if (nombre.equals("Tablet-432ASD")) {boton_disponible2tablet.setText(estado);}
            if (nombre.equals("Tablet-023NVB")) {boton_disponible3tablet.setText(estado);}
            if (nombre.equals("Tablet-836IKL")) {boton_disponible4tablet.setText(estado);}
            if (nombre.equals("Tablet-265HVA")) {boton_disponible5tablet.setText(estado);}

        }

    } catch (Exception e) {
        System.out.println("ERROR: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (conn != null) conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al cerrar: " + ex.getMessage());
        }
    }
}
    //separador
    
    private void abrirReserva(String nombreRecurso,String marca, String tipoRecurso) {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        conn = Conexión.getConexion();

        String sql = "SELECT estado FROM Recursos_tecno WHERE nombre_recurso = ?";
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

        // ✔ Si está disponible → abrir ReservaFrame
        new ReservasFrameTecno(nombreRecurso,marca,tipoRecurso, this).setVisible(true);

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error en la BD: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (conn != null) conn.close();
        } catch (SQLException ex) {
            System.out.println("Error cerrando: " + ex.getMessage());
        }
    }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        boton_disponible4compu = new javax.swing.JLabel();
        boton_reservar4compu = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        boton_disponible5compu = new javax.swing.JLabel();
        boton_reservar5_compu = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        boton_reservar4video = new javax.swing.JButton();
        boton_disponible4video = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        boton_disponible5video = new javax.swing.JLabel();
        boton_reservar5video = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        boton_disponible4tablet = new javax.swing.JLabel();
        boton_reservar4tablet = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        boton_reservar5tablet = new javax.swing.JButton();
        boton_disponible5tablet = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        tecResources_iconButton = new javax.swing.JLabel();
        infrastructure_iconButton = new javax.swing.JLabel();
        start_iconButton = new javax.swing.JLabel();
        logOut_icon1 = new javax.swing.JLabel();
        logOut_Button = new javax.swing.JButton();
        infrastructure_Button = new javax.swing.JButton();
        tec_resourcesButton = new javax.swing.JButton();
        start_Button = new javax.swing.JButton();
        boton_disponible3tablet = new javax.swing.JLabel();
        boton_disponible2tablet = new javax.swing.JLabel();
        boton_disponible3video = new javax.swing.JLabel();
        boton_disponible1tablet = new javax.swing.JLabel();
        boton_disponible3compu = new javax.swing.JLabel();
        boton_disponible2video = new javax.swing.JLabel();
        boton_disponible1video = new javax.swing.JLabel();
        boton_disponible2compu = new javax.swing.JLabel();
        boton_disponible1compu = new javax.swing.JLabel();
        boton_reservar3tablet = new javax.swing.JButton();
        boton_reservar2tablet = new javax.swing.JButton();
        boton_reservar1tablet = new javax.swing.JButton();
        boton_reservar3video = new javax.swing.JButton();
        boton_reservar2video = new javax.swing.JButton();
        boton_reservar1video = new javax.swing.JButton();
        boton_reservar3compu = new javax.swing.JButton();
        boton_reservar2compu = new javax.swing.JButton();
        boton_reservar1compu = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tecResourses_text = new javax.swing.JLabel();
        logOut_icon = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        infrastructure_icon = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tecResourses_icon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        start_icon = new javax.swing.JLabel();
        whiteLogo = new javax.swing.JLabel();
        unispace_text = new javax.swing.JLabel();
        white_background = new javax.swing.JLabel();
        tecno_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/laptop.png"))); // NOI18N
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, -1, -1));

        jLabel44.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel44.setText("Laptop-236VCH");
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 210, -1, -1));

        boton_disponible4compu.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        boton_disponible4compu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_disponible4compu.setText("Disponible");
        getContentPane().add(boton_disponible4compu, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 240, -1, -1));

        boton_reservar4compu.setBackground(new java.awt.Color(0, 0, 0));
        boton_reservar4compu.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        boton_reservar4compu.setForeground(new java.awt.Color(255, 255, 255));
        boton_reservar4compu.setText("Reservar");
        boton_reservar4compu.setBorder(null);
        boton_reservar4compu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_reservar4compuMouseClicked(evt);
            }
        });
        boton_reservar4compu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reservar4compuActionPerformed(evt);
            }
        });
        getContentPane().add(boton_reservar4compu, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 100, 22));

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, -1, 150));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/laptop.png"))); // NOI18N
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, -1, -1));

        jLabel47.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Laptop-12345SCZ");
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 210, -1, -1));

        jLabel48.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        jLabel48.setText("Disponible");
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 240, -1, -1));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Reservar");
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, 100, 22));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/laptop.png"))); // NOI18N
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 150, -1, -1));

        jLabel50.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Laptop-321DSG");
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 210, -1, -1));

        boton_disponible5compu.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        boton_disponible5compu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_disponible5compu.setText("Disponible");
        getContentPane().add(boton_disponible5compu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 240, -1, -1));

        boton_reservar5_compu.setBackground(new java.awt.Color(0, 0, 0));
        boton_reservar5_compu.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        boton_reservar5_compu.setForeground(new java.awt.Color(255, 255, 255));
        boton_reservar5_compu.setText("Reservar");
        boton_reservar5_compu.setBorder(null);
        boton_reservar5_compu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_reservar5_compuMouseClicked(evt);
            }
        });
        boton_reservar5_compu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reservar5_compuActionPerformed(evt);
            }
        });
        getContentPane().add(boton_reservar5_compu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 260, 100, 22));

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 140, 160, 150));

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, -1, 150));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/videobean.png"))); // NOI18N
        getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 320, -1, -1));

        jLabel55.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel55.setText("Proyector-154JHG");
        getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, -1, -1));

        boton_reservar4video.setBackground(new java.awt.Color(0, 0, 0));
        boton_reservar4video.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        boton_reservar4video.setForeground(new java.awt.Color(255, 255, 255));
        boton_reservar4video.setText("Reservar");
        boton_reservar4video.setBorder(null);
        boton_reservar4video.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_reservar4videoMouseClicked(evt);
            }
        });
        boton_reservar4video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reservar4videoActionPerformed(evt);
            }
        });
        getContentPane().add(boton_reservar4video, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 430, 100, 22));

        boton_disponible4video.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        boton_disponible4video.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_disponible4video.setText("Disponible");
        getContentPane().add(boton_disponible4video, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 410, -1, -1));

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 310, -1, 150));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/videobean.png"))); // NOI18N
        getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 320, -1, -1));

        jLabel60.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel60.setText("Proyector-615NGS");
        getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 380, -1, -1));

        boton_disponible5video.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        boton_disponible5video.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_disponible5video.setText("Disponible");
        getContentPane().add(boton_disponible5video, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 410, -1, -1));

        boton_reservar5video.setBackground(new java.awt.Color(0, 0, 0));
        boton_reservar5video.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        boton_reservar5video.setForeground(new java.awt.Color(255, 255, 255));
        boton_reservar5video.setText("Reservar");
        boton_reservar5video.setBorder(null);
        boton_reservar5video.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_reservar5videoMouseClicked(evt);
            }
        });
        boton_reservar5video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reservar5videoActionPerformed(evt);
            }
        });
        getContentPane().add(boton_reservar5video, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 430, 100, 22));

        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 310, 160, 150));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tablet.png"))); // NOI18N
        getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 500, -1, -1));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tablet.png"))); // NOI18N
        getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, -1, -1));

        jLabel66.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel66.setText("Tablet-265HVA");
        getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 560, -1, -1));

        jLabel67.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel67.setText("Tablet-836IKL");
        getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 560, -1, -1));

        boton_disponible4tablet.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        boton_disponible4tablet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_disponible4tablet.setText("Disponible");
        getContentPane().add(boton_disponible4tablet, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 590, -1, -1));

        boton_reservar4tablet.setBackground(new java.awt.Color(0, 0, 0));
        boton_reservar4tablet.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        boton_reservar4tablet.setForeground(new java.awt.Color(255, 255, 255));
        boton_reservar4tablet.setText("Reservar");
        boton_reservar4tablet.setBorder(null);
        boton_reservar4tablet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_reservar4tabletMouseClicked(evt);
            }
        });
        boton_reservar4tablet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reservar4tabletActionPerformed(evt);
            }
        });
        getContentPane().add(boton_reservar4tablet, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 610, 100, 22));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, 160, 150));

        boton_reservar5tablet.setBackground(new java.awt.Color(0, 0, 0));
        boton_reservar5tablet.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        boton_reservar5tablet.setForeground(new java.awt.Color(255, 255, 255));
        boton_reservar5tablet.setText("Reservar");
        boton_reservar5tablet.setBorder(null);
        boton_reservar5tablet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_reservar5tabletMouseClicked(evt);
            }
        });
        boton_reservar5tablet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reservar5tabletActionPerformed(evt);
            }
        });
        getContentPane().add(boton_reservar5tablet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 610, 100, 22));

        boton_disponible5tablet.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        boton_disponible5tablet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_disponible5tablet.setText("Disponible");
        getContentPane().add(boton_disponible5tablet, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 590, -1, -1));

        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 490, 160, 150));

        tecResources_iconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resources_icon.png"))); // NOI18N
        getContentPane().add(tecResources_iconButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 340, 40, 30));

        infrastructure_iconButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infrastructure_iconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/infrastructure_icon.png"))); // NOI18N
        getContentPane().add(infrastructure_iconButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 439, 40, 30));

        start_iconButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/start_icon.png"))); // NOI18N
        getContentPane().add(start_iconButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 240, 40, 30));

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

        tec_resourcesButton.setBackground(new java.awt.Color(44, 44, 44));
        tec_resourcesButton.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 20)); // NOI18N
        tec_resourcesButton.setForeground(new java.awt.Color(255, 255, 255));
        tec_resourcesButton.setText("Tecnologicos ");
        tec_resourcesButton.setBorder(null);
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

        boton_disponible3tablet.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        boton_disponible3tablet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_disponible3tablet.setText("Disponible");
        getContentPane().add(boton_disponible3tablet, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 590, -1, -1));

        boton_disponible2tablet.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        boton_disponible2tablet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_disponible2tablet.setText("Disponible");
        getContentPane().add(boton_disponible2tablet, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 592, -1, -1));

        boton_disponible3video.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        boton_disponible3video.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_disponible3video.setText("Disponible");
        getContentPane().add(boton_disponible3video, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, -1, -1));

        boton_disponible1tablet.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        boton_disponible1tablet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_disponible1tablet.setText("Disponible");
        getContentPane().add(boton_disponible1tablet, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 592, -1, -1));

        boton_disponible3compu.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        boton_disponible3compu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_disponible3compu.setText("Disponible");
        getContentPane().add(boton_disponible3compu, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, -1, -1));

        boton_disponible2video.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        boton_disponible2video.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_disponible2video.setText("Disponible");
        getContentPane().add(boton_disponible2video, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 412, -1, -1));

        boton_disponible1video.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        boton_disponible1video.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_disponible1video.setText("Disponible");
        getContentPane().add(boton_disponible1video, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 412, -1, -1));

        boton_disponible2compu.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        boton_disponible2compu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        boton_disponible2compu.setText("Disponible");
        getContentPane().add(boton_disponible2compu, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 242, -1, -1));

        boton_disponible1compu.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 12)); // NOI18N
        boton_disponible1compu.setText("Disponible");
        getContentPane().add(boton_disponible1compu, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 242, -1, -1));

        boton_reservar3tablet.setBackground(new java.awt.Color(0, 0, 0));
        boton_reservar3tablet.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        boton_reservar3tablet.setForeground(new java.awt.Color(255, 255, 255));
        boton_reservar3tablet.setText("Reservar");
        boton_reservar3tablet.setBorder(null);
        boton_reservar3tablet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_reservar3tabletMouseClicked(evt);
            }
        });
        boton_reservar3tablet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reservar3tabletActionPerformed(evt);
            }
        });
        getContentPane().add(boton_reservar3tablet, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 610, 100, 22));

        boton_reservar2tablet.setBackground(new java.awt.Color(0, 0, 0));
        boton_reservar2tablet.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        boton_reservar2tablet.setForeground(new java.awt.Color(255, 255, 255));
        boton_reservar2tablet.setText("Reservar");
        boton_reservar2tablet.setBorder(null);
        boton_reservar2tablet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_reservar2tabletMouseClicked(evt);
            }
        });
        boton_reservar2tablet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reservar2tabletActionPerformed(evt);
            }
        });
        getContentPane().add(boton_reservar2tablet, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, 100, 22));

        boton_reservar1tablet.setBackground(new java.awt.Color(0, 0, 0));
        boton_reservar1tablet.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        boton_reservar1tablet.setForeground(new java.awt.Color(255, 255, 255));
        boton_reservar1tablet.setText("Reservar");
        boton_reservar1tablet.setBorder(null);
        boton_reservar1tablet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_reservar1tabletMouseClicked(evt);
            }
        });
        boton_reservar1tablet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reservar1tabletActionPerformed(evt);
            }
        });
        getContentPane().add(boton_reservar1tablet, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 100, 22));

        boton_reservar3video.setBackground(new java.awt.Color(0, 0, 0));
        boton_reservar3video.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        boton_reservar3video.setForeground(new java.awt.Color(255, 255, 255));
        boton_reservar3video.setText("Reservar");
        boton_reservar3video.setBorder(null);
        boton_reservar3video.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_reservar3videoMouseClicked(evt);
            }
        });
        boton_reservar3video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reservar3videoActionPerformed(evt);
            }
        });
        getContentPane().add(boton_reservar3video, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 100, 22));

        boton_reservar2video.setBackground(new java.awt.Color(0, 0, 0));
        boton_reservar2video.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        boton_reservar2video.setForeground(new java.awt.Color(255, 255, 255));
        boton_reservar2video.setText("Reservar");
        boton_reservar2video.setBorder(null);
        boton_reservar2video.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_reservar2videoMouseClicked(evt);
            }
        });
        boton_reservar2video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reservar2videoActionPerformed(evt);
            }
        });
        getContentPane().add(boton_reservar2video, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 100, 22));

        boton_reservar1video.setBackground(new java.awt.Color(0, 0, 0));
        boton_reservar1video.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        boton_reservar1video.setForeground(new java.awt.Color(255, 255, 255));
        boton_reservar1video.setText("Reservar");
        boton_reservar1video.setBorder(null);
        boton_reservar1video.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_reservar1videoMouseClicked(evt);
            }
        });
        boton_reservar1video.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reservar1videoActionPerformed(evt);
            }
        });
        getContentPane().add(boton_reservar1video, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 100, 22));

        boton_reservar3compu.setBackground(new java.awt.Color(0, 0, 0));
        boton_reservar3compu.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        boton_reservar3compu.setForeground(new java.awt.Color(255, 255, 255));
        boton_reservar3compu.setText("Reservar");
        boton_reservar3compu.setBorder(null);
        boton_reservar3compu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_reservar3compuMouseClicked(evt);
            }
        });
        boton_reservar3compu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reservar3compuActionPerformed(evt);
            }
        });
        getContentPane().add(boton_reservar3compu, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 100, 22));

        boton_reservar2compu.setBackground(new java.awt.Color(0, 0, 0));
        boton_reservar2compu.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        boton_reservar2compu.setForeground(new java.awt.Color(255, 255, 255));
        boton_reservar2compu.setText("Reservar");
        boton_reservar2compu.setBorder(null);
        boton_reservar2compu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_reservar2compuMouseClicked(evt);
            }
        });
        boton_reservar2compu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reservar2compuActionPerformed(evt);
            }
        });
        getContentPane().add(boton_reservar2compu, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 100, 22));

        boton_reservar1compu.setBackground(new java.awt.Color(0, 0, 0));
        boton_reservar1compu.setFont(new java.awt.Font("Source Code Pro ExtraBold", 0, 14)); // NOI18N
        boton_reservar1compu.setForeground(new java.awt.Color(255, 255, 255));
        boton_reservar1compu.setText("Reservar");
        boton_reservar1compu.setBorder(null);
        boton_reservar1compu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_reservar1compuMouseClicked(evt);
            }
        });
        boton_reservar1compu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_reservar1compuActionPerformed(evt);
            }
        });
        getContentPane().add(boton_reservar1compu, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 260, 100, 22));

        jLabel32.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel32.setText("Tablet-023NVB");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 560, -1, -1));

        jLabel31.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel31.setText("Tablet-432ASD");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, -1, -1));

        jLabel30.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel30.setText("Tablet-441MHU");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 560, -1, -1));

        jLabel29.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel29.setText("Proyector-777JLO");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, -1, -1));

        jLabel28.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel28.setText("Proyector-325SDA");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, -1, -1));

        jLabel27.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel27.setText("Proyector-745SXZ");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 380, -1, -1));

        jLabel26.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel26.setText("Laptop-421FDX");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 210, -1, -1));

        jLabel25.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Laptop-331VGD");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        jLabel20.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Laptop-123SCZ");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 210, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tablet.png"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tablet.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tablet.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 500, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/videobean.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/videobean.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/videobean.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 320, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/laptop.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 150, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/laptop.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/laptop.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 150, -1, -1));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 160, 150));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 160, 150));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, 150));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, 160, 150));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 160, 150));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, 150));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, -1, 150));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 160, 150));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/skyBlue_square.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 160, 150));

        tecResourses_text.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 38)); // NOI18N
        tecResourses_text.setText("Recursos Tecnologicos");
        getContentPane().add(tecResourses_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        logOut_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logOut_icon.png"))); // NOI18N
        getContentPane().add(logOut_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 635, 40, 30));

        jLabel24.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Cerrar sesión");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, -1, -1));

        jLabel23.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Infraestructura");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        infrastructure_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/infrastructure_icon.png"))); // NOI18N
        getContentPane().add(infrastructure_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 40, 40));

        jLabel22.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(179, 179, 179));
        jLabel22.setText("Tecnológicos");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        jLabel21.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(179, 179, 179));
        jLabel21.setText("Recursos");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        tecResourses_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resources_icon.png"))); // NOI18N
        getContentPane().add(tecResourses_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 40, 40));

        jLabel7.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Inicio");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        start_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/start_icon.png"))); // NOI18N
        getContentPane().add(start_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 40, 40));

        whiteLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/start_logo.png"))); // NOI18N
        getContentPane().add(whiteLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 107, 118));

        unispace_text.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 50)); // NOI18N
        unispace_text.setForeground(new java.awt.Color(255, 255, 255));
        unispace_text.setText("UniSpace");
        unispace_text.setToolTipText("");
        getContentPane().add(unispace_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        white_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white_background.png"))); // NOI18N
        getContentPane().add(white_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 69, 1010, 640));

        tecno_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/black_background.png"))); // NOI18N
        getContentPane().add(tecno_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_reservar1compuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reservar1compuActionPerformed

    }//GEN-LAST:event_boton_reservar1compuActionPerformed

    private void boton_reservar2compuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reservar2compuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_reservar2compuActionPerformed

    private void boton_reservar3compuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reservar3compuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_reservar3compuActionPerformed

    private void boton_reservar1videoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reservar1videoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_reservar1videoActionPerformed

    private void boton_reservar2videoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reservar2videoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_reservar2videoActionPerformed

    private void boton_reservar3videoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reservar3videoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_reservar3videoActionPerformed

    private void boton_reservar1tabletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reservar1tabletActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_reservar1tabletActionPerformed

    private void boton_reservar2tabletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reservar2tabletActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_reservar2tabletActionPerformed

    private void boton_reservar3tabletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reservar3tabletActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_reservar3tabletActionPerformed

    private void start_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_ButtonActionPerformed

    }//GEN-LAST:event_start_ButtonActionPerformed

    private void tec_resourcesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tec_resourcesButtonActionPerformed
        //Nada por ahora.
    }//GEN-LAST:event_tec_resourcesButtonActionPerformed

    private void infrastructure_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infrastructure_ButtonActionPerformed

    }//GEN-LAST:event_infrastructure_ButtonActionPerformed

    private void logOut_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOut_ButtonActionPerformed

    }//GEN-LAST:event_logOut_ButtonActionPerformed

    private void start_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start_ButtonMouseClicked
        this.dispose();                     // Cierra la ventana actual (Inicio)
        Inicio start_page = new Inicio(); // Crea la nueva ventana(Infraestructura)
        start_page.setVisible(true);
    }//GEN-LAST:event_start_ButtonMouseClicked

    private void infrastructure_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infrastructure_ButtonMouseClicked
        this.dispose();                     // Cierra la ventana actual (tecno_resources)
        Insfractuture_resources infraResourses = new Insfractuture_resources(); // Crea la nueva ventana(Infraestructura)
        infraResourses.setVisible(true);
    }//GEN-LAST:event_infrastructure_ButtonMouseClicked

    private void logOut_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOut_ButtonMouseClicked
        this.dispose();                     // Cierra la ventana actual (Recursos tecnologicos)
        Login login = new Login(); // Crea la nueva ventana(Login)
        login.setVisible(true);        // La muestra
    }//GEN-LAST:event_logOut_ButtonMouseClicked

    private void boton_reservar4compuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reservar4compuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_reservar4compuActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void boton_reservar5_compuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reservar5_compuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_reservar5_compuActionPerformed

    private void boton_reservar4videoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reservar4videoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_reservar4videoActionPerformed

    private void boton_reservar5videoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reservar5videoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_reservar5videoActionPerformed

    private void boton_reservar4tabletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reservar4tabletActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_reservar4tabletActionPerformed

    private void boton_reservar5tabletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_reservar5tabletActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_reservar5tabletActionPerformed

    private void boton_reservar1compuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_reservar1compuMouseClicked
        abrirReserva("Laptop-123SCZ","Hp", "Tecnológico");
    }//GEN-LAST:event_boton_reservar1compuMouseClicked

    private void boton_reservar2compuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_reservar2compuMouseClicked
        abrirReserva("Laptop-331VGD","Asus", "Tecnológico");
    }//GEN-LAST:event_boton_reservar2compuMouseClicked

    private void boton_reservar3compuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_reservar3compuMouseClicked
        abrirReserva("Laptop-421FDX","Lenovo", "Tecnológico");
    }//GEN-LAST:event_boton_reservar3compuMouseClicked

    private void boton_reservar4compuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_reservar4compuMouseClicked
        abrirReserva("Laptop-236VCH","Asus", "Tecnológico");
    }//GEN-LAST:event_boton_reservar4compuMouseClicked

    private void boton_reservar5_compuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_reservar5_compuMouseClicked
        abrirReserva("Laptop-321DSG","Hp", "Tecnológico");
    }//GEN-LAST:event_boton_reservar5_compuMouseClicked

    private void boton_reservar1videoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_reservar1videoMouseClicked
        abrirReserva("Proyector-745SXZ","Epson", "Tecnológico");
    }//GEN-LAST:event_boton_reservar1videoMouseClicked

    private void boton_reservar2videoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_reservar2videoMouseClicked
        abrirReserva("Proyector-325SDA","Epson", "Tecnológico");
    }//GEN-LAST:event_boton_reservar2videoMouseClicked

    private void boton_reservar3videoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_reservar3videoMouseClicked
        abrirReserva("Proyector-777JLO","Epson", "Tecnológico");
    }//GEN-LAST:event_boton_reservar3videoMouseClicked

    private void boton_reservar4videoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_reservar4videoMouseClicked
        abrirReserva("Proyector-154JHG","Epson", "Tecnológico");
    }//GEN-LAST:event_boton_reservar4videoMouseClicked

    private void boton_reservar5videoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_reservar5videoMouseClicked
        abrirReserva("Proyector-615NGS","Epson", "Tecnológico");
    }//GEN-LAST:event_boton_reservar5videoMouseClicked

    private void boton_reservar1tabletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_reservar1tabletMouseClicked
        abrirReserva("Tablet-441MHU","Samsung", "Tecnológico");
    }//GEN-LAST:event_boton_reservar1tabletMouseClicked

    private void boton_reservar2tabletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_reservar2tabletMouseClicked
        abrirReserva("Tablet-432ASD","Samsung", "Tecnológico");
    }//GEN-LAST:event_boton_reservar2tabletMouseClicked

    private void boton_reservar3tabletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_reservar3tabletMouseClicked
        abrirReserva("Tablet-023NVB","Samsung", "Tecnológico");
    }//GEN-LAST:event_boton_reservar3tabletMouseClicked

    private void boton_reservar4tabletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_reservar4tabletMouseClicked
        abrirReserva("Tablet-836IKL","Huawei", "Tecnológico");
    }//GEN-LAST:event_boton_reservar4tabletMouseClicked

    private void boton_reservar5tabletMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_reservar5tabletMouseClicked
        abrirReserva("Tablet-265HVA","Huawei", "Tecnológico");
    }//GEN-LAST:event_boton_reservar5tabletMouseClicked
    
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
        java.awt.EventQueue.invokeLater(() -> new tecno_resources().setVisible(true));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel boton_disponible1compu;
    private javax.swing.JLabel boton_disponible1tablet;
    private javax.swing.JLabel boton_disponible1video;
    private javax.swing.JLabel boton_disponible2compu;
    private javax.swing.JLabel boton_disponible2tablet;
    private javax.swing.JLabel boton_disponible2video;
    private javax.swing.JLabel boton_disponible3compu;
    private javax.swing.JLabel boton_disponible3tablet;
    private javax.swing.JLabel boton_disponible3video;
    private javax.swing.JLabel boton_disponible4compu;
    private javax.swing.JLabel boton_disponible4tablet;
    private javax.swing.JLabel boton_disponible4video;
    private javax.swing.JLabel boton_disponible5compu;
    private javax.swing.JLabel boton_disponible5tablet;
    private javax.swing.JLabel boton_disponible5video;
    private javax.swing.JButton boton_reservar1compu;
    private javax.swing.JButton boton_reservar1tablet;
    private javax.swing.JButton boton_reservar1video;
    private javax.swing.JButton boton_reservar2compu;
    private javax.swing.JButton boton_reservar2tablet;
    private javax.swing.JButton boton_reservar2video;
    private javax.swing.JButton boton_reservar3compu;
    private javax.swing.JButton boton_reservar3tablet;
    private javax.swing.JButton boton_reservar3video;
    private javax.swing.JButton boton_reservar4compu;
    private javax.swing.JButton boton_reservar4tablet;
    private javax.swing.JButton boton_reservar4video;
    private javax.swing.JButton boton_reservar5_compu;
    private javax.swing.JButton boton_reservar5tablet;
    private javax.swing.JButton boton_reservar5video;
    private javax.swing.JButton infrastructure_Button;
    private javax.swing.JLabel infrastructure_icon;
    private javax.swing.JLabel infrastructure_iconButton;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton logOut_Button;
    private javax.swing.JLabel logOut_icon;
    private javax.swing.JLabel logOut_icon1;
    private javax.swing.JButton start_Button;
    private javax.swing.JLabel start_icon;
    private javax.swing.JLabel start_iconButton;
    private javax.swing.JLabel tecResources_iconButton;
    private javax.swing.JLabel tecResourses_icon;
    private javax.swing.JLabel tecResourses_text;
    private javax.swing.JButton tec_resourcesButton;
    private javax.swing.JLabel tecno_background;
    private javax.swing.JLabel unispace_text;
    private javax.swing.JLabel whiteLogo;
    private javax.swing.JLabel white_background;
    // End of variables declaration//GEN-END:variables
}
