package Interface_employed;



public class asuntoFrame extends javax.swing.JFrame {

    public asuntoFrame() {
        initComponents();
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
        getContentPane().add(labelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 80, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("League Spartan Thin", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 750, 190));

        botonRevisado.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 24)); // NOI18N
        botonRevisado.setText("Revisado");
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
    /**
     * @param args the command line arguments
     */
    private void cerrarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarVentanaMouseClicked
        this.dispose();
    }//GEN-LAST:event_cerrarVentanaMouseClicked

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
