package Interface;

import Interface_employed.inicio_empleado;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import conexión.Conexión;

public class Login extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());
    
    public static int usuarioID;

    public Login() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(background_space, "src/images/space_background.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        register_account = new javax.swing.JButton();
        login_button = new javax.swing.JButton();
        password_bar = new javax.swing.JPasswordField();
        user_textBarName = new javax.swing.JTextField();
        id_icon = new javax.swing.JLabel();
        password_login = new javax.swing.JLabel();
        black_bar = new javax.swing.JLabel();
        black_bar2 = new javax.swing.JLabel();
        blue_logo = new javax.swing.JLabel();
        unispace_text = new javax.swing.JLabel();
        create_account_Del = new javax.swing.JLabel();
        noAccount_text = new javax.swing.JLabel();
        gray_background = new javax.swing.JLabel();
        white_logo_lbl = new javax.swing.JLabel();
        unispace_textGray = new javax.swing.JLabel();
        background_space = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        register_account.setBackground(new java.awt.Color(145, 145, 145));
        register_account.setFont(new java.awt.Font("League Spartan ExtraBold", 3, 16)); // NOI18N
        register_account.setForeground(new java.awt.Color(255, 255, 255));
        register_account.setText("Registrarse");
        register_account.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        register_account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_accountMouseClicked(evt);
            }
        });
        register_account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_accountActionPerformed(evt);
            }
        });
        getContentPane().add(register_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 500, 140, 40));

        login_button.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        login_button.setText("Iniciar sesión");
        login_button.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login_button.setBorderPainted(false);
        login_button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        login_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, 130, 40));

        password_bar.setBackground(new java.awt.Color(179, 179, 179));
        password_bar.setFont(new java.awt.Font("League Spartan ExtraBold", 3, 16)); // NOI18N
        password_bar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        password_bar.setBorder(null);
        password_bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                password_barMouseMoved(evt);
            }
        });
        password_bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                password_barMousePressed(evt);
            }
        });
        password_bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_barActionPerformed(evt);
            }
        });
        getContentPane().add(password_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 398, 400, 30));

        user_textBarName.setBackground(new java.awt.Color(179, 179, 179));
        user_textBarName.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 16)); // NOI18N
        user_textBarName.setBorder(null);
        user_textBarName.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                user_textBarNameMouseMoved(evt);
            }
        });
        user_textBarName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_textBarNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user_textBarNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user_textBarNameMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                user_textBarNameMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                user_textBarNameMouseReleased(evt);
            }
        });
        user_textBarName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_textBarNameActionPerformed(evt);
            }
        });
        user_textBarName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                user_textBarNameKeyPressed(evt);
            }
        });
        getContentPane().add(user_textBarName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 318, 400, 30));

        id_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        id_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ID_icon.png"))); // NOI18N
        getContentPane().add(id_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 40, 40));

        password_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        password_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passwordSignUp_icon.png"))); // NOI18N
        getContentPane().add(password_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 40, 40));

        black_bar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blackBar.png"))); // NOI18N
        getContentPane().add(black_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 450, 3));

        black_bar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        black_bar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blackBar.png"))); // NOI18N
        getContentPane().add(black_bar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 450, 3));

        blue_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        blue_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue_logo.png"))); // NOI18N
        getContentPane().add(blue_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 130, 110));

        unispace_text.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 38)); // NOI18N
        unispace_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unispace_text.setText("Unispace");
        getContentPane().add(unispace_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, -1, 50));

        create_account_Del.setFont(new java.awt.Font("League Spartan ExtraBold", 3, 18)); // NOI18N
        create_account_Del.setForeground(new java.awt.Color(255, 255, 255));
        create_account_Del.setText("Crear cuenta");
        getContentPane().add(create_account_Del, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 130, 20));

        noAccount_text.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 18)); // NOI18N
        noAccount_text.setText("¿Aún no tienes cuenta?");
        getContentPane().add(noAccount_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, 200, 20));

        gray_background.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 12)); // NOI18N
        gray_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gray_backgroundLogin.png"))); // NOI18N
        getContentPane().add(gray_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 578, 372));

        white_logo_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white_logo.png"))); // NOI18N
        getContentPane().add(white_logo_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 165, 182));

        unispace_textGray.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 95)); // NOI18N
        unispace_textGray.setForeground(new java.awt.Color(179, 179, 179));
        unispace_textGray.setText("UniSpace");
        getContentPane().add(unispace_textGray, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 430, 90));

        background_space.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background_space.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/space_background.png"))); // NOI18N
        getContentPane().add(background_space, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void password_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_barActionPerformed
        
    }//GEN-LAST:event_password_barActionPerformed

    private void register_accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_accountActionPerformed
        

    }//GEN-LAST:event_register_accountActionPerformed

    private void register_accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_accountMouseClicked
        this.dispose();                     // Cierra la ventana actual (Login)
        Sing_up registro = new Sing_up(); // Crea la nueva ventana (Resgistro)
        registro.setVisible(true);        // La muestra
    }//GEN-LAST:event_register_accountMouseClicked

    private void login_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_buttonMouseClicked
      String id = user_textBarName.getText();
      String contrasena = password_bar.getText();

    if (id.isEmpty() || contrasena.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Debes llenar todos los campos.");
        return;
    }

    try {
        Connection conexion = Conexión.getConexion();
        
        String sql = "SELECT * FROM usuario WHERE id_usuario = ? AND contrasena = ?";
        PreparedStatement pst = conexion.prepareStatement(sql);
        pst.setString(1, id);
        pst.setString(2, contrasena);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            // Login correcto
            
            Login.usuarioID = rs.getInt("id_usuario");
            String nombre = rs.getString("nombre");
            String rol = rs.getString("rol");

            JOptionPane.showMessageDialog(this, 
                    "Bienvenido " + nombre + " (" + rol + ")");

            this.dispose();

            // Aquí decides qué ventana abrir según su rol
            if (rol.equalsIgnoreCase("estudiante")) {
                Inicio inicio = new Inicio();
                inicio.setVisible(true);
            } else if (rol.equalsIgnoreCase("empleado")) {
                // si tienes una ventana especial para empleados
                // EmpleadoInicio emp = new EmpleadoInicio();
                // emp.setVisible(true);
                inicio_empleado inicioEmp = new inicio_empleado(); // temporal
                inicioEmp.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "ID o contraseña incorrectos.");
        }

        rs.close();
        pst.close();
        conexion.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al iniciar sesión: " + e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_login_buttonMouseClicked

    private void user_textBarNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_textBarNameMouseClicked
       
    }//GEN-LAST:event_user_textBarNameMouseClicked

    private void user_textBarNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_textBarNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_textBarNameActionPerformed

    private void user_textBarNameMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_textBarNameMouseMoved
        
    }//GEN-LAST:event_user_textBarNameMouseMoved

    private void password_barMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_barMouseMoved
        
    }//GEN-LAST:event_password_barMouseMoved

    private void user_textBarNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_textBarNameMousePressed
        user_textBarName.setText("Escribe tu ID aquí...");
        user_textBarName.setForeground(Color.GRAY);

        // Cuando el usuario hace clic o escribe
        user_textBarName.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (user_textBarName.getText().equals("Escribe tu ID aquí...")) {
                    user_textBarName.setText("");
                    user_textBarName.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (user_textBarName.getText().isEmpty()) {
                    user_textBarName.setText("Escribe tu ID aquí...");
                    user_textBarName.setForeground(Color.GRAY);
                }
            }
        });
    }//GEN-LAST:event_user_textBarNameMousePressed

    private void password_barMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_barMousePressed
        password_bar.setText("Escribe");
        password_bar.setForeground(Color.GRAY);

        // Cuando el usuario hace clic o escribe
        password_bar.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (password_bar.getText().equals("Escribe")) {
                    password_bar.setText("");
                    password_bar.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (password_bar.getText().isEmpty()) {
                    password_bar.setText("Escribe tu password aquí...");
                    password_bar.setForeground(Color.GRAY);
                }
            }
        });
    }//GEN-LAST:event_password_barMousePressed

    private void user_textBarNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_textBarNameMouseEntered
       
    }//GEN-LAST:event_user_textBarNameMouseEntered

    private void user_textBarNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_textBarNameMouseReleased
       
    }//GEN-LAST:event_user_textBarNameMouseReleased

    private void user_textBarNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_textBarNameMouseExited
        
    }//GEN-LAST:event_user_textBarNameMouseExited

    private void user_textBarNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_textBarNameKeyPressed
        
    }//GEN-LAST:event_user_textBarNameKeyPressed

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
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_space;
    private javax.swing.JLabel black_bar;
    private javax.swing.JLabel black_bar2;
    private javax.swing.JLabel blue_logo;
    private javax.swing.JLabel create_account_Del;
    private javax.swing.JLabel gray_background;
    private javax.swing.JLabel id_icon;
    private javax.swing.JButton login_button;
    private javax.swing.JLabel noAccount_text;
    private javax.swing.JPasswordField password_bar;
    private javax.swing.JLabel password_login;
    private javax.swing.JButton register_account;
    private javax.swing.JLabel unispace_text;
    private javax.swing.JLabel unispace_textGray;
    private javax.swing.JTextField user_textBarName;
    private javax.swing.JLabel white_logo_lbl;
    // End of variables declaration//GEN-END:variables
}
