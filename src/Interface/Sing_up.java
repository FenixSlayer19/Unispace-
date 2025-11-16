package Interface;

import conexión.Conexión;
import java.sql.Connection;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sing_up extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Sing_up.class.getName());

    private String rolSeleccionado = null;

    public Sing_up() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(background_space, "src/images/space_background.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        password_bar = new javax.swing.JPasswordField();
        confirmPassword_bar = new javax.swing.JPasswordField();
        text_barPhoneNum = new javax.swing.JTextField();
        text_barName = new javax.swing.JTextField();
        text_barId = new javax.swing.JTextField();
        text_barEmail = new javax.swing.JTextField();
        createAccount_button = new javax.swing.JButton();
        studentToggleButton = new javax.swing.JToggleButton();
        employedToggleButton = new javax.swing.JToggleButton();
        employed_button = new javax.swing.JButton();
        student_button = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        textBar_account = new javax.swing.JLabel();
        confirmPass_img = new javax.swing.JLabel();
        password_img = new javax.swing.JLabel();
        phoneNum_img = new javax.swing.JLabel();
        email_img = new javax.swing.JLabel();
        id_img = new javax.swing.JLabel();
        user_img = new javax.swing.JLabel();
        confirmPass_box = new javax.swing.JLabel();
        password_box = new javax.swing.JLabel();
        phoneNum_box = new javax.swing.JLabel();
        email_box = new javax.swing.JLabel();
        id_box = new javax.swing.JLabel();
        name_box = new javax.swing.JLabel();
        employedText_Del = new javax.swing.JLabel();
        student_textDel = new javax.swing.JLabel();
        who_are_youText = new javax.swing.JLabel();
        sing_upText = new javax.swing.JLabel();
        blue_logo = new javax.swing.JLabel();
        gray_background = new javax.swing.JLabel();
        white_logo_img = new javax.swing.JLabel();
        text_Unispace = new javax.swing.JLabel();
        background_space = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1290, 710));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        password_bar.setBackground(new java.awt.Color(78, 72, 72));
        password_bar.setForeground(new java.awt.Color(255, 255, 255));
        password_bar.setBorder(null);
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
        getContentPane().add(password_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 438, 250, 30));

        confirmPassword_bar.setBackground(new java.awt.Color(78, 72, 72));
        confirmPassword_bar.setForeground(new java.awt.Color(255, 255, 255));
        confirmPassword_bar.setBorder(null);
        confirmPassword_bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPassword_barActionPerformed(evt);
            }
        });
        getContentPane().add(confirmPassword_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 508, 250, 30));

        text_barPhoneNum.setBackground(new java.awt.Color(78, 72, 72));
        text_barPhoneNum.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 18)); // NOI18N
        text_barPhoneNum.setForeground(new java.awt.Color(255, 255, 255));
        text_barPhoneNum.setBorder(null);
        text_barPhoneNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_barPhoneNumActionPerformed(evt);
            }
        });
        getContentPane().add(text_barPhoneNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 368, 250, 30));

        text_barName.setBackground(new java.awt.Color(78, 72, 72));
        text_barName.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 18)); // NOI18N
        text_barName.setForeground(new java.awt.Color(255, 255, 255));
        text_barName.setBorder(null);
        text_barName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                text_barNameMousePressed(evt);
            }
        });
        text_barName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_barNameActionPerformed(evt);
            }
        });
        getContentPane().add(text_barName, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 368, 250, 30));

        text_barId.setBackground(new java.awt.Color(78, 72, 72));
        text_barId.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 18)); // NOI18N
        text_barId.setForeground(new java.awt.Color(255, 255, 255));
        text_barId.setBorder(null);
        text_barId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_barIdActionPerformed(evt);
            }
        });
        getContentPane().add(text_barId, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 438, 250, 30));

        text_barEmail.setBackground(new java.awt.Color(78, 72, 72));
        text_barEmail.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 18)); // NOI18N
        text_barEmail.setForeground(new java.awt.Color(255, 255, 255));
        text_barEmail.setBorder(null);
        text_barEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_barEmailActionPerformed(evt);
            }
        });
        getContentPane().add(text_barEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 508, 250, 30));

        createAccount_button.setBackground(new java.awt.Color(215, 215, 215));
        createAccount_button.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 18)); // NOI18N
        createAccount_button.setText("Crear Cuenta");
        createAccount_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccount_buttonMouseClicked(evt);
            }
        });
        createAccount_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccount_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(createAccount_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, 160, 40));

        studentToggleButton.setBackground(new java.awt.Color(145, 145, 145));
        studentToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/student_icon.png"))); // NOI18N
        studentToggleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentToggleButtonMouseClicked(evt);
            }
        });
        studentToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentToggleButtonActionPerformed(evt);
            }
        });
        getContentPane().add(studentToggleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 240, 60, 60));

        employedToggleButton.setBackground(new java.awt.Color(145, 145, 145));
        employedToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employed_icon.png"))); // NOI18N
        employedToggleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employedToggleButtonMouseClicked(evt);
            }
        });
        getContentPane().add(employedToggleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 240, 60, 60));

        employed_button.setBackground(new java.awt.Color(179, 179, 179));
        employed_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/employed_icon.png"))); // NOI18N
        employed_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employed_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(employed_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 240, 60, 60));

        student_button.setBackground(new java.awt.Color(179, 179, 179));
        student_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/student_icon.png"))); // NOI18N
        student_button.setBorder(null);
        getContentPane().add(student_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 240, 60, 60));

        loginButton.setBackground(new java.awt.Color(215, 215, 215));
        loginButton.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 18)); // NOI18N
        loginButton.setText("Iniciar sesión");
        loginButton.setBorder(null);
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 590, 120, 40));

        textBar_account.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 20)); // NOI18N
        textBar_account.setText("ya tienes una cuenta.");
        getContentPane().add(textBar_account, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 604, -1, -1));

        confirmPass_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/changePassword_icon.png"))); // NOI18N
        getContentPane().add(confirmPass_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 503, -1, -1));

        password_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passwordSignUp_icon.png"))); // NOI18N
        getContentPane().add(password_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 433, -1, -1));

        phoneNum_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phone_icon.png"))); // NOI18N
        getContentPane().add(phoneNum_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 363, -1, -1));

        email_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/email_icon.png"))); // NOI18N
        getContentPane().add(email_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 503, -1, -1));

        id_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ID_icon.png"))); // NOI18N
        getContentPane().add(id_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 433, -1, -1));

        user_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_sign_up.png"))); // NOI18N
        getContentPane().add(user_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 363, -1, -1));

        confirmPass_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/singUpButton_background.png"))); // NOI18N
        getContentPane().add(confirmPass_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, -1, -1));

        password_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/singUpButton_background.png"))); // NOI18N
        getContentPane().add(password_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, -1, -1));

        phoneNum_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/singUpButton_background.png"))); // NOI18N
        getContentPane().add(phoneNum_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, -1, -1));

        email_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/singUpButton_background.png"))); // NOI18N
        getContentPane().add(email_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, -1, -1));

        id_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/singUpButton_background.png"))); // NOI18N
        getContentPane().add(id_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 313, 46));

        name_box.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/singUpButton_background.png"))); // NOI18N
        name_box.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(name_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 313, 46));

        employedText_Del.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 20)); // NOI18N
        employedText_Del.setText("Empleado");
        getContentPane().add(employedText_Del, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, -1, -1));

        student_textDel.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 20)); // NOI18N
        student_textDel.setText("Estudiante");
        getContentPane().add(student_textDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, -1, -1));

        who_are_youText.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 28)); // NOI18N
        who_are_youText.setText("Who are you?");
        getContentPane().add(who_are_youText, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, -1, -1));

        sing_upText.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 40)); // NOI18N
        sing_upText.setText("Sign up!");
        getContentPane().add(sing_upText, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 160, 50));

        blue_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue_logo127x125.png"))); // NOI18N
        getContentPane().add(blue_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 127, 125));

        gray_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gray_backgroundSingUp.png"))); // NOI18N
        getContentPane().add(gray_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 711, 518));

        white_logo_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/white_logo.png"))); // NOI18N
        getContentPane().add(white_logo_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, 165, 182));

        text_Unispace.setFont(new java.awt.Font("League Spartan ExtraBold", 0, 95)); // NOI18N
        text_Unispace.setForeground(new java.awt.Color(179, 179, 179));
        text_Unispace.setText("UniSpace");
        getContentPane().add(text_Unispace, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 430, 90));

        background_space.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/space_background.png"))); // NOI18N
        getContentPane().add(background_space, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_barIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_barIdActionPerformed

    }//GEN-LAST:event_text_barIdActionPerformed

    private void text_barNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_barNameActionPerformed

    }//GEN-LAST:event_text_barNameActionPerformed

    private void text_barEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_barEmailActionPerformed


    }//GEN-LAST:event_text_barEmailActionPerformed

    private void text_barPhoneNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_barPhoneNumActionPerformed

    }//GEN-LAST:event_text_barPhoneNumActionPerformed

    private void confirmPassword_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPassword_barActionPerformed

        confirmPassword_bar.addFocusListener(new java.awt.event.FocusAdapter() {
        });    }//GEN-LAST:event_confirmPassword_barActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed


    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        this.dispose();                     // Cierra la ventana actual (Sign_up)
        Login login = new Login(); // Crea la nueva ventana(Login)
        login.setVisible(true);        // La muestra
    }//GEN-LAST:event_loginButtonMouseClicked

    private void employed_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employed_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employed_buttonActionPerformed

    private void password_barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_barActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_barActionPerformed

    private void createAccount_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccount_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createAccount_buttonActionPerformed

    private void password_barMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_barMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_barMousePressed

    private void text_barNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_text_barNameMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_barNameMousePressed

    private void createAccount_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccount_buttonMouseClicked

        String id = text_barId.getText();
        String nombre = text_barName.getText();
        String correo = text_barEmail.getText();
        String telefono = text_barPhoneNum.getText();
        String contraseña = password_bar.getText();
        String repetir = confirmPassword_bar.getText();

        if (!contraseña.equals(repetir)) {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden.");
            return;
        }
        if (rolSeleccionado == null) {
            JOptionPane.showMessageDialog(this, "Debes seleccionar un rol (estudiante o empleado).");
            return;
        }

        try {
            Connection conexión = (Connection) Conexión.getConexion();
            String sql = "INSERT INTO usuario (id, nombre, correo, telefono, contrasena, rol) VALUES (?, ?, ?, ?, ?, ?)";

            PreparedStatement pst = conexión.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, nombre);
            pst.setString(3, correo);
            pst.setString(4, telefono);
            pst.setString(5, contraseña);
            pst.setString(6, rolSeleccionado);

            pst.executeUpdate();
            pst.close();
            conexión.close();
            JOptionPane.showMessageDialog(this, "Registro exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }


    }//GEN-LAST:event_createAccount_buttonMouseClicked

    private void studentToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentToggleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentToggleButtonActionPerformed

    private void studentToggleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentToggleButtonMouseClicked
        rolSeleccionado = "estudiante";
        student_button.setBackground(new Color(100, 180, 255));
        employed_button.setBackground(new Color(179, 179, 179));
    }//GEN-LAST:event_studentToggleButtonMouseClicked

    private void employedToggleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employedToggleButtonMouseClicked
        rolSeleccionado = "empleado";
        employed_button.setBackground(new Color(100, 180, 255)); // marca selección visual
        student_button.setBackground(new Color(179, 179, 179));    // desmarca estudiante
        // TODO add your handling code here:
    }//GEN-LAST:event_employedToggleButtonMouseClicked

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
        java.awt.EventQueue.invokeLater(() -> new Sing_up().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_space;
    private javax.swing.JLabel blue_logo;
    private javax.swing.JLabel confirmPass_box;
    private javax.swing.JLabel confirmPass_img;
    private javax.swing.JPasswordField confirmPassword_bar;
    private javax.swing.JButton createAccount_button;
    private javax.swing.JLabel email_box;
    private javax.swing.JLabel email_img;
    private javax.swing.JLabel employedText_Del;
    private javax.swing.JToggleButton employedToggleButton;
    private javax.swing.JButton employed_button;
    private javax.swing.JLabel gray_background;
    private javax.swing.JLabel id_box;
    private javax.swing.JLabel id_img;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel name_box;
    private javax.swing.JPasswordField password_bar;
    private javax.swing.JLabel password_box;
    private javax.swing.JLabel password_img;
    private javax.swing.JLabel phoneNum_box;
    private javax.swing.JLabel phoneNum_img;
    private javax.swing.JLabel sing_upText;
    private javax.swing.JToggleButton studentToggleButton;
    private javax.swing.JButton student_button;
    private javax.swing.JLabel student_textDel;
    private javax.swing.JLabel textBar_account;
    private javax.swing.JLabel text_Unispace;
    private javax.swing.JTextField text_barEmail;
    private javax.swing.JTextField text_barId;
    private javax.swing.JTextField text_barName;
    private javax.swing.JTextField text_barPhoneNum;
    private javax.swing.JLabel user_img;
    private javax.swing.JLabel white_logo_img;
    private javax.swing.JLabel who_are_youText;
    // End of variables declaration//GEN-END:variables
}
