package vista;

import conexion.Conexion;
import controlador.Ctrl_Colaborador;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.Colaborador;

/**
 *
 * @author HP
 */
public class InterColaborador extends javax.swing.JInternalFrame {

    int obtenerId_CategoriaCombo = 0;

    public InterColaborador() {
        initComponents();
        this.setSize(new Dimension(450, 350));
        this.setTitle("Nuevo Colaborador");
        this.CargarComboCategorias();
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
        jLabel6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_nota = new javax.swing.JTextField();
        txt_descripcion = new javax.swing.JTextField();
        jComboBox_categoria = new javax.swing.JComboBox<>();
        jButton_Guardar = new javax.swing.JButton();
        jLab_nombre = new javax.swing.JLabel();
        jLab_apellido = new javax.swing.JLabel();
        jLab_nota = new javax.swing.JLabel();
        jLab_descripcion = new javax.swing.JLabel();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NUEVO COLABORADOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nota:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Descripcion:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Categorias:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 90, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nombreKeyReleased(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, -1));

        txt_apellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyReleased(evt);
            }
        });
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 170, -1));

        txt_nota.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_notaKeyReleased(evt);
            }
        });
        getContentPane().add(txt_nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 170, -1));

        txt_descripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_descripcionKeyReleased(evt);
            }
        });
        getContentPane().add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, -1));

        jComboBox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Categoria:", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 170, -1));

        jButton_Guardar.setBackground(new java.awt.Color(0, 153, 255));
        jButton_Guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Guardar.setText("Guardar");
        jButton_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 90, 30));

        jLab_nombre.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLab_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 170, 20));

        jLab_apellido.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLab_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 170, 20));

        jLab_nota.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLab_nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 170, 20));

        jLab_descripcion.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLab_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 170, 20));

        jLabel_wallpaper.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo3.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarActionPerformed
        Colaborador colaborador = new Colaborador();
        Ctrl_Colaborador ctrl_Colaborador = new Ctrl_Colaborador();
        String categoria = "";
        categoria = jComboBox_categoria.getSelectedItem().toString().trim();
        //validar los campos 
        if (txt_nombre.getText().equals("") | txt_apellido.getText().equals("") | txt_nota.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "complete todos los campos");
            this.validar();

        } else {
            //colsunta para ver si el colaborador ya existe
            if (!ctrl_Colaborador.existeColaborador(txt_apellido.getText().trim())) {

                if (categoria.equalsIgnoreCase("Selecione categoria:")) {
                    JOptionPane.showMessageDialog(null, "Selcione categoria");
                } else {
                    try {
                        colaborador.setNombre(txt_nombre.getText().trim());
                        colaborador.setApellido(txt_apellido.getText().trim());
                        String notaTXT = "";
                        double nota = 0.0;
                        notaTXT = txt_nota.getText().trim();
                        boolean aux = false;

                        //si el usuario ingres con coma lo convertimos a punto
                        for (int i = 0; i < notaTXT.length(); i++) {

                            if (notaTXT.charAt(i) == ',') {
                                String notaNuevo = notaTXT.replace(",", ".");
                                nota = Double.parseDouble(notaNuevo);
                                aux = true;
                            }
                        }
                        //evaluar la condicion
                        if (aux == true) {
                            colaborador.setNota(nota);
                        } else {
                            nota = Double.parseDouble(notaTXT);
                            colaborador.setNota(nota);
                        }
                        colaborador.setDescripcion(txt_descripcion.getText().trim());
                        //id_categoria  cargar metodo que obtiene el id de categoria
                        this.Idcategoria();
                        colaborador.setId_categoria(obtenerId_CategoriaCombo);

                        if (ctrl_Colaborador.guardar(colaborador)) {
                            JOptionPane.showMessageDialog(null, "Registro Guardado");
                            txt_nombre.setBackground(Color.green);
                            txt_apellido.setBackground(Color.green);
                            txt_nota.setBackground(Color.green);
                            txt_descripcion.setBackground(Color.green);

                            this.CargarComboCategorias();
                            this.Limpiar();

                        } else {
                            JOptionPane.showMessageDialog(null, "Error al  Guardar");
                        }

                    } catch (HeadlessException | NumberFormatException e) {
                        System.out.println("Erro en: " + e);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "El colaborador ya existe en la Base de Datos");
            }
        }
    }//GEN-LAST:event_jButton_GuardarActionPerformed

    private void txt_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyReleased
        this.validar();
    }//GEN-LAST:event_txt_nombreKeyReleased

    private void txt_apellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyReleased
        this.validar();
    }//GEN-LAST:event_txt_apellidoKeyReleased

    private void txt_notaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_notaKeyReleased
        this.validar();
    }//GEN-LAST:event_txt_notaKeyReleased

    private void txt_descripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descripcionKeyReleased
        this.validar();
    }//GEN-LAST:event_txt_descripcionKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JComboBox<String> jComboBox_categoria;
    private javax.swing.JLabel jLab_apellido;
    private javax.swing.JLabel jLab_descripcion;
    private javax.swing.JLabel jLab_nombre;
    private javax.swing.JLabel jLab_nota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nota;
    // End of variables declaration//GEN-END:variables

    //Metodo para limpiar campos
    private void Limpiar() {
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_nota.setText("");
        txt_descripcion.setText("");
    }

    //Metodo para cargar categoria
    private void CargarComboCategorias() {
        Connection cn = Conexion.conectar();
        String sql = "select * from tb_categoria";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_categoria.removeAllItems();
            jComboBox_categoria.addItem("Selecione categoria:");
            while (rs.next()) {
                jComboBox_categoria.addItem(rs.getString("descripcion"));
            }
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error al cargar Categorias");
        }
    }

    //metodo para obtener el id categoria
    private int Idcategoria() {
        String sql = "select * from tb_categoria where descripcion = '" + this.jComboBox_categoria.getSelectedItem() + "'";
        Statement st;
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                obtenerId_CategoriaCombo = rs.getInt("id_categoria");

            }
        } catch (SQLException e) {
            System.out.println("Erro al obtener el id categoria");
        }
        return obtenerId_CategoriaCombo;
    }

    public void validar() {
        if (txt_nombre.getText().isEmpty()) {
            jLab_nombre.setText("*campo obligatorio ");
        } else {
            jLab_nombre.setText("");
        }
        if (txt_apellido.getText().isEmpty()) {
            jLab_apellido.setText("*campo obligatorio");

        } else {
            jLab_apellido.setText("");
        }
        if (txt_nota.getText().isEmpty()) {
            jLab_nota.setText("*completar campo");

        } else {
            jLab_nota.setText("");
        }if (txt_descripcion.getText().isEmpty()) {
            jLab_descripcion.setText("*completar campo");

        } else {
            jLab_descripcion.setText("");
        }
    }

}
