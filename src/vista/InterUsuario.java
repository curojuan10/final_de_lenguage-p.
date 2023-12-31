package vista;

import controlador.Ctrl_Usuario;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;

import modelo.Usuario;

/**
 *
 * @author HP
 */
public class InterUsuario extends javax.swing.JInternalFrame {
    
    public InterUsuario() {
        initComponents();
        this.setSize(new Dimension(400, 300));
        this.setTitle("Nueva Usuario");
        txt_password.setVisible(true);
        txt_password_visible.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_otrosDatos = new javax.swing.JTextField();
        jButton_guardar = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();
        jLab_password = new javax.swing.JLabel();
        jLab_correo = new javax.swing.JLabel();
        jLab_otrosdatos = new javax.swing.JLabel();
        jLab_usuario = new javax.swing.JLabel();
        Chek_ver_clave = new javax.swing.JCheckBox();
        txt_password_visible = new javax.swing.JTextField();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nueva Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("CorreoElectronico:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 150, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("OtrosDatos:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, -1));

        txt_usuario.setBackground(new java.awt.Color(153, 153, 255));
        txt_usuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyReleased(evt);
            }
        });
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 170, -1));

        txt_correo.setBackground(new java.awt.Color(153, 153, 255));
        txt_correo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_correoKeyReleased(evt);
            }
        });
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 170, -1));

        txt_otrosDatos.setBackground(new java.awt.Color(153, 153, 255));
        txt_otrosDatos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_otrosDatos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_otrosDatosKeyReleased(evt);
            }
        });
        getContentPane().add(txt_otrosDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 170, -1));

        jButton_guardar.setBackground(new java.awt.Color(255, 153, 153));
        jButton_guardar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton_guardar.setText("Guardar");
        jButton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 90, 30));

        txt_password.setBackground(new java.awt.Color(153, 153, 255));
        txt_password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_passwordKeyReleased(evt);
            }
        });
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 170, -1));

        jLab_password.setBackground(new java.awt.Color(255, 255, 255));
        jLab_password.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLab_password.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jLab_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 116, 170, 20));

        jLab_correo.setBackground(new java.awt.Color(255, 255, 255));
        jLab_correo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLab_correo.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jLab_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 164, 170, 20));

        jLab_otrosdatos.setBackground(new java.awt.Color(255, 255, 255));
        jLab_otrosdatos.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLab_otrosdatos.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jLab_otrosdatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 214, 170, 20));

        jLab_usuario.setBackground(new java.awt.Color(255, 255, 255));
        jLab_usuario.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLab_usuario.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(jLab_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 76, 170, 10));

        Chek_ver_clave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Chek_ver_claveMouseClicked(evt);
            }
        });
        getContentPane().add(Chek_ver_clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 20, 20));
        getContentPane().add(txt_password_visible, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 170, -1));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 390, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed
     
        if (txt_usuario.getText().isEmpty() || txt_password.getText().isEmpty() || txt_correo.getText().isEmpty() || txt_otrosDatos.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "!complete los campos¡");
            this.validar();
        } else {
            Usuario usuario = new Usuario();
        Ctrl_Usuario ctrl_Usuario = new Ctrl_Usuario();
        
            if (!ctrl_Usuario.existeUsuario(txt_usuario.getText().trim())) {
            usuario.setUsuario(txt_usuario.getText().trim());
            usuario.setPassword(txt_password.getText().trim());
            usuario.setCorreoElectronico(txt_correo.getText().trim());
            usuario.setOtrosDatosUsuario(txt_otrosDatos.getText().trim());
           
            if (ctrl_Usuario.guardar(usuario)) {
                JOptionPane.showMessageDialog(null, "!Usuario registrado¡");
                
            } else {
                JOptionPane.showMessageDialog(null, "!Error al registrar usuario¡");
            }
            } else {
            JOptionPane.showMessageDialog(null, "!El usuario ya esta registrado ingreso otro nuevo¡");
            }
        }
        
        this.Limpiar();
        

    }//GEN-LAST:event_jButton_guardarActionPerformed

    private void txt_usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyReleased
        this.validar();
    }//GEN-LAST:event_txt_usuarioKeyReleased

    private void txt_passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyReleased
        this.validar();
    }//GEN-LAST:event_txt_passwordKeyReleased

    private void txt_correoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_correoKeyReleased
        this.validar();
    }//GEN-LAST:event_txt_correoKeyReleased

    private void txt_otrosDatosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_otrosDatosKeyReleased
        this.validar();
    }//GEN-LAST:event_txt_otrosDatosKeyReleased

    private void Chek_ver_claveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Chek_ver_claveMouseClicked
        
        if (Chek_ver_clave.isSelected() == true) {
            String pass = "";
            char[] passIngresado = txt_password.getPassword();
            for (int i = 0; i < passIngresado.length; i++) {
                pass += passIngresado[i];
            }
            txt_password_visible.setText(pass);
            txt_password.setVisible(false);
            txt_password_visible.setVisible(true);
        } else {
            String passwordIngresado = txt_password_visible.getText().trim();
            txt_password.setText(passwordIngresado);
            txt_password.setVisible(true);
            txt_password_visible.setVisible(false);
        }
    }//GEN-LAST:event_Chek_ver_claveMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Chek_ver_clave;
    private javax.swing.JButton jButton_guardar;
    private javax.swing.JLabel jLab_correo;
    private javax.swing.JLabel jLab_otrosdatos;
    private javax.swing.JLabel jLab_password;
    private javax.swing.JLabel jLab_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_otrosDatos;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_password_visible;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

    //metodo de limpiar
    private void Limpiar() {
        txt_usuario.setText("");
        txt_password.setText("");
        txt_correo.setText("");
        txt_otrosDatos.setText("");
        
    }
    
    public void validar() {
        if (txt_usuario.getText().isEmpty()) {
            jLab_usuario.setText("*completar campo ");
        } else {
            jLab_usuario.setText("");
        }
        if (txt_password.getText().isEmpty()) {
            jLab_password.setText("*completar campo");
            
        } else {
            jLab_password.setText("");
        }
        if (txt_correo.getText().isEmpty()) {
            jLab_correo.setText("*completar campo");
            
        } else if (!txt_correo.getText().contains("@") || !txt_correo.getText().contains(".") || !txt_correo.getText().contains("gmail")) {
            jLab_correo.setText("*correo invalido");
        } else {
            jLab_correo.setText("");
            
        }
        if (txt_otrosDatos.getText().isEmpty()) {
            jLab_otrosdatos.setText("*completar campo");
        } else {
            jLab_otrosdatos.setText("");
        }
        
        
    }
    
}
